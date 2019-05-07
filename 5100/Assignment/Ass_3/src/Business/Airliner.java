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
public class Airliner {
    
    private String airlinerName;
    private FlightDirectory flightDirectory;
    
    public Airliner() {
        flightDirectory = new FlightDirectory();
    }
    
    public FlightDirectory getFlightDirectory() {
        return flightDirectory;
    }
    

    
    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    
    
    @Override
    public String toString() {
        return airlinerName;
    }

    
}
