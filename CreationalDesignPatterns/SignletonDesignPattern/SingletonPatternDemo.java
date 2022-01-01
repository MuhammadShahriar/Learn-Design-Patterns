package CreationalDesignPatterns.SignletonDesignPattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.printMessage();
        singleObject.setMessage("Hellow");
        singleObject.printMessage();

        SingleObject singleObject2 = SingleObject.getInstance();
        singleObject2.printMessage();
    }
}
