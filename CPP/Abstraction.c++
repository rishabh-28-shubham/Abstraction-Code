#include <bits/stdc++.h>
using namespace std;

// Base Class : Dish
class Dish
{
protected: // Protected members are accessible by derived classes
    string name;
    double price;

public:
    // Calling Constructor
    Dish(const string &name, double price) : name(name), price(price) {}

    // Pure Virtual Function => to prepare Dish
    virtual void prepareDish() const = 0;

    // Pure Virtual Function => to gather Ingredients
    virtual vector<string> getIngredients() const = 0;

    // Defining a common functionality for all dishes
    // could also be overridden if needed
    void serverDish() const
    {
        cout << "Serving" << name << "to the customer." << endl;
    }

    // Get the name of the dish
    string getName() const
    {
        return name;
    }

    // Get the price of dish
    double getPrice() const
    {
        return price;
    }

    // Virtual Destructor
    virtual ~Dish() = default;
};

// Subclass: Pizza
class Pizza : public Dish
{
public:
    // Constructor for Pizza, calls the base class (Dish) constructor
    Pizza(const string &name, double price) : Dish(name, price) {}

    // Implementation of the abstract prepareDish method for Pizza
    // To handle Pure Virtual Function Deceleration
    void prepareDish() const override
    {
        cout << "--- Preparing " << name << " ---" << endl;
        cout << "1. Kneading dough." << endl;
        cout << "2. Adding sauce and toppings." << endl;
        cout << "3. Baking in oven until golden." << endl;
        cout << name << " is ready!" << endl;
    }

    // Implementation of the abstract getIngredients method for Pizza
    vector<string> getIngredients() const override
    {
        return {"Flour", "Water", "Yeast", "Tomato Sauce", "Cheese", "Pepperoni"};
    }
};

// Concrete Subclass: Pasta
class Pasta : public Dish
{
public:
    // Constructor for Pasta, calls the base class (Dish) constructor
    Pasta(const string &name, double price) : Dish(name, price) {}

    // Implementation of the abstract prepareDish method for Pasta
    // To handle Pure Virtual Function Deceleration
    void prepareDish() const override
    {
        cout << "--- Preparing " << name << " ---" << endl;
        cout << "1. Boiling pasta." << endl;
        cout << "2. Preparing sauce (e.g., Marinara)." << endl;
        cout << "3. Mixing pasta with sauce." << endl;
        cout << name << " is ready!" << endl;
    }

    // Implementation of the abstract getIngredients method for Pasta
    vector<string> getIngredients() const override
    {
        return {"Pasta (Durum Wheat)", "Tomatoes", "Garlic", "Olive Oil", "Herbs"};
    }
};

// Restaurant Class (Demonstrates Abstraction in Use)
class Restaurant
{
public:
    void orderDish(Dish *dish)
    {
        if (dish)
        { // Check if the dish pointer is not null
            cout << "\nCustomer ordered: " << dish->getName() << " (Price: $" << dish->getPrice() << ")" << endl;

            // The 'prepareDish' method is called.
            dish->prepareDish();

            // The 'serverDish' method is a concrete method from the base class.
            dish->serverDish();

            cout << "Ingredients used for " << dish->getName() << ": ";
            for (const string &ingredient : dish->getIngredients())
            {
                cout << ingredient << ", ";
            }
            cout << "\n"<< endl;
        }
        else
        {
            cout << "Invalid dish ordered." << endl;
        }
    }
};

// Main Function
int main()
{
    // Create a Restaurant object
    Restaurant myRestaurant;

    // Create concrete dish objects
    Pizza pepperoniPizza("Pepperoni Pizza", 15.99);
    Pasta spaghettiBolognese("Spaghetti Bolognese", 12.50);

    // Order dishes through the restaurant.
    myRestaurant.orderDish(&pepperoniPizza);
    myRestaurant.orderDish(&spaghettiBolognese);

    return 0;
}