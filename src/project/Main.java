package project;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends Applet implements KeyListener{
	final int WIDTH = 800, HEIGHT = 550;
	Paddle p1;
	Thread thread;

	/**
	 * basically the constructor
	 */
	public void init() {
		this.resize(WIDTH, HEIGHT);
		p1 = new Paddle(1);

		this.addKeyListener(this);
		thread = new Thread((Runnable) this);
		thread.start();
	}

	/**
	 * Draws the graphics
	 * @param graphics
	 */
	public void paint(Graphics graphics) {
		graphics.setColor(Color.BLACK);
		graphics.fillRect(0,0, WIDTH, HEIGHT);
		p1.draw(graphics);
	}

	/**
	 * Updates
	 * @param graphics
	 */
	public void update(Graphics graphics) {
		paint(graphics);
	}

	/**
	 * Runs the objects/scene
	 */
	public void run() {
		//code
		for (;;) {





			repaint();
			//Thread sleep: 10 millis
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}


		}
	}

	/**
	 * Key Typed
	 * @param e
	 */
	@Override
	public void keyTyped(KeyEvent e) {
		//code
	}

	/**
	 * Conditions when key's are pressed
	 * @param e
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		//code

		//Player 1 keys
		if(e.getKeyCode() == KeyEvent.VK_W) { // VK -> Means Virtual Keyboard, Were "UP" is were you specify the key you will press
			p1.setUp(true);
		}
		else if(e.getKeyCode() == KeyEvent.VK_S) {
			p1.setDown(true);
		}
	}

	/**
	 * Conditions for when the key's are released
	 * @param e
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		//Player 1 keys
		if(e.getKeyCode() == KeyEvent.VK_W) { // VK -> Means Virtual Keyboard, Were "UP" is were you specify the key you will press
			p1.setUp(false);
		}
		else if(e.getKeyCode() == KeyEvent.VK_S) {
			p1.setDown(false);
		}
	}
}