public class WrongPasswordException extends Exception {

    private String info;


    public WrongPasswordException(String message) {
        super(message);
        info = message;
    }

    @Override
    public String toString() {
        return info + " Details of WrongPasswordException:";
    }

}
