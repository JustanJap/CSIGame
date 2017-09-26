package com.datjap.Maps.MapData;

import com.datjap.main.Location;

public class MapObject extends MapData{
	public static String[] dataTypes = new String[] {"solid"};
	
	public MapObject(Location location) {
		this.setLocation(location);
	}
}
