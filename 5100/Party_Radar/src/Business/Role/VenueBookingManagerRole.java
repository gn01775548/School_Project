/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;
import Business.Campus.Campus;
import Business.CampusParty;
import Business.Enterprise.Enterprise;
import Business.Group.Group;
import Business.Group.VenueBookingManagerGroup;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.venueRadar.venueBookingManagerRole.VenueBookingManagerWorkAreaPanel;

/**
 *
 * @author raunak
 */
public class VenueBookingManagerRole extends Role{


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Group group, Enterprise enterprise, CampusParty business, Campus campus) {
        return new VenueBookingManagerWorkAreaPanel(userProcessContainer, account, (VenueBookingManagerGroup)group, enterprise, campus);
        
    }   
    
}
