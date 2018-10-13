/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_sistema_distribuido;

import java.sql.ResultSet;

/**
 *
 * @author USUARIO
 */
public class MYSQLConexion {
     public static void main(String[] args) {
        // TODO code application logic here
      ResultSet rs;
        try{
        Conexion cn = new Conexion();
        cn.conexion();
           }catch(Exception ex){
            System.out.println("ERROR:"+ ex);
           }
     }
}
