package odc14.grid.pane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * JavaFx kurs od podstaw - kontener Grid Pane #14
 * 
 * @author ZacznijProgramowac </br>
 *         https://www.youtube.com/watch?v=WkwBmFc9oA8
 */
public class Main extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/odc14/GridPane.fxml"));
		GridPane gridPane = loader.load();
		Scene scene = new Scene(gridPane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Grid Pane Example");
		primaryStage.show();

	}

}
