/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Group;

import Business.Group.EventManagerGroup;
import Business.Group.PlatformMemberGroup;
import Business.Group.Group.Type;
import Business.Group.MaintainerGroup;
import Business.Group.VenueMaintainanceManagerGroup;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class GroupDirectory {
    
    private ArrayList<Group> groupList;

    public GroupDirectory() {
        groupList = new ArrayList();
    }

    public ArrayList<Group> getGroupList() {
        return groupList;
    }
    
    public Group createGroup(Type type){
        Group group = null;
        if (type.getValue().equals(Type.EventManager.getValue())){
            group = new EventManagerGroup();
            groupList.add(group);
        }
        else if (type.getValue().equals(Type.PlatformMember.getValue())){
            group = new PlatformMemberGroup();
            groupList.add(group);
        }
        else if (type.getValue().equals(Type.Maintainer.getValue())){
            group = new MaintainerGroup();
            groupList.add(group);
        }
        
        else if (type.getValue().equals(Type.VenueMaintainanceManager.getValue())){
            group = new VenueMaintainanceManagerGroup();
            groupList.add(group);
        }
        else if (type.getValue().equals(Type.VenueBookingManager.getValue())){
        group = new VenueBookingManagerGroup();
        groupList.add(group);
        }
        
        else if (type.getValue().equals(Type.CateringManager.getValue())){
        group = new CateringManagerGroup();
        groupList.add(group);
        }
//        else if (type.getValue().equals(Type.Visitor.getValue())){
//            group = new VisitorGroup();
//            groupList.add(group);
//        }
        return group;
    }
}
