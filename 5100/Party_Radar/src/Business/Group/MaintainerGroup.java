/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Group;


import Business.Group.Group;
import Business.Role.Role;
import Business.Role.MaintainerRole;
import java.util.ArrayList;

/**
 *
 * @author
 */
public class MaintainerGroup extends Group{

    public MaintainerGroup() {
        super(Group.Type.Maintainer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MaintainerRole());
        return roles;
    }
     
   
    
    
}
