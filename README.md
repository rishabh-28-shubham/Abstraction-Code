# Abstraction in OOP: Restaurant Dish Example

This repository contains code examples demonstrating the fundamental concept of **Abstraction** in Object-Oriented Programming (OOP). It uses a relatable "restaurant dish" analogy to illustrate how abstract classes, inheritance, and polymorphism work together to simplify complex systems by hiding unnecessary details.

## 🍽️ The Restaurant Analogy for Abstraction

Imagine you're at a restaurant. When you order a "Pizza," you don't need to know the intricate details of how the chef kneads the dough, prepares the sauce, or bakes it in the oven. You simply interact with the concept of a "Pizza" – you order it, and you receive a delicious, prepared dish. The complex preparation process is **abstracted** away from you, the customer.

In OOP, abstraction works similarly. We define a high-level concept (like a `Dish`) that specifies *what* something does, without revealing *how* it does it. The specific implementations (like `Pizza` or `Pasta`) then handle the "how."

## 💻 Code Examples

This repository provides the "restaurant dish" abstraction example implemented in two popular OOP languages:

1.  **C++**
2.  **Java**

Both implementations showcase:
* An **abstract base class** (`Dish`) defining common properties and abstract methods.
* **Concrete subclasses** (`Pizza`, `Pasta`) that extend the abstract class and provide specific implementations for the abstract methods.
* A **client class** (`Restaurant`) that interacts with the abstract `Dish` type polymorphically, demonstrating how complexity is hidden.

### C++ Code

The C++ code can be found in the `cpp/` directory (or directly in the root if you prefer a single file structure).

**Key files:**
* `main.cpp` (contains the `Dish`, `Pizza`, `Pasta`, and `Restaurant` classes)

**How to Compile and Run (C++):**

1.  **Save the code:** Save the C++ code (e.g., from `main.cpp`) to a file named `main.cpp`.
2.  **Compile:** Open a terminal or command prompt and use a C++ compiler (like g++):
    ```bash
    g++ main.cpp -o restaurant_app
    ```
3.  **Run:** Execute the compiled program:
    ```bash
    ./restaurant_app
    ```

**Expected Output:**

### Java Code

The Java code can be found in the `java/` directory (or directly in the root if you prefer a single file structure).

**Key files:**
* `Dish.java`
* `Pizza.java`
* `Pasta.java`
* `Restaurant.java`
* `RestaurantApp.java` (contains the `main` method)

**How to Compile and Run (Java):**

1.  **Save the code:** Save each Java class into its respective `.java` file (e.g., `Dish.java`, `Pizza.java`, etc.). Ensure all files are in the same directory.
2.  **Compile:** Open a terminal or command prompt and use the Java compiler:
    ```bash
    javac *.java
    ```
3.  **Run:** Execute the main application class:
    ```bash
    java RestaurantApp
    ```

**Expected Output:**
## 💡 Key Concepts Demonstrated

* **Abstraction:** Hiding complex implementation details and showing only essential features.
* **Abstract Classes:** Classes that cannot be instantiated directly and often contain abstract (pure virtual in C++) methods. They serve as blueprints.
* **Inheritance:** Concrete classes (`Pizza`, `Pasta`) inheriting properties and behaviors from the abstract `Dish` class.
* **Polymorphism:** The ability to treat objects of different classes (e.g., `Pizza` and `Pasta`) through a common interface (`Dish`), allowing the same method call (`prepareDish()`) to behave differently based on the actual object type at runtime.

## 🤝 Contributing

Feel free to fork this repository, suggest improvements, or add examples in other programming languages!

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🔗 Connect with Me

If you found this example helpful, consider connecting with me on my other platforms:

* [Medium](https://medium.com/@rishabhvishwarkarma)
* [Instagram](https://www.instagram.com/rish_vish_28_ur?igsh=NjY0bjVxYXR2OW83)
* [LinkedIn](https://www.linkedin.com/in/rishabhvishwakarma28/)
* [GitHub](https://github.com/rishabh-28-shubham)

Thank you for exploring this abstraction example!
