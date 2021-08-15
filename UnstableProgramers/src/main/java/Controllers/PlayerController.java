package Controllers;

public class PlayerController {

    //    Needed Controllers
    LobbyController lobbyController;
    HandController handController;
    StableController stableController;

    static PlayerController playerController;

    //   Make an Instance

    public static PlayerController getInstance() {
        if (playerController == null) {
            playerController = new PlayerController();
        }
        return playerController;
    }

    public PlayerController() {
        this.handController = HandController.getInstance();
        this.lobbyController = LobbyController.getInstance();
        this.stableController = StableController.getInstance();
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
