/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author bonnie
 */
public class Flight {
    private String flightName;
    private String flightTime;
    private String flightFromLoca;
    private String flightToLoca;
    private String airplaneName;
    private int[]  seat;
    private CustomerDirectory customerDirectory;

    
    
    
    
    
     public Flight() {
        customerDirectory = new CustomerDirectory();
        //this.seat = seat;
        seat=new int [300];
        
        for(int i=0; i<seat.length; i++){
            seat[i]=1;
        }               
    }
    
     public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }
     
    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    
    
    public String getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public String getFlightFromLoca() {
        return flightFromLoca;
    }

    public void setFlightFromLoca(String flightFromLoca) {
        this.flightFromLoca = flightFromLoca;
    }

    public String getFlightToLoca() {
        return flightToLoca;
    }

    public void setFlightToLoca(String flightToLoca) {
        this.flightToLoca = flightToLoca;
    }

    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }
    
    
    public int[] getSeat() {
        return seat;
    }

    public void setSeat(int[] seat) {
        this.seat = seat;
    }
    
    @Override
    public String toString() {
        return flightName;
    }

    
    
}
