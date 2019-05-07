/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InformationQueue;

import Business.Enterprise.Venue;

/**
 *
 * @author lvziqing
 */
public class InvitationPost extends InformationPost{

    private EventPost eventPost; 
    
    public InvitationPost() {
    this.eventPost = new EventPost();
    
    }

    public EventPost getEventPost() {
        return eventPost;
    }

    public void setPost(EventPost eventPost) {
        this.eventPost = eventPost;
    }

    @Override
    public String toString() {
        return this.eventPost.getEventName();
    }  
   
}