package project;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle {

	private double y, speedY;
	private int x, playerSide, w, h;
	boolean up, down;

	/**
	 * constructor
	 */
	public Paddle(int playerSide) {
		y = 231;
		speedY = 0;
		up =false;
		down = false;
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
	 * conditions to move the paddle
	 */
	public void move() {

		// To set the values
		if (up) {
			speedY -= 22;
		}
		else if (down) {
			speedY += 22;
		}

		//Speed of Paddles
		if(speedY >= 4){
			speedY = 4;
		}
		else if(speedY <= -4) {
			speedY = -4;
		}

		//To move
		y += speedY;

		// To keep in boundary
		if (y < 0) {
			y = 0;
		}

		if( y > 420) {
			y = 420;
		}
	}

	/**
	 * get y
	 * @return
	 */
	public int getY() {
		return (int) y;
	}

	public void setUp(boolean up){
		this.up = up;
	}
	public void setDown(boolean down){
		this.down = down;
	}
}