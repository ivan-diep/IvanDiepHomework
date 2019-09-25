import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;



public class Flagga_1 extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				launch(args);
	}
	

	public void start(Stage primaryStage) throws Exception {
	      //Den ska rita rektangel 
		Rectangle rectangle_1	= new Rectangle();
		Rectangle rectangle_2	= new Rectangle();

		
		
		//Här bestämmer jag vart färgerna ska vara och hur det ska se ut.

		rectangle_1.setWidth(200);
		rectangle_1.setHeight(400);
		rectangle_1.setFill(Color.BLUE);
		
		rectangle_2.setTranslateX(400);
		rectangle_2.setWidth(200);
		rectangle_2.setHeight(400);
		rectangle_2.setFill(Color.RED);
		
		 Group root = new Group(rectangle_1,rectangle_2);


	      //Creating a scene object 
	      Scene scene = new Scene(root, 600, 300);
	      //Setting title to the Stage 
	      primaryStage.setTitle("Drawing a Circle"); 
	      
	      primaryStage.setScene(scene);
	      
	      primaryStage.show();
}
	
}