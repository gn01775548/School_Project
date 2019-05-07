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
public class FlightDirectory {
     private ArrayList<Flight> flightDir;
    
    public FlightDirectory() {
        flightDir = new ArrayList<Flight>();
    }

    public ArrayList<Flight> getFlightDir() {
        return flightDir;
    }
    
    
    public Flight addFlight() {
        Flight aa = new Flight();
        flightDir.add(aa);
        return aa;
    }
    
    public void removeFlight(Flight ff) {
        flightDir.remove(ff);
    }
    
    public Flight searchFlightbyFromLoca(String keyWord) {
        for(Flight ff : flightDir) {
            if(keyWord.equals(ff.getFlightFromLoca())) {
                return ff;
            }
        }
        return null;
    }
    
    public Flight searchFlightbyTime(String keyWord) {
        for(Flight ff : flightDir) {
            if(keyWord.equals(ff.getFlightTime())) {
                return ff;
            }
        }
        return null;
    }
    
    public Flight searchFlightbyToLoca(String keyWord) {
        for(Flight ff : flightDir) {
            if(keyWord.equals(ff.getFlightToLoca())) {
                return ff;
            }
        }
        return null;
    }

}
