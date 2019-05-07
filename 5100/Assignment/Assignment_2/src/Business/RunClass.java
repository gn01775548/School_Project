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

public class RunClass{
        protected Product product;
        protected Supplier supplier;
    
        public static void main(String[] args) {
            Product product = new Product();
            Scanner p = new Scanner(System.in);
            
        int c = 1;
        int d;
        
        while (c<=4){
        System.out.printf("Input 1 for Create, Input 2 for Update, Input 3 for View, Input 4 for End\n",c);      
        d=p.nextInt();p.nextLine(); 

        if(d==1){
            
            product.create();
           
        }
        
        else if(d==2){
            
            product.update();
        }
        
        else if(d==3){
            
            product.view();
        }
        
        else if(d==4){
            
            break;
        }
        
        else{
            System.out.println("Wrong Choice");
            }
        
        }
        }
    }


        
