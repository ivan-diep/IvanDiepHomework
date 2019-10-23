
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

public class Calculator1 extends Application {
	
	
    TextField inputField;
    ArrayList<Button> numpad;
    GridPane numpadLayout;
    HBox utilContainer;
    BorderPane mainLayout;
    VBox displayLayout;
    
    

	@Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Kalkulatorn");
        
        
     	Button button1 = new Button();
    	Button button2 = new Button();
    	Button button3 = new Button();
    	Button button4 = new Button();
    	Button button5 = new Button();
    	Button button6 = new Button();
    	Button button7 = new Button();
    	Button button8 = new Button();
    	Button button9 = new Button();
    	Button button0 = new Button();
    
    	button1 = new Button("1");
		button1.setTranslateY(10);
		button1.setTranslateX(10);
    	button1.setMinWidth(40);
    	button1.setMinHeight(40);
    	
    	button2 = new Button("2");
		button2.setTranslateY(10);
		button2.setTranslateX(20);
    	button2.setMinWidth(40);
    	button2.setMinHeight(40);
    	
    	button3 = new Button("3");
		button3.setTranslateY(10);
		button3.setTranslateX(30);
    	button3.setMinWidth(40);
    	button3.setMinHeight(40);

    	button4 = new Button("4");
		button4.setTranslateY(20);
		button4.setTranslateX(10);
    	button4.setMinWidth(40);
    	button4.setMinHeight(40);

        initField();
    	numpadLayout.add(button1, 0, 0);
    	numpadLayout.add(button2, 1, 0);
    	numpadLayout.add(button3, 2, 0);
    	numpadLayout.add(button4, 0, 1);




 		

      displayLayout.getChildren().add(inputField);

      mainLayout.setTop(displayLayout);
      mainLayout.setCenter(numpadLayout);
      mainLayout.setBottom(utilContainer);

        Scene scene = new Scene(mainLayout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
	
    
	private void initField(){
	
    

    	
        inputField = new TextField();
        numpad = new ArrayList<Button>();
        numpadLayout = new GridPane();
        utilContainer = new HBox();
        displayLayout = new VBox();
        mainLayout = new BorderPane();
    }


}