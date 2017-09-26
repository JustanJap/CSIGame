package com.datjap.main;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class DrawLoop extends JComponent {

	public int loopCount;
	public DrawLoop() {
		startLoop();
		loopCount = 0;
	}
	
	public void paint(Graphics graphicBase) {
		Graphics2D g = (Graphics2D) graphicBase;
		
		
		
		g.fillRect(0, 0, Main.display.getWidth(), Main.display.getHeight());
		
		
		Main.draw(g);
	}

	public void startLoop() {
		Thread thread = new Thread(() -> {
			try {
				if (Main.gameRunning) {
					Thread.sleep(1000 / Main.fps);
					this.repaint();
					startLoop();
					loopCount++;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		thread.start();
	}
}
