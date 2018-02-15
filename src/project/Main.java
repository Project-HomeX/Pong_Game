package project;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends Applet implements KeyListener{
	final int WIDTH = 800, HEIGHT = 550;


	/**
	 * basically the constructor
	 */
	public void setup() {
		this.resize(WIDTH, HEIGHT);
	}

	/**
	 * Draws the graphics
	 * @param graphics
	 */
	public void paint(Graphics graphics) {

	}

	/**
	 * Updates
	 * @param graphics
	 */
	public void update(Graphics graphics) {

	}

	/**
	 * Runs the objects/scene
	 */
	public void run() {
		//code
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
	}

	/**
	 * Conditions for when the key's are released
	 * @param e
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		//code
	}
}