/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Group;


import Business.Group.Group;
import Business.Role.EventManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EventManagerGroup extends Group{

    public EventManagerGroup() {
        super(Group.Type.EventManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EventManagerRole());
        return roles;
    }
     
}