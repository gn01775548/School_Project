/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.analytics;

import assignment_4.entities.Customer;
import assignment_4.entities.Item;
import assignment_4.entities.Order;
import assignment_4.entities.Product;
import assignment_4.entities.SalesPerson;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author harshalneelkamal
 */
public class DataStore {
    private static DataStore dataStore;
    
    private Map<Integer, Customer> customer;
    private Map<Integer, Product> product;
    private Map<Integer, SalesPerson> sales;
    private Map<Integer, Order> oreders;
    private Map<Integer, Item> item;
    
    private DataStore(){
        customer = new HashMap<>();
        product = new HashMap<>();
        sales = new HashMap<>();
        oreders = new HashMap<>();
    }
    
    public static DataStore getInstance(){
        if(dataStore == null)
            dataStore = new DataStore();
        return dataStore;
    }

    public static DataStore getDataStore() {
        return dataStore;
    }

    public static void setDataStore(DataStore dataStore) {
        DataStore.dataStore = dataStore;
    }
    
    public Map<Integer, Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(Map<Integer, Customer> customer) {
        this.customer = customer;
    }

    public Map<Integer, Product> getProduct() {
        return product;
    }

    public void setProduct(Map<Integer, Product> product) {
        this.product = product;
    }

    public Map<Integer, SalesPerson> getSales() {
        return sales;
    }

    public void setSales(Map<Integer, SalesPerson> sales) {
        this.sales = sales;
    }

    public Map<Integer, Order> getOreders() {
        return oreders;
    }

    public void setOreders(Map<Integer, Order> oreders) {
        this.oreders = oreders;
    }

    public Map<Integer, Item> getItem() {
        return item;
    }

    public void setItem(Map<Integer, Item> item) {
        this.item = item;
    }
    
}


