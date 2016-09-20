package odc20.listener;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * JavaFx kurs od podstaw - Listeners #20
 * 
 * @author ZacznijProgramowac https://youtu.be/IQAPfQqbd8c</br>
 * 
 * 
 */
public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/odc20/ListenerExample.fxml"));
		Pane pane = loader.load();
		Scene scene = new Scene(pane);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setTitle("Przykład Listener");
		stage.setResizable(false);
		stage.show();
	}

}
