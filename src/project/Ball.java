package project;

import com.sun.prism.paint.Color;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Ball extends Pane{
	private double radius = 20;
	private double xCord = 300;
	private double yCord = 300;
	
	private double dx = Math.cos(Math.PI/(2*Math.random()+1))+5;
	private double dy = Math.sin(Math.PI/(2*Math.random()+1))+2;
	Circle circle = new Circle(xCord, yCord, radius);
	Timeline animation;
	/**
	 * default Constructor
	 */
	Ball(){
		circle.setFill(Paint.valueOf("WHITE"));		
		getChildren().addAll(circle);
		//create animation for the ball. 
		animation = new Timeline(new KeyFrame(Duration.millis(8),e->moveBall()));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
		
	}

	public void moveBall() {
		//this is not finished, it's just to show that it works. 
		if(xCord>600 || xCord<50)
			dx*=-1;
		if(yCord>=600 ||yCord<50)
			dy*=-1;
		
		xCord+=dx;
		yCord+=dy;
		
		circle.setCenterX(xCord);
		circle.setCenterY(yCord);
			

	}
}
