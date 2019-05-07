package Business;

import Business.Member.Member;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @auth
 */
public class ConfigureASystem {
    
    public static CampusParty configure(){
        
        CampusParty system = CampusParty.getInstance();
        
        //Create a campus
        //create an enterprise
        //initialize some organizations
        //have some members
        //create user account
        
        
        Member member = system.getMemberDirectory().createMember("HuskyGo");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", member, new SystemAdminRole());
        
        return system;
    }
    
}
