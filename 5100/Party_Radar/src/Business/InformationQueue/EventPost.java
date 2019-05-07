/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InformationQueue;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;




/**
 *
 * @author raunak
 */
public class EventPost extends InformationPost{
    
    private String eventName;
    private int numberAttendees;
    private VenueRequestPost vPost;
    private CateringRequestPost cPost;
    private int availableSpot;
    private ArrayList<UserAccount> currentRegister;
    private String picPath;
    private String details;
    
    
    private int likes = 0;
    
    private int favorites = 0;

    public EventPost() {
        this.currentRegister = new ArrayList<UserAccount>();
        this.availableSpot = numberAttendees - currentRegister.size();
        this.vPost = new VenueRequestPost();
        this.cPost = new CateringRequestPost();
    }

    public void addLikes(){
        this.likes ++;
    }
    public void reduceLikes(){
        this.likes --;
    }
    
    public void addFavorites(){
        this.favorites ++;
    }
    public void reduceFavorites(){
        this.favorites --;
    }
    
    public int getLikes() {
        return likes;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getFavorites() {
        return favorites;
    }

    public void setFavorites(int favorites) {
        this.favorites = favorites;
    }
    
    public void addCurrentRegister(UserAccount account){        
        currentRegister.add(account);
    }
    
    public void removeCurrentRegister(UserAccount account){        
        currentRegister.remove(account);
    }


    public int getNumberAttendees() {
        return numberAttendees;
    }

    public void setNumberAttendees(int numberAttendees) {
        this.numberAttendees = numberAttendees;
    }


    public int getAvailableSpot() {
        return availableSpot;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public VenueRequestPost getvPost() {
        return vPost;
    }

    public void setvPost(VenueRequestPost vPost) {
        this.vPost = vPost;
    }
       
          
    public CateringRequestPost getcPost() {
        return cPost;
    }

    public void setcPost(CateringRequestPost cPost) {
        this.cPost = cPost;
    }

    public ArrayList<UserAccount> getCurrentRegister() {
        return currentRegister;
    }

    public void setCurrentRegister(ArrayList<UserAccount> currentRegister) {
        this.currentRegister = currentRegister;
    }

    public void setAvailableSpot(int availableSpot) {
        this.availableSpot = availableSpot;
    }
    
    public boolean attend(){
        if (this.availableSpot <= 0){
            return false;
        } else {
            this.availableSpot--;
            return true;
        }
    }
    public boolean cancelAttend(){
        if (this.availableSpot >= this.numberAttendees){
            return false;
        } else {
            this.availableSpot++;
            return true;
        }
    }
    @Override
    public String toString() {
        return this.eventName;
    }  
}


