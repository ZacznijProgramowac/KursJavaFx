package odc16.border.pane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * JavaFx kurs od podstaw - kontener Border Pane #16
 * 
 * @author ZacznijProgramowac </br>
 *         https://www.youtube.com/watch?v=2lA5Gv6kPVo
 */
public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/odc16/BorderPaneExample.fxml"));
		BorderPane borderPane = loader.load();
		Scene scene = new Scene(borderPane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Border Pane Example");
		primaryStage.show();

	}

}
