package Views;

import Controllers.MenuController;

public class MenuView {
    private final MenuController menuController = MenuController.getInstance();

    public void QuitApplication(){
        menuController.QuitApplication();
    }
}
