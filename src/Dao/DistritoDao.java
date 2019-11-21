/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import Interfaces.IDistrito;
import Datos.Distrito;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DistritoDao 
    
{

    Vector vDistrito = new Vector ();
    
    
    public void guardar(Distrito unDistrito) {
     vDistrito.addElement(unDistrito);
    }

    
    public DefaultTableModel listar() {
    Vector vCabe= new Vector();
    vCabe.addElement("Codigo");
    vCabe.addElement("Distrito");
//    vCabe.addElement("Abreviatura");
    DefaultTableModel mdlTabla = new DefaultTableModel(vCabe,0);
    
    try {
        FileReader fw = new FileReader ("Distritros.txt");
        BufferedReader br =  new BufferedReader (fw);
        String d;
        while ((d=br.readLine())!=null){
            StringTokenizer linea = new StringTokenizer(d,"/");
            Vector x = new Vector();
            while (linea.hasMoreTokens()){
                x.addElement(linea.nextToken());
            }
                mdlTabla.addRow(x);
            
        }
    }
    catch(java.io.IOException ioex){
        JOptionPane.showMessageDialog(null, ioex.toString());
        
    }
    return mdlTabla;
    }

    
    public void  guardarArchivo(Distrito distrito) {

    
    try {
        FileWriter fw = new FileWriter ("Distritros.txt",true);
        BufferedWriter bw = new BufferedWriter (fw); 
        PrintWriter pw=  new PrintWriter(bw);
     
        pw.print(distrito.getCodigo());
        pw.print("/"+distrito.getDistrito());
        pw.println("/"+distrito.getAbreciatura());
        pw.close();
    }
    catch(java.io.IOException ioex){
        JOptionPane.showMessageDialog(null, ioex.toString());
        
    }
    
    }

}
