package Views;

import Controllers.GameController;
import Controllers.LobbyController;
import Controllers.MenuController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CreateView {

    public LobbyController lobbyController = LobbyController.getInstance();
    public GameController gameController = GameController.getInstance();

    @FXML
    private Button GameButton;
    @FXML
    private Button JoinGameButton;
    @FXML
    private TextField PlayerName;
    @FXML
    private TextField GameCode;

    static CreateView createView;

    public static CreateView getInstance(){
        if(createView ==null){
            createView = new CreateView();
        }
        return createView;
    }
   public CreateView (){}


    public String getPlayerName(){
        return PlayerName.getText();
    }
//===================================================================
// Create a new Game
//===================================================================

    public void createANewGame() {
        this.gameController.startNewGame(getPlayerName());
    }
    public void  showNewGameOptions(){
//        JoinGameButton.styleProperty().setValue("display: none");
    }

//===================================================================
// Join a Game
//===================================================================
    public void JoinAGame() {
       String gameCode = GameCode.getText();
        this.lobbyController.joingame(gameCode, getPlayerName());
    }

    public void showJoinGameOptions() {
        GameButton.styleProperty().setValue("display: none;");
        GameCode.styleProperty().setValue("display: none;");

    }
//===================================================================
// Go back to the main menu
//===================================================================

    public void returnToMenu() {
        this.gameController.returnToMain();
    }
}
