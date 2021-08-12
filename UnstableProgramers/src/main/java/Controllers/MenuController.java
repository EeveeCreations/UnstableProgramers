package Controllers;

import Exeptions.ExceptionOnStop;

public class MenuController {
    static MenuController menuController;

    //    Needed Controllers
    private ApplicationController applicationController;
    private LobbyController lobbyController;

    //   Make an Instance

    public static MenuController getInstance(){
        if(menuController ==null){
            menuController = new MenuController();
        }
        return menuController;
    }

    public MenuController(){
        applicationController = ApplicationController.getInstance();
//        lobbyController = LobbyController.getInstance();
    }


//===================================================================
// Open menu
//===================================================================

 

//===================================================================
// Close menu
//===================================================================



//===================================================================
// Change menu
//===================================================================



//===================================================================
// StopGame
//===================================================================

    public void QuitApplication(){
            applicationController.stop();
    }

}
