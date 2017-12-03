/**Program: ProgramExercise8
 * File: ProgramExercise814_3
 * Summary: Generates 3 random cards
 * Author: Steven Holloway
 * Date: December 3, 2017
 **/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import java.util.ArrayList;
import javafx.geometry.Pos;

public class ProgramExercise814_3 extends Application {
	@Override
	public void start(Stage primaryStage) {
		// Create a list of cards
		ArrayList<Integer> cards = getCards();
		//insert VBox here
		VBox pane = new VBox(5);
                pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(5, 5, 5, 5));

		for (int i = 0; i < 3; i++) {
			pane.getChildren().add(new ImageView(new Image("images/card/" +
				cards.get(i) + ".png")));
		}

		// Create a scene here
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Program Exercise 8 14_3"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}

	//list card numbers 1-52
	private ArrayList<Integer> getCards() {
		ArrayList<Integer> cards = new ArrayList<>();
		for (int i = 0; i < 52; i++) {
			cards.add(i + 1);
		}
		java.util.Collections.shuffle(cards);
		return cards;
                //end method
	}
}