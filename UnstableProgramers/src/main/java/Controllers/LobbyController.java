package Controllers;

public class LobbyController {

    //    Needed Controllers
    private FirebaseController fireBaseController;
    private PlayerController playerController;
    private GameController gameController;

    static LobbyController lobbyController;

    //   Make an Instance

    public static LobbyController getInstance() {
        if (lobbyController == null) {
            lobbyController = new LobbyController();
        }
        return lobbyController;
    }

    public LobbyController() {
//        fireBaseController = FirebaseController.getInstance();
//        gameController = GameController.getInstance();
//        playerController = PlayerController.getInstance();
    }
//===================================================================
// Create Lobby
//===================================================================


//===================================================================
// Enter Lobby
//===================================================================


//===================================================================
// Delete Lobby
//===================================================================


//===================================================================
// Start Lobby
//===================================================================


}
