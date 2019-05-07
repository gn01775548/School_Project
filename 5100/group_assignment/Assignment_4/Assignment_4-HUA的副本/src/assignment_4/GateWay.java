/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4;

import assignment_4.analytics.AnalysisHelper;
import assignment_4.analytics.DataStore;
import assignment_4.entities.Item;
import assignment_4.entities.Order;
import assignment_4.entities.Product;
import java.io.IOException;

/**·
 *
 * @author harshalneelkamal
 */
public class GateWay {
    
    DataReader orderReader;
    DataReader prodReader;
    AnalysisHelper helper;
    
    public GateWay() throws IOException {
        
        DataGenerator generator = DataGenerator.getInstance();
        orderReader = new DataReader(generator.getOrderFilePath());
        prodReader = new DataReader(generator.getProductCataloguePath());        
        helper = new AnalysisHelper();
    }
//    
    public static void main(String[] args) throws IOException {     
        GateWay inst = new GateWay();
        inst.readData();
    }
    
    private void readData() throws IOException{
        String[] row;
        while((row = orderReader.getNextRow()) != null ){
            generateOrder(row);
        }
        while((row = prodReader.getNextRow()) != null ){
            generateProd(row);
        }
        
        runAnalysis();
    }
////        
    private void generateOrder(String[] row){
        
        int orderId = Integer.parseInt(row[0]);
        
        int productId = Integer.parseInt(row[2]);
        int quantity = Integer.parseInt(row[3]);              
        int salesId = Integer.parseInt(row[4]);        
        int customerId = Integer.parseInt(row[5]);        
        int salesPrice = Integer.parseInt(row[6]);
        
        Item item = new Item(productId, salesPrice, quantity);
        
        Order o = new Order(orderId, customerId, item, salesId);
        DataStore.getInstance().getOreders().put(orderId, o);
    }

    private void generateProd(String[] row){
        int productId = Integer.parseInt(row[0]);
        int minPrice = Integer.parseInt(row[1]);
        int maxPrice = Integer.parseInt(row[2]);
        
        Product p = new Product(productId,minPrice, maxPrice);
        DataStore.getInstance().getProduct().put(productId, p);
    }

     
    
    private void runAnalysis(){
        helper.bestProduct();	// solution to question1
        helper.bestCustomers();	// solution to question2
        helper.bestSales();		// solution to question3
        helper.totalReve();		// solution to question4
    }

}

    
    
    
    
    




