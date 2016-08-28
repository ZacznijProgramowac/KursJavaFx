package odc12.hbox.vbox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFx kurs od podstaw - kontenery HBox i VBox #12
 * 
 * @author ZacznijProgramowac </br>
 *         https://www.youtube.com/watch?v=GgtGVaXKIzw
 */
public class MainVboxFxml extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/odc12/Vbox.fxml"));
		VBox vbox = loader.load();
		Scene scene = new Scene(vbox);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Vbox Example");
		primaryStage.show();

	}

}
