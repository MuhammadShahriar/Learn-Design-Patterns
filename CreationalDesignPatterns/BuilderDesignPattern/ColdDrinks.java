package CreationalDesignPatterns.BuilderDesignPattern;

public abstract class ColdDrinks implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
