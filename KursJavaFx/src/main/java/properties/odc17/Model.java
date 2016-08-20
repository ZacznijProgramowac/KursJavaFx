package properties.odc17;

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

public class Model {

	private StringProperty propertyTextField = new SimpleStringProperty("Wartość początkowa");
	private ReadOnlyStringWrapper propertyWraper = new ReadOnlyStringWrapper();
	private ReadOnlyStringProperty readOnlyString = propertyWraper.getReadOnlyProperty();

	public void propertiesShow() {
		StringProperty stringProperty = new SimpleStringProperty();
		IntegerProperty integerProperty = new SimpleIntegerProperty();
		LongProperty longProperty = new SimpleLongProperty();
		DoubleProperty doubleProperty = new SimpleDoubleProperty();
		FloatProperty floatProperty = new SimpleFloatProperty();
		BooleanProperty boolenProprety = new SimpleBooleanProperty();
		ObjectProperty objectProperty = new SimpleObjectProperty();
	}

	public StringProperty getPropertyTextField() {
		return propertyTextField;
	}

	public void setPropertyTextField(StringProperty propertyTextField) {
		this.propertyTextField = propertyTextField;
	}

	public ReadOnlyStringWrapper getPropertyWraper() {
		return propertyWraper;
	}

	public void setPropertyWraper(ReadOnlyStringWrapper propertyWraper) {
		this.propertyWraper = propertyWraper;
	}

	public ReadOnlyStringProperty getReadOnlyString() {
		return readOnlyString;
	}

	public void setReadOnlyString(ReadOnlyStringProperty readOnlyString) {
		this.readOnlyString = readOnlyString;
	}

}
