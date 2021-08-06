package Models;

public class Lobby {
    //    Attributes
    private int players;
    private char lobbyCode;
    private Game game;

    //    Constructor
    public Lobby(int players, char lobbyCode, Game game) {
        this.players = players;
        this.lobbyCode = lobbyCode;
        this.game = game;
    }


    //    Setters
    public void setPlayers(int players) {
        this.players = players;
    }

    public void setLobbyCode(char lobbyCode) {
        this.lobbyCode = lobbyCode;
    }

    public void setGame(Game game) {
        this.game = game;
    }


    //    Getters
    public int getPlayers() {
        return players;
    }

    public char getLobbyCode() {
        return lobbyCode;
    }

    public Game getGame() {
        return game;
    }
}
