package MenuRegisters;

/**
 * Class to initialize the Dish object with relevant methods.
 */

public class Dish {
    
    private String name;
    private String type;
    private double price;

    /**
     * Simple constructor to initialize a Dish object.
     * @param name the name of the dish.
     * @param type the type of dish.
     * @param price the price of the dish.
     */
    public Dish(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    /**
     * Get-method for the name of the dish.
     * @return the name of the dish.
     */
    public String getName() {
        return name;
    }

    /**
     * Get-method for the type of dish.
     * @return the type of dish.
     */
    public String getType() {
        return type;
    }

    /**
     * Get-method for the price of the dish.
     * @return the price of the dish.
     */
    public double getPrice() {
        return price;
    }

    /**
     * ToString method for the Dish object.
     */
    public String toString() {
        String listOfDishes = "";
        listOfDishes = listOfDishes.concat("Name of the dish: " + getName());
        listOfDishes = listOfDishes.concat("\nType of dish: " + getType());
        listOfDishes = listOfDishes.concat("\nPrice: " + getPrice());

        return listOfDishes;
    }
}
