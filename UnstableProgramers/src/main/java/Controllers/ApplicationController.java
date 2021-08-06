package Controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ApplicationController extends Application {

    private GameController gameController;
    private FireBaseController fireBaseController;


//===================================================================
// Start Up GUI
//===================================================================

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../../resources/sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }


//===================================================================
// Create new Game
//===================================================================


//===================================================================
// Keep Games Separate
//===================================================================


//===================================================================
// Update To Firebase
//===================================================================


//===================================================================
// Private to player
//===================================================================

}
