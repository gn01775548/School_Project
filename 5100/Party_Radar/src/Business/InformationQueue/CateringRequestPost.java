/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InformationQueue;

import Business.Enterprise.CateringMenu;

/**
 *
 * @author bonnie
 */
public class CateringRequestPost extends InformationPost{


    private CateringMenu cateringMenu; 
    
    public CateringRequestPost() {
    this.cateringMenu = new CateringMenu();
}



    public CateringMenu getCateringMenu() {
        return cateringMenu;
    }

    public void setCateringMenu(CateringMenu cateringMenu) {
        this.cateringMenu = cateringMenu;
    }

    
        @Override
    public String toString() {
        return this.cateringMenu.getCateringName();
    }   
}
