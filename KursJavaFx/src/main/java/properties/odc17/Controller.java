package properties.odc17;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

	@FXML
	private TextField textField;

	@FXML
	private Label label;

	private Model model = new Model();

	@FXML
	public void initialize() {
		// model.getPropertyTextField().bindBidirectional(textField.textProperty());
		textField.textProperty().bindBidirectional(model.getPropertyTextField());
		System.out.println("eee" + model.getPropertyTextField().getValue());

	}

	@FXML
	public void write() {
		System.out.println("Wartość zapisana:" + model.getPropertyTextField().getValue());
	}

}
