package odc16.border.pane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFx kurs od podstaw - kontener Border Pane #16
 * 
 * @author ZacznijProgramowac </br>
 *         https://www.youtube.com/watch?v=2lA5Gv6kPVo
 */
public class BorderPaneExample extends Application {

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Label topLabel = new Label("Witamy w aplikacji");

		TextArea textArea = new TextArea();
		AnchorPane anchorPaneCenter = new AnchorPane();
		anchorPaneCenter.getChildren().add(textArea);
		AnchorPane.setTopAnchor(textArea, 0.0);
		AnchorPane.setRightAnchor(textArea, 0.0);
		AnchorPane.setBottomAnchor(textArea, 0.0);
		AnchorPane.setLeftAnchor(textArea, 0.0);

		Button open = new Button("Otwórz");
		Button save = new Button("Zapisz");
		Button exit = new Button("Wyjdź");
		VBox vboxLeft = new VBox();
		vboxLeft.getChildren().addAll(open, save, exit);
		vboxLeft.setSpacing(10);
		vboxLeft.setAlignment(Pos.TOP_CENTER);
		vboxLeft.setPadding(new Insets(10));

		Label bottomLabel = new Label("Status programu: OK");

		BorderPane borderPane = new BorderPane();
		borderPane.setTop(topLabel);
		borderPane.setCenter(anchorPaneCenter);
		borderPane.setBottom(bottomLabel);
		borderPane.setLeft(vboxLeft);
		BorderPane.setAlignment(topLabel, Pos.TOP_CENTER);

		Scene scene = new Scene(borderPane, 600, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("BorderPane - przykład");
		primaryStage.show();

	}

}
