package basic;

public class Authenticationbean {

    private String message;

    public Authenticationbean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "AuthBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
