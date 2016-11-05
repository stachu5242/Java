package FormInJavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.*;
public class FirstFromJavaFX extends Application{ 

	public static void main(String[] args) {
		launch(args);

	}
	@Override
	public void start (Stage primaryStage)
	{
		primaryStage.setTitle("JavaFX Welcome");
		primaryStage.show();
	}
	
	GridPane grid = new GridPane();
	grid.setAlignment(Pos.CENTER);
	grid.setHgap(10);
	grid.setVgap(10);
	grid.setPadding(new Insets(25,25,25,25));
	
	Scene scene = new Scene(grid,300,275);
	primaryStage.setScene(scene);

	Text scenetitle = new Text("Welcome");
	scenetitle.setFront(Font.font("Tahoma",FontWeight.NORMAL,20));
	grid.add(scenetitle, 0,0,2,1);
	
	
}
