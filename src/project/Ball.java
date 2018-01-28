package project;

import com.sun.prism.paint.Color;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class Ball extends Pane{
	private double radius = 20;
	private double xCord = 300;
	private double yCord = 300;

	Circle circle = new Circle(xCord, yCord, radius);

	/**
	 * default Constructor
	 */
	Ball(){
		circle.setFill(Paint.valueOf("WHITE"));
		
		getChildren().addAll(circle);
	}

	public void moveBall() {

	}
}
