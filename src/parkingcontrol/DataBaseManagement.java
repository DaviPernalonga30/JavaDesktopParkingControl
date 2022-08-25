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
        url = "jdbc:postgresql://localhost:5432/postgres";
        user = "postgres";
        password = "";
        
        
        try{
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão deu certo!");
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
