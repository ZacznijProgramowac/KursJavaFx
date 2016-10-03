package odc21.observable.list;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

	private StringProperty name = new SimpleStringProperty();
	private StringProperty surname = new SimpleStringProperty();

	public Person(String name, String surname) {
		this.name.set(name);
		this.surname.set(surname);
	}

	public StringProperty getName() {
		return name;
	}

	public void setName(StringProperty name) {
		this.name = name;
	}

	public StringProperty getSurname() {
		return surname;
	}

	public void setSurname(StringProperty surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return name.get() + " " + surname.get();
	}

}
