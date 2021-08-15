package Controllers;

import Exeptions.ExceptionOnStop;
import Views.MenuView;

import java.io.IOException;

public class MenuController {
    static MenuController menuController;

    //    Needed Controllers
    ApplicationController applicationController;
    LobbyController lobbyController;
    MenuView menuView;

    //   Make an Instance

    public static MenuController getInstance() {
        if (menuController == null) {
            menuController = new MenuController();
        }
        return menuController;
    }

    public MenuController() {
//        this.menuView = MenuView.getInstance();
        this.applicationController = ApplicationController.getInstance();
        this.lobbyController = LobbyController.getInstance();
    }

//===================================================================
// Switch to new Screens
//===================================================================
    public void changeToCreateScreen() throws IOException {
        applicationController.fxmlLoad("create");
    }

    public void showAboutMe() throws IOException {
        applicationController.fxmlLoad("about");
    }


//===================================================================
// Go to Create a new Lobby
//===================================================================

    public void openCreateAGame() throws IOException {
        applicationController.fxmlLoad("create");
    }

    //===================================================================
// Go to join a player
//===================================================================
    public void openJoinGame() throws IOException {
        applicationController.fxmlLoad("create");
    }


//===================================================================
// StopGame
//===================================================================

    public void QuitApplication() {
        applicationController.stop();
    }

}
