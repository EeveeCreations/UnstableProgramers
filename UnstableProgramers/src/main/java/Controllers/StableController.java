package Controllers;

public class StableController {

    //    Needed Controllers
    private CardController cardController;
    private PlayerController playerController;

    static StableController stableController;

    //   Make an Instance

    public static StableController getInstance() {
        if (stableController == null) {
            stableController = new StableController();
        }
        return stableController;
    }

    public StableController() {
        this.cardController = CardController.getInstance();
        this.playerController = PlayerController.getInstance();
    }
//===================================================================
// Upgrade
//===================================================================


//===================================================================
// Downgrade
//===================================================================


//===================================================================
// Basic Unicorn
//===================================================================


//===================================================================
// Special Unicorn
//===================================================================

}
