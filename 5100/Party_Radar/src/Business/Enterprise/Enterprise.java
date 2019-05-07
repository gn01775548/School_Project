 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Group.Group;
import Business.Group.GroupDirectory;

/**
 *
 * @author
 */
public abstract class Enterprise extends Group{
    
    private EnterpriseType enterpriseType;
    private GroupDirectory groupDirectory;

  
    public Enterprise(String name, EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        groupDirectory=new GroupDirectory();
    }
    
    public GroupDirectory getGroupDirectory() {
        return groupDirectory;
    }
    
    public enum EnterpriseType{
        PartyRadar("PartyRadar"),
        VenueRadar("VenueRadar");
       
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    

}
