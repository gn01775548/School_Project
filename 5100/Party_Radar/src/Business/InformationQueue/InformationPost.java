/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InformationQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author raunak
 */

public class InformationPost {

    private Date date;
    private String message;
    private String place;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private String notes;


    private int id;
    private static int count = 1;

    public InformationPost() {
        date = new Date();
        id = count;
        count++;
    }

    
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    
    
    public int getId() {
        return id;
    }


    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }  

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
        @Override
    public String toString() {
        return this.message;
    }  

}
