/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Group;


import Business.Group.Group;
import Business.Role.Role;
import Business.Role.VenueMaintainanceManagerRole;
import java.util.ArrayList;

/**
 *
 * @author
 */
public class VenueMaintainanceManagerGroup extends Group{

    public VenueMaintainanceManagerGroup() {
        super(Group.Type.VenueMaintainanceManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VenueMaintainanceManagerRole());
        return roles;

    }
     
}