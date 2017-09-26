package com.datjap.Maps;

import java.util.ArrayList;
import java.util.Scanner;

import com.datjap.Maps.MapData.MapData;
import com.datjap.Maps.MapData.MapDisplay;
import com.datjap.main.Location;

import ResourceLoader.Resource;

public class MapLoader {
	public MapLoader(MapEnum map) {
		Scanner mapScan = new Scanner(Resource.getFile(map.name()) + ".csv");
		int x = 0;
		int y = 0;
		while (mapScan.hasNextLine()) {
			String line = mapScan.nextLine();
			String[] elementLine = line.split(",");
			for (String elementPoint : elementLine) {
				String[] elementMapData = elementPoint.split(";");
				for (String mapDataString : elementMapData) {
					ArrayList<MapData> mapData = new ArrayList<MapData>();
					if (stringArrayContains(MapDisplay.dataTypes, mapDataString)) {
						mapData.add(new MapDisplay(new Location(x, y)));
					}
				}
				x++;
			}
			y++;
		}
	}

	public Map createMap() {
		return null;

	}

	public static boolean stringArrayContains(String[] stringArray, String string) {
		string = removeNumbers(string);
		for (String stringTest : stringArray) {
			stringTest = removeNumbers(stringTest);
			if (stringTest.equals(string)) {
				return true;
			}
		}
		return false;
	}

	public static String removeNumbers(String string) {
		return string.replaceAll("\\d", "");
	}

}
