/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.Cliente;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClienteDAO {
    private static Connection cn;
    private static PreparedStatement ps;
    private static ResultSet rs;
 //-------------------------LISTAR-----------------//
    public static ArrayList<Cliente> listarclientes(){
        ArrayList<Cliente> listcl = new ArrayList<>();
        String sql= "Select * from cliente";
        cn = Conexion.Abrir();
        Cliente cl;
        try {
            ps = cn.prepareStatement(sql);
            rs= ps.executeQuery();
            while(rs.next()){
                cl = new Cliente();
                cl.setIdcliente(rs.getInt(1));
                cl.setApellidos(rs.getString(2));
                cl.setNombre(rs.getString(3));
                cl.setEmail(rs.getString(4));
                cl.setPais(rs.getInt(5));
                listcl.add(cl);
                
            }
            cn.close();
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Error aqui en listar-cliente: "+ex);
        }
        return listcl;
    }
     //-------------------------INSERTAR-----------------//
    public static void insertar(Cliente cl){
        String sql= "insert into cliente(apellidos,nombres,email,idpais)values(?,?,?,?)";
        cn = Conexion.Abrir();
        try {
            ps = cn.prepareStatement(sql);
           ps.setString(1, cl.getApellidos());
           ps.setString(2, cl.getNombre());
           ps.setString(3, cl.getEmail());
           ps.setInt(4, cl.getPais());
           ps.executeUpdate();
            cn.close();
            ps.close();
           
        } catch (SQLException ex) {
            System.out.println("Error aqui en insertar-cliente: "+ex);
        }
    }
     //-------------------------MODIFICAR-----------------//
    public static void modificar(Cliente cl){
        String sql= "Update cliente set apellidos = ?,nombres = ?, email = ?, idpais = ? where idcliente =? ";
        cn = Conexion.Abrir();
        try {
            ps = cn.prepareStatement(sql);
           ps.setString(1, cl.getApellidos());
           ps.setString(2, cl.getNombre());
           ps.setString(3, cl.getEmail());
           ps.setInt(4, cl.getPais());
           ps.setInt(5, cl.getIdcliente());
           ps.executeUpdate();
            cn.close();
            ps.close();
           
        } catch (SQLException ex) {
            System.out.println("Error aqui en modificar-cliente: "+ex);
        }
    }
    //-------------------------MODIFICAR-----------------//
    public static void eliminar(int id){
        String sql= "Delete from cliente where idcliente =? ";
        cn = Conexion.Abrir();
        try {
            ps = cn.prepareStatement(sql);
           ps.setInt(1, id);
           ps.executeUpdate();
            cn.close();
            ps.close();
           
        } catch (SQLException ex) {
            System.out.println("Error aqui en eliminar-cliente: "+ex);
        }
    }
}
