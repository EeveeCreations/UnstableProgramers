package Controllers;

public class HandController {

    private final int MAX_CARDS = 7;
    private final int MIN_CARDS = 1;

    static HandController handController;

    //    Needed Controllers
    CardController cardController;
    PlayerController playerController;

    //   Make an Instance

    public static HandController getInstance() {
        if (handController == null) {
            handController = new HandController();
        }
        return handController;
    }

    public HandController() {
        this.cardController = CardController.getInstance();
        this.playerController = PlayerController.getInstance();
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
