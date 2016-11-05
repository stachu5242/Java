package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage)
	{
		Button button = new Button();
		button.setText("Say 'Hello World' ");
		button.setOnAction(new EventHandler<ActionEvent>()
				{
				
					@Override
					public void handle(ActionEvent event)
					{
					System.out.println("Hello World!");
					}
			
				});
		StackPane root = new StackPane();
		root.getChildren().add(button);
		Scene scene = new Scene(root, 300, 250);
		primaryStage.setTitle("Hello World!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
