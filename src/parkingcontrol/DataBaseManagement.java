/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkingcontrol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


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
                + "(str_name, str_carmodel, str_contact, str_initdate, str_enddate, str_license, str_weekdays, bool_ismensalist, bool_ismotorbike) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";        
        
        
        
        try(java.sql.PreparedStatement st = this.con.prepareStatement(sqlcmd)){
            st.setString(1, sub.getName());
            st.setString(2, sub.getCarModel());
            st.setString(3, sub.getContact());
            st.setString(4, sub.getSubscriptionDate());
            st.setString(5, sub.getSubscriptionDeadLine());
            st.setString(6, sub.getLicense());
            st.setString(7, sub.getWeekDays());
            st.setBoolean(8, sub.getIsMensalist());
            st.setBoolean(9, sub.getIsMotorBike());
            
            st.executeUpdate();
            
            
            System.out.println("deu certo: " + sqlcmd);
            
            
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    
    
    }
    
    public java.util.ArrayList selectFromSubscriber(){
        //depois criar uma regra para que só sejam carregados
        //aqueles que em 3 meses ainda foram mensalistas.
        
        
        java.util.ArrayList<Subscriber> sublist = new java.util.ArrayList();
        String query = "SELECT * FROM public.subscriber";
        
        try(java.sql.Statement st = this.con.createStatement()){
            java.sql.ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                var sub = new Subscriber();
                sub.setName(rs.getString("str_name"));
                sub.setCarModel(rs.getString("str_carmodel"));
                sub.setContact(rs.getString("str_contact"));
                sub.setManualSubscriptionDate(rs.getString("str_initdate"));
                sub.setManualSubscriptionDeadLine(rs.getString("str_enddate"));
                sub.setLicense(rs.getString("str_license"));
                sub.setWeekDays(rs.getString("str_weekdays"));
                sub.setIsMensalist(rs.getBoolean("bool_ismensalist"));
                sub.setIsMotorBike(rs.getBoolean("bool_ismotorbike"));
                
                sublist.add(sub);
                
            }
            
      
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return sublist;
    }
    
    
    public void updateItemFromSubscriber(Subscriber sub){
        //Criar a regra de update
        //https://www.javaguides.net/2020/02/java-jdbc-postgresql-update-example.html
        
        
        
        
        
    }
    
    
    
    
    
    
}
