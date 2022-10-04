package ex05taudelacruz;

import java.util.*;

public class Store {
    private String name;
    private double earnings;
    private ArrayList<Item> itemList = new ArrayList();
    private static ArrayList<Store> storeList = new ArrayList();

    public Store(String name) {
        this.name = name;
        this.earnings = 0;
        storeList.add(this);
    }

    public String getName(){
        return name;
    }
    public double getEarnings(){
        return earnings;
    }
    public void sellItem(int index){
        if(index <= itemList.size() && index >= 0) {
            Item itemSold = itemList.get(index);
            this.earnings += itemSold.getCost();
            System.out.printf("Successfully sold item %s for %f!\n", itemSold.getName(), itemSold.getCost());
        } else {
            System.out.printf("There are only %d items in the store.\n", itemList.size());
        }
    }
    public void sellItem(String name){        
        for(int i = 0; i < itemList.size(); i++) {
            if(itemList.get(i).getName().equals(name)) {
                Item itemSold = itemList.get(i);
                this.earnings += itemSold.getCost();
                System.out.printf("Successfully sold item %s for %f!\n", itemSold.getName(), itemSold.getCost());
                return;
            }
        }
        System.out.printf("This store does not sell %s.\n", name);
    }
    public void sellItem(Item i){        
        if(itemList.contains(i)) {
            Item itemSold = itemList.get(itemList.indexOf(i));
            this.earnings += itemSold.getCost();
            System.out.printf("Successfully sold item %s for %f!\n", itemSold.getName(), itemSold.getCost());
        } else {
            System.out.printf("This store does not sell %s.\n", i.getName());
        }
    }
    public void addItem(Item i) {
        itemList.add(i);
    }
    public void filterType(String type){
        System.out.printf("Items of type %s:\n", type);
        
        for(Item i: itemList) {
            if(i.getType().equals(type)) {
                System.out.printf("- %s (Cost: %f)\n", i.getName(), i.getCost());
            }
        }
    }
    public void filterCheap(double maxCost){
        System.out.printf("Items cheaper than %f:\n", maxCost);
        
        for(Item i: itemList) {
            if(i.getCost() <= maxCost) {
                System.out.printf("- %s (Cost: %f)\n", i.getName(), i.getCost());
            }
        }
    }
    public void filterExpensive(double minCost){
        System.out.printf("Items more expensive than %f:\n", minCost);
        
        for(Item i: itemList) {
            if(i.getCost() >= minCost) {
                System.out.printf("- %s (Cost: %f)\n", i.getName(), i.getCost());
            }
        }
    }
    public static void printStats(){
        for(Store store: storeList) {
            System.out.printf("- Store Name: \"%s\" | Earnings: %f\n", store.getName(), store.getEarnings());
        }
    }
}
