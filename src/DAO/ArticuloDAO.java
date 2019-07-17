
package DAO;

import BEAN.Articulo;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;




public class ArticuloDAO {
    private static Connection cn;
    private static PreparedStatement ps;
    private static ResultSet rs;
   public static ArrayList<Articulo>listarArticulo(){
       ArrayList<Articulo> listart = new ArrayList<>();
       String sql = "Select * from articulo";
       cn= Conexion.Abrir();
       Articulo art;
        try {
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                art = new Articulo();
                art.setIdarticulo(rs.getInt(1));
                art.setIdCategoria(rs.getInt(2));
                art.setNombre(rs.getString(3));
                art.setDescripcion(rs.getString(4));
                art.setPrecio(rs.getDouble(5));
                art.setFoto(rs.getString(6));
                listart.add(art);
            }
            cn.close();
            rs.close();
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error aqui en listar-articulo: "+ex);
        }
       return listart;
   } 
   public static void insertar(Articulo art){
       String sql = "insert into articulo(idcategoria,nombre,descripcion,precio,foto)values(?,?,?,?,?)";
       cn=Conexion.Abrir();
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, art.getIdCategoria());
            ps.setString(2, art.getNombre());
            ps.setString(3, art.getDescripcion());
            ps.setDouble(4, art.getPrecio());
            ps.setString(5, art.getFoto());
            ps.executeUpdate();
            
            cn.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error aqui en insertar - articulo: "+ex);
        }
   } 
    public static void modificar (Articulo art){
       String sql = "Update articulo set idcategoria =?, nombre=?, descripcion=?, precio=?, foto=? where idarticulo = ?";
       cn=Conexion.Abrir();
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, art.getIdCategoria());
            ps.setString(2, art.getNombre());
            ps.setString(3, art.getDescripcion());
            ps.setDouble(4, art.getPrecio());
            ps.setString(5, art.getFoto());
            ps.setInt(6, art.getIdarticulo());
            ps.executeUpdate();
            
            cn.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error aqui en modificar - articulo: "+ex);
        }
   } 
     public static void eliminar (int id){
       String sql = "Delete from articulo where idarticulo = ?";
       cn=Conexion.Abrir();
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            cn.close();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error aqui en eliminar - articulo: "+ex);
        }
   } 
}
