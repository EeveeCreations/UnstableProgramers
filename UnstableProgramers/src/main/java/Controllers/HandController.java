package Controllers;

public class HandController {

    private final int MAX_CARDS = 7;
    private final int MIN_CARDS = 1;

    static HandController handController;

    //    Needed Controllers
    private CardController cardController;
    private PlayerController playerController;

    //   Make an Instance

    public static HandController getInstance() {
        if (handController == null) {
            handController = new HandController();
        }
        return handController;
    }

    public HandController() {
        cardController = CardController.getInstance();
        playerController = PlayerController.getInstance();
    }

//===================================================================
// Destroy a card
//===================================================================

//===================================================================
// Discard a card
//===================================================================

//===================================================================
// Place card to a stable
//===================================================================

//===================================================================
// Play a card
//===================================================================


}
