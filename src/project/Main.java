package project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
	
	/**
	 * Creates a stage, and runs the ball and box class
	 * @param s
	 * @throws Exception
	 */
	@Override
	public void start(Stage s) throws Exception {
		Paddles bR = new Paddles();
  		Ball ball = new Ball();
 		bR.getChildren().add(ball);
 		bR.setOnKeyPressed(e->{
 			
			if(e.getCode().toString().equals("DOWN")){

				bR.moveBoxDown("right");
			}
			else if(e.getCode().toString().equals("UP")){
					bR.moveBoxUp("right");
			}
			
			if(e.getText().equals("w")){
				bR.moveBoxUp("left");
			}
			else if(e.getText().equals("s")){
				bR.moveBoxDown("left");
			}
		});
 		
 		Scene scene = new Scene(bR,600, 600);
		scene.setFill(Color.BLACK);
		s.setScene(scene);
		s.show();
		
		bR.requestFocus();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
