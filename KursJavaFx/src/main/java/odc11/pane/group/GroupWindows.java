package odc11.pane.group;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * JavaFx kurs od podstaw - kontenery Pane i Group #11
 * 
 * @author ZacznijProgramowac </br>
 *         https://www.youtube.com/watch?v=Q3hRExH0_J0
 */
public class GroupWindows extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Przykład konternera GROUP napisanego w javie
		Group group = new Group();

		// definiujemy kontrolki i ustawiamy ich pozycje
		Label loginLabel = new Label("Login");
		loginLabel.setLayoutX(63);
		loginLabel.setLayoutY(76);

		// definiujemy kontrolki i ustawiamy ich pozycje oraz rozmiar
		// preferowany
		TextField loginField = new TextField();
		loginField.setLayoutX(63);
		loginField.setLayoutY(93);
		loginField.setPrefHeight(25);
		loginField.setPrefWidth(184);

		Label passLabel = new Label("Hasło");
		passLabel.setLayoutX(63);
		passLabel.setLayoutY(136);

		TextField passField = new TextField();
		passField.setLayoutX(63);
		passField.setLayoutY(153);
		passField.setPrefHeight(25);
		passField.setPrefWidth(184);

		CheckBox rememberCheckBox = new CheckBox("Zapamiętaj");
		rememberCheckBox.setLayoutX(63);
		rememberCheckBox.setLayoutY(192);

		Button loginButton = new Button("Prześlij");
		loginButton.setLayoutX(195);
		loginButton.setLayoutY(211);

		// zdefiniowane elementy wystarczy dodac do konternera Group za pomoca
		// metody getChildren()
		group.getChildren().addAll(loginLabel, loginField, passLabel, passField, loginButton, rememberCheckBox);

		Scene scene = new Scene(group);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setTitle("Przykładowy Pane");
		stage.setResizable(false);
		stage.show();

	}

}
