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
    private Scene scene;
    private static Stage primairystage;



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
        applicationController = new ApplicationController();

//        Stage
        primaryStage = new Stage();
        primaryStage.setMinHeight(550);
        primaryStage.setMinWidth(800);


        primaryStage.setTitle("Unstable Programmers");

//        Scene
        scene = new Scene(fxmlLoad("menu"));
        primaryStage.setScene(scene);

        primaryStage.show();
    }
//===================================================================
// Stop and starting of game
//===================================================================

   public void stop(){
        System.exit(0);
   }

    //    Start
    public static void main(String[] args) {
        launch(args);
    }

//===================================================================
// Change screen
//===================================================================

    public Parent fxmlLoad(String fxml) throws IOException {
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
