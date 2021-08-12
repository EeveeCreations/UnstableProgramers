package Controllers;

public class PlayerController {

    //    Needed Controllers
    private LobbyController lobbyController;
    private HandController handController;
    private StableController stableController;

    static PlayerController playerController;

    //   Make an Instance

    public static PlayerController getInstance() {
        if (playerController == null) {
            playerController = new PlayerController();
        }
        return playerController;
    }

    public PlayerController() {
        handController = HandController.getInstance();
        lobbyController = LobbyController.getInstance();
        stableController = StableController.getInstance();
    }

//===================================================================
// Update
//===================================================================


//===================================================================
// Delete
//===================================================================


//===================================================================
// Change Lobby
//===================================================================


//===================================================================
// Join Lobby
//===================================================================


}
