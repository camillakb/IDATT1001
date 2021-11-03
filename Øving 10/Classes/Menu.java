package Classes;

import java.util.ArrayList;

public class Menu {
    
    private String menuName;
    private ArrayList<Dish> dishes;

    public Menu(String menuName, ArrayList<Dish> dishes) {
        this.menuName = menuName;
        this.dishes = dishes;
    }

    public String getMenuName() {
        return menuName;
    }

    public ArrayList<Dish> getDishes() {
        return dishes;
    }

    public double getMenuPrice() {
        double sum = 0;
        for (Dish dish : this.dishes) {
            sum += dish.getPrice();
        }

        return sum;
    }

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
