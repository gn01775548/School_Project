/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Info;




/**
 *
 * @author bonnie
 */

public class Person {
    private String firstName;
    private String lastName;
    public Add homeaddress;    
    public Add workaddress;
    public Add localaddress;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    public Add getWorkaddress(){
                return workaddress;
        }
            
        public void setWorkaddress(Add addparam){
                workaddress = addparam;
        }
        
        public Add getLocaladdress(){
                return localaddress;
        }
            
        public void setLocaladdress(Add addparam){
                localaddress = addparam;
        }
        
        public Add getHomeaddress(){
                return homeaddress;
        }
            
        public void setHomeaddress(Add addparam){
                homeaddress = addparam;
        }
    
    
     
    
}


