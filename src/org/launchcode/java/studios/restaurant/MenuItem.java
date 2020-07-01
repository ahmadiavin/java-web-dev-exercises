package org.launchcode.java.studios.restaurant;

public class MenuItem{
    //Each menu item has a price, description, and category (appetizer, main course, or dessert)
    private double price;
    private String description;
    private String category;
    //It should be possible to display whether a menu item is new or not
    private boolean isNew;

    public MenuItem(double p, String d, String c, boolean iN){
        this.price=p;
        this.description=d;
        this.category=c;
        this.isNew=iN;
    }

    //set price
    public void setPrice(double price){
        this.price=price;
    }
    //set description

    public void setDescription(String description) {
        this.description = description;
    }
    //get description
    public String getDescription(){
        return description;
    }

    //set category

    public void setCategory(String category) {
        this.category = category;
    }

    //indicate whether new item
    public void setNew(boolean aNew) {
        isNew = aNew;
    }
    // A way to tell if a menu item is new
    public String isMenuItemNew(){
        if (this.isNew){
            return ("New");
        }
        else {
            return ("");
        }
    }
    //A way to print out both a single menu item
    public void printItem(MenuItem item){
        String itemDescription=item.getDescription();
        System.out.println(itemDescription);
    }
    //A way to determine whether or not two menu items are equal.
    public boolean isEqual(MenuItem itemToCompare){
        if(itemToCompare==this){
            return true;
        }
        if (itemToCompare==null){
            return false;
        }
        if(itemToCompare.getClass() !=getClass()){
            return false;
        }
        MenuItem theItem = (MenuItem) itemToCompare;
        return theItem.getDescription()==getDescription();
    }
}
