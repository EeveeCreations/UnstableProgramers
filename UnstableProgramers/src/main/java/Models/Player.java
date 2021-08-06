package Models;

public class Player {
    //    Attributes
    private String name;
    private String babyCorn;

    private Lobby lobby;
    private Hand hand;
    private Stable stable;

    //    Constructor

    public Player(String name, String babyCorn, Lobby lobby) {
        this.name = name;
        this.babyCorn = babyCorn;
        this.lobby = lobby;
    }

    //    Setters
    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void setStable(Stable stable) {
        this.stable = stable;
    }

    //    Getters
    public String getName() {
        return name;
    }

    public String getBabyCorn() {
        return babyCorn;
    }

    public Lobby getLobby() {
        return lobby;
    }

    public Hand getHand() {
        return hand;
    }

    public Stable getStable() {
        return stable;
    }
}
