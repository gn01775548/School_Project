/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Group;


import Business.Group.Group;
import Business.Role.PlatformMemberRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class PlatformMemberGroup extends Group{

    public PlatformMemberGroup() {
        super(Group.Type.PlatformMember.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PlatformMemberRole());
        return roles;
    }
     
   
    
    
}
