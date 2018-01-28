package project;

import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
	
	/**
	 * What does it do?
	 * @param s
	 * @throws Exception
	 */
	@Override
	public void start(Stage s) throws Exception {
		Pane p = new Pane();
		//p.setPrefSize(600,600);
  		Box bR = new Box();
  		Ball ball = new Ball();
 		
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
 		
 		//p.getChildren().addAll(bR,ball);
 		bR.getChildren().add(ball);
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
