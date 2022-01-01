package CreationalDesignPatterns.BuilderDesignPattern;

public class Pepsi extends ColdDrinks{
    @Override
    public String name() {
        return "Pepsi";
    }

    public float price() {
        return 11.3f;
    }
}
