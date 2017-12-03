/**Program: NFLDraftFX
 * File: NFLDraftFX.java
 * Summary: Generates JavaFX for NFL Draft
 * Author: Steven Holloway
 * Date: November 25, 2017
 **/

package nfldraftfx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class NFLDraftFX extends Application {

    @Override
    public void start(Stage primaryStage) {

        //instantiate Manager createPlayers method
        Manager manager = new Manager();
        manager.createPlayers(10);

        //create listView nodes
        ListView<String> draftedPlayers = new ListView();
        draftedPlayers.setMinWidth(1150);
        ListView<String> allPlayers = new ListView();
        allPlayers.setMinWidth(1150);
        
        //populate availablePlayers with player names and positions only
        manager.availablePlayers.forEach((player) -> {
            allPlayers.getItems().add(player.toString());
        }); //observable list for getting selected index value
        //ObservableList index1 = availablePlayers.getSelectionModel().getSelectedIndices();
        //create button nodes and actions


        Button draft = new Button();
        draft.setText("DRAFT");
        draft.setOnAction(e -> {
            draftedPlayers.getItems().add(allPlayers.getSelectionModel().getSelectedItem());
            allPlayers.getItems().remove(allPlayers.getSelectionModel().getSelectedItem());
            manager.availablePlayers.remove(allPlayers.getSelectionModel().getSelectedIndex());
        });

        Button remove = new Button();
        remove.setText("REMOVE");
        remove.setOnAction(e -> {
            allPlayers.getItems().remove(allPlayers.getSelectionModel().getSelectedItem());
            manager.availablePlayers.remove(allPlayers.getSelectionModel().getSelectedIndex());
        });

        //create labels

        Label drafted = new Label("Drafted Players");
        drafted.setFont(javafx.scene.text.Font.font("Times New Roman", FontWeight.BOLD, 14));
        
        Label available = new Label("Available Players");
        available.setFont(javafx.scene.text.Font.font("Times New Roman", FontWeight.BOLD, 14));
    
        //hbox for center buttons
        HBox buttons = new HBox(40);
        buttons.setAlignment(Pos.CENTER);
        buttons.getChildren().addAll(remove, draft);
        
        HBox playersBox = new HBox(20);
        playersBox.setAlignment(Pos.CENTER);
        playersBox.getChildren().addAll(available, allPlayers);
        
        HBox draftedBox = new HBox(20);
        draftedBox.setAlignment(Pos.CENTER);
        draftedBox.getChildren().addAll(drafted, draftedPlayers);
        
        Image image = new Image("image/NFLPIC.png");
        ImageView imageView = new ImageView(image);
        
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(20);
        vbox.getChildren().addAll(imageView, playersBox, buttons, draftedBox);


        //creates the scene
        Scene scene = new Scene(vbox);

        //displays primaryStage maximized to the user
        primaryStage.setMaximized(true);
        primaryStage.setTitle("NFL Draft");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
}