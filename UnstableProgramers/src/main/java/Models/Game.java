package Models;

public class Game {
    public String state;
    public Player host;
    public int lobbyCode;
    public int players;

    public String chat;
    public String eventLog;

    public boolean QUEENBEE = false;



//  Constructor

    public Game(String state, Player host, int lobbyCode, int players, String chat) {
        this.state = state;
        this.host = host;
        this.lobbyCode = lobbyCode;
        this.players = players;
        this.chat = chat;
    }


//    Getters

    public String getState() {
        return state;
    }

    public Player getHost() {
        return host;
    }

    public int getLobbyCode() {
        return lobbyCode;
    }

    public int getPlayers() {
        return players;
    }

    public String getChat() {
        return chat;
    }

    public String getEventLog() {
        return eventLog;
    }

    public boolean isQUEENBEE() {
        return QUEENBEE;
    }


//    Setters
    public void setState(String state) {
        this.state = state;
    }

    public void setHost(Player host) {
        this.host = host;
    }

    public void setLobbyCode(int lobbyCode) {
        this.lobbyCode = lobbyCode;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    public void setEventLog(String eventLog) {
        this.eventLog = eventLog;
    }

    public void setQUEENBEE(boolean QUEENBEE) {
        this.QUEENBEE = QUEENBEE;
    }
}
