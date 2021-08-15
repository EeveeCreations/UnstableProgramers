package Controllers;

import Models.Game;

public class CardController {

    //Needed Controllers
    DeckController deckController;
    PlayerController playerController;
    GameController gameController;

    static CardController cardController;

    //    Get Instance
    public static CardController getInstance() {
        if (cardController == null) {cardController = new CardController();}
        return cardController;
    }

    public CardController() {
        this.deckController = DeckController.getInstance();
        this.playerController = PlayerController.getInstance();
        this.gameController = GameController.getInstance();
    }
}
