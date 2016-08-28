package odc15.anchor.pane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * JavaFx kurs od podstaw - kontener Anchor Pane #15
 * 
 * @author ZacznijProgramowac </br>
 *         https://www.youtube.com/watch?v=dgScLKk1txE
 */
public class AchorPaneExample extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		TextField textField = new TextField();
		CheckBox rememberCheckBox = new CheckBox();
		Button acceptButton = new Button("Zapisz");
		Button cancelButton = new Button("Anuluj");

		AnchorPane anchorPane = new AnchorPane();
		anchorPane.setPrefHeight(300);
		anchorPane.setPrefWidth(500);

		anchorPane.getChildren().addAll(textField, rememberCheckBox, acceptButton, cancelButton);

		AnchorPane.setTopAnchor(textField, 10.0);
		AnchorPane.setRightAnchor(textField, 10.0);
		AnchorPane.setBottomAnchor(textField, 40.0);
		AnchorPane.setLeftAnchor(textField, 10.0);

		AnchorPane.setLeftAnchor(rememberCheckBox, 10.0);
		AnchorPane.setBottomAnchor(rememberCheckBox, 10.0);

		AnchorPane.setBottomAnchor(acceptButton, 10.0);
		AnchorPane.setRightAnchor(acceptButton, 70.0);

		AnchorPane.setBottomAnchor(cancelButton, 10.0);
		AnchorPane.setRightAnchor(cancelButton, 10.0);

		Scene scene = new Scene(anchorPane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("AcnhorPane - przykład");
		primaryStage.show();

	}

}
