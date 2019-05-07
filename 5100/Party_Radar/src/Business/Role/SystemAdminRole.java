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
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Group group, Enterprise enterprise, CampusParty system, Campus campus) {
        return new SystemAdminWorkAreaPanel(userProcessContainer, system);
    }
    
}
