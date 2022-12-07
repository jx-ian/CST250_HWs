package cst250project;

import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author 
 */

public class Customer{

    private HashMap<String, Integer> order = new HashMap<>();
    private HashMap<String, Integer> addOn = new HashMap<>();
    private Set<Entry<String, Integer>> orderEntry = order.entrySet();
    private Set<Entry<String, Integer>> addOnEntry = addOn.entrySet();
    private java.util.Date date = new java.util.Date(); 
    
    //Drinks
    private String[] drink = {"coffee", "latte", "americano", "black", "cappuccino", "macchiato", "mocha", "cold brew", "tea", "water"};
    private double[] drinkPrice = {1.5, 3, 2.5, 1.5, 3.75, 3.75, 3.25, 3.5, 1.5, 1};
    private String[] flavors = {"coconut", "vanilla", "hazelnut", "mocha", "caramel", "pumpkin spice", "peppermint", "cinnamon"};
    private double flavorPrice = 0.5;
    
    //Bakery Goods
    private String[] pastry = {"donut", "muffin", "bagel", "roll", "tart", "cookie", "cake pop"};
    private double[] pastryPrice = {1.25, 2, 2.25, 2.5, 1.75, 1.5, 2.5};
    private String[] pastryFlavor = {"nutella", "hazelnut", "cinnamon", "pumpkin spice", "caramel", "butter", "strawberry", "blueberry", "cheese"};
    private double pastryFlavorPrice = 0.25;
    
    private String customer;
    private double total;
    private int count;

    //
    public Customer(String customer, double total) {
        this.customer = customer;
        this.total = total;
    }
    
    public Customer(String customer) {
        this.customer = customer;
    }
    
    public HashMap<String, Integer> getOrder() {
        return order;
    }

    public void setOrder(HashMap<String, Integer> order) {
        this.order = order;
    }

    public HashMap<String, Integer> getAddOn() {
        return addOn;
    }

    //
    public void setAddOn(HashMap<String, Integer> addOn) {    
        this.addOn = addOn;
    }

    public Set<Entry<String, Integer>> getOrderEntry() {
        return orderEntry;
    }

    public void setOrderEntry(Set<Entry<String, Integer>> orderEntry) {
        this.orderEntry = orderEntry;
    }

    public Set<Entry<String, Integer>> getAddOnEntry() {
        return addOnEntry;
    }

    public void setAddOnEntry(Set<Entry<String, Integer>> addOnEntry) {
        this.addOnEntry = addOnEntry;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public String[] getDrink() {
        return drink;
    }

    public void setDrink(String[] drink) {
        this.drink = drink;
    }

    public double[] getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(double[] drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public String[] getFlavors() {
        return flavors;
    }

    public void setFlavors(String[] flavors) {
        this.flavors = flavors;
    }

    public double getFlavorPrice() {
        return flavorPrice;
    }

    public void setFlavorPrice(double flavorPrice) {
        this.flavorPrice = flavorPrice;
    }

    public String[] getPastry() {
        return pastry;
    }

    public void setPastry(String[] pastry) {
        this.pastry = pastry;
    }

    public double[] getPastryPrice() {
        return pastryPrice;
    }

    public void setPastryPrice(double[] pastryPrice) {
        this.pastryPrice = pastryPrice;
    }

    public String[] getPastryFlavor() {
        return pastryFlavor;
    }

    public void setPastryFlavor(String[] pastryFlavor) {
        this.pastryFlavor = pastryFlavor;
    }

    public double getPastryFlavorPrice() {
        return pastryFlavorPrice;
    }

    public void setPastryFlavorPrice(double pastryFlavorPrice) {
        this.pastryFlavorPrice = pastryFlavorPrice;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

   
    //
    public void addDrink(String orderDrink, int quantity) {
        this.order.put(orderDrink, quantity);
        
        for (int i = 0; i < this.getDrink().length; i++) {
            if(orderDrink == this.drink[i]) {
                this.setTotal(this.total + (quantity * this.drinkPrice[i]));
            }
        }
        
    }
    
    public void addFlavor(String add, int amount) {
        this.addOn.put(add, amount);
        
        for (int i = 0; i < this.getFlavors().length; i++) {
            if(add == this.flavors[i]) {
                this.setTotal(this.total + (amount * this.getFlavorPrice()));
            }
        }
    }
    
    
    //
    public void addPastry(String orderPastry, int quantity){
        this.order.put(orderPastry, quantity);
        
        for(int i = 0; i < this.getPastry().length; i++) {
            if(orderPastry == this.pastry[i]) {
                this.setTotal(this.total + (quantity * this.pastryPrice[i]));
            }
        }
    }
    
    public void addPastryFlavor(String add, int amount) {
        this.addOn.put(add, amount);
            
        for(int i = 0; i < this.getPastryFlavor().length; i++) {
            if (add == this.pastryFlavor[i]) {
                this.setTotal(this.total + (amount * this.getPastryFlavorPrice()));
            }
        }
    }
    
    public void bill() {
        
        System.out.println("----------------------------");
        System.out.println("BREW'D CAFE\n");
        System.out.println("NAME: " + getCustomer());
        System.out.println("\nITEMS:");
        
        for(Entry<String, Integer> orderEntryItems : this.getOrderEntry()) {
                System.out.println(orderEntryItems.getValue() + " " + orderEntryItems.getKey());
            }

        
        for(Entry<String, Integer> addOnEntryItems : this.getAddOnEntry()) {
            if(this.getAddOnEntry() == null) {
                return;
            }
            else {
            System.out.println(addOnEntryItems.getValue() + " " + addOnEntryItems.getKey() + " flavor");
            }
        }
        
        System.out.println("\nSUBTOTAL: \n$ " + this.getTotal());
        System.out.println("TAX (10.25%):");
        System.out.printf("$ %.2f\n", this.getTotal() * 0.1025);
        System.out.printf("TOTAL:\n$ %.2f\n" ,(this.getTotal() + (this.getTotal() * 0.1025)));
        System.out.println("\n" + this.getDate());
        System.out.println("----------------------------");
    }

}
