package odc09.podsumowanie;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX kurs od podstaw - podsumowanie wiedzy (odcinki 1-8) #9
 * 
 * @author ZacznijProgramowac </br>
 *         https://www.youtube.com/watch?v=G2MVPrmrDtw
 */
public class Main extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/odc09/MainScreen.fxml"));
		StackPane stackPane = loader.load();
		Scene scene = new Scene(stackPane, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Flow Example");
		primaryStage.show();
	}

}
