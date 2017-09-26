package com.datjap.drawable;

import com.datjap.main.Velocity;

public interface Moveable {
	public Velocity getVelocity();
	public void setVelocity(Velocity velocity);
	
	public void updateLocation();
}
