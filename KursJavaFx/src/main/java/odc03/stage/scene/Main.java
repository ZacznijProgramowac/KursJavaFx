package odc03.stage.scene;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * JavaFx kurs od podstaw - czym jest Stage i Scene? #3
 * 
 * @author ZacznijProgramowac </br>
 *         https://www.youtube.com/watch?v=q1YU3QhpB1g
 */

// Nasza klasa musi rozszerzac klase Application z JavaFx
public class Main extends Application {

	public static void main(String[] args) {
		// musimy wywolac metode launch, ktora uruchomi nasza aplikacje w JavaFx
		launch(args);
	}

	// Po roszerzeniu klasy Application musimy zaimplementowac metode start, w
	// ktorej mamy pierwszy
	// Stage aplikacji
	@Override
	public void start(Stage primaryStage) throws Exception {

		// StakPane jest kontenerem, ktory zawiera w sobie kontrolki jak Buttony
		StackPane stackPane = new StackPane();
		Button button = new Button("Przycisk");

		// metoda getChildren służy do pobrania listy elementów jakie ma w sobie
		// stackPane, majac liste mozna dodac do niej przycisk
		stackPane.getChildren().add(button);

		// Scena sluzy do wyswietlania elementow jakie zdefiniowalismy
		// Dodajemy kontener, mozna tez zdefiniowac wielkosc sceny
		Scene scene = new Scene(stackPane, 400, 600);

		// Scena zostaje umieszczona w Stage
		primaryStage.setScene(scene);

		primaryStage.setTitle("Pierwsze okno");

		/**
		 * Stage posiada w sobie wiele metod, ktore zmieniaja jego dzialanie i
		 * wyglad
		 */
		// blokowanie zmiany rozmiaru okna myszka
		primaryStage.setResizable(false);

		// uruchomienie w trybie pelnoekranowym
		primaryStage.setFullScreen(true);

		// zmiana wygladu okna, usuniecie belki systemowej
		primaryStage.initStyle(StageStyle.UNDECORATED);

		// przezroczystosc okna
		primaryStage.setOpacity(0.8);

		// wywolannie okna na ekranie
		primaryStage.show();

	}

}
