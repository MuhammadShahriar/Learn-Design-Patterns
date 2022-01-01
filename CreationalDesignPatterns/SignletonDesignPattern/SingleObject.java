package CreationalDesignPatterns.SignletonDesignPattern;

public class SingleObject {
    private static SingleObject instance = new SingleObject();
    private String message = "Hi";

    public static SingleObject getInstance() {
        return instance;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(this.message);
    }
}
