package illegalTriangleException;

public class IllegalTriangleException extends Exception {
    String s;

    public IllegalTriangleException(String message) {
        super(message);
        this.s = message;
    }

}
