package MenuRegisters;

import java.util.ArrayList;

/**
 * Class to initialize a Menuregister with relevant methods.
 */

public class Menuregister {
    
    private ArrayList<Dish> dishes;
    private ArrayList<Menu> menus;

    /**
     * Simple constructor for the Menuregister.
     */
    public Menuregister() { 
        this.menus = new ArrayList<Menu>();
        this.dishes = new ArrayList<Dish>();
    }
    
    /**
     * Method to add a new dish to the menu register.
     * @param newDish the dish that will be added to the menu register.
     */
    public void addDish(Dish newDish) { 
        this.dishes.add(newDish);
    }
    
    /**
     * Method to get a dish by it's name.
     * @param names the name of the dish.
     * @return the dish with the given name (null if it does not exist).
     */
    public Dish getDishByName(String names) { 
        for (Dish dish : this.dishes) {
            if (dish.getName().equals(names)) {
                return dish;
            }
        } 

        return null;
    }

    /**
     * Method to get dishes based on the type of dish.
     * @param types the type of dish.
     * @return a list of dishes of the given type.
     */
    public ArrayList<Dish> getDishesOfType(String types) { 
        ArrayList<Dish> resultList = new ArrayList<Dish>();

        for (Dish dish : this.dishes) {
            if(dish.getType().equals(types)) {
                resultList.add(dish);
            }
        }
        return resultList;
    }
    
    /**
     * Method to add a new menu to the menu register.
     * @param newMenu the new menu that will be added to the menu register.
     */
    public void addMenu(Menu newMenu) { 
        this.menus.add(newMenu);
    }
    
    /**
     * Method to get menu's between two given prices.
     * @param lowestPrice the lowest price.
     * @param highestPrice the highest price.
     * @return a list of menu's in the given price interval.
     */
    public ArrayList<Menu> getMenuesBetweenPrices(double lowestPrice, double highestPrice) { //Get menus with a total price in a set interval.
        ArrayList<Menu> resultList = new ArrayList<Menu>();

        for (Menu menu : this.menus) {
            if (lowestPrice <= menu.getMenuPrice() && menu.getMenuPrice() <= highestPrice) {
                resultList.add(menu);
            }
        }

        return resultList;
    }
}
