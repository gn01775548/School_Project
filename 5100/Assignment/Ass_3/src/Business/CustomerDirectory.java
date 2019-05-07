package Business;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author bonnie
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> custDir;
    
    public CustomerDirectory() {
        custDir = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustDir() {
        return custDir;
    }
    
    public Customer addCustomer() {
        Customer cu = new Customer();
        custDir.add(cu);
        return cu;
    }
    
    public void removeCustomer(Customer cu) {
        custDir.remove(cu);
    }
    
    public Customer searchCustomer(String keyWord) {
        for(Customer cu : custDir) {
            if(keyWord.equals(cu.getCustomerName())) {
                return cu;
            }
        }
        return null;
    }
}
