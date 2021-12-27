public class WrongLoginException extends Exception {

//    WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами –
//    один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.


    private String info;


    public WrongLoginException(String message) {
        super(message);
        info = message;
    }

    @Override
    public String toString() {
        return info + " Details of WrongLoginException:";
    }


}
