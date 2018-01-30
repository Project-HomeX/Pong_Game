package project;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Box extends Pane {
	private double width = 35;
	private double height = 150;
	
	private double rightX = 555;
	private double rightY = 10;
	
	private double leftX = 10;
	private double leftY = 10;
	
	Rectangle rectLeft = new Rectangle(leftX, leftY, width, height);
	Rectangle rectRight = new Rectangle(rightX, rightY, width, height);
	
	/**
	 * Constructor
	 */
	Box() {
		rectLeft.setFill(Color.WHITE);
		rectRight.setFill(Color.WHITE);
		
		getChildren().addAll(rectRight,rectLeft);
	}
	
	/**
	 * Moves box's up
	 * @param pos
	 */
	public void moveBoxUp(String pos) {
 		if (pos.equals("left")) {
			if (leftY > 0){
				this.leftY -= 22;
				rectLeft.setY(leftY);
			}
		}
		
		if(pos.equals("right")){
			if (rightY > 0){
				this.rightY -= 22;
				rectRight.setY(rightY);
			}
			
		}
	}
	
	/**
	 * Moves box's down
	 * @param pos
	 */
	public void moveBoxDown(String pos) {
 		if (pos.equals("left")) {
			if (leftY + height < getHeight()) {
				this.leftY += 22;
				rectLeft.setY(leftY);
			}
			
		}
		
		if(pos.equals("right")){
			if (rightY + height < getHeight()) {
				this.rightY += 22;
				rectRight.setY(rightY);
			}
			
		}
	}
}
