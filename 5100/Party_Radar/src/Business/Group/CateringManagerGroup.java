/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Group;

import Business.Role.CateringManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bonnie
 */
public class CateringManagerGroup extends Group{
    public CateringManagerGroup() {
        super(Group.Type.CateringManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CateringManagerRole());
        return roles;

    }
}
