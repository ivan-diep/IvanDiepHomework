
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
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

      initField();

      displayLayout.getChildren().add(inputField);

      mainLayout.setTop(displayLayout);
      mainLayout.setCenter(numpadLayout);
      mainLayout.setBottom(utilContainer);

        Scene scene = new Scene(mainLayout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    @SuppressWarnings("unchecked")
	private void initField(){
    	char[]tecken= {'1', '2','3', '4', '5', '6', '7', '8', '9', '0'};
    	for(char t : tecken) {
    		Button temp = new Button(""+ t);
    		temp.setOnAction((EventHandler<ActionEvent>) this);
    	}
    

    	
        inputField = new TextField();
        numpad = new ArrayList<Button>();
        numpadLayout = new GridPane();
        utilContainer = new HBox();
        displayLayout = new VBox();
        mainLayout = new BorderPane();
    }


}