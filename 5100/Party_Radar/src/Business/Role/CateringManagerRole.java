/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Campus.Campus;
import Business.CampusParty;
import Business.Enterprise.Enterprise;
import Business.Group.CateringManagerGroup;
import Business.Group.Group;
import static Business.Group.Group.Type.CateringManager;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.venueRadar.cateringManagerRole.CateringManagerWorkAreaPanel;

/**
 *
 * @author bonnie
 */
public class CateringManagerRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Group group, Enterprise enterprise, CampusParty business, Campus campus) {
        return new CateringManagerWorkAreaPanel(userProcessContainer, account, (CateringManagerGroup)group, enterprise, campus);
        
    }   
}
