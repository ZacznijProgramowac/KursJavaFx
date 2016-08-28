package odc11.pane.group;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * JavaFx kurs od podstaw - kontenery Pane i Group #11
 * 
 * @author ZacznijProgramowac </br>
 *         https://www.youtube.com/watch?v=Q3hRExH0_J0
 */
public class MainPaneFxml extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	// Wczytujemy FXML z kontenerem Pane
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/odc11/Pane.fxml"));
		Pane pane = loader.load();
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Pane Example");
		primaryStage.show();
	}

}
