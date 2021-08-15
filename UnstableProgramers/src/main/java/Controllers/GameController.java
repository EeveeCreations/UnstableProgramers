package Controllers;

import Exeptions.ExceptionMenu;
import Views.GameView;

import java.io.IOException;

public class GameController {

    static GameController gameController;

    // Needed Controllers and Views
    GameView gameView;

    ApplicationController applicationController;
    LobbyController lobbyController;
    PlayerController playerController;


    //   Make an Instance

    public static GameController getInstance() {
        if (gameController == null) {
            gameController = new GameController();
        }
        return gameController;
    }

    public GameController() {
    }


//===================================================================
// Connect with database
//===================================================================
    public void DataHandler(){
//        this.gameView = GameView.getInstance();
//        this.applicationController = ApplicationController.getInstance();
//        this.lobbyController = LobbyController.getInstance();
//        this.playerController = PlayerController.getInstance();
    }


//===================================================================
// Make a new game
//===================================================================
    public void startNewGame(String hostName) {
        createLobby();
    }

    private void createLobby() {
    }


//===================================================================
// Return to mainMenu
//===================================================================
    public void returnToMain() {
        applicationController = ApplicationController.getInstance();
        try {
            applicationController.fxmlLoad("menu");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}