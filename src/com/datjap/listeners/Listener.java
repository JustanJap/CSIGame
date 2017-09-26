package com.datjap.listeners;

import java.awt.event.KeyEvent;

import com.datjap.main.Main;

public class Listener extends ListenerAdapter {

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyChar()) {
		case 'w':
			Main.player.jump();
			break;
		case 'a':
			Main.player.getVelocity().setX(-1 * 3);
			break;
		case 's':

			break;
		case 'd':
			Main.player.getVelocity().setX(1 * 3);

			break;
		default:
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyChar()) {
		case 'w':
			break;
		case 'a':
			Main.player.getVelocity().setX(0);

			break;
		case 's':

			break;
		case 'd':
			Main.player.getVelocity().setX(0);

			break;
		default:
			break;

		}
	}
}
