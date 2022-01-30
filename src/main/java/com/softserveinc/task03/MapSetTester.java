package com.softserveinc.task03;

import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class MapSetTester {

    public static void main(String[] args) throws IOException {

        try {
            Scanner fileIn = new Scanner(new File("networkShows.txt"));

            // 1. create an empty HashMap
            Map<String, Set<String>> networkMap = new HashMap<>();

            while (fileIn.hasNextLine()) {
                String network = fileIn.nextLine();
                String show = fileIn.nextLine();
                System.out.println("TV show on " + network + ": " + show);

                // 2. add to show to the map and print the map
                if (networkMap.containsKey(network)) {
                    Set<String> n = networkMap.get(network);
                    n.add(show);
                } else {
                    Set<String> tree = new TreeSet<>();
                    tree.add(show);
                    networkMap.put(network, tree);
                }
                System.out.println(networkMap + "\n");
            }

            // 3. print the map sorted by network
            List<String> keys = new ArrayList<>(networkMap.keySet());
            keys = keys.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

            for (String key : keys) {
                System.out.println(key + ": " + networkMap.get(key));
            }
            System.out.print("\n");

            // 4. lookup network for a show (inverse of map)
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.print("Enter TV show: ");
                String show = scanner.nextLine();
                if (show.isEmpty())
                    break;
                boolean showExists = false;
                for (String key : keys) {
                    if (networkMap.get(key).contains(show)) {
                        System.out.println("Network: " + key + "\n");
                        showExists = true;
                        break;
                    }
                }
                if (!showExists)
                    System.out.println("UNKNOWN\n");

            } while (true);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
