package Controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplicationController extends Application {

    private static GameController gameController;
    private static FirebaseController fireBaseController;

    static ApplicationController applicationController;

    //    Attributes
    private Parent root;


    //   Make an Instance

    public static ApplicationController getInstance() {
        if (applicationController == null) {
            applicationController = new ApplicationController();
        }
        return applicationController;
    }

    public ApplicationController() {
        gameController = GameController.getInstance();
        fireBaseController = FirebaseController.getInstance();
    }

//===================================================================
// Start Up GUI
//===================================================================


    @Override
    public void start(Stage primaryStage) throws Exception {
        root = fxmlLoading("menu");
        primaryStage.setTitle("Unstable Programmers");

//        Scene
        primaryStage.setScene(new Scene(root, 800, 550));


        primaryStage.show();
    }
//===================================================================
// Stop and starting of game
//===================================================================

    //    Stop
    @Override
    public void stop() throws Exception {
        super.stop();
    }

    //    Start
    public static void main(String[] args) {
        launch(args);
    }

//===================================================================
// Change screen
//===================================================================

    public Parent fxmlLoading(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationController.class.getClassLoader().getResource("fxml/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public void show(String fxmlFile) {

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
