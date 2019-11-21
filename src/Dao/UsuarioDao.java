/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Datos.Usuario;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;


public class UsuarioDao {
   
    public boolean leerArchivo(String usuario, String contraseña){
        boolean resp = false;
        
        try{
            FileReader fr = new FileReader("Usuarios.txt");
            BufferedReader br = new BufferedReader (fr);
            String d="";
            while((d=br.readLine())!=null){
                StringTokenizer unaLinea = new StringTokenizer(d,"|");
                Vector x = new Vector();
                while (unaLinea.hasMoreTokens()){
                    String usu= unaLinea.nextToken();
                    String contra= unaLinea.nextToken();
                    
                    if(usu.equalsIgnoreCase(usuario)&& contra.equals(contraseña)){
                        resp=true;
                        JOptionPane.showMessageDialog(null, "Bienvenido");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "USUARIO INCORRECTO");
                        resp=false;
                    }
                }
            }
        }catch(java.io.IOException ioex){
            JOptionPane.showMessageDialog(null, ioex.toString());
        }
        
        return resp;
    }
            
            
}
