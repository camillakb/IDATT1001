package Classes;
public class Dish {
    
    private String name;
    private String type;
    private double price;

    public Dish(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        String listOfDishes = "";
        listOfDishes = listOfDishes.concat("Name of the dish: " + getName());
        listOfDishes = listOfDishes.concat("\nType of dish: " + getType());
        listOfDishes = listOfDishes.concat("\nPrice: " + getPrice());

        return listOfDishes;
    }
    
}
