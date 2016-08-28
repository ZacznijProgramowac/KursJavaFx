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
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

/**
 * JavaFx kurs od podstaw - kontener Grid Pane #14
 * 
 * @author ZacznijProgramowac </br>
 *         https://www.youtube.com/watch?v=WkwBmFc9oA8
 */
public class MainGridPane extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) {
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

		GridPane gridPane = new GridPane();
		gridPane.addColumn(0, loginLabel, loginField, passLabel, passField, rememberCheckBox, loginButton);
		gridPane.setPadding(new Insets(10));
		// gridPane.setGridLinesVisible(true);

		ColumnConstraints column1 = new ColumnConstraints(300);
		gridPane.getColumnConstraints().add(column1);

		RowConstraints row1 = new RowConstraints(50);
		row1.setValignment(VPos.BOTTOM);
		gridPane.getRowConstraints().add(row1);

		RowConstraints row2 = new RowConstraints(50);
		row2.setValignment(VPos.TOP);
		gridPane.getRowConstraints().add(row2);

		RowConstraints row3 = new RowConstraints(50);
		row3.setValignment(VPos.BOTTOM);
		gridPane.getRowConstraints().add(row3);

		RowConstraints row4 = new RowConstraints(50);
		row4.setValignment(VPos.TOP);
		gridPane.getRowConstraints().add(row4);

		RowConstraints row5 = new RowConstraints(50);
		row5.setValignment(VPos.BOTTOM);
		gridPane.getRowConstraints().add(row5);

		RowConstraints row6 = new RowConstraints(50);
		row6.setValignment(VPos.TOP);
		gridPane.getRowConstraints().add(row6);

		GridPane.setHalignment(loginButton, HPos.RIGHT);

		Scene scene = new Scene(gridPane);
		stage.setScene(scene);
		stage.setTitle("GridPane1");
		stage.show();

	}

}