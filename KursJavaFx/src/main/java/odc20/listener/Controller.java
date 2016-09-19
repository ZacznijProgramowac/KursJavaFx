package odc20.listener;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

	@FXML
	private TextField nameTextField;

	@FXML
	private Label nameLabel;

	@FXML
	private TextField surnameTextField;

	@FXML
	private Label surnameLabel;

	@FXML
	private TextField yearTextField;

	@FXML
	private CheckBox confirmCheckBox;

	@FXML
	private Button logginButton;

	@FXML
	private Label ageLabel;

	private BooleanProperty checkBoxProperty = new SimpleBooleanProperty();

	@FXML
	public void initialize() {
		// bindowanie CheckBox z properties BooleanProperty
		confirmCheckBox.selectedProperty().bindBidirectional(checkBoxProperty);

		// nalozenie listenera na textProperty przez powolanie klasy anonimowej.
		nameTextField.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				System.out.println("Stara wartość: " + oldValue);
				System.out.println("Nowa wartość: " + newValue);
				if (((String) newValue).isEmpty()) {
					surnameTextField.setText("");
				}
			}
		});

		// nalozenie listenera z wyrazeniem lambdy
		surnameTextField.focusedProperty().addListener((observable, oldValue, newValue) -> {
			if (newValue) {
				System.out.println("Jesteś w polu naziwsko");
			} else {
				System.out.println("Byłeś w polu naziwsko");
			}

		});

		// nalozenie listenera przez odwolanie sie do metody
		yearTextField.textProperty().addListener(Controller::yearTextFieldListener);

		// listener na properties BooleanProperty zainicjalizowany w naszej
		// klasie
		checkBoxProperty.addListener((observable, oldValue, newValue) -> {
			if (newValue) {
				System.out.println("Zaznaczono");
			} else {
				System.out.println("Odznaczono");
			}

		});

	}

	// metoda ktora wykorzystana jest do podpiecia listenera
	private static void yearTextFieldListener(ObservableValue<? extends String> observable, String oldValue,
			String newValue) {
		System.out.println("Tutaj: " + observable);
		System.out.println("Nowa wartość: " + newValue);
	}

}
