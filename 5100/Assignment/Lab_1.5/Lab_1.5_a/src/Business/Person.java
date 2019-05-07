/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author bonnie
 */

class Address{
    String streetLine1;
    String streetLine2;
    String city;
    String state;
    String zipCode;
    String country;

    public String getStreetLine1() {
        return streetLine1;
    }

    public void setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
    }

    public String getStreetLine2() {
        return streetLine2;
    }

    public void setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
}


public class Person {  
    
            String lastName;
            String firstName;
            Address workaddress;
            Address homeaddress;
            Address localaddress;
       
        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }           
            
        public Address getWorkaddress(){
                return workaddress;
        }
            
        public void setWorkaddress(Address addressparam){
                workaddress = addressparam;
        }
        
        public Address getLocaladdress(){
                return localaddress;
        }
            
        public void setLocaladdress(Address addressparam){
                localaddress = addressparam;
        }
        
        public Address getHomeaddress(){
                return homeaddress;
        }
            
        public void setHomeaddress(Address addressparam){
                homeaddress = addressparam;
        }


        public static void main(String[] args) {
            Person person = new Person();
            person.setFirstName("Joe");
            person.setLastName("Smith");
            
            Address address = new Address();
            address.setStreetLine1("360 Huntington Ave");
            address.setStreetLine2("130 Snell Engineering");
            address.setCity("Boston");
            address.setState("MA");
            address.setZipCode("02115");
            address.setCountry("USA");
            person.setWorkaddress(address);
            
            address = new Address();
            address.setStreetLine1("100 Main Street");
            address.setStreetLine2(null);
            address.setCity("Natick");
            address.setState("MA");
            address.setZipCode("01760");
            address.setCountry("USA");
            person.setLocaladdress(address);

            address = new Address();
            address.setStreetLine1("201 Best Street");
            address.setStreetLine2(null);
            address.setCity("Cool-town");
            address.setState("Shanghai");
            address.setZipCode(null);
            address.setCountry("China");
            person.setHomeaddress(address);

            System.out.println("Person");
            System.out.println("1.  "+"FirstName:"+person.firstName);
            System.out.println("2.  "+"LastName:"+person.lastName);
            System.out.println("WorkAddress");
            System.out.println("1.  "+" StreetLine1:"+person.workaddress.streetLine1);
            System.out.println("2.  "+" StreetLine2:"+person.workaddress.streetLine2);
            System.out.println("3.  "+" City:"+person.workaddress.city);
            System.out.println("4.  "+" State:"+person.workaddress.state);
            System.out.println("5.  "+" ZipCode:"+person.workaddress.zipCode);
            System.out.println("6.  "+" Country:"+person.workaddress.country);

            System.out.println("LocalAddress");
            System.out.println("1.  "+" StreetLine1:"+person.localaddress.streetLine1);
            System.out.println("2.  "+" StreetLine2:"+person.localaddress.streetLine2);
            System.out.println("3.  "+" City:"+person.localaddress.city);
            System.out.println("4.  "+" State:"+person.localaddress.state);
            System.out.println("5.  "+" ZipCode:"+person.localaddress.zipCode);
            System.out.println("6.  "+" Country:"+person.localaddress.country);

            
            System.out.println("HomeAddress");
            System.out.println("1.  "+" StreetLine1:"+person.homeaddress.streetLine1);
            System.out.println("2.  "+" StreetLine2:"+person.homeaddress.streetLine2);
            System.out.println("3.  "+" City:"+person.homeaddress.city);
            System.out.println("4.  "+" State:"+person.homeaddress.state);
            System.out.println("5.  "+" ZipCode:"+person.homeaddress.zipCode);
            System.out.println("6.  "+" Country:"+person.homeaddress.country);
            

        }
}






