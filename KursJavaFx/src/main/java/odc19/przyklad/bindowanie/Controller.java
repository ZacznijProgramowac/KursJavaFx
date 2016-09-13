package odc19.przyklad.bindowanie;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

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

	private PersonViewModel personViewModel = new PersonViewModel();

	@FXML
	public void initialize() {
		// textProperty bindujemy z property typu String
		nameTextField.textProperty().bindBidirectional(personViewModel.getNameProperty());
		// textProperty bindujemy z property typu String
		surnameTextField.textProperty().bindBidirectional(personViewModel.getSurnameProperty());

		// disableProperty bidnujemy z property typu Boolen - bedzie wlaczac
		// wylaczac pole
		surnameTextField.disableProperty().bind(personViewModel.getDisableSurnameProperty());

		// konwenter to konwertowania String na Number
		StringConverter conventer = new NumberStringConverter();
		// bindowanie z konwenterem, textProperty bindujemy z IntegerProperty
		yearTextField.textProperty().bindBidirectional(personViewModel.getYearProperty(), conventer);

		// selectedProperty bindujemy z property typi Boolean
		confirmCheckBox.selectedProperty().bindBidirectional(personViewModel.getConfirmProperty());

		// Label bindujemy z property typu String, obliczona wartoscia wieku
		ageLabel.textProperty().bind(personViewModel.getAgeProperty());

		// dwa labele bindujemy z property typu Boolean, steruje ich
		// widocznoscia
		nameLabel.visibleProperty().bind(personViewModel.getNameOkProperty());
		surnameLabel.visibleProperty().bind(personViewModel.getSurnameOKProperty());

		// przycisk bindujemy z property typu Boolean
		logginButton.disableProperty().bind(personViewModel.getButtonProperty());
	}

}
