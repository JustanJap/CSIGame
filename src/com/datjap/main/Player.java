package com.datjap.main;

import java.awt.Color;
import java.awt.Graphics2D;

import com.datjap.drawable.Drawable;
import com.datjap.drawable.Moveable;

public class Player implements Drawable, Moveable {
	Location location;
	Velocity velocity;
	int height, width;

	boolean falling = false;
	int jumpStartVelocity = 30;
	int gravity = 2;

	public Player(Location location, Velocity velocity) {
		this.location = location;
		this.velocity = velocity;
		height = 150;
		width = 20;

	}

	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setPaint(Color.WHITE);
		g.fillRect(location.getX(), location.getY() - height, width, height);
		updateLocation();
	}

	public void jump() {
		if (!falling) {
			velocity.setY(-jumpStartVelocity);
		}
	}

	@Override
	public void updateLocation() {
		// TODO Auto-generated method stub

		location.setX(location.getX() + velocity.getX());
		location.setY(location.getY() + velocity.getY());

		if (location.getY() >= (int) Main.dimensions.getHeight()) {
			location.setY((int) Main.dimensions.getHeight());

			if (falling) {
				falling = false;
				velocity.setY(0);
			}
		} else {
			velocity.setY(velocity.getY() + gravity);
			if (!falling)
				falling = true;
		}
	}

	@Override
	public Velocity getVelocity() {
		return velocity;
	}

	@Override
	public void setVelocity(Velocity velocity) {
		this.velocity = velocity;
	}

	@Override
	public int getHeight() {
		return height;

	}

	@Override
	public int getWidth() {
		return width;

	}

	@Override
	public void setHeight(int height) {
		// TODO Auto-generated method stub
		this.height = height;
	}

	@Override
	public void setWidth(int width) {
		// TODO Auto-generated method stub
		this.width = width;
	}

}
