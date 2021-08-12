package Controllers;

public class GameController {

    static GameController gameController;

    //    Needed Controllers
    private ApplicationController applicationController;
    private LobbyController lobbyController;
    private PlayerController playerController;


    //   Make an Instance

    public static GameController getInstance() {
        if (gameController == null) {
            gameController = new GameController();
        }
        return gameController;
    }

    public GameController() {
//        applicationController = ApplicationController.getInstance();
//        lobbyController = LobbyController.getInstance();
//        playerController = PlayerController.getInstance();
    }
}
