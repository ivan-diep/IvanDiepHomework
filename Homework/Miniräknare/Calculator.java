
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.util.ArrayList;

public class Calculator {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
          ArrayList<Button> numpad; 
          numpad = new ArrayList<Button>();
    
          
    }
    private void createButtons(){
    	char[]tecken= {'1', '2','3', '4', '5', '6', '7', '8', '9', '0'};
    	for(char t : tecken) {
    		Button temp = new Button(""+ t);
    		temp.setOnAction((EventHandler<ActionEvent>) this);
    	}
    }
    
   
    }