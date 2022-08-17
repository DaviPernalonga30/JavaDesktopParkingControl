/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkingcontrol;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author davip
 */
public class ArquivesManagement {
    public void SaveFile(ArrayList<Object> list, String filepath){
        File arq = new File(filepath);
        try{
            arq.delete();
            arq.createNewFile();
            
            FileOutputStream aux = new FileOutputStream(arq);
            
            ObjectOutputStream objOutput = new ObjectOutputStream(aux);
            objOutput.writeObject(list);
            objOutput.close();
            
        }
        catch(IOException erro){
            System.out.println("Não foi possível salvar o arquivo. " + erro.getMessage());

        }
        
    }
    
    public ArrayList<Object> LoadFile(String filepath){
        ArrayList<Object> list = new ArrayList<>();
        try{            
            FileInputStream aux2 = new FileInputStream(filepath);
            
            ObjectInputStream objInput = new ObjectInputStream(aux2);
            
            list = (ArrayList<Object>)objInput.readObject();
            objInput.close();
            
        }
        catch(IOException erro1){
            System.out.println("Erro: " + erro1.getMessage());
            
        }
        catch(ClassNotFoundException erro2){
            System.out.println("Erro: " + erro2.getMessage());
            
        }
        
        
        return list;
    }
        
    
    
    
    
}
