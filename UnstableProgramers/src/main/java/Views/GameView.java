package Views;

import Views.GameView;
import Controllers.GameController;

public class GameView {

    static GameView gameView;

    public static GameView getInstance(){
        if(gameView ==null){
            gameView = new GameView();
        }
        return gameView;
    }

    public GameView(){

    }
    private GameController gameController;

}
