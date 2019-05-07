/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Group;


import Business.Group.Group;
import Business.Role.Role;
import Business.Role.VenueBookingManagerRole;
import Business.Role.VenueMaintainanceManagerRole;
import java.util.ArrayList;

/**
 *
 * @author
 */
public class VenueBookingManagerGroup extends Group{

    public VenueBookingManagerGroup() {
        super(Group.Type.VenueBookingManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VenueBookingManagerRole());
        return roles;

    }
     
}