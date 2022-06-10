package MenuRegisters;

import java.util.ArrayList;

/**
 * Class to initialize a Menu object with relevant methods.
 */

public class Menu {
    
    private String menuName;
    private ArrayList<Dish> dishes;

    /**
     * Simple constructor for the Menu object.
     * @param menuName the name of the menu.
     * @param dishes the dishes on the menu.
     */
    public Menu(String menuName, ArrayList<Dish> dishes) {
        this.menuName = menuName;
        this.dishes = dishes;
    }

    /**
     * Get-method for the menu's name.
     * @return the name of the menu.
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * Get-method for the price of the menu.
     * @return the price of the menu.
     */
    public double getMenuPrice() {
        double sum = 0;
        for (Dish dish : this.dishes) {
            sum += dish.getPrice();
        }

        return sum;
    }

    /**
     * ToString method for the Menu object.
     */
    public String toString() {
        String listOfMenus = "";
        listOfMenus = listOfMenus.concat("Name of menu: " + getMenuName());
        listOfMenus = listOfMenus.concat("\nDishes in the menu: \n");
        
        for (Dish dish : this.dishes) {
            listOfMenus = listOfMenus.concat(dish.toString() + "\n\n");
        }

        listOfMenus = listOfMenus.concat("Total price: " + getMenuPrice());

        return listOfMenus;
    }
}
