package Controllers;

public class FirebaseController {
    static FirebaseController firebaseController;

    //    Needed Controllers
    private ApplicationController applicationController;
    private LobbyController lobbyController;

    //   Make an Instance

    public static FirebaseController getInstance(){
        if(firebaseController ==null){
            firebaseController = new FirebaseController();
        }
        return firebaseController;
    }

    public FirebaseController() {
//        applicationController = ApplicationController.getInstance();
//        lobbyController = LobbyController.getInstance();
    }

//===================================================================
// Connect to Firebase
//===================================================================

//===================================================================
// Add to Firebase
//===================================================================

//===================================================================
// Delete in Firebase
//===================================================================

//===================================================================
// Replace in Firebase
//===================================================================

//===================================================================
// Get from Firebase
//===================================================================


}
