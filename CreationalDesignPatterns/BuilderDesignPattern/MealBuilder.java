package CreationalDesignPatterns.BuilderDesignPattern;

public class MealBuilder {
    public Meal PrepareVegMeal() {
        Meal meal = new Meal();
        meal.addMeal( new VegBurger() );
        meal.addMeal( new Pepsi());

        return meal;
    }

    public Meal PrepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addMeal( new ChickenBurger() );
        meal.addMeal( new Coak());

        return meal;
    }
    
}
