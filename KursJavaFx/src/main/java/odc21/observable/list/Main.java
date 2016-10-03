package odc21.observable.list;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * JavaFx kurs od podstaw - ObservableList i ListProperty #21
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
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/odc21/ObservableListExample.fxml"));
		Pane pane = loader.load();
		Scene scene = new Scene(pane);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setTitle("Observable List");
		stage.setResizable(false);
		stage.show();
	}

}
