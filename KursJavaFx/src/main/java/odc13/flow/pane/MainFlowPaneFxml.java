package odc13.flow.pane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * JavaFx kurs od podstaw - kontener Flow Pane #13
 * 
 * @author ZacznijProgramowac </br>
 *         https://www.youtube.com/watch?v=327H_iqQzzg
 */
public class MainFlowPaneFxml extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/odc13/FlowPaneExample.fxml"));
		FlowPane flowPane = loader.load();
		Scene scene = new Scene(flowPane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("FlowPane Example");
		primaryStage.show();

	}

}
