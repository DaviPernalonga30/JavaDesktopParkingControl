/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkingcontrol;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author davip
 */
public class Subscriber implements Serializable {
    private String      name;
    private String      carModel;
    private String      subscriptionDate;
    private String      subscriptionDeadLine;
    private String      weekDays;
    private String      contact;
    private String      license;
    private Boolean     isMensalist;
   
    
    
    //Setters
    public void setName(String aux){
        this.name = aux;
    }
    public void setCarModel(String aux){
        this.carModel = aux;
    }
    public void setManualSubscriptionDate(String aux){
        this.subscriptionDate = aux;
    }
    public void setManualSubscriptionDeadLine(String aux){
        this.subscriptionDeadLine = aux;
    }
    public void setWeekDays(String aux){
        this.weekDays = aux;
    }
    public void setContact(String aux){
        this.contact = aux;
    }
    public void setLicense(String aux){
        this.license = aux;
    }
    public void setIsMensalist(Boolean aux){
        this.isMensalist = aux;
    }
    
    //Getters
    public String getName(){
        return this.name;
    }
    public String getCarModel(){
        return this.carModel;
    }
    public String getSubscriptionDate(){
        return this.subscriptionDate;
    }
    public String getSubscriptionDeadLine(){
        return this.subscriptionDeadLine;
    }
    public String getWeekDays(){
        return this.weekDays;
    }
    public String getContact(){
        return this.contact;
    }
    public String getLicense(){
        return this.license;
    }
    public Boolean getIsMensalist(){
        return this.isMensalist;

    }
    
    public void setAutoSubscriptionDate(){
        String aux;
        SimpleDateFormat formatter;
        formatter = new SimpleDateFormat("dd/MM/yyyy");
        aux = formatter.format(Calendar.getInstance().getTime());
        this.setManualSubscriptionDate(aux);
    }
    
    public void setAutoSubscriptionDeadLine(){
        
        return;
        
    }
    
    
    
    
    
}
