/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.Usuario;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class UsuarioDAO {
    private static Connection cn;
    private static PreparedStatement ps;
    private static ResultSet rs;
    
    public static ArrayList<Usuario> listarusu(){
        ArrayList<Usuario> listu = new ArrayList<>();
        String sql = "Select u.idusuario, u.usuario, u.password, e.nombre from usuario u, empleado e where u.idempleado = e.idempleado";
        cn = Conexion.Abrir();
        Usuario usu;
        try {
            ps= cn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                usu = new Usuario();
                usu.setIdusu(rs.getInt(1));
                usu.setUsuario(rs.getString(2));
                usu.setPass(rs.getInt(3));
                usu.setEmpleado(rs.getString(4));
                listu.add(usu);
            }
            cn.close();
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error aqui en listar - usuario: "+ex);
        }return listu;
        
        
    }
    public static ArrayList<Usuario> convertirusu(String nom){
        ArrayList<Usuario> listu = new ArrayList<>();
        String sql = "Select idempleado from empleado where nombre =?";
        cn = Conexion.Abrir();
        Usuario usu;
        try {
            ps= cn.prepareStatement(sql);
            ps.setString(1, nom);
            rs = ps.executeQuery();
            
            while(rs.next()){
                usu = new Usuario();
                usu.setIdempleado(rs.getInt(1));
                listu.add(usu);
            }
            cn.close();
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error aqui enconversion - usuario: "+ex);
        }return listu;
        
        
    }
    //---------------------------INSERTAR----------------------------
    public static void insertarusu(Usuario usu){
        String sql = "insert into usuario(usuario, password,idempleado)values(?,?,?) ";
        cn= Conexion.Abrir();
        
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, usu.getUsuario());
            ps.setInt(2, usu.getPass());
            ps.setInt(3, usu.getIdempleado());
            ps.executeUpdate();
            
            ps.close();
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en insertar - usuario: "+ex);
        }
    }
    //---------------------------MODIFICAR----------------------------
    public static void modificarusu(Usuario usu){
        String sql = "Update usuario set usuario=?, password=?, idempleado=? where idusuario=? ";
        cn= Conexion.Abrir();
        
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, usu.getUsuario());
            ps.setInt(2, usu.getPass());
            ps.setInt(3, usu.getIdempleado());
            ps.setInt(4, usu.getIdusu());
            ps.executeUpdate();
            
            ps.close();
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en modificar - usuario: "+ex);
        }
    }
    //---------------------------ELIMINAR----------------------------
    public static void eliminarusu(int id){
        String sql = "Delete from usuario where idusuario=?";
        cn= Conexion.Abrir();
        
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            
            ps.close();
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error en eliminar - usuario: "+ex);
        }
    }
}
