/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

/**
 *
 * @author bonnie
 */
public class CateringMenu {
    private int id;
    private String cateringName;
    private String type;
    private String details;
    private String picPath;
    private CateringCalender cateringCalender;
    
    private static int count = 1;

    
    
    public CateringMenu(){
        id = count;
        count++;
        cateringCalender = new CateringCalender();
    }


    public String getCateringName() {
        return cateringName;
    }

    public void setCateringName(String cateringName) {
        this.cateringName = cateringName;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }


    public CateringCalender getCateringCalender() {
        return cateringCalender;
    }

    public void setCateringCalender(CateringCalender cateringCalender) {
        this.cateringCalender = cateringCalender;
    }

    public int getId() {
        return id;
    }
    
        
    @Override
    public String toString() {
        return String.valueOf(id);
    }

}
