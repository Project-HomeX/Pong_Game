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

	Circle circle = new Circle(xCord, yCord, radius);
	Timeline animation;
	/**
	 * default Constructor
	 */
	Ball(){
		circle.setFill(Paint.valueOf("WHITE"));		
		getChildren().addAll(circle);
		//create animation for the ball. 
		animation = new Timeline(new KeyFrame(Duration.millis(50),e->moveBall()));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
		
	}

	public void moveBall() {
		//this is not finished, it's just to show that it works. 
			if((xCord<getWidth())){
				xCord+=2;
				circle.setCenterX(xCord);
			}
			else if(xCord>=getWidth()){
				xCord -=2;
				circle.setCenterY(xCord);
			}

	}
}
