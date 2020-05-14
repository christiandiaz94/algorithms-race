package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	private ArgorithmsRaceGUI controller;

	public static void main(String[] args) {
		launch(args);

	}
	
	public Main () {
		controller = new ArgorithmsRaceGUI();
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("algorithms.fxml"));
			fxmlLoader.setController(controller);
			Parent root = fxmlLoader.load();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Basic Algorithms Race");
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
