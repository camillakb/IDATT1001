import Classes.Dish;
import Classes.Menu;
import Classes.Menuregister;

public class restaurantclient {
    
    public static void main (String[] args) {

        Menuregister register = new Menuregister();

        register.addDish(new Dish("Italian appetizer", "Italian", 150));
        register.addDish(new Dish("Italian dinner", "Italian", 200));
        register.addDish(new Dish("Italian dessert", "Italian", 200));
        register.addDish(new Dish("Vegetarian appetizer", "Vegetarian", 100));
        register.addDish(new Dish("Vegetarian dinner", "Vegetarian", 200));
        register.addDish(new Dish("Vegetarian dessert", "Vegetarian", 100));

        register.addMenu(new Menu("Italian", register.getDishesOfType("Italian")));
        register.addMenu(new Menu("Vegetarian", register.getDishesOfType("Vegetarian")));


        System.out.println(register.getDishByName("Italian dinner"));
        System.out.println();
        System.out.println(register.getMenuesBetweenPrices(500, 600));
    }
}
