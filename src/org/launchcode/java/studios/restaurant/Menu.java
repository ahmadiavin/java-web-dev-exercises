package org.launchcode.java.studios.restaurant;
import java.util.ArrayList;
import java.util.Date;
public class Menu {
    //The app should know when the menu was last updated,
    // so visitors can see that the restaurant is constantly changing and adding exciting new items
    private Date lastUpdated;
    //The menu consists of several menu items
    private ArrayList<org.launchcode.java.studios.restaurant.MenuItem> menuItemsList;

    public Menu(Date d, ArrayList <org.launchcode.java.studios.restaurant.MenuItem>mIL){
        this.lastUpdated=d;
        this.menuItemsList=mIL;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setMenuItemsList(ArrayList<org.launchcode.java.studios.restaurant.MenuItem> menuItemsList) {
        this.menuItemsList = menuItemsList;
    }
    public Date getLastUpdated(){
        return lastUpdated;
    }

    public ArrayList<org.launchcode.java.studios.restaurant.MenuItem> getMenuItemsList() {
        return menuItemsList;
    }

    // a way to add menu items from the menu

    public ArrayList<org.launchcode.java.studios.restaurant.MenuItem> addItem(org.launchcode.java.studios.restaurant.MenuItem item){
        this.menuItemsList.add(item);
        return this.menuItemsList;
    }
    // A way to remove menu items from the menu.
    public ArrayList<org.launchcode.java.studios.restaurant.MenuItem> removeItem(org.launchcode.java.studios.restaurant.MenuItem item){
        int itemToRemove = -1;
        for(int index =0; index<menuItemsList.size(); index++){
            if (menuItemsList.get(index).equals(item)){
                itemToRemove=index;
            }
        }
        this.menuItemsList.remove(itemToRemove);
        return this.menuItemsList;
    }

    //A way to tell when the menu was last updated
    public String menuLastUpdated(){
        return ("Last updated on " + this.lastUpdated);
    }

    //A way to print out the entire menu.
    public void printMenu(){
        for (int index = 0; index <menuItemsList.size(); index++){
            //get description at index
            System.out.println(menuItemsList.get(index).getDescription());
        }

    }

}
