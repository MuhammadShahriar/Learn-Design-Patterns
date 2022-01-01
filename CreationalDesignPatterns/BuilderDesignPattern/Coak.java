package CreationalDesignPatterns.BuilderDesignPattern;

public class Coak extends ColdDrinks{
    @Override
    public String name() {
        return "Cock";
    }

    @Override
    public float price() {
        return 10.2f;
    }
}
