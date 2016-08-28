package odc07.event.handler;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
		System.out.println("Jestem kontrolerem");
	}

	// Ta metoda zostaje wywolana automatycznie po konstruktorze. Na
	// wstrzyknietym przycisku podmieia nam napis
	@FXML
	void initialize() {
		// definiujemy handler za pomoca klasy anonimowej
		EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("To jest handler zdefiniowany w klasie anonimowej");
			}
		};
		// dodajemy handler do przycisku
		button.addEventHandler(ActionEvent.ACTION, handler);

		// definiujemy handler wyrazenia lambda
		EventHandler<MouseEvent> mouseHandlerLambda = e -> {
			System.out.println("To jest handler lambda");
		};
		// dodajemy handler
		button.addEventHandler(MouseEvent.MOUSE_ENTERED, mouseHandlerLambda);

		// najprosciej definiowac akcje dla przycisku ze pomoca metod setOn..
		button.setOnAction(e -> {
			System.out.println("To jest handler setOnAction");
			// jezeli nacisniemy przycisk handler MOUSER ENTERED zostanie
			// usuniety
			button.removeEventHandler(MouseEvent.MOUSE_ENTERED, mouseHandlerLambda);
		});
	}

}
