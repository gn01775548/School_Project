/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities;

/**
 *
 * @author harshalneelkamal
 */
public class SalesPerson {
    
    int salesId;
    int orderId;

    public SalesPerson(int salesId, int orderId) {
        this.salesId = salesId;
        this.orderId = orderId;
    }
    

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    
    @Override
    public String toString() {
        return "Sales Person{" + "id = " + this.salesId + "}";
    }
    
}
