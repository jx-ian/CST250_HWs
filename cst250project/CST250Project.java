package cst250project;

/**
 * @author 
 */

public class CST250Project {

    public static void main(String[] args) {
        
        /*
        Welcome to Brew'd Cafe!
        
        Drinks Menu
        Drinks: coffee $1.50, latte $30, americano $2.50, black $1.50, cappuccino $3.75, macchiato $3.75, mocha $3.25, cold brew $3.50, tea $1.50, water $1.00
        Flavors Shots: coconut, vanilla, hazelnut, mocha, caramel, Pumpkin spice, peppermint, cinnamon
        Flavor Price: 0.5

        Bakery Goods
        Pastry: donut $1.25, muffin $2.00, bagel $2.25, roll $2.5, tart $1.75, cookie $1.50, cake pop $2.50
        Flavors: nutella, hazelnut, cinnamon, pumpkin spice, caramel, butter, strawberry, blueberry, cheese
        Flavor Price = 0.25
        */
        
        Store BrewdCafe = new Store();
        
        Customer customer1 = new Customer("Cool person");
        customer1.addDrink("coffee", 1);
        customer1.addFlavor("coconut", 2);
        customer1.addPastry("donut", 2);
        customer1.addPastryFlavor("nutella", 3);
        customer1.bill();
        
        Customer customer2 = new Customer("Funny person");
        customer2.addDrink("americano", 2);
        customer2.bill();
        
        BrewdCafe.StoreClose();
        BrewdCafe.sale(customer1);
        BrewdCafe.sale(customer2);
        BrewdCafe.printTotalSaleAmount();
    }
    
}
