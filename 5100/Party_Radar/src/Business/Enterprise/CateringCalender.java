/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author bonnie
 */
public class CateringCalender {
    private Date startDate;
    private Date endDate;
    private HashMap<Date, Integer> dateMap; 
    
    
    public CateringCalender() {
        dateMap = new HashMap();
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            startDate = formatter.parse("11/30/2018");
            endDate = formatter.parse("11/29/2019");
        } 
        catch(ParseException e){
            JOptionPane.showMessageDialog(null, "Please follow valide date format!");
        }
        
        Calendar start = Calendar.getInstance();
        start.setTime(startDate);
        Calendar end = Calendar.getInstance();
        end.setTime(endDate);

        for (Date date = start.getTime(); start.before(end); start.add(Calendar.DATE, 1), date = start.getTime()) {
            dateMap.put(date, 0);
        }
       
    } 

    public void bookDate(Date d) {
        System.out.print("bookDate successe");
        dateMap.put(d,1);
    }
}
