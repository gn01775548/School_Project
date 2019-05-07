/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    
    int customerId;
    List<Order> orderArrayList;
    

    public Customer(int customerId, int orderId) {
        this.customerId = customerId;
        this.orderArrayList = new ArrayList<Order>();
    }   

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
      
    @Override
    public String toString() {
        return "Customer{" + "id = " + this.customerId + "}";
    }
}
