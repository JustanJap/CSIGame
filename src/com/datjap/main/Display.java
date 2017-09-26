package com.datjap.main;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import com.datjap.listeners.Listener;

@SuppressWarnings("serial")
public class Display extends JFrame{
	public Display() {
		this.setSize(800, 600);
		this.setTitle("Test");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new DrawLoop(), BorderLayout.CENTER);
		Main.dimensions = this.getComponent(0).getSize();
		Listener listener = new Listener();
		this.addMouseListener(listener);
		this.addKeyListener(listener);
		
	}
}
