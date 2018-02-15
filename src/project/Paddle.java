package project;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle {

	private double y, speedY;
	private int x, playerSide, w, h;

	/**
	 * constructor
	 */
	public Paddle() {
		y = 231;
		speedY = 0;
		//Setting which side
		if(playerSide == 1) {
			x = 745;
		}
		else {
			x = 30;
		}
	}

	/**
	 * Draws the shape
	 * @param graphics
	 */
	public void draw(Graphics graphics) {
		graphics.setColor(Color.WHITE);
		graphics.fillRect(x, (int)y, 25, 90);
	}

	/**
	 * Move the ball
	 */
	public void move() {

	}

	/**
	 * get y
	 * @return
	 */
	public int getY() {
		return (int) y;
	}
}