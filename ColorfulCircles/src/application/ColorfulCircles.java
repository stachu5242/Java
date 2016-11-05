package application;
	
import com.sun.prism.paint.Color;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class ColorfulCircles extends Application {
	@Override
	public void start(Stage primaryStage) {
	Group root = new Group();
	Scene scene = new Scene(root,800,600, Color.BLACK);
	primaryStage.setScene(scene);
	
	primaryStage.show();
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
