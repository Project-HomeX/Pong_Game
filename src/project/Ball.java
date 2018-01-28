package project;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class Ball extends Pane{
	private double radius = 20;
	private double xCord = 300;
	private double yCord = 300;
	private double xV = -0.5;
	private double yV = 0.5;

	Circle circle = new Circle(xCord, yCord, radius);

	/**
	 * default Constructor
	 */
	Ball(){
		circle.setFill(Paint.valueOf("WHITE"));
		
		getChildren().addAll(circle);
		startCircle();
	}

	/**
	 * Basically "schedules" when to move the ball, in this case: run after 0 milliseconds, every 10 milliseconds
	 */
	public void startCircle(){
		ScheduledThreadPoolExecutor circleMove = new ScheduledThreadPoolExecutor(1);
		circleMove.scheduleAtFixedRate(()->moveBall(),0,10, TimeUnit.MILLISECONDS);
	}

	public void moveBall() {
	xCord += xV;
	circle.setCenterX(xCord);

	yCord += yV;
	circle.setCenterY(yCord);
	}
}
