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
import Business.Group.MaintainerGroup;
import javax.swing.JPanel;
import userinterface.venueRadar.MaintainerRole.MaintainanceWorkAreaPanel;

/**
 *
 * @author raunak
 */
public class MaintainerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Group group, Enterprise enterprise, CampusParty business, Campus campus) {
        return new MaintainanceWorkAreaPanel(userProcessContainer, account, (MaintainerGroup)group, business, enterprise);
    }
    
}
