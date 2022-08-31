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
    public void SaveFile(ArrayList list, String filepath){
        File arq = new File(filepath+".2de");
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
    
    public ArrayList LoadFile(String filepath){
        ArrayList list = new ArrayList();
        try{            
            FileInputStream aux2 = new FileInputStream(filepath);
            
            ObjectInputStream objInput = new ObjectInputStream(aux2);
            
            list = (ArrayList)objInput.readObject();
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
    
    
    public void AutoLoad(ArrayList Veic, ArrayList Subs){
        ArrayList ListVeic = this.LoadFile("Documentos/autosaveVeic.2de");
        ArrayList ListSubs = this.LoadFile("Documentos/autosaveSubs.2de");
        Veic = ListVeic;
        Subs = ListSubs;
        
    }
    
    public void AutoSave(ArrayList Veic, ArrayList Subs){
        this.SaveFile(Veic, "Documentos/autosaveVeic");
        this.SaveFile(Subs, "Documentos/autosaveSubs");
    }
     
    
    
    public void CSVcreation(ArrayList aux){
        
        
        
        
    }
    
    
    
    
}
