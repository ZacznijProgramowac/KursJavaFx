package odc12.hbox.vbox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * JavaFx kurs od podstaw - kontenery HBox i VBox #12
 * 
 * @author ZacznijProgramowac </br>
 *         https://www.youtube.com/watch?v=GgtGVaXKIzw
 */
public class MainHboxFxml extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/odc12/Hbox.fxml"));
		HBox hbox = loader.load();
		Scene scene = new Scene(hbox);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hbox Example");
		primaryStage.show();

	}

}
