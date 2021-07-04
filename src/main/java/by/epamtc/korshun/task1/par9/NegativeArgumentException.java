package by.epamtc.korshun.task1.par9;

public class NegativeArgumentException extends  Exception{
    public NegativeArgumentException() {
    }

    public NegativeArgumentException(String message) {
        super(message);
    }

    public NegativeArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeArgumentException(Throwable cause) {
        super(cause);
    }
}
