package CreationalDesignPatterns.BuilderDesignPattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal1 = mealBuilder.PrepareVegMeal();
        meal1.showitems();

        Meal meal2 = mealBuilder.PrepareNonVegMeal();
        meal2.showitems();
    }
}
