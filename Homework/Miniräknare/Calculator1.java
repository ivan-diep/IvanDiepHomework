
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

public class Calculator1 extends Application implements EventHandler<ActionEvent>{
	
	//Grafiska objekt
    TextField inputField;
    ArrayList<Button> numpad;
    GridPane numpadLayout;
    HBox utilContainer;
    BorderPane mainLayout;
    VBox displayLayout;    
    
 	Button button1;
	Button button2;
	Button button3;
	Button button4;
	Button button5;
	Button button6;
	Button button7;
	Button button8;
	Button button9;
	Button button0;
	Button buttonAdd;
	Button buttonSub;
	Button buttonDiv;  
	Button buttonMulti;
	Button buttonSumma;  
	Button buttonDelete;    




	@Override
    public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Kalkulatorn");
		
		initField();
		initButtons();
		populateNumpad();
		
		displayLayout.getChildren().add(inputField);
		
		mainLayout.setTop(displayLayout);
		mainLayout.setCenter(numpadLayout);
		mainLayout.setBottom(utilContainer);
		
		Scene scene = new Scene(mainLayout, 250, 275);
		primaryStage.setScene(scene);
		primaryStage.show();
        
    }
    
	
    
	private void populateNumpad() {
        numpadLayout.add(button1, 0, 0);
    	numpadLayout.add(button2, 1, 0);
    	numpadLayout.add(button3, 2, 0);
    	numpadLayout.add(button4, 0, 1);
    	numpadLayout.add(button5, 1, 1);
    	numpadLayout.add(button6, 2, 1);
    	numpadLayout.add(button7, 0, 2);
    	numpadLayout.add(button8, 1, 2);
    	numpadLayout.add(button9, 2, 2);
    	numpadLayout.add(button0, 0, 3);
    	numpadLayout.add(buttonSumma, 1, 3);
    	numpadLayout.add(buttonDelete, 2, 3);
    	numpadLayout.add(buttonAdd, 4, 0);
    	numpadLayout.add(buttonSub, 4, 1);
    	numpadLayout.add(buttonMulti, 4, 2);
    	numpadLayout.add(buttonDiv, 4, 3);		







	}



	private void initButtons() {
		//Initiate all buttons
    	button1 = new Button("1");
		button1.setTranslateY(10);
		button1.setTranslateX(10);
    	button1.setMinWidth(50);
    	button1.setMinHeight(50);
    	button1.setOnAction(this);
    	
    	button2 = new Button("2");
		button2.setTranslateY(10);
		button2.setTranslateX(20);
    	button2.setMinWidth(50);
    	button2.setMinHeight(50);
    	button2.setOnAction(this);
    	
    	button3 = new Button("3");
		button3.setTranslateY(10);
		button3.setTranslateX(30);
    	button3.setMinWidth(50);
    	button3.setMinHeight(50);
    	button3.setOnAction(this);

    	button4 = new Button("4");
		button4.setTranslateY(20);
		button4.setTranslateX(10);
    	button4.setMinWidth(50);
    	button4.setMinHeight(50);
    	button4.setOnAction(this);

    	
    	button5 = new Button("5");
		button5.setTranslateY(20);
		button5.setTranslateX(20);
    	button5.setMinWidth(50);
    	button5.setMinHeight(50);
    	button5.setOnAction(this);

    	
    	button6 = new Button("6");
		button6.setTranslateY(20);
		button6.setTranslateX(30);
    	button6.setMinWidth(50);
    	button6.setMinHeight(50);
    	button6.setOnAction(this);

    	
    	button7 = new Button("7");
		button7.setTranslateY(30);
		button7.setTranslateX(10);
    	button7.setMinWidth(50);
    	button7.setMinHeight(50);
    	button7.setOnAction(this);
    	
    	button8 = new Button("8");
		button8.setTranslateY(30);
		button8.setTranslateX(20);
    	button8.setMinWidth(50);
    	button8.setMinHeight(50);
    	button8.setOnAction(this);
    	
    	button9 = new Button("9");
		button9.setTranslateY(30);
		button9.setTranslateX(30);
    	button9.setMinWidth(50);
    	button9.setMinHeight(50);
    	button9.setOnAction(this);
    	
    	button0 = new Button("0");
		button0.setTranslateY(40);
		button0.setTranslateX(10);
    	button0.setMinWidth(50);
    	button0.setMinHeight(50);
    	button0.setOnAction(this);
    	
    	buttonSumma = new Button("=");
    	buttonSumma.setTranslateY(40);
    	buttonSumma.setTranslateX(20);
    	buttonSumma.setMinWidth(50);
    	buttonSumma.setMinHeight(50);
    	buttonSumma.setOnAction(this);
    	
    	buttonDelete = new Button("C");
    	buttonDelete.setTranslateY(40);
    	buttonDelete.setTranslateX(30);
    	buttonDelete.setMinWidth(50);
    	buttonDelete.setMinHeight(50);
    	buttonDelete.setOnAction(this);
    	
    	buttonAdd = new Button("+");
    	buttonAdd.setTranslateY(10);
    	buttonAdd.setTranslateX(40);
    	buttonAdd.setMinWidth(50);
    	buttonAdd.setMinHeight(50);
    	buttonAdd.setOnAction(this);

    	buttonSub = new Button("-");
    	buttonSub.setTranslateY(20);
    	buttonSub.setTranslateX(40);
    	buttonSub.setMinWidth(50);
    	buttonSub.setMinHeight(50);
    	buttonSub.setOnAction(this);
    	
    	buttonMulti = new Button("x");
    	buttonMulti.setTranslateY(30);
    	buttonMulti.setTranslateX(40);
    	buttonMulti.setMinWidth(50);
    	buttonMulti.setMinHeight(50);
    	buttonMulti.setOnAction(this);
    	
    	buttonDiv = new Button("/");
    	buttonDiv.setTranslateY(40);
    	buttonDiv.setTranslateX(40);
    	buttonDiv.setMinWidth(50);
    	buttonDiv.setMinHeight(50);
    	buttonDiv.setOnAction(this);

    	
	}

	private void initField(){
	    inputField = new TextField();
        numpad = new ArrayList<Button>();
        numpadLayout = new GridPane();
        utilContainer = new HBox();
        displayLayout = new VBox();
        mainLayout = new BorderPane();
    }




	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
		if(event.getSource().equals(button1))
		{
			inputField.textProperty().set(inputField.textProperty().get() + "1");
		}
		
		
		if(event.getSource().equals(button2))
		{
			inputField.textProperty().set(inputField.textProperty().get() + "2");
		}
		
		if(event.getSource().equals(button3))
		{
			inputField.textProperty().set(inputField.textProperty().get() + "3");
		}
		
		if(event.getSource().equals(button4))
		{
			inputField.textProperty().set(inputField.textProperty().get() + "4");
		}
		
		if(event.getSource().equals(button5))
		{
			inputField.textProperty().set(inputField.textProperty().get() + "5");
		}
		
		if(event.getSource().equals(button6))
		{
			inputField.textProperty().set(inputField.textProperty().get() + "6");
		}
		
		if(event.getSource().equals(button7))
		{
			inputField.textProperty().set(inputField.textProperty().get() + "7");
		}
		
		if(event.getSource().equals(button8))
		{
			inputField.textProperty().set(inputField.textProperty().get() + "8");
		}
		
		if(event.getSource().equals(button9))
		{
			inputField.textProperty().set(inputField.textProperty().get() + "9");
		}
		
		if(event.getSource().equals(button0))
		{
			inputField.textProperty().set(inputField.textProperty().get() + "0");
		}
		
		if(event.getSource().equals(buttonSumma))
		{
			inputField.textProperty().set(inputField.textProperty().get() + "=");
		}
		
		if(event.getSource().equals(buttonDelete))
		{
			inputField.textProperty().set(inputField.textProperty().get() + "C");
		}
		
		if(event.getSource().equals(buttonAdd))
		{
			inputField.textProperty().set(inputField.textProperty().get() + "+");
		}
		
		if(event.getSource().equals(buttonSub))
		{
			inputField.textProperty().set(inputField.textProperty().get() + "-");
		}
		
		if(event.getSource().equals(buttonMulti))
		{
			inputField.textProperty().set(inputField.textProperty().get() + "x");
		}
		
		if(event.getSource().equals(buttonDiv))
		{
			inputField.textProperty().set(inputField.textProperty().get() + "/");
		}
		
		
	}


}