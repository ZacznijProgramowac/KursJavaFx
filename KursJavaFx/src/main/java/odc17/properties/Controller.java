package odc17.properties;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

	@FXML
	private TextField textField;

	@FXML
	private Label labelName;

	private Person person = new Person();

	@FXML
	public void initialize() {
		textField.textProperty().bindBidirectional(person.getPropertyTextField());
		labelName.textProperty().bind(person.getPropertyTextField());
	}

	@FXML
	public void write() {
		person.getIntegerProperty().set(2222);
		System.out.println(person.getIntegerProperty().get());
		System.out.println(person.getIntegerProperty().getValue());
	}

}
