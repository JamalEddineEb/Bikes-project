
package com.soap.ws.client.generated;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soap.ws.client.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfStation_QNAME = new QName("http://schemas.datacontract.org/2004/07/BikesServer", "ArrayOfStation");
    private final static QName _Station_QNAME = new QName("http://schemas.datacontract.org/2004/07/BikesServer", "Station");
    private final static QName _Position_QNAME = new QName("http://schemas.datacontract.org/2004/07/BikesServer", "Position");
    private final static QName _ArrayOfStep_QNAME = new QName("http://schemas.datacontract.org/2004/07/Bikes", "ArrayOfStep");
    private final static QName _Step_QNAME = new QName("http://schemas.datacontract.org/2004/07/Bikes", "Step");
    private final static QName _PositionStrings_QNAME = new QName("http://schemas.datacontract.org/2004/07/Bikes", "PositionStrings");
    private final static QName _ValueTupleOfArrayOfArrayOfdoubleArrayOfstring0DMmj3Sh_QNAME = new QName("http://schemas.datacontract.org/2004/07/System", "ValueTupleOfArrayOfArrayOfdoubleArrayOfstring0dMmj3_Sh");
    private final static QName _ArrayOfArrayOfdouble_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfArrayOfdouble");
    private final static QName _ArrayOfdouble_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfdouble");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _GetStationsFromCityNameCity_QNAME = new QName("http://tempuri.org/", "city");
    private final static QName _GetStationsFromCityNameResponseGetStationsFromCityNameResult_QNAME = new QName("http://tempuri.org/", "getStationsFromCityNameResult");
    private final static QName _GetFootStepsOrigin_QNAME = new QName("http://tempuri.org/", "origin");
    private final static QName _GetFootStepsDestination_QNAME = new QName("http://tempuri.org/", "destination");
    private final static QName _GetFootStepsResponseGetFootStepsResult_QNAME = new QName("http://tempuri.org/", "GetFootStepsResult");
    private final static QName _GetNearestStationWithAvailableBikesAddress_QNAME = new QName("http://tempuri.org/", "address");
    private final static QName _GetNearestStationWithAvailableBikesResponseGetNearestStationWithAvailableBikesResult_QNAME = new QName("http://tempuri.org/", "GetNearestStationWithAvailableBikesResult");
    private final static QName _GetItineraryStepsResponseGetItineraryStepsResult_QNAME = new QName("http://tempuri.org/", "GetItineraryStepsResult");
    private final static QName _GetPositionFromAddressResponseGetPositionFromAddressResult_QNAME = new QName("http://tempuri.org/", "getPositionFromAddressResult");
    private final static QName _StepInstruction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Bikes", "instruction");
    private final static QName _PositionStringsLat_QNAME = new QName("http://schemas.datacontract.org/2004/07/Bikes", "lat");
    private final static QName _PositionStringsLon_QNAME = new QName("http://schemas.datacontract.org/2004/07/Bikes", "lon");
    private final static QName _StationAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/BikesServer", "address");
    private final static QName _StationContractName_QNAME = new QName("http://schemas.datacontract.org/2004/07/BikesServer", "contract_name");
    private final static QName _StationName_QNAME = new QName("http://schemas.datacontract.org/2004/07/BikesServer", "name");
    private final static QName _StationPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/BikesServer", "position");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soap.ws.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStationsFromCityName }
     * 
     */
    public GetStationsFromCityName createGetStationsFromCityName() {
        return new GetStationsFromCityName();
    }

    /**
     * Create an instance of {@link GetStationsFromCityNameResponse }
     * 
     */
    public GetStationsFromCityNameResponse createGetStationsFromCityNameResponse() {
        return new GetStationsFromCityNameResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStation }
     * 
     */
    public ArrayOfStation createArrayOfStation() {
        return new ArrayOfStation();
    }

    /**
     * Create an instance of {@link GetFootSteps }
     * 
     */
    public GetFootSteps createGetFootSteps() {
        return new GetFootSteps();
    }

    /**
     * Create an instance of {@link GetFootStepsResponse }
     * 
     */
    public GetFootStepsResponse createGetFootStepsResponse() {
        return new GetFootStepsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStep }
     * 
     */
    public ArrayOfStep createArrayOfStep() {
        return new ArrayOfStep();
    }

    /**
     * Create an instance of {@link GetNearestStationWithAvailableBikes }
     * 
     */
    public GetNearestStationWithAvailableBikes createGetNearestStationWithAvailableBikes() {
        return new GetNearestStationWithAvailableBikes();
    }

    /**
     * Create an instance of {@link GetNearestStationWithAvailableBikesResponse }
     * 
     */
    public GetNearestStationWithAvailableBikesResponse createGetNearestStationWithAvailableBikesResponse() {
        return new GetNearestStationWithAvailableBikesResponse();
    }

    /**
     * Create an instance of {@link Station }
     * 
     */
    public Station createStation() {
        return new Station();
    }

    /**
     * Create an instance of {@link GetItineraryCoordinates }
     * 
     */
    public GetItineraryCoordinates createGetItineraryCoordinates() {
        return new GetItineraryCoordinates();
    }

    /**
     * Create an instance of {@link GetItineraryCoordinatesResponse }
     * 
     */
    public GetItineraryCoordinatesResponse createGetItineraryCoordinatesResponse() {
        return new GetItineraryCoordinatesResponse();
    }

    /**
     * Create an instance of {@link ValueTupleOfArrayOfArrayOfdoubleArrayOfstring0DMmj3Sh }
     * 
     */
    public ValueTupleOfArrayOfArrayOfdoubleArrayOfstring0DMmj3Sh createValueTupleOfArrayOfArrayOfdoubleArrayOfstring0DMmj3Sh() {
        return new ValueTupleOfArrayOfArrayOfdoubleArrayOfstring0DMmj3Sh();
    }

    /**
     * Create an instance of {@link GetItinerarySteps }
     * 
     */
    public GetItinerarySteps createGetItinerarySteps() {
        return new GetItinerarySteps();
    }

    /**
     * Create an instance of {@link GetItineraryStepsResponse }
     * 
     */
    public GetItineraryStepsResponse createGetItineraryStepsResponse() {
        return new GetItineraryStepsResponse();
    }

    /**
     * Create an instance of {@link GetPositionFromAddress }
     * 
     */
    public GetPositionFromAddress createGetPositionFromAddress() {
        return new GetPositionFromAddress();
    }

    /**
     * Create an instance of {@link GetPositionFromAddressResponse }
     * 
     */
    public GetPositionFromAddressResponse createGetPositionFromAddressResponse() {
        return new GetPositionFromAddressResponse();
    }

    /**
     * Create an instance of {@link PositionStrings }
     * 
     */
    public PositionStrings createPositionStrings() {
        return new PositionStrings();
    }

    /**
     * Create an instance of {@link Position }
     * 
     */
    public Position createPosition() {
        return new Position();
    }

    /**
     * Create an instance of {@link Step }
     * 
     */
    public Step createStep() {
        return new Step();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfdouble }
     * 
     */
    public ArrayOfArrayOfdouble createArrayOfArrayOfdouble() {
        return new ArrayOfArrayOfdouble();
    }

    /**
     * Create an instance of {@link ArrayOfdouble }
     * 
     */
    public ArrayOfdouble createArrayOfdouble() {
        return new ArrayOfdouble();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfStation }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BikesServer", name = "ArrayOfStation")
    public JAXBElement<ArrayOfStation> createArrayOfStation(ArrayOfStation value) {
        return new JAXBElement<ArrayOfStation>(_ArrayOfStation_QNAME, ArrayOfStation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Station }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Station }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BikesServer", name = "Station")
    public JAXBElement<Station> createStation(Station value) {
        return new JAXBElement<Station>(_Station_QNAME, Station.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Position }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Position }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BikesServer", name = "Position")
    public JAXBElement<Position> createPosition(Position value) {
        return new JAXBElement<Position>(_Position_QNAME, Position.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStep }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfStep }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Bikes", name = "ArrayOfStep")
    public JAXBElement<ArrayOfStep> createArrayOfStep(ArrayOfStep value) {
        return new JAXBElement<ArrayOfStep>(_ArrayOfStep_QNAME, ArrayOfStep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Step }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Step }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Bikes", name = "Step")
    public JAXBElement<Step> createStep(Step value) {
        return new JAXBElement<Step>(_Step_QNAME, Step.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PositionStrings }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PositionStrings }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Bikes", name = "PositionStrings")
    public JAXBElement<PositionStrings> createPositionStrings(PositionStrings value) {
        return new JAXBElement<PositionStrings>(_PositionStrings_QNAME, PositionStrings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueTupleOfArrayOfArrayOfdoubleArrayOfstring0DMmj3Sh }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValueTupleOfArrayOfArrayOfdoubleArrayOfstring0DMmj3Sh }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System", name = "ValueTupleOfArrayOfArrayOfdoubleArrayOfstring0dMmj3_Sh")
    public JAXBElement<ValueTupleOfArrayOfArrayOfdoubleArrayOfstring0DMmj3Sh> createValueTupleOfArrayOfArrayOfdoubleArrayOfstring0DMmj3Sh(ValueTupleOfArrayOfArrayOfdoubleArrayOfstring0DMmj3Sh value) {
        return new JAXBElement<ValueTupleOfArrayOfArrayOfdoubleArrayOfstring0DMmj3Sh>(_ValueTupleOfArrayOfArrayOfdoubleArrayOfstring0DMmj3Sh_QNAME, ValueTupleOfArrayOfArrayOfdoubleArrayOfstring0DMmj3Sh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfdouble }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfdouble }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfArrayOfdouble")
    public JAXBElement<ArrayOfArrayOfdouble> createArrayOfArrayOfdouble(ArrayOfArrayOfdouble value) {
        return new JAXBElement<ArrayOfArrayOfdouble>(_ArrayOfArrayOfdouble_QNAME, ArrayOfArrayOfdouble.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfdouble }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfdouble")
    public JAXBElement<ArrayOfdouble> createArrayOfdouble(ArrayOfdouble value) {
        return new JAXBElement<ArrayOfdouble>(_ArrayOfdouble_QNAME, ArrayOfdouble.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "city", scope = GetStationsFromCityName.class)
    public JAXBElement<String> createGetStationsFromCityNameCity(String value) {
        return new JAXBElement<String>(_GetStationsFromCityNameCity_QNAME, String.class, GetStationsFromCityName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfStation }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getStationsFromCityNameResult", scope = GetStationsFromCityNameResponse.class)
    public JAXBElement<ArrayOfStation> createGetStationsFromCityNameResponseGetStationsFromCityNameResult(ArrayOfStation value) {
        return new JAXBElement<ArrayOfStation>(_GetStationsFromCityNameResponseGetStationsFromCityNameResult_QNAME, ArrayOfStation.class, GetStationsFromCityNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "origin", scope = GetFootSteps.class)
    public JAXBElement<String> createGetFootStepsOrigin(String value) {
        return new JAXBElement<String>(_GetFootStepsOrigin_QNAME, String.class, GetFootSteps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "destination", scope = GetFootSteps.class)
    public JAXBElement<String> createGetFootStepsDestination(String value) {
        return new JAXBElement<String>(_GetFootStepsDestination_QNAME, String.class, GetFootSteps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStep }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfStep }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetFootStepsResult", scope = GetFootStepsResponse.class)
    public JAXBElement<ArrayOfStep> createGetFootStepsResponseGetFootStepsResult(ArrayOfStep value) {
        return new JAXBElement<ArrayOfStep>(_GetFootStepsResponseGetFootStepsResult_QNAME, ArrayOfStep.class, GetFootStepsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "address", scope = GetNearestStationWithAvailableBikes.class)
    public JAXBElement<String> createGetNearestStationWithAvailableBikesAddress(String value) {
        return new JAXBElement<String>(_GetNearestStationWithAvailableBikesAddress_QNAME, String.class, GetNearestStationWithAvailableBikes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Station }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Station }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetNearestStationWithAvailableBikesResult", scope = GetNearestStationWithAvailableBikesResponse.class)
    public JAXBElement<Station> createGetNearestStationWithAvailableBikesResponseGetNearestStationWithAvailableBikesResult(Station value) {
        return new JAXBElement<Station>(_GetNearestStationWithAvailableBikesResponseGetNearestStationWithAvailableBikesResult_QNAME, Station.class, GetNearestStationWithAvailableBikesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "origin", scope = GetItineraryCoordinates.class)
    public JAXBElement<String> createGetItineraryCoordinatesOrigin(String value) {
        return new JAXBElement<String>(_GetFootStepsOrigin_QNAME, String.class, GetItineraryCoordinates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "destination", scope = GetItineraryCoordinates.class)
    public JAXBElement<String> createGetItineraryCoordinatesDestination(String value) {
        return new JAXBElement<String>(_GetFootStepsDestination_QNAME, String.class, GetItineraryCoordinates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "origin", scope = GetItinerarySteps.class)
    public JAXBElement<String> createGetItineraryStepsOrigin(String value) {
        return new JAXBElement<String>(_GetFootStepsOrigin_QNAME, String.class, GetItinerarySteps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "destination", scope = GetItinerarySteps.class)
    public JAXBElement<String> createGetItineraryStepsDestination(String value) {
        return new JAXBElement<String>(_GetFootStepsDestination_QNAME, String.class, GetItinerarySteps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStep }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfStep }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetItineraryStepsResult", scope = GetItineraryStepsResponse.class)
    public JAXBElement<ArrayOfStep> createGetItineraryStepsResponseGetItineraryStepsResult(ArrayOfStep value) {
        return new JAXBElement<ArrayOfStep>(_GetItineraryStepsResponseGetItineraryStepsResult_QNAME, ArrayOfStep.class, GetItineraryStepsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "address", scope = GetPositionFromAddress.class)
    public JAXBElement<String> createGetPositionFromAddressAddress(String value) {
        return new JAXBElement<String>(_GetNearestStationWithAvailableBikesAddress_QNAME, String.class, GetPositionFromAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PositionStrings }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PositionStrings }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "getPositionFromAddressResult", scope = GetPositionFromAddressResponse.class)
    public JAXBElement<PositionStrings> createGetPositionFromAddressResponseGetPositionFromAddressResult(PositionStrings value) {
        return new JAXBElement<PositionStrings>(_GetPositionFromAddressResponseGetPositionFromAddressResult_QNAME, PositionStrings.class, GetPositionFromAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Bikes", name = "instruction", scope = Step.class)
    public JAXBElement<String> createStepInstruction(String value) {
        return new JAXBElement<String>(_StepInstruction_QNAME, String.class, Step.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Bikes", name = "lat", scope = PositionStrings.class)
    public JAXBElement<String> createPositionStringsLat(String value) {
        return new JAXBElement<String>(_PositionStringsLat_QNAME, String.class, PositionStrings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Bikes", name = "lon", scope = PositionStrings.class)
    public JAXBElement<String> createPositionStringsLon(String value) {
        return new JAXBElement<String>(_PositionStringsLon_QNAME, String.class, PositionStrings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BikesServer", name = "address", scope = Station.class)
    public JAXBElement<String> createStationAddress(String value) {
        return new JAXBElement<String>(_StationAddress_QNAME, String.class, Station.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BikesServer", name = "contract_name", scope = Station.class)
    public JAXBElement<String> createStationContractName(String value) {
        return new JAXBElement<String>(_StationContractName_QNAME, String.class, Station.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BikesServer", name = "name", scope = Station.class)
    public JAXBElement<String> createStationName(String value) {
        return new JAXBElement<String>(_StationName_QNAME, String.class, Station.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Position }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Position }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/BikesServer", name = "position", scope = Station.class)
    public JAXBElement<Position> createStationPosition(Position value) {
        return new JAXBElement<Position>(_StationPosition_QNAME, Position.class, Station.class, value);
    }

}
