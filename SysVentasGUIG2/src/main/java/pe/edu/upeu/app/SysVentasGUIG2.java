/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pe.edu.upeu.app;

import javax.swing.JOptionPane;
import pe.edu.upeu.app.dao.ClienteDAO;
import pe.edu.upeu.app.dao.ClienteDaoI;
import pe.edu.upeu.app.gui.CARGA;
import pe.edu.upeu.app.gui.Login;
import pe.edu.upeu.app.gui.inicio;
import pe.edu.upeu.app.modelo.ClienteTO;

/**
 *
 * @author Lab Software
 */
public class SysVentasGUIG2 {

    public static void main(String[] args) {
        
        CARGA carga = new CARGA();
        
       carga.setLocationRelativeTo(null);
       
       carga.setVisible(true);
       
       //gargando...
       
       for(int i = 0; i<=100; i++){
           
           try{
               Thread.sleep(60);
           } catch (Exception e) {
           }
           System.out.println(i+"%");
           carga.Progreso.setValue(i);
       }
       new inicio().setVisible(true);
        ClienteDaoI dao=new ClienteDAO();
        for (ClienteTO listarCliente : dao.listarClientes()) {
            System.out.println(""+listarCliente.getDniruc() +"\t"+ listarCliente.nombresrs);
        }
       
        }
    }


