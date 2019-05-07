/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Group;

import Business.Member.MemberDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.InformationQueue.InformationQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Group {

    private String name;
    private InformationQueue infoQueue;
    private MemberDirectory memberDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int groupID;
    private static int counter=0;
    
    public enum Type{
        Admin("Admin Group"), Lab("Lab Group"), 
        EventManager("EventManager Group"), 
        PlatformMember("PlatformMember Group"),
        Maintainer("Maintainer Group"),
        VenueBookingManager("VenueBookingManager Group"),
        CateringManager("CateringManager Group"),
        VenueMaintainanceManager("VenueMaintainanceManager Group");
        
//        Visitor("Visitors Group")
//        VenueAdmin("VenueAdmin Group")
//        PartyRadarAdmin("PartyRadar Admin Group"),

        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Group(String name) {
        this.name = name;
        infoQueue = new InformationQueue();
        memberDirectory = new MemberDirectory();
        userAccountDirectory = new UserAccountDirectory();
        groupID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();


    public MemberDirectory getMemberDirectory() {
        return memberDirectory;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getGroupID() {
        return groupID;
    }

    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public InformationQueue getInfoQueue() {
        return infoQueue;
    }

    public void setInfoQueue(InformationQueue infoQueue) {
        this.infoQueue = infoQueue;
    }
      
    @Override
    public String toString() {
        return name;
    }    
}
