/**Program: ProgramExercise8
*File: Program Exercise814_4
*Summary: Create random colored java signs
*Author: Steven Holloway
*Date: 12/3/2017
 **/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ProgramExercise814_4 extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		HBox hBox = new HBox(10);
		hBox.setPadding(new Insets(10, 10, 10, 10));
		hBox.setAlignment(Pos.CENTER);

		// Add text to hBox here
		for (int i = 0; i < 5; i++) {
			// Crate Calibri text
			Text text = new Text("Java");
			text.setFont(Font.font("Calibri", FontWeight.BOLD,
			FontPosture.ITALIC, 32));
			text.setRotate(90);

			// Set a random color
			text.setFill(new Color(Math.random(), Math.random(), 
				Math.random(), Math.random()));
			hBox.getChildren().add(text);
		}

		// Create a scene here
		Scene scene = new Scene(hBox, 400, 200);
		primaryStage.setTitle("Program Exercise8 14_4");//set title
		primaryStage.setScene(scene); 
		primaryStage.show(); 
                //end method
	}
}