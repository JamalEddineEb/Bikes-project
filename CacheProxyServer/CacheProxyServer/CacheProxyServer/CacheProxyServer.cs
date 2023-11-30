using System;
using System.Net.Http;
using System.Runtime.Caching;
using System.Text.Json;
using System.Threading.Tasks;

namespace BikesServer
{
    public class CacheProxyService<T>
    {
        internal readonly ObjectCache cache;
        internal readonly DateTimeOffset dt_default;

        public CacheProxyService()
        {
            cache = MemoryCache.Default;
            dt_default = ObjectCache.InfiniteAbsoluteExpiration;
        }

        public Task<T> Get(string CacheItemName)
        {
            return Get(CacheItemName, dt_default);
        }

        public Task<T> Get(string CacheItemName, double dt_seconds)
        {
            var expirationTime = DateTimeOffset.Now.AddSeconds(dt_seconds);
            return Get(CacheItemName, expirationTime);
        }

        public async Task<T> Get(string CacheItemName, DateTimeOffset dt)
        {
            T cacheItem = (T)cache.Get(CacheItemName);

            if (cacheItem == null)
            {
                cacheItem = await GetFromApi(CacheItemName);
                cache.Set(CacheItemName, cacheItem, new CacheItemPolicy { AbsoluteExpiration = dt });
            }

            return cacheItem;
        }

        private async Task<T> GetFromApi(string Uri)
        {
            using (HttpClient client = new HttpClient())
            {
                try
                {
                    HttpResponseMessage response = await client.GetAsync(Uri);
                    response.EnsureSuccessStatusCode();

                    string responseBody = await response.Content.ReadAsStringAsync();

                    return JsonSerializer.Deserialize<T>(responseBody);
                }
                catch (Exception ex)
                {
                    throw new Exception($"An error occurred: {ex.Message}");
                }
            }
        }
    }

}