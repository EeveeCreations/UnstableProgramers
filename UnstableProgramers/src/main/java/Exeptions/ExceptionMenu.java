package Exeptions;

public class ExceptionMenu extends Exception {

    @Override
    public String getMessage() {
        String message;
        message = "The menu has failed to load excuse us for a moment";
        return message;
    }
}
