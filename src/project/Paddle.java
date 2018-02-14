package project;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle {

	private double y, speedY;
	private int x, playerSide, w, h;

	//Constructor
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

	public void draw(Graphics graphics) {
		graphics.setColor(Color.WHITE);
		graphics.fillRect(x, (int)y, 25, 90);
	}
	public void move() {

	}
	public int getY() {
		return (int) y;
	}

}