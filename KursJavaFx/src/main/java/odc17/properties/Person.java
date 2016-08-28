package odc17.properties;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

	private StringProperty propertyTextField = new SimpleStringProperty(this, "nameProperty", "Jon Snow");
	private IntegerProperty integerProperty = new SimpleIntegerProperty(1111);

	private ReadOnlyStringWrapper propertyWraper = new ReadOnlyStringWrapper(this, "readOnly", "tylko odczyt");
	private ReadOnlyStringProperty readOnlyString = propertyWraper.getReadOnlyProperty();

	public ReadOnlyStringProperty getReadOnlyString() {
		return propertyWraper.getReadOnlyProperty();
	}

	public Person() {

		propertyWraper.set("Jednak zmieniam wartość");
		readOnlyString.get();
	}

	public StringProperty getPropertyTextField() {
		return propertyTextField;
	}

	public void setPropertyTextField(StringProperty propertyTextField) {
		this.propertyTextField = propertyTextField;
	}

	public IntegerProperty getIntegerProperty() {
		return integerProperty;
	}

	public void setIntegerProperty(IntegerProperty integerProperty) {
		this.integerProperty = integerProperty;
	}

	public void propertiesShow() {
		StringProperty stringProperty = new SimpleStringProperty("Jakiś tekst");
		IntegerProperty integerProperty = new SimpleIntegerProperty(1111);
		LongProperty longProperty = new SimpleLongProperty(55555);
		DoubleProperty doubleProperty = new SimpleDoubleProperty(3.0);
		FloatProperty floatProperty = new SimpleFloatProperty(0.3f);
		BooleanProperty boolenProprety = new SimpleBooleanProperty(true);
		ObjectProperty objectProperty = new SimpleObjectProperty(new SimpleStringProperty());
	}

}
