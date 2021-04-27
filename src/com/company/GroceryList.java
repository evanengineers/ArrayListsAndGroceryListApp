package com.company;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem (String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have "+ groceryList.size() +" items in your grocery list.");
        for(int i = 0; i<groceryList.size(); i++) {

            System.out.println((i + 1) + ". " + groceryList.get(i)); //Arraylist uses the get method unlike arrays[i]

        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem); //arraylists have the set method to update/replace an item.
        System.out.println("Grocery item " + (position + 1) + " has been modified." );
    }

    public void removeItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeItem(position);
        }
    }

    private void removeItem(int position) {
        groceryList.remove(position);
    }

    private int findItem(String searchItem) {
      // boolean exists = groceryList.contains(searchItem);  the contains method would work great here as well.
       return groceryList.indexOf(searchItem); //returns -1 if the item does not exist.  and returns the index of item if it does exist
//       if(position >= 0) {
//           return groceryList.get(position);
//       }
//      return null;
    }

    public boolean onFile (String searchItem){
        int position= findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }




}
