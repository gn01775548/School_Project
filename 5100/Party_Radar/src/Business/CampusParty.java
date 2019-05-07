/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Campus.Campus;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PartyRadarEnterprise;
import Business.Group.Group;
import Business.Group.PlatformMemberGroup;
import Business.InformationQueue.EventPost;
import Business.InformationQueue.InformationPost;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author
 */
public class CampusParty extends Group{
    
    private static CampusParty business;
    private ArrayList<Campus> campusList;
    private ArrayList<UserAccount> searchMemberArrayList;
    private ArrayList<EventPost> masterEventPostDirectory;
    
    public static CampusParty getInstance(){
        if(business==null){
            business=new CampusParty();
        }
        return business;
    }
    
    private CampusParty(){
        super(null);
        campusList=new ArrayList<Campus>();
        searchMemberArrayList = new ArrayList<UserAccount>();
        masterEventPostDirectory = new ArrayList<EventPost>();
    }
   
       
    //Rita: search function added
    public ArrayList<UserAccount> getSearchMemberArrayList(String memberName) {
    
        ArrayList<UserAccount> tempArr = new ArrayList<UserAccount>();
        ArrayList<UserAccount> searchMemberArrayList = new ArrayList<UserAccount>();
        
        for (Campus c: campusList){
                 
            // traverse enterprises in each campus
             for(Enterprise e: c.getEnterpriseDirectory().getEnterpriseList()){ 
                if (e instanceof PartyRadarEnterprise){

                    //  traverse groups in each enterprise and find platformMemberGroup
                    for (Group g: e.getGroupDirectory().getGroupList()){
                        if (g instanceof PlatformMemberGroup){

                            // travser members in platformMembergroup
                            for (UserAccount a: g.getUserAccountDirectory().getUserAccountList()){
                                tempArr.add(a);
                            }
                        }
                    }
                }
            }
        }
        
        for (UserAccount account: tempArr){
            if(account.getMember().getName().equals(memberName)){
                searchMemberArrayList.add(account);
            }
        }
        return searchMemberArrayList;
    }
    
    
    // get MasterEventPost Directory
    public ArrayList<InformationPost> getMasterEventPostDirectory() {
        ArrayList<InformationPost> masterEventPostDirectory = new ArrayList<InformationPost>();
        for (Campus c : campusList){
            for (Enterprise e: c.getEnterpriseDirectory().getEnterpriseList()){
                if (e instanceof PartyRadarEnterprise){
                    for (Group g: e.getGroupDirectory().getGroupList()){
                        for (InformationPost infoPost: g.getInfoQueue().getInfoPostList()){
                            if (infoPost instanceof EventPost){
                                masterEventPostDirectory.add(infoPost);
                            }
                        }
                    }
                }
            }
        }
        return masterEventPostDirectory;
    }
    
    public ArrayList<InformationPost> getCampusEventPostDirectory(Campus selectCampus) {
        
        // eventPostDirectory in selected campus
        ArrayList<InformationPost> campusEventPostDirectory = new ArrayList<InformationPost>();
        for (Enterprise e: selectCampus.getEnterpriseDirectory().getEnterpriseList()){
            if (e instanceof PartyRadarEnterprise){
                for (Group g: e.getGroupDirectory().getGroupList()){
                    for (InformationPost infoPost: g.getInfoQueue().getInfoPostList()){
                        if (infoPost instanceof EventPost){
                            campusEventPostDirectory.add(infoPost);
                        }
                    }
                }
            }
        }
        return campusEventPostDirectory;
    }
    
    
    public Campus createAndAddCampus(){
        Campus campus=new Campus();
        campusList.add(campus);
        return campus;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }


    public ArrayList<Campus> getCampusList() {
        return campusList;
    }

    public void setCampusList(ArrayList<Campus> campusList) {
        this.campusList = campusList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Campus campus:campusList){
            
        }
        return true;
    }
    
    public boolean isContains(String name){
        for(Campus c : campusList){
            if (c.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
}
