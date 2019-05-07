/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Campus.Campus;
import Business.CampusParty;
import Business.Enterprise.Enterprise;
import Business.Group.Group;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        SystemAdmin ("System Admin"),
        EventManager ("Event Manager"),
        VenueMaintainanceManager ("VenueMaintainance Manager"),
        VenueBookingManager ("VenueBooking Manager"),
        CateringManager("Catering Manager"),
        PlatformMamber ("Platform Member"),
        Maintainer ("Maintainer");
        
        private String value;
        
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(
        JPanel userProcessContainer, 
        UserAccount account, 
        Group group,
        Enterprise enterprise, 
        CampusParty business,
        Campus campus);

    @Override
    public String toString() {
        return this.getClass().getName();
    }   
}