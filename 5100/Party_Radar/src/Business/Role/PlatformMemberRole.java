/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.Campus.Campus;
import Business.CampusParty;
import Business.Enterprise.Enterprise;
import Business.Group.Group;
import Business.Group.PlatformMemberGroup;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.partyRadar.memberRole.MemberWelcomePage;

/**
 *
 * @author raunak
 */
public class PlatformMemberRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Group group, Enterprise enterprise, CampusParty business, Campus campus) {
        return new MemberWelcomePage(userProcessContainer, account, (PlatformMemberGroup)group, enterprise, campus, business);
    }
    
}
