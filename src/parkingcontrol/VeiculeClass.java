/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkingcontrol;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author davip
 */
public class VeiculeClass implements Serializable{
    private SimpleDateFormat    formatter;
    private String              license;
    private String              timeIn;
    private String              timeOut;
    private Boolean             isSubscriber;   //falta getters e setters e comparações.
    private Boolean             hasKey;
    
    public void setLicense(String aux){
        this.license = aux;
    }
    
    public String getLicense(){
        return this.license;
    }
    
    public void setManualTimeIn(String aux){
        this.timeIn = aux;
    }
    
    public String getTimeIn(){
        return this.timeIn;
    }
    
    public void setManualTimeOut(String aux){
        this.timeOut = aux;
    }
    
    public String getTimeOut(){
        return this.timeOut;
    }
    
    public void setAutoTimeIn(){
        formatter = new SimpleDateFormat("HH:mm");
        this.timeIn = formatter.format(Calendar.getInstance().getTime());
    }
    
    public void setAutoTimeOut(){
        formatter = new SimpleDateFormat("HH:mm");
        this.timeOut = formatter.format(Calendar.getInstance().getTime());
    }
    
    public void setIsSubscriber(ArrayList<Subscriber> list){
        String auxLicense = this.getLicense();
        this.isSubscriber = false;
        for(int i = 0; i<list.size(); i = i+1){
            if(list.get(i).getLicense().equals(auxLicense)){
                if(list.get(i).getIsMensalist() == true){
                    this.isSubscriber = true;
                }
            }
        }
    }
    
    public Boolean getIsSubscriber(){
        return this.isSubscriber;
        
    }
    
    public void setHasKey(Boolean key){
        this.hasKey = key;
    }
    
    public Boolean getHasKey(){
        return this.hasKey;
    }
}
