package odc09.podsumowanie;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class MainController {

	@FXML
	private StackPane mainStackPane;

	@FXML
	public void initialize() {
		loadMenuScreen();
	}

	public void loadMenuScreen() {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/odc09/MenuScreen.fxml"));
		Pane pane = null;
		try {
			pane = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		MenuController menuController = loader.getController();
		menuController.setMainController(this);
		setScreen(pane);
	}

	public void setScreen(Pane pane) {
		mainStackPane.getChildren().clear();
		mainStackPane.getChildren().add(pane);
	}

}
