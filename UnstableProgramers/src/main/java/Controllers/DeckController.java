package Controllers;

import Models.*;

import java.util.ArrayList;

public class DeckController {
    private ArrayList<Card> cards;
    private ArrayList<Card> discardPile;
    private ArrayList<Card> cardPile;
    private ArrayList<Card> destroyPile;

    static DeckController deckController;

    //    Needed Controllers
    private GameController gameController;
    private PlayerController playerController;

    //   Make an Instance

    public static DeckController getInstance(){
        if(deckController ==null){
            deckController = new DeckController();
        }
        return deckController;
    }

    public DeckController() {
//        gameController = GameController.getInstance();
//        playerController = PlayerController.getInstance();
    }

//===================================================================
// Discard pile
//===================================================================

    public void moveCardToDiscardPile(Card card){
        discardPile.add(card);
    }

//===================================================================
// Destroy pile
//===================================================================
    public void moveCardToDestroyPile(Card card){
    destroyPile.add(card);
}

//===================================================================
// Card pile
//===================================================================
    public void moveCardToHand(Card card){
    cardPile.add(card);
}




}
