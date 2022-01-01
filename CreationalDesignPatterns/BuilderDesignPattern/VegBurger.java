package CreationalDesignPatterns.BuilderDesignPattern;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 30.5f;
    }
}
