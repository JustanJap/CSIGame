package com.datjap.main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Main {
	Graphics g;
	static int fps = 30;
	static boolean gameRunning = true;
	static Display display;
	public static Player player;
	
	public static Dimension dimensions;


	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		display = new Display();
		System.out.println(dimensions);
		player = new Player(new Location(0, (int) dimensions.getHeight()), new Velocity(0, 0));
	}
	
	public static void draw(Graphics2D g) {
		player.draw(g);
	}

}
