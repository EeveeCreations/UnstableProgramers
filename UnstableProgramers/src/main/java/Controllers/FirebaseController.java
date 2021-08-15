package Controllers;

public class FirebaseController {
    static FirebaseController firebaseController;

    //    Needed Controllers
    ApplicationController applicationController;
    LobbyController lobbyController;

    //   Make an Instance

    public static FirebaseController getInstance(){
        if(firebaseController ==null){
            firebaseController = new FirebaseController();
        }
        return firebaseController;
    }

    public FirebaseController() {
//        this.applicationController = ApplicationController.getInstance();
//        this.lobbyController = LobbyController.getInstance();
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
