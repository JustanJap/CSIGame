package com.datjap.drawable;

import java.awt.Graphics2D;

public interface Drawable {
	public void draw(Graphics2D g);

	public int getHeight();

	public int getWidth();

	public void setHeight(int height);

	public void setWidth(int width);
}
