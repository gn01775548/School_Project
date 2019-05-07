/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author bonnie
 */
public class MenuDirectory {
    

    private ArrayList<CateringMenu> menuDirectory;
    private ArrayList<CateringMenu> searchMenuList;
    
    public MenuDirectory() {
        menuDirectory = new ArrayList<CateringMenu>(); 
        searchMenuList = new ArrayList<CateringMenu>();
    }

    
    public ArrayList<CateringMenu> getMenuDirectory() {
        return menuDirectory;
    }

    public CateringMenu addCateringMenu(){
        CateringMenu cateringMenu = new CateringMenu();
        menuDirectory.add(cateringMenu);
        return cateringMenu;
    }


    public void removeCateringMenu(CateringMenu cateringMenu) {
        menuDirectory.remove(cateringMenu);
    }
}
