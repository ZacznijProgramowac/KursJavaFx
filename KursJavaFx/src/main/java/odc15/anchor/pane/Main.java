package odc15.anchor.pane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * JavaFx kurs od podstaw - kontener Anchor Pane #15
 * 
 * @author ZacznijProgramowac </br>
 *         https://www.youtube.com/watch?v=dgScLKk1txE
 */
public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/odc15/AnchorPaneExample.fxml"));
		AnchorPane anchorPane = loader.load();
		Scene scene = new Scene(anchorPane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Anchor Pane Example");
		primaryStage.show();

	}

}
