package Classes;

import java.util.ArrayList;

public class Menuregister {
    
    private ArrayList<Dish> dishes;
    private ArrayList<Menu> menus;

    public Menuregister() { //Constructor
        this.menus = new ArrayList<Menu>();
        this.dishes = new ArrayList<Dish>();
    }
    
    public void addDish(Dish newDish) { //Add a new dish.
        this.dishes.add(newDish);
    }
    
    public Dish getDishByName(String names) { //Find a dish by name.
        for(Dish dish : this.dishes) {
            if(dish.getName().equals(names)) {
                return dish;
            }
        } 
        return null;
    }

    public ArrayList<Dish> getDishesOfType(String types) { //Get dishes based on type of dish.
        ArrayList<Dish> resultList = new ArrayList<Dish>();

        for (Dish dish : this.dishes) {
            if(dish.getType().equals(types)) {
                resultList.add(dish);
            }
        }
        return resultList;
    }
    
    public void addMenu(Menu newMenu) { //Add a new menu containing a set of dishes.
        this.menus.add(newMenu);
    }
    


    public ArrayList<Menu> getMenuesBetweenPrices(double lowestPrice, double highestPrice) { //Get menus with a total price in a set interval.
        ArrayList<Menu> resultList = new ArrayList<Menu>();

        for (Menu menu : this.menus) {
            if(lowestPrice <= menu.getMenuPrice() && menu.getMenuPrice() <= highestPrice) {
                resultList.add(menu);
            }
        }
        return resultList;
    }
    
}
