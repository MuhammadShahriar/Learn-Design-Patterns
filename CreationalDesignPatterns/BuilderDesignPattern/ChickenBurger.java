package CreationalDesignPatterns.BuilderDesignPattern;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 55.5f;
    }
}
