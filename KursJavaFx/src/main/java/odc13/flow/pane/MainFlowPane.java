package odc13.flow.pane;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * JavaFx kurs od podstaw - kontener Flow Pane #13
 * 
 * @author ZacznijProgramowac </br>
 *         https://www.youtube.com/watch?v=327H_iqQzzg
 */
public class MainFlowPane extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) {
		Label loginLabel = new Label("Login");
		loginLabel.setLayoutX(63);
		loginLabel.setLayoutY(76);

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

		FlowPane flowPane = new FlowPane(Orientation.VERTICAL, 0, 10);
		flowPane.setPrefWidth(230);
		flowPane.setPrefHeight(340);
		flowPane.setAlignment(Pos.TOP_CENTER);
		flowPane.getChildren().addAll(loginLabel, loginField, passLabel, passField, loginButton, rememberCheckBox);

		Scene scene = new Scene(flowPane);
		stage.setScene(scene);
		stage.setTitle("FlowPane");
		stage.show();
	}

}