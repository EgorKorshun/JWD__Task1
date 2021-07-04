package by.epamtc.korshun.task1.par7;

public class NullPointException extends  Exception{
    public NullPointException() {
    }

    public NullPointException(String message) {
        super(message);
    }

    public NullPointException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullPointException(Throwable cause) {
        super(cause);
    }
}
