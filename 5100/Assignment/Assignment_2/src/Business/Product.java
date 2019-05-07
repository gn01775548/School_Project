/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Scanner;

/**
 *
 * @author bonnie
 */
public class Product {
    private String name;
    private double price;
    private int availNum;
    private String description;
    private Supplier supplier;
    
    public Product(){
         supplier = new Supplier();
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailNum() {
        return availNum;
    }

    public void setAvailNum(int availNum) {
        this.availNum = availNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void create(){  
        Scanner p = new Scanner(System.in);
        System.out.println("Name:");
        setName(p.nextLine()) ;
        System.out.println("Price:");
        setPrice(p.nextDouble()) ;
        System.out.println("Available Number:");
        setAvailNum(p.nextInt()) ;
        p.nextLine(); 
        System.out.println("Description:");
        setDescription(p.nextLine()) ; 
        System.out.println("Supplier Name:");
        getSupplier().setSupName(p.nextLine()) ; 
        System.out.println("Supplier Address:");
        getSupplier().setSupAdd(p.nextLine()) ;
    }
    public void update(){
        Scanner p = new Scanner(System.in);
        System.out.println("Name:");
        setName(p.nextLine()) ;
        System.out.println("Price:");
        setPrice(p.nextDouble()) ;
        System.out.println("Available Number:");
        setAvailNum(p.nextInt()) ;
        p.nextLine(); 
        System.out.println("Description:");
        setDescription(p.nextLine()) ;
        System.out.println("Supplier Name:");
        getSupplier().setSupName(p.nextLine()) ;
        System.out.println("Supplier Address:");
        getSupplier().setSupAdd(p.nextLine()) ;
    }
    
    public void display(){
    
        Scanner p = new Scanner(System.in);
        System.out.println("Name:");
        setName(p.nextLine()) ;
        System.out.println("Price:");
        setPrice(p.nextDouble()) ;
        System.out.println("Available Number:");
        setAvailNum(p.nextInt()) ;
        p.nextLine(); 
        System.out.println("Description:");
        setDescription(p.nextLine()) ;
        System.out.println("Supplier Name:");
        getSupplier().setSupName(p.nextLine()) ;
        System.out.println("Supplier Address:");
        getSupplier().setSupAdd(p.nextLine()) ;
    
    }
    
    public void view(){
        System.out.println("Name:\n" + getName());
        System.out.println("Price:\n" + getPrice());
        System.out.println("Available Number:\n" + getAvailNum());
        System.out.println("Description:\n" + getDescription()); 
        System.out.println("Supplier Name:\n" + getSupplier().getSupName());
        System.out.println("Supplier Address:\n" + getSupplier().getSupAdd());   
        
    }
    
}






