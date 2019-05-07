/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author lvziqing
 */
public class VenueDirectory {


    private ArrayList<Venue> venueDirectory;
    private ArrayList<Venue> searchVenueList;
    
    public VenueDirectory() {
        venueDirectory = new ArrayList<Venue>(); 
        searchVenueList = new ArrayList<Venue>();
        
        
    }

    
    public ArrayList<Venue> getVenueDirectory() {
        return venueDirectory;
    }

    public Venue addVenue(){
        Venue venue = new Venue();
        venueDirectory.add(venue);
        return venue;
    }


    public void removeVenue(Venue venue) {
        venueDirectory.remove(venue);
    }
    
}

 
    
