package cst250project;

import java.util.ArrayList;

/**
 * @author 
 */

public class Store {
    
    private double totalSales;

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public void sale(Customer customer) {
        System.out.println("");
        System.out.println(customer.getCustomer());
        System.out.println("ITEM: " + customer.getOrder());
        if(customer.getAddOn().isEmpty()) {
        }
        else {
            System.out.println("FLAVORS:" + customer.getAddOn());
        }
        System.out.printf("$%.2f\n",customer.getTotal() + (customer.getTotal() * 0.1025));
        
        ArrayList<Double> sales = new ArrayList<>();
        sales.add(customer.getTotal() + (customer.getTotal() * 0.1025));
        totalSale(sales);
        
    }
    
    public void StoreClose() {
        System.out.println("----------------------------");
        System.out.println("\nSALE SUMMARY: ");
    }
    
    public void totalSale(ArrayList<Double> sales) {
        for (int i = 0; i < sales.size(); i++) {
            this.setTotalSales(this.getTotalSales() + sales.get(i));
        }
    }
    
    public void printTotalSaleAmount() {
        System.out.printf("\nTOTAL SALES: $%.2f\n", this.getTotalSales());
    }
}
