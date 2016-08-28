package odc06.eventy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;

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
		System.out.println("Jestem kontrolerem 6");
	}

	// Ta metoda zostaje wywolana automatycznie po konstruktorze. Na
	// wstrzyknietym przycisku podmieia nam napis
	@FXML
	void initialize() {
		button.setText("Nowa nazwa");
	}

	// Akcje dla kontrolerk definiujemy w plikach FXML w tym przypadku metoda
	// onAction="#onActionButton"
	// parametr ActionEvent przekazywany do metody pozwala nam wyciągnać wiecej
	// ifnormacji ze zrodla wywolania eventu
	@FXML
	public void onActionButton(ActionEvent e) {
		System.out.println("To jest metoda onActionButton  " + e.getSource());
		if (e.getSource() instanceof CheckBox) {
			System.out.println("Dodatkowa informacja od CheckBoxa");
		}
	}

	// Akcje dla kontrolerk definiujemy w plikach FXML w tym przypadku metoda
	// onMouseEntered="#onMouseEnteredButton"
	@FXML
	public void onMouseEnteredButton(MouseEvent e) {
		System.out.println("To jest metoda onMouseEnteredButton " + e.getSource());
	}

}
