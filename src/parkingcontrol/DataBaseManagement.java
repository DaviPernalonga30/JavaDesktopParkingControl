/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkingcontrol;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author davip
 */
public class DataBaseManagement {
    private String url;
    private String user;
    private String password;
    private Connection con;
    
    
    DataBaseManagement(){
        this.url = "jdbc:postgresql://localhost:5050/2D-Estacionamento";
        this.user = "postgres";
        this.password = "postgres";
        
        
        try{
            Class.forName("org.postgresql.Driver");
            this.con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão deu certo!");
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void insertIntoSubscriber(Subscriber sub){
        String sqlcmd = "INSERT INTO public.subscriber "
                + "(str_name, str_carmodel, str_initdate, str_enddate, str_license, str_weekdays, bool_ismensalist, bool_ismotorbike) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";        
        
        
        
        try(java.sql.PreparedStatement st = this.con.prepareStatement(sqlcmd)){
            st.setString(1, sub.getName());
            st.setString(2, sub.getCarModel());
            st.setString(3, sub.getSubscriptionDate());
            st.setString(4, sub.getSubscriptionDeadLine());
            st.setString(5, sub.getLicense());
            st.setString(6, sub.getWeekDays());
            st.setBoolean(7, sub.getIsMensalist());
            st.setBoolean(8, sub.getIsMotorBike());
            
            st.executeUpdate();
            
            
            System.out.println("deu certo: " + sqlcmd);
            
            
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    
    
    }
    
    
}
