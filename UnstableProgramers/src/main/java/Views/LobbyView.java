package Views;
import Controllers.GameController;
import Controllers.LobbyController;

public class LobbyView {
    LobbyController lobbyController = LobbyController.getInstance();
    static LobbyView lobbyView;

    public static LobbyView getInstance(){
        if(lobbyView ==null){
            lobbyView = new LobbyView();
        }
        return lobbyView;
    }

    public LobbyView(){

    }
    private GameController gameController;
}
