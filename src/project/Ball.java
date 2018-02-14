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
	private double xV = -2;
	private double yV = 1;

	Circle circle = new Circle(xCord, yCord, radius);

	/**
	 * default Constructor
	 */
	Ball(){
		circle.setFill(Paint.valueOf("WHITE"));
		
		getChildren().addAll(circle);
		startCircle();
		//boxCollision();
	}

	/**
	 * Basically "schedules" when to move the ball, in this case: run after 0 milliseconds, every 10 milliseconds
	 */
	public void startCircle(){
		ScheduledThreadPoolExecutor circleMove = new ScheduledThreadPoolExecutor(1);
		circleMove.scheduleAtFixedRate(()->moveBall(),0,7, TimeUnit.MILLISECONDS);
	}
	
	//I CANNOT get this method to get constructed in the constructor above. If i construct it i dont't have to do anything in the Main class
	// When there is a Collision with the box's the ball goes back
	public void boxCollision(Paddles box1){
		if(xCord <= 45) {
			if(yCord >= box1.rectLeft.getY() && yCord <= box1.rectLeft.getY() + 150)
				xV = -xV;
		} else if (xCord >= 555) {
			if(yCord >= box1.rectRight.getY() && yCord <= box1.rectRight.getY() + 150)
				xV = -xV;
		}
	}

	public void moveBall() {
	xCord += xV;
	circle.setCenterX(xCord);

	yCord += yV;
	circle.setCenterY(yCord);
	
	if(yCord < 15){
		yV = -yV;
	}
	if(yCord > 585){
		yV = -yV;
	}

	if(xCord < 10){
		xV = -xV;

	}
	if (xCord > 590){
		xV = -xV;
	}
	}
}