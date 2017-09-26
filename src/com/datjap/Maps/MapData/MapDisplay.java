package com.datjap.Maps.MapData;

import com.datjap.main.Location;

public class MapDisplay extends MapData{
	public static String[] dataTypes = new String[] {"texture"};

	public MapDisplay(Location location) {
		this.setLocation(location);
	}
}
