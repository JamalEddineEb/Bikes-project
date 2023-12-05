package org.example;

import com.soap.ws.client.generated.*;
import org.jxmapviewer.JXMapKit;
import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.painter.CompoundPainter;
import org.jxmapviewer.painter.Painter;
import org.jxmapviewer.viewer.*;


import javax.swing.*;
import javax.xml.ws.WebServiceException;
import java.awt.*;
import java.util.*;
import java.util.List;


public class Main {

    private static void drawRoute(List<GeoPosition> points,List<String> types, JXMapViewer mapViewer){


            // Set the focus
            GeoPosition originPosition = points.get(0);

            Set<Waypoint> waypoints = new HashSet<>();



            waypoints.add(new DefaultWaypoint(points.get(0).getLatitude(), points.get(0).getLongitude()));
            waypoints.add(new DefaultWaypoint(points.get(points.size()-1).getLatitude(), points.get(points.size()-1).getLongitude()));

            int i=0;

            while(i<types.size()){
                if(types.get(i).equals("biking")){
                    waypoints.add(new DefaultWaypoint(points.get(i).getLatitude(), points.get(i).getLongitude()));
                    break;
                }
                i++;
            }
            while(i<types.size()){
                if(types.get(i).equals("walking")){
                    waypoints.add(new DefaultWaypoint(points.get(i).getLatitude(), points.get(i).getLongitude()));
                    break;
                }
                i++;
            }


            WaypointPainter<Waypoint> waypointPainter = new WaypointPainter<>();

            waypointPainter.setWaypoints(waypoints);


            mapViewer.setOverlayPainter(waypointPainter);

            mapViewer.setPanEnabled(true);

            // Set the zoom and position
            mapViewer.setZoom(7);
            mapViewer.setAddressLocation(originPosition);
            mapViewer.repaint();
            mapViewer.setOverlayPainter(waypointPainter);


            RoutePainter routePainter = new RoutePainter(points,types);
            List<Painter<JXMapViewer>> painters = new ArrayList<>();
            painters.add(routePainter);
            painters.add(waypointPainter);
            CompoundPainter<JXMapViewer> painter = new CompoundPainter<>(painters);
            mapViewer.setOverlayPainter(painter);
    }

    public static void main(String[] args) {
        try {
            SwingUtilities.invokeLater(() -> {
                // Create a JFrame to display the map
                JFrame frame = new JFrame("Itinerary");
                frame.setLayout(new BorderLayout()); // Use BorderLayout

                JXMapKit jXMapKit = new JXMapKit();
                jXMapKit.setDefaultProvider(JXMapKit.DefaultProviders.OpenStreetMaps);

                BikeService bikeService = new BikeService();
                IBikeService port = bikeService.getBasicHttpBindingIBikeService();


                // Create a JXMapViewer instance
                JXMapViewer mapViewer = jXMapKit.getMainMap();

                // Create a TileFactoryInfo for OpenStreetMap
                OSMTileFactoryInfo info = new OSMTileFactoryInfo();
                DefaultTileFactory tileFactory = new DefaultTileFactory(info);
                mapViewer.setTileFactory(tileFactory);


                JPanel originPanel = new JPanel();
                JTextField destinationAddressInput = new JTextField(20);
                JTextField originAddressInput = new JTextField(20);

                JPanel legendPanel = new JPanel(new GridLayout(2, 1));
                JPanel bottomPanel = new JPanel(new BorderLayout());
                bottomPanel.add(legendPanel, BorderLayout.WEST);


                // Create the first label for walking
                JLabel walkingLabel = new JLabel("Blue Line: Biking");
                walkingLabel.setOpaque(true);
                walkingLabel.setBackground(Color.BLUE);
                walkingLabel.setForeground(Color.WHITE); // Set text color to white for better visibility
                legendPanel.add(walkingLabel);

                // Create the second label for biking
                JLabel bikingLabel = new JLabel("Red Line: Walking");
                bikingLabel.setOpaque(true);
                bikingLabel.setBackground(Color.RED);
                bikingLabel.setForeground(Color.WHITE); // Set text color to white for better visibility
                legendPanel.add(bikingLabel);
                frame.add(bottomPanel, BorderLayout.SOUTH);

                JButton fetchButton = new JButton("Get itinerary");

                // Add input and button to the panel
                originPanel.add(originAddressInput);
                originPanel.add(destinationAddressInput);
                originPanel.add(fetchButton);

                // Action listener for the button
                fetchButton.addActionListener(e -> {
                    String origin = originAddressInput.getText();
                    String destination = destinationAddressInput.getText();

                    //////////////////


                    // Fetch coordinates based on address
                    try {
                        List<ArrayOfdouble> coordinates = port.getItineraryCoordinates(origin, destination).getItem1().getArrayOfdouble();
                        List<String> types = port.getItineraryCoordinates(origin, destination).getItem2().getString();
                        List<Step> steps = port.getItinerarySteps(origin, destination).getStep();

                        for (Step step : steps) {
                            System.out.println(step.getInstruction().getValue()+" "+step.getDistance()+"m");
                        }

                        List<GeoPosition> points = new ArrayList<>();
                        for(ArrayOfdouble step : coordinates){
                            points.add(new GeoPosition(step.getDouble().get(1), step.getDouble().get(0)));

                        }


                        drawRoute(points, types, mapViewer);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                });

                // Add components to the frame
                frame.add(originPanel, BorderLayout.NORTH); // Add the panel to the top of the frame
                frame.add(mapViewer, BorderLayout.CENTER); // Add the mapViewer to the center

                // Set frame properties
                frame.setSize(800, 600);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            });
        } catch (WebServiceException e) {
            e.printStackTrace();
        }


    }
}