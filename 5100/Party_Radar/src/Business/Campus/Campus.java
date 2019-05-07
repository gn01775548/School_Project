/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Campus;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author MyPC1
 */
public class Campus {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    
    public Campus(){
        enterpriseDirectory=new EnterpriseDirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
