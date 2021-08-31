package Controllers;

import Views.CreateView;
import Views.MenuView;

public class MenuController {
    static MenuController menuController;

    //    Needed Controllers
    ApplicationController applicationController;
    LobbyController lobbyController;
    CreateView createView;
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
        this.createView = CreateView.getInstance();
        this.applicationController = ApplicationController.getInstance();
        this.lobbyController = LobbyController.getInstance();
    }

//===================================================================
// Switch to new Screens
//===================================================================

    public void openAboutMe() {
        applicationController.show("about");
    }


//===================================================================
// Go to Create a new Lobby
//===================================================================

    public void openCreateAGame(){
        applicationController.show("create");
        createView.showNewGameOptions();
    }

    //===================================================================
// Go to join a player
//===================================================================
    public void openJoinGame(){
        applicationController.show("create");
        createView.showJoinGameOptions();
    }


//===================================================================
// StopGame
//===================================================================

    public void QuitApplication() {
        applicationController.stop();
    }

}
