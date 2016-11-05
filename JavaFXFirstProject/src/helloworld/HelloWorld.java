package helloworld;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class HelloWorld extends Application{

	public static void main(String[] args) {
	 launch(args);

	}

	@Override
	public void start(Stage primaryStage)
	{
		primaryStage.setTitle("Hello World");
		Button przycisk = new Button();
		przycisk.setText("Say 'Hello World'");
		przycisk.setOnAction(new EventHandler<ActionEvent>()
				{

					@Override
					public void handle(ActionEvent event) {
						System.out.println("Hello Wordl!");
						
					}
					
				});
		StackPane root = new StackPane();
		root.getChildren().add(przycisk);
		primaryStage.setScene(new Scene(root,300,250));
		primaryStage.show();
		
	}
}
