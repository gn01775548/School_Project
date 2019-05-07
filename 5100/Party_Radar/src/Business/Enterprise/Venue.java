/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


/**
 *
 * @author lvziqing
 */
public class Venue {
    
    private int id;
    private String venueName;
    private String location;
    private String label;
    private String details;
    private String picPath;
    private String campus;
    private VenueCalender venueCalender;
    
    private static int count = 1;

    
    
    public Venue(){
        id = count;
        count++;
        venueCalender = new VenueCalender();
    }


    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public VenueCalender getVenueCalender() {
        return venueCalender;
    }

    public void setVenueCalender(VenueCalender venueCalender) {
        this.venueCalender = venueCalender;
    }

    public int getId() {
        return id;
    }
    
        
    @Override
    public String toString() {
        return String.valueOf(id);
    }

    }

 
    
    

