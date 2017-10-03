package com.datjap.Maps.MapData;

public class MapObject extends MapData implements MapDataInterface {
	public static String[] dataTypes = new String[] { "solid" };

	public MapObject(String mapDataInput) {

	}

	@Override
	public String[] getTypes() {
		// TODO Auto-generated method stub
		return dataTypes;
	}
}
