package Controllers;

import Views.LobbyView;

public class LobbyController {

    //    Needed Controllers
    FirebaseController fireBaseController;
    PlayerController playerController;
    GameController gameController;

    LobbyView lobbyView;

    static LobbyController lobbyController;

    //   Make an Instance

    public static LobbyController getInstance() {
        if (lobbyController == null) {
            lobbyController = new LobbyController();
        }
        return lobbyController;
    }

    public LobbyController() {
//        TODO: Findout why applicatiion doesnt run without this commented
//        this.lobbyView = LobbyView.getInstance();
//        this.fireBaseController = FirebaseController.getInstance();
//        this.gameController = GameController.getInstance();
//        this.playerController = PlayerController.getInstance();
    }


//===================================================================
// Create Lobby
//===================================================================


//===================================================================
// Enter Lobby
//===================================================================
    public void joingame(String gameCode, String playerName) {
        if(checkIfCodeExcists(gameCode) &&
        checkIfPlayerNameExists(playerName)){

        }
        else {
            //TODO: set an alert to send  player back
        }
    }

    private boolean checkIfPlayerNameExists(String PlayerName) {
        boolean check = false;
        return check;
    }

    private boolean checkIfCodeExcists(String gameCode) {
        boolean check = false;
        return check;
    }

//===================================================================
// Delete Lobby
//===================================================================


//===================================================================
// Start Lobby
//===================================================================


}
