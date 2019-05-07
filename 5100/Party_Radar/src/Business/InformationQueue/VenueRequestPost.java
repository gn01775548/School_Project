/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InformationQueue;

import Business.Enterprise.Venue;
import java.util.Date;

/**
 *
 * @author lvziqing
 */
public class VenueRequestPost extends InformationPost{

    private Venue venue; 
    
    public VenueRequestPost() {
    this.venue = new Venue();
}



    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }
    
    

    
        @Override
    public String toString() {
        return this.venue.getVenueName();

   
    }   
}