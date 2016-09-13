package odc19.przyklad.bindowanie;

import java.time.LocalDate;

import javafx.beans.binding.When;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PersonViewModel {

	// textfield imie
	private StringProperty nameProperty = new SimpleStringProperty();

	// widocznosc/ niewidocznosc label OK imie
	private BooleanProperty nameOkProperty = new SimpleBooleanProperty(false);

	// textfield naziwsko
	private StringProperty surnameProperty = new SimpleStringProperty();

	// wylaczenie/wlaczenie pola nazwisko
	private BooleanProperty disableSurnameProperty = new SimpleBooleanProperty(true);

	// widocznosc/ niewidocznosc label OK naziwsko
	private BooleanProperty surnameOKProperty = new SimpleBooleanProperty(false);

	// textfield - rok urodzenia
	private IntegerProperty yearProperty = new SimpleIntegerProperty();

	// przyjmuje wartosc checkBox
	private BooleanProperty confirmProperty = new SimpleBooleanProperty(false);

	// obliczony wiek
	private StringProperty ageProperty = new SimpleStringProperty();

	// wlacz/wylacz przycisk
	private BooleanProperty buttonProperty = new SimpleBooleanProperty(false);

	// aktualny rok
	private IntegerProperty actualYearProperty = new SimpleIntegerProperty(LocalDate.now().getYear());

	public PersonViewModel() {
		nameOkProperty.bind(nameProperty.isNotEmpty());
		surnameOKProperty.bind(surnameProperty.isNotEmpty());
		disableSurnameProperty.bind(nameProperty.isEmpty());
		buttonProperty.bind(confirmProperty.not());
		ageProperty.bind(new When(yearProperty.isNotEqualTo(0))
				.then(actualYearProperty.subtract(yearProperty).asString()).otherwise(""));
	}

	public BooleanProperty getButtonProperty() {
		return buttonProperty;
	}

	public void setButtonProperty(BooleanProperty buttonProperty) {
		this.buttonProperty = buttonProperty;
	}

	public IntegerProperty getActualYearProperty() {
		return actualYearProperty;
	}

	public void setActualYearProperty(IntegerProperty actualYearProperty) {
		this.actualYearProperty = actualYearProperty;
	}

	public BooleanProperty getDisableSurnameProperty() {
		return disableSurnameProperty;
	}

	public void setDisableSurnameProperty(BooleanProperty disableSurnameProperty) {
		this.disableSurnameProperty = disableSurnameProperty;
	}

	public StringProperty getNameProperty() {
		return nameProperty;
	}

	public void setNameProperty(StringProperty nameProperty) {
		this.nameProperty = nameProperty;
	}

	public StringProperty getSurnameProperty() {
		return surnameProperty;
	}

	public void setSurnameProperty(StringProperty surnameProperty) {
		this.surnameProperty = surnameProperty;
	}

	public IntegerProperty getYearProperty() {
		return yearProperty;
	}

	public void setYearProperty(IntegerProperty yearProperty) {
		this.yearProperty = yearProperty;
	}

	public BooleanProperty getConfirmProperty() {
		return confirmProperty;
	}

	public void setConfirmProperty(BooleanProperty confirmProperty) {
		this.confirmProperty = confirmProperty;
	}

	public StringProperty getAgeProperty() {
		return ageProperty;
	}

	public void setAgeProperty(StringProperty ageProperty) {
		this.ageProperty = ageProperty;
	}

	public BooleanProperty getNameOkProperty() {
		return nameOkProperty;
	}

	public void setNameOkProperty(BooleanProperty nameOkProperty) {
		this.nameOkProperty = nameOkProperty;
	}

	public BooleanProperty getSurnameOKProperty() {
		return surnameOKProperty;
	}

	public void setSurnameOKProperty(BooleanProperty surnameOKProperty) {
		this.surnameOKProperty = surnameOKProperty;
	}

}
