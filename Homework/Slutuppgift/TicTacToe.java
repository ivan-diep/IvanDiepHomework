

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class TicTacToe extends Application implements EventHandler<ActionEvent> {

	// Grafiska objekt
	TextField inputField;
	ArrayList<Button> numpad;
	GridPane numpadLayout;
	HBox utilContainer;
	BorderPane mainLayout;
	VBox displayLayout;

	String tal1;
	String operation;
	String tal2;

	Button button1;
	Button button2;
	Button button3;
	Button button4;
	Button button5;
	Button button6;
	Button button7;
	Button button8;
	Button button9;
	



	// Minirknare layout
	// mainmetod
	@Override
	public void start(Stage primaryStage) throws Exception {

		// layout
		primaryStage.setTitle("Tic Tac Toe");

		initField();
		initButtons();
		populateNumpad();
		// gör att du inte kan skriva, man kan bara klicka på buttons.
		inputField.setEditable(false);

		displayLayout.getChildren().add(inputField);

		mainLayout.setTop(displayLayout);
		mainLayout.setCenter(numpadLayout);
		mainLayout.setBottom(utilContainer);

		Scene scene = new Scene(mainLayout, 275, 302.5);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	// placering vart knapparna ska vara
	private void populateNumpad() {
		// placering var knapparna ska vara
		numpadLayout.add(button1, 0, 0);
		numpadLayout.add(button2, 1, 0);
		numpadLayout.add(button3, 2, 0);
		numpadLayout.add(button4, 0, 1);
		numpadLayout.add(button5, 1, 1);
		numpadLayout.add(button6, 2, 1);
		numpadLayout.add(button7, 0, 2);
		numpadLayout.add(button8, 1, 2);
		numpadLayout.add(button9, 2, 2);
		
	}

	// placering på mina buttons
	private void initButtons() {
		// Initiate all buttons
		button1 = new Button();
		button1.setTranslateY(10);
		button1.setTranslateX(10);
		button1.setMinWidth(80);
		button1.setMinHeight(80);
		button1.setOnAction(this);

		button2 = new Button();
		button2.setTranslateY(10);
		button2.setTranslateX(20);
		button2.setMinWidth(80);
		button2.setMinHeight(80);
		button2.setOnAction(this);

		button3 = new Button();
		button3.setTranslateY(10);
		button3.setTranslateX(30);
		button3.setMinWidth(80);
		button3.setMinHeight(80);
		button3.setOnAction(this);

		button4 = new Button();
		button4.setTranslateY(20);
		button4.setTranslateX(10);
		button4.setMinWidth(80);
		button4.setMinHeight(80);
		button4.setOnAction(this);

		button5 = new Button();
		button5.setTranslateY(20);
		button5.setTranslateX(20);
		button5.setMinWidth(80);
		button5.setMinHeight(80);
		button5.setOnAction(this);

		button6 = new Button();
		button6.setTranslateY(20);
		button6.setTranslateX(30);
		button6.setMinWidth(80);
		button6.setMinHeight(80);
		button6.setOnAction(this);

		button7 = new Button();
		button7.setTranslateY(30);
		button7.setTranslateX(10);
		button7.setMinWidth(80);
		button7.setMinHeight(80);
		button7.setOnAction(this);

		button8 = new Button();
		button8.setTranslateY(30);
		button8.setTranslateX(20);
		button8.setMinWidth(80);
		button8.setMinHeight(80);
		button8.setOnAction(this);

		button9 = new Button();
		button9.setTranslateY(30);
		button9.setTranslateX(30);
		button9.setMinWidth(80);
		button9.setMinHeight(80);
		button9.setOnAction(this);




	}

	private void initField() {
		inputField = new TextField();
		numpad = new ArrayList<Button>();
		numpadLayout = new GridPane();
		utilContainer = new HBox();
		displayLayout = new VBox();
		mainLayout = new BorderPane();
	}
	// klickbara buttons

	@Override

	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub

		// buttons som går att klicka, event handle gör att knapparna fungerar.
		if (event.getSource().equals(button1)) {
			inputField.textProperty().set(inputField.textProperty().get());
			int test = 2;
			if(test == 1) {
				button1.setText("X");
			} else if (test == 2) {
				button1.setText("O");
			}
		}

		if (event.getSource().equals(button2)) {
			inputField.textProperty().set(inputField.textProperty().get());
		}

		if (event.getSource().equals(button3)) {
			inputField.textProperty().set(inputField.textProperty().get());
		}

		if (event.getSource().equals(button4)) {
			inputField.textProperty().set(inputField.textProperty().get());
		}

		if (event.getSource().equals(button5)) {
			inputField.textProperty().set(inputField.textProperty().get());
		}

		if (event.getSource().equals(button6)) {
			inputField.textProperty().set(inputField.textProperty().get());
		}

		if (event.getSource().equals(button7)) {
			inputField.textProperty().set(inputField.textProperty().get());
		}

		if (event.getSource().equals(button8)) {
			inputField.textProperty().set(inputField.textProperty().get());
		}

		if (event.getSource().equals(button9)) {
			inputField.textProperty().set(inputField.textProperty().get());
		}

	}
}