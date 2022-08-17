/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkingcontrol;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author davip
 */
public class PcUI implements ActionListener{
    
    private JFrame mainFrame;
    private JTable table;
    private JMenuBar menubar;
    private JPanel panel;
    private JButton buttonAddCar;
    private ArrayList<VeiculeClass> veiculeList;
    
    
    PcUI(){
        this.veiculeList = new ArrayList();
        VeiculeClass test = new VeiculeClass();
        test.setAutoTimeIn();
        test.setLicense("kk deu bom");
        test.setAutoTimeOut();
        veiculeList.add(test);
        this.panel     = this.PanelCreation();
        this.menubar   = this.MenuBarCreation();
        //this.table     = this.VeiculeTableCreation(this.veiculeList);
        
        this.mainFrame = this.FrameCreation();
        this.mainFrame.setJMenuBar(this.menubar);
        this.panel.add(this.table);
        this.mainFrame.add(this.panel);
        //this.mainFrame.add(new JScrollPane(this.table));
        this.mainFrame.setVisible(true);
        
        
    }
    
    /*
    
    private JTable VeiculeTableCreation(ArrayList<VeiculeClass> list){
        JTable      table           = new JTable();
        DefaultTableModel model     = new DefaultTableModel();
        model.addColumn("Placa");
        model.addColumn("Hora de Entrada");
        model.addColumn("Hora de Saída");
        model.addColumn("Mensalista");
        
        
        for(int i = 0; i<list.size(); i= i + 1){
            Object[] linha = {
                list.get(i).getLicense(), list.get(i).getTimeIn(), list.get(i).getTimeOut(), null
            };
            model.insertRow(i, linha);
        }
        
        table.setModel(model);
        
        return table;
        
        
    }
    private JTable SubscriberTableCreation(ArrayList<Subscriber> list){
        JTable      table           = new JTable();
        String[]    collumName ={
            
            
        };
        Object[][]  data;
        
        return table;
        
        
    }
    private void updateTable(JTable table, Object data){
        //fazer uma comparação dos objetos
        //pegar o ultimo index da tabela e
        //adicionar o ultimo objeto nela.
        
    }
    
    */
    
    private JFrame FrameCreation(){
        JFrame frame = new JFrame();
        frame.setTitle("Controle de veículos no estacionamento");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(1024, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        return frame;
        
    }
    
    private JButton ButtonCreation(String name){
        JButton button = new JButton();
        button.setName(name);
        button.setText(name);
        button.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        
        return button;
    }
    
    private JMenuBar MenuBarCreation(){
        JMenuBar menubar        =   new JMenuBar();
        menubar.setName("Barra de menu");
        JMenu fileMenu          =   new JMenu("Arquivo"); 
        JMenu editMenu          =   new JMenu("Editar");
        
        
        JMenuItem newAction     =   new JMenuItem("Novo");
        JMenuItem saveAction    =   new JMenuItem("Salvar Arquivo");
        JMenuItem saveAsAction  =   new JMenuItem("Salvar Como");
        
        JMenuItem sizeAppAction =   new JMenuItem("Alterar resolução");
        
        
        fileMenu.add(newAction);
        fileMenu.add(saveAction);
        fileMenu.add(saveAsAction);
        
        editMenu.add(sizeAppAction);
        
        menubar.add(fileMenu);
        menubar.add(editMenu);    
        
        return menubar;
    }
    
    private JPanel PanelCreation(){
        JPanel panel = new JPanel();
        panel.setSize(1024,768);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setOpaque(true);
        return panel;
    }
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
