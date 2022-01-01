package CreationalDesignPatterns.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<Item>();
    private float totalPrice = 0;

    public void addMeal ( Item item ) {
        this.items.add(item);
    }

    public void showitems() {
        for ( Item item : items ) {
            System.out.print("Item: " + item.name());
            System.out.print(" Packing: " + item.packing().pack());
            System.out.println(" Price: " + item.price());
        }
    }

    public float getTotalPrice() {
        for ( Item item: items ) {
            this.totalPrice += item.price();
        }

        return this.totalPrice;
    }

}
