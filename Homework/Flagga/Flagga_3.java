import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;



public class Flagga_3 extends Application{

	public static void main(String[] args) {
				launch(args);
	}
	

	public void start(Stage primaryStage) throws Exception {
	      //Den ska rita rektangel 
		Rectangle rectangle_1	= new Rectangle();
		Rectangle rectangle_2	= new Rectangle();
		Rectangle rectangle_3	= new Rectangle();
	
		
		//Här bestämmer jag vart färgerna ska vara och hur det ska se ut.

		        rectangle_1.setWidth(600);
				rectangle_1.setHeight(300);
				rectangle_1.setFill(Color.BLUE);
				
				rectangle_2.setTranslateY(140);
				rectangle_2.setWidth(600);
				rectangle_2.setHeight(50);
				rectangle_2.setFill(Color.YELLOW);
				
				rectangle_3.setTranslateX(175);
				rectangle_3.setWidth(50);
				rectangle_3.setHeight(300);
				rectangle_3.setFill(Color.YELLOW);
				
		
		 Group root = new Group(rectangle_1,rectangle_2, rectangle_3);


	      //Creating a scene object 
	      Scene scene = new Scene(root, 600, 300);
	      //Setting title to the Stage 
	      primaryStage.setTitle("Sverige"); 
	      
	      primaryStage.setScene(scene);
	      
	      primaryStage.show();
}
	
}