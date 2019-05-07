/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InformationQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class InformationQueue {
    
    private ArrayList<InformationPost> infoPostList;

    public InformationQueue() {
        infoPostList = new ArrayList();
    }


    public ArrayList<InformationPost> getInfoPostList() {
        return infoPostList;
    }
}