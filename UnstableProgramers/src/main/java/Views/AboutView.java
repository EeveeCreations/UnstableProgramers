package Views;

import Controllers.GameController;

public class AboutView {
    static AboutView aboutView;

    private final GameController gameController = GameController.getInstance();

    public static AboutView getInstance(){
        if(aboutView ==null){
            aboutView = new AboutView();
        }
        return aboutView;
    }
    public AboutView (){
    }

//===================================================================
// Animation
//===================================================================

   public void showAnimation(){}

//===================================================================
// Text
//===================================================================
   public void showText(){}
//===================================================================
// Go back to the main menu
//===================================================================

    public void returnToMenu() {
        this.gameController.returnToMain();
    }
}
