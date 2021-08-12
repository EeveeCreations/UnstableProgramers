package Controllers;

import Models.Game;

public class CardController {

    //Needed Controllers
    private DeckController deckController;
    private PlayerController playerController;
    private GameController gameController;

    static CardController cardController;

    //    Get Instance
    public static CardController getInstance() {
        if (cardController == null) {cardController = new CardController();}
        return cardController;
    }

    public CardController() {
        deckController = DeckController.getInstance();
        playerController = PlayerController.getInstance();
        gameController = GameController.getInstance();
    }
}
