package com.softserveinc.task03;

import java.util.*;
import java.io.*;

public class MapSetTester {

	public static void main(String[] args) throws IOException {
		
		Scanner fileIn = new Scanner(new File("networkShows.txt"));
		
		// 1. create an empty HashMap
		
		while (fileIn.hasNextLine()) {
			String network = fileIn.nextLine();
			String show = fileIn.nextLine();
			System.out.println("TV show on " + network + ": " + show);
			
			// 2. add to show to the map and print the map
		}
		
		// 3. print the map sorted by network 
		
		// 4. lookup network for a show (inverse of map)
	}

}
