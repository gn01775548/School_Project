/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author lvziqing
 */
public class VenueCalender {
    
//    private String[] venueCalender;
//    private ArrayList<Date> dateList;
    private Date startDate;
    private Date endDate;
    private HashMap<Date, Integer> dateMap; 
    
    
    public VenueCalender() {
        dateMap = new HashMap();
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            startDate = formatter.parse("30/11/2018");
            endDate = formatter.parse("29/11/2019");
        } 
        catch(ParseException e){
            JOptionPane.showMessageDialog(null, "Please follow valide date format!");
        }
        
        Calendar start = Calendar.getInstance();
        start.setTime(startDate);
        Calendar end = Calendar.getInstance();
        end.setTime(endDate);

        for (Date date = start.getTime(); start.before(end); start.add(Calendar.DATE, 1), date = start.getTime()) {
            // Do your job here with `date`.
//            dateList.add(date);
            dateMap.put(date, 0);
        }
        
        
//        venueCalender = new String[365];   
//        
//        for(int i=0; i<365; i++){
//            venueCalender [i] = "available";           
//        }
    } 

//    public String getSeat(int dayOfYear) {
//        return venueCalender[dayOfYear];
//    }

    public void bookDate(Date d) {
        System.out.print("bookDate successe");
        dateMap.put(d,1);
    }
    
//    public Venue getAvailableDate(Date d){
//        
//    }

    public HashMap<Date, Integer> getDateMap() {
        return dateMap;
    }
    
    
}
