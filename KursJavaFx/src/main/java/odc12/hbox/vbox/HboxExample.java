package odc12.hbox.vbox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * JavaFx kurs od podstaw - kontenery HBox i VBox #12
 * 
 * @author ZacznijProgramowac </br>
 *         https://www.youtube.com/watch?v=GgtGVaXKIzw
 */
public class HboxExample extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Label loginLabel = new Label("Login");

		TextField loginField = new TextField();
		loginField.setPrefHeight(25);
		loginField.setPrefWidth(184);

		Label passLabel = new Label("Hasło");

		TextField passField = new TextField();
		passField.setPrefHeight(25);
		passField.setPrefWidth(184);

		CheckBox rememberCheckBox = new CheckBox("Zapamiętaj");

		Button loginButton = new Button("Prześlij");

		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10));
		hbox.setSpacing(10);

		hbox.getChildren().addAll(loginLabel, loginField, passLabel, passField, rememberCheckBox, loginButton);

		Scene scene = new Scene(hbox);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setTitle("Przykładowy Pane");
		stage.show();

	}

}
