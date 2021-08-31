package Views;

import Controllers.GameController;
import Controllers.MenuController;

import java.io.IOException;

public class MenuView {

    final MenuController menuController = MenuController.getInstance();


    static MenuView menuView;

//    TODO:FIX Instences
//    public static MenuView getInstance(){
//        if(menuView ==null){
//            menuView = new MenuView();
//        }
//        return menuView;
//    }
//
    public MenuView(){
    }

    private GameController gameController;
//  Attributes


//===================================================================
// Go to about me.
//===================================================================
    public void openAboutMe() {
            menuController.openAboutMe();
        }


//===================================================================
// Create a game
//===================================================================

    public void startCreateNewGame() {
            menuController.openCreateAGame();
       }

//===================================================================
// Join a Games
//===================================================================
    public void startJoiningAGame() {
            menuController.openJoinGame();
    }


//===================================================================
// Close Application
//===================================================================

    public void QuitApplication() {
        menuController.QuitApplication();
    }
}
