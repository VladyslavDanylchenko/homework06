package com.softserveinc.task03;

import java.util.*;
import java.io.*;

public class MapSetTester {

    public static void main(String[] args) throws IOException {

        Scanner fileIn = new Scanner(new File("networkShows.txt"));

        // 1. create an empty HashMap
        Map<String, Set<String>> networkMap = new HashMap<>();

        while (fileIn.hasNextLine()) {
            String network = fileIn.nextLine();
            String show = fileIn.nextLine();
            System.out.println("TV show on " + network + ": " + show);

            // 2. add to show to the map and print the map
            Set<String> networkSet;
            if (networkMap.containsKey(network)) {
                networkSet = networkMap.get(network);
            } else {
                networkSet = new TreeSet<>();
                networkMap.put(network, networkSet);
            }
            networkSet.add(show);
            System.out.println(networkMap);
            System.out.println();
        }

        // 3. print the map sorted by network
        List<String> networks = new ArrayList<>(networkMap.keySet());
        networks.sort(String::compareTo);
        for (String network : networks) {
            System.out.println(network + ": " + networkMap.get(network));
        }

        // 4. lookup network for a show (inverse of map)
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the TV Show: ");
            String show = scanner.nextLine();
            String network = findNetwork(networkMap, show);
            System.out.println(network == null ? "UNKNOWN" : network);
        }
    }

    private static String findNetwork(Map<String, Set<String>> networkMap, String show) {
        for (String network : networkMap.keySet()) {
            if (networkMap.get(network).contains(show)) {
                return network;
            }
        }
        return null;
    }

}
