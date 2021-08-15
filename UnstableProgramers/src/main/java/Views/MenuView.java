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
//    public MenuView(){
//
//    }
    private GameController gameController;
//  Attributes


//===================================================================
// Go to about me.
//===================================================================
    public void openAboutMe() {
        try {
            menuController.showAboutMe();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


//===================================================================
// Create a game
//===================================================================

    public void startCreateNewGame() {
        try {
            menuController.openCreateAGame();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//===================================================================
// Join a Game
//===================================================================
    public void startJoiningAGame() {
        try {
            menuController.openJoinGame();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


//===================================================================
// Close Application
//===================================================================

    public void QuitApplication() {
        menuController.QuitApplication();
    }
}
