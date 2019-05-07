/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import assignment_4.entities.Item;
import assignment_4.entities.Order;
import assignment_4.entities.Product;


public class AnalysisHelper {
    
	/**
	 * Our top 3 most popular product sorted from high to low.
	 */
	public void bestProduct(){
		System.out.println("\nbest product : ");
		List<Item> itemList = new ArrayList<>();
		Map<Integer, Product> productMap = DataStore.getInstance().getProduct();
		Map<Integer, Integer> productCount = new HashMap<>();
		Map<Integer, Order> orderMap = DataStore.getInstance().getOreders();
		for (Integer key : orderMap.keySet()) {
			Item item = orderMap.get(key).getItem();
			itemList.add(item);
		}
		
		for (Item item : itemList) {
			int productId = item.getProductId();
			int quantity = item.getQuantity();
			
			if (productCount.get(productId) == null){
				productCount.put(productId, quantity);
			} else {
				int q = productCount.get(productId);
				q = q + quantity;
				productCount.put(productId, q);
			}
		}
		List<Integer> productCountVal = new ArrayList<>(productCount.values());
		Collections.sort(productCountVal, new Comparator<Integer>(){            
            @Override
            public int compare(Integer o1, Integer o2) {
            	return o2-o1;
            }
        });
		
		for(int i = 0; i < 3; i++){
			int val = productCountVal.get(i);
			for (int productId : productCount.keySet()){
				if (val == productCount.get(productId)){
					System.out.println("Top " + (i+1) + " : " + val);
					System.out.println(productMap.get(productId));
				}
			}
		}
	}
	
	/**
	 * Our 3 best customers 
	 */
	public void bestCustomers(){
		System.out.println("\nOur 3 best customers:");
		Map<Integer, Order> orderMap = DataStore.getInstance().getOreders();
		List<Order> orderList = new ArrayList<>(orderMap.values());
		Map<Integer, Integer> customerPrice = new HashMap<>();
		
		for (Order order : orderList) {
			int customerId = order.getCustomerId();
			if (customerPrice.get(customerId) == null){
				int price = order.getItem().getQuantity() * order.getItem().getSalesPrice();
				customerPrice.put(customerId, price);
			} else {
				int price = customerPrice.get(customerId);
				price = price + order.getItem().getSalesPrice() * order.getItem().getQuantity();
				customerPrice.put(customerId, price);
			}
		}
		
		List<Integer> priceList = new ArrayList<>(customerPrice.values());
		Collections.sort(priceList, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
            	return o2-o1;
            }
        });
		
		for (int i = 0; i < 3; i++){
			int val = priceList.get(i);
			for (int customerId : customerPrice.keySet()) {
				if (val == customerPrice.get(customerId)) {
					System.out.println("Top " + (i+1) + " : " + val);
					System.out.println("Customer{" + "id = " + customerId + "}");
				}
			}
		}
	}
	
	/**
	 * Our top 3 best sales people	
	 */
	public void bestSales(){
		System.out.println("\ntop 3 best sales people：");
		Map<Integer, Order> orderMap = DataStore.getInstance().getOreders();
		Map<Integer, Product> productMap = DataStore.getInstance().getProduct();
		List<Order> orderList = new ArrayList<>(orderMap.values());
		Map<Integer, Integer> salesPrice = new HashMap<>();
		for (Order order : orderList) {
			int salesId = order.getSalesId();
			int productId = order.getItem().getProductId();
			int productMinPrice = productMap.get(productId).getMinPrice();
			int price = (order.getItem().getSalesPrice() - productMinPrice) * order.getItem().getQuantity();
			if (salesPrice.get(salesId) == null){
				salesPrice.put(salesId, price);
			} else {
				int p = salesPrice.get(salesId);
				p += price;
				salesPrice.put(salesId, p);
			}
		}
		List<Integer> priceList = new ArrayList<>(salesPrice.values());
		Collections.sort(priceList, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		
		for (int i = 0; i < 3; i++){
			int val = priceList.get(i);
			for (int salesId : salesPrice.keySet()){
				if (val == salesPrice.get(salesId)) {
					System.out.println("Top " + (i+1) + " : " + val);
					System.out.println("Sales Person{" + "id = " + salesId + "}");
				}
			}
		}
	}
	
	/**
	 * Our total revenue for the year
	 */
	public void totalReve(){
		Map<Integer, Order> orderMap = DataStore.getInstance().getOreders();
		Map<Integer, Product> productMap = DataStore.getInstance().getProduct();
		int totalRevenue = 0;
		for(int key : orderMap.keySet()){
			Order order = orderMap.get(key);
			int productId = order.getItem().getProductId();
			int minPrice = productMap.get(productId).getMinPrice();
			int salesPrice = order.getItem().getSalesPrice();
			int quantity = order.getItem().getQuantity();
			int price = (salesPrice - minPrice) * quantity;
			totalRevenue += price;
		}
		System.out.println("\ntotal revenue for the year : " + totalRevenue);
	}
}
                 




