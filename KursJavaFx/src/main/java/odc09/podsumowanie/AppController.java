package odc09.podsumowanie;

import javafx.fxml.FXML;

public class AppController {

	private MainController mainController;
	
	@FXML
	public void backMenu(){
		mainController.loadMenuScreen();
	}

	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}

}
