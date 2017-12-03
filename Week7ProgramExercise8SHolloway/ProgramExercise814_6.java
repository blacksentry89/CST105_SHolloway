/**Program: ProgramExercise8
*File: Program Exercise814_6
*Summary: Create a checkerboard
*Author: Steven Holloway
*Date: 12/3/2017
 **/


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;

public class ProgramExercise814_6 extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		GridPane pane = new GridPane();

		// Create rectangles here
		int count = 0;
	//add number for rectangles
		for (int i = 0; i < 8; i++) {
			count++;
			for (int j = 0; j < 8; j++) {
				Rectangle r = new Rectangle(110, 110, 110, 110);
				if (count % 2 == 0)
					r.setFill(Color.WHITE);
				pane.add(r, j, i);
				count++;
			}
		}

		// Create a scene here
		Scene scene = new Scene (pane);
		primaryStage.setTitle("Program Exercise 8 14_6"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}
}