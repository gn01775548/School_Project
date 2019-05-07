/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bonnie
 */
public class VenueRadarEnterprise extends Enterprise {
    private VenueDirectory venueDirectory;
    private MenuDirectory menuDirectory;

    public VenueRadarEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.VenueRadar);
        venueDirectory = new VenueDirectory();
        menuDirectory = new MenuDirectory();
    }

    public VenueDirectory getVenueDirectory() {
        return venueDirectory;
    }

    public void setVenueDirectory(VenueDirectory venueDirectory) {
        this.venueDirectory = venueDirectory;
    }   

    public MenuDirectory getMenuDirectory() {
        return menuDirectory;
    }

    public void setMenuDirectory(MenuDirectory menuDirectory) {
        this.menuDirectory = menuDirectory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}

