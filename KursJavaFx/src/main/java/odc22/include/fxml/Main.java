package odc22.include.fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * JavaFx kurs od podstaw - fx:include - łączenie FXMLów #22
 * 
 * @author ZacznijProgramowac https://www.facebook.com/zacznijprogramowac</br>
 * 
 * 
 */
public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/odc22/Main.fxml"));
		Pane pane = loader.load();
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Include FXML");
		primaryStage.setResizable(false);
		primaryStage.show();
	}

}
