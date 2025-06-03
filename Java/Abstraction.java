import java.util.ArrayList; // Required for using ArrayList
import java.util.List;    // Required for using List interface

// Base Class: Dish
abstract class Dish {
    protected String name;
    protected double price;

    // Calling Constructor
    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Abstract Method => to prepare Dish
    public abstract void prepareDish();

    // Abstract Method => to gather Ingredients
    public abstract List<String> getIngredients();

    // Defining a common functionality for all dishes
    // could also be overridden if needed
    public void serveDish() {
        System.out.println("Serving " + name + " to the customer.");
    }

    // Get the name of the dish
    public String getName() {
        return name;
    }

    // Get the price of dish
    public double getPrice() {
        return price;
    }
}

// Subclass: Pizza
class Pizza extends Dish {
    // Constructor for Pizza, calls the base class (Dish) constructor
    public Pizza(String name, double price) {
        super(name, price);
    }

    // Implementation of the abstract prepareDish method for Pizza
    // To handle Abstract Method Declaration
    @Override
    public void prepareDish() {
        System.out.println("--- Preparing " + name + " ---");
        System.out.println("1. Kneading dough.");
        System.out.println("2. Adding sauce and toppings.");
        System.out.println("3. Baking in oven until golden.");
        System.out.println(name + " is ready!");
    }

    // Implementation of the abstract getIngredients method for Pizza
    public List<String> getIngredients() {
        List<String> ingredients = new ArrayList<>();
        ingredients.add("Flour");
        ingredients.add("Water");
        ingredients.add("Yeast");
        ingredients.add("Tomato Sauce");
        ingredients.add("Cheese");
        ingredients.add("Pepperoni");
        return ingredients;
    }
}

// Subclass: Pasta
class Pasta extends Dish {
    // Constructor for Pasta, calls the base class (Dish) constructor
    public Pasta(String name, double price) {
        super(name, price);
    }

    // Implementation of the abstract prepareDish method for Pasta
    // To handle Abstract Method Declaration
    @Override
    public void prepareDish() {
        System.out.println("--- Preparing " + name + " ---");
        System.out.println("1. Boiling pasta.");
        System.out.println("2. Preparing sauce (e.g., Alfredo).");
        System.out.println("3. Mixing pasta with sauce.");
        System.out.println(name + " is ready!");
    }

    // Implementation of the abstract getIngredients method for Pasta
    @Override
    public List<String> getIngredients() {
        List<String> ingredients = new ArrayList<>();
        ingredients.add("Pasta (Fettuccine)");
        ingredients.add("Cream");
        ingredients.add("Parmesan Cheese");
        ingredients.add("Chicken");
        ingredients.add("Garlic");
        return ingredients;
    }
}

// Restaurant Class (Demonstrates Abstraction in Use)
class Restaurant {
    public void orderDish(Dish dish) {
        if (dish != null) { // Check if the dish object is not null
            System.out.println("\nCustomer ordered: " + dish.getName()
                            + " (Price: $" + dish.getPrice() + ")");

            // The 'prepareDish' method is called.
            dish.prepareDish();

            // The 'serveDish' method is a concrete method from the base class.
            dish.serveDish();

            System.out.print("Ingredients used for " + dish.getName() + ": ");
            for (String ingredient : dish.getIngredients()) {
                System.out.print(ingredient + ", ");
            }
            System.out.println("\n");
        } else {
            System.out.println("Invalid dish ordered.");
        }
    }
}

// Main Class 
class RestaurantApp {
    public static void main(String[] args) {
        // Create a Restaurant object
        Restaurant myRestaurant = new Restaurant();

        // Create concrete dish objects
        Pizza pepperoniPizza = new Pizza("Pepperoni Pizza", 15.99);
        Pasta alfredoPasta = new Pasta("Chicken Alfredo Pasta", 13.75);

        // Order dishes through the restaurant.
        myRestaurant.orderDish(pepperoniPizza);
        myRestaurant.orderDish(alfredoPasta);
    }
}
