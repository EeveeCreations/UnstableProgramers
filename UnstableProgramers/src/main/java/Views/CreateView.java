package Views;

import Controllers.GameController;
import Controllers.LobbyController;
import Controllers.MenuController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CreateView {

    public LobbyController lobbyController = LobbyController.getInstance();
    public GameController gameController = GameController.getInstance();

    @FXML
    private Button GameButton;
    @FXML
    private Button JoinGameButton;


    static CreateView createView;

    public static CreateView getInstance(){
        if(createView ==null){
            createView = new CreateView();
        }
        return createView;
    }
    public CreateView (){}

    //===================================================================
// Create a new Game
//===================================================================
    public void createANewGame(String hostName) {
        this.gameController.startNewGame(hostName);
    }

    //===================================================================
// Join a Game
//===================================================================
    public void JoinAGame(String gameCode, String playerName) {
        this.lobbyController.joingame(gameCode, playerName);
    }

//===================================================================
// Go back to the main menu
//===================================================================

    public void backToMain(String gameCode) {
        this.gameController.returnToMain();
    }

}
