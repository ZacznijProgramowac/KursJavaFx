package odc05.kontroler.wstrzykiwanie;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Ten kontroller obsluguje formatkę StackPaneWindows.fxml w katalogu
 * fxml/odc05/ wczytywana w klasie Main. W kontrolerze tym mozemy wstrzykiwac
 * elementy umieszczone na formtce jak przyciski, pola tekstowe etc Wazne aby
 * plik FXML mial takze informacje jaki kontroler go obsluguje. Patrz linia 7 w
 * pliku StackPaneWindows.fxml Kontroler jest definiowany przez:
 * fx:controller="odc05.kontroler.wstrzykiwanie.StackPaneController"
 *
 */
public class StackPaneController {

	// Wstrzykujemy przycisk z formatki FXML za pomca metody @FXML, przycisk
	// musi miec ustawiony
	// parametr fx:id="button"
	@FXML
	private Button button;

	public StackPaneController() {
		System.out.println("Jestem kontrolerem");
	}

	// Ta metoda zostaje wywolana automatycznie po konstruktorze. Na
	// wstrzyknietym przycisku podmieia nam napis
	@FXML
	void initialize() {
		button.setText("Nowa nazwa");
	}

}
