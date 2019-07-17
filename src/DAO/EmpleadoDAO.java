/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.Empleado;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;




public class EmpleadoDAO {
    private static PreparedStatement ps;
    private static Connection cn;
    private static ResultSet rs;
 //-----------------------LISTAR-----------------------//
   public static ArrayList<Empleado> ListarEmpleados(){
       ArrayList<Empleado> listaemp = new ArrayList<>();
       String sql = "select * from empleado";
       cn = Conexion.Abrir();
       Empleado em;
       try {
           ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
           while(rs.next()){
               em = new Empleado();
               em.setIdempleado(rs.getInt(1));
               em.setNombre(rs.getString(2));
               em.setApepat(rs.getString(3));
               em.setApemat(rs.getString(4));
               em.setCargo(rs.getString(5));
               listaemp.add(em);
           }
           cn.close();
        
       } catch (SQLException ex) {
           System.out.println("Error en ArrayList-Empleado: " + ex);
       }
       return listaemp;
   }
    //-----------------------INSERTAR-----------------------//
   public static void insertar(Empleado em){
       String sql = "insert into empleado(nombre,apepaterno,apematerno,cargo)values(?,?,?,?)";
       cn = Conexion.Abrir();
     
       try {
           ps = cn.prepareStatement(sql);
            //
           ps.setString(1, em.getNombre());
           ps.setString(2, em.getApepat());
           ps.setString(3, em.getApemat());
           ps.setString(4, em.getCargo());
           ps.executeUpdate();
           
           cn.close();
           ps.close();
           
       } catch (SQLException ex) {
           System.out.println("Error en insertar-Empleado: " + ex);
       }
   }
   //-----------------------MODIFICAR-----------------------//
   public static void modificar(Empleado em){
       String sql = "Update empleado set nombre = ?, apepaterno = ?, apematerno = ?, cargo = ? where idempleado = ?";
       cn = Conexion.Abrir();
     
       try {
           ps = cn.prepareStatement(sql);
            //
           ps.setString(1, em.getNombre());
           ps.setString(2, em.getApepat());
           ps.setString(3, em.getApemat());
           ps.setString(4, em.getCargo());
           ps.setInt(5, em.getIdempleado());
           ps.executeUpdate();
           
           cn.close();
           ps.close();
           
       } catch (SQLException ex) {
           System.out.println("Error en modificar-Empleado: " + ex);
       } 
}
   //-----------------------ELIMINAR-----------------------//
   public static void eliminar(int id){
       String sql = "Delete from empleado where idempleado =?";
       cn = Conexion.Abrir();
     
       try {
           ps = cn.prepareStatement(sql);
            //
           ps.setInt(1, id);
           ps.executeUpdate();
           
           cn.close();
           ps.close();
           
       } catch (SQLException ex) {
           System.out.println("Error en eliminar-Empleado: " + ex);
       }
      
}
}
