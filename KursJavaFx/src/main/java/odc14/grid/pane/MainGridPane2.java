package odc14.grid.pane;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * JavaFx kurs od podstaw - kontener Grid Pane #14
 * 
 * @author ZacznijProgramowac </br>
 *         https://www.youtube.com/watch?v=WkwBmFc9oA8
 */
public class MainGridPane2 extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label loginLabel = new Label("Login");

		TextField loginField = new TextField();
		loginField.setPrefHeight(25);
		loginField.setPrefWidth(184);

		Label passLabel = new Label("Hasło");
		passLabel.setLayoutX(63);
		passLabel.setLayoutY(136);

		TextField passField = new TextField();
		passField.setPrefHeight(25);
		passField.setPrefWidth(184);

		CheckBox rememberCheckBox = new CheckBox("Zapamiętaj");

		Button loginButton = new Button("Prześlij");

		GridPane gridPane = new GridPane();
		gridPane.setVgap(10);
		gridPane.setHgap(10);
		gridPane.setPadding(new Insets(10));

		gridPane.getChildren().addAll(loginLabel, loginField, passLabel, passField, rememberCheckBox, loginButton);

		GridPane.setConstraints(loginLabel, 0, 0);
		GridPane.setConstraints(loginField, 0, 1);
		GridPane.setConstraints(passLabel, 0, 2);
		GridPane.setConstraints(passField, 0, 3);
		GridPane.setConstraints(rememberCheckBox, 0, 4, 1, 1, HPos.LEFT, VPos.TOP);
		GridPane.setConstraints(loginButton, 0, 5, 1, 1, HPos.RIGHT, VPos.TOP);

		Scene scene = new Scene(gridPane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("GridPane2");
		primaryStage.show();
	}

}
