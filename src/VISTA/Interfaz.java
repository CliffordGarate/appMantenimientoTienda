/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import BEAN.Articulo;
import BEAN.Cliente;
import BEAN.Empleado;
import BEAN.Usuario;
import DAO.ArticuloDAO;
import DAO.ClienteDAO;
import DAO.EmpleadoDAO;
import DAO.UsuarioDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class Interfaz extends javax.swing.JFrame {
//variable incremento index cmb 
      int cmb;
        DefaultTableModel md1;
         DefaultTableModel md2;
         DefaultTableModel md3;
         DefaultTableModel md4;
    public Interfaz() {
        initComponents();
        setTitle("MANTENIMIENTO DE TIENDA");
        
        listarempleados();
        listarcliente();
        listararticulos();
        listarusuario();
    }
    //*****************************EMPLEADO MANTENIMIENTO*****************************************
    //-------------------LISTAR TABLA EMPLEADOS----------------------------
    public  void listarempleados(){
    String col []= {"ID_Empleado","Nombre","Apellido Paterno","Apellido Materno", "Cargo"};
    md1 = new DefaultTableModel(null,col);
    tabla_em.setModel(md1);
    ArrayList<Empleado> ls = EmpleadoDAO.ListarEmpleados();
    for(Empleado x:ls ){
        md1.addRow(new Object[]{x.getIdempleado(),x.getNombre(),x.getApepat(), x.getApemat(), x.getCargo()});
    }
}
//-----------------------LiMPIAR TXT--------------------------
    public void LimpiarEmpleado(){
        txt_id_em.setText("");
        txt_nombre_em.setText("");
        txt_apepa_em.setText("");
        txt_apema_em.setText("");
        txt_cargo_em.setText("");
    }
    //*****************************CLIENTE MANTENIMIENTO*****************************************
    //-------------------LISTAR TABLA CLIENTE----------------------------
    public  void listarcliente(){
        String col []={"ID_Cliente","Apellidos","Nombre","Email","ID_Pais"};
        md2 = new DefaultTableModel(null, col);
        tabla_cl.setModel(md2);
    ArrayList<Cliente> lc = ClienteDAO.listarclientes();
    for(Cliente x: lc){
        md2.addRow(new Object[]{x.getIdcliente(),x.getApellidos(),x.getNombre(),x.getEmail(), x.getPais()});
      }
    }
    //-----------------------LiMPIAR TXT--------------------------
    public void LimpiarCliente(){
        txt_id_cl.setText("");
        txt_nombre_cl.setText("");
        txt_apellidos_cl.setText("");
        txt_email_cl.setText("");   
    }
   //---------------------------------MANTENIMIENTO ARTICULO------------------------
    public void listararticulos(){
        String col[]={"ID_Articulo","Nombre","Descripcion","ID_Categoria","Precio","Foto"};
        md3 = new DefaultTableModel(null,col);
        tabla_art.setModel(md3);
        
        ArrayList<Articulo> ls = ArticuloDAO.listarArticulo();
        for(Articulo x : ls){
        md3.addRow(new Object[]{x.getIdarticulo(),x.getNombre(),x.getDescripcion(), x.getIdCategoria(), x.getPrecio(),x.getFoto()});
    }
       
    }
     public void limpiararticulo(){
         txt_id_art.setText("");
         txt_nombre_art.setText("");
         txt_descripcion_art.setText("");
         txt_precio_art.setText("");
         txt_id_art.setText("");
         txt_foto_art.setText("");
     }
     //---------------------------------MANTENIMIENTO USUARIO------------------------
    public void listarusuario(){
        String col[]={"ID_Usuario","Usuario","Password","empleado"};
        md4 = new DefaultTableModel(null,col);
        tabla_usu.setModel(md4);
        
        ArrayList<Usuario> ls = UsuarioDAO.listarusu();
        for(Usuario x : ls){
        md4.addRow(new Object[]{x.getIdusu(), x.getUsuario(), x.getPass(), x.getEmpleado()});
    }
       
    }
     public void limpiarusuario(){
         txt_id_usu.setText("");
         txt_usu.setText("");
         txt_emp_usu.setText("");
         txt_pass_usu.setText("");
         
     }
     
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nombre_em = new javax.swing.JTextField();
        txt_apepa_em = new javax.swing.JTextField();
        txt_apema_em = new javax.swing.JTextField();
        txt_cargo_em = new javax.swing.JTextField();
        txt_id_em = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_em = new javax.swing.JTable();
        BTN_GRABAR_EM = new javax.swing.JButton();
        BTN_ELIMINAR_EM = new javax.swing.JButton();
        BTN_NUEVO_EM = new javax.swing.JButton();
        BTN_MODIFICAR_EM = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_nombre_cl = new javax.swing.JTextField();
        txt_apellidos_cl = new javax.swing.JTextField();
        txt_email_cl = new javax.swing.JTextField();
        txt_id_cl = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_cl = new javax.swing.JTable();
        BTN_GRABAR_CL = new javax.swing.JButton();
        BTN_ELIMINAR_CL = new javax.swing.JButton();
        BTN_NUEVO_CL = new javax.swing.JButton();
        BTN_MODIFICAR_CL = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cmb_pais = new javax.swing.JComboBox<String>();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_nombre_art = new javax.swing.JTextField();
        txt_precio_art = new javax.swing.JTextField();
        txt_id_art = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_art = new javax.swing.JTable();
        BTN_GRABAR_ART = new javax.swing.JButton();
        BTN_ELIMINAR_ART = new javax.swing.JButton();
        BTN_NUEVO_ART = new javax.swing.JButton();
        BTN_MODIFICAR_ART = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cmb_categoria = new javax.swing.JComboBox<String>();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_descripcion_art = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_foto_art = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_usu = new javax.swing.JTextField();
        txt_id_usu = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla_usu = new javax.swing.JTable();
        BTN_GRABAR_ART1 = new javax.swing.JButton();
        BTN_ELIMINAR_ART1 = new javax.swing.JButton();
        BTN_NUEVO_ART1 = new javax.swing.JButton();
        BTN_MODIFICAR_ART1 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txt_pass_usu = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_emp_usu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Apellido Paterno:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Apellido Materno:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Cargo:");

        txt_nombre_em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_emActionPerformed(evt);
            }
        });

        txt_id_em.setEnabled(false);

        tabla_em.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_em.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_emMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_em);

        BTN_GRABAR_EM.setText("GRABAR");
        BTN_GRABAR_EM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GRABAR_EMActionPerformed(evt);
            }
        });

        BTN_ELIMINAR_EM.setText("ELIMINAR");
        BTN_ELIMINAR_EM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ELIMINAR_EMActionPerformed(evt);
            }
        });

        BTN_NUEVO_EM.setText("NUEVO");
        BTN_NUEVO_EM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NUEVO_EMActionPerformed(evt);
            }
        });

        BTN_MODIFICAR_EM.setText("MODIFICAR");
        BTN_MODIFICAR_EM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_MODIFICAR_EMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN_MODIFICAR_EM, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_NUEVO_EM, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombre_em)
                            .addComponent(txt_apepa_em)
                            .addComponent(txt_apema_em)
                            .addComponent(txt_cargo_em)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_id_em, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN_GRABAR_EM, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_ELIMINAR_EM, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_id_em, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_nombre_em, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_apepa_em, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_apema_em, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_cargo_em, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_GRABAR_EM, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_NUEVO_EM, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_ELIMINAR_EM, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_MODIFICAR_EM, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(29, 29, 29))))
        );

        jTabbedPane1.addTab("Mantenimiento Empleado", jPanel2);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Nombres:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("ID:");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Apellidos:");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Email:");

        txt_nombre_cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_clActionPerformed(evt);
            }
        });

        txt_email_cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_email_clActionPerformed(evt);
            }
        });

        txt_id_cl.setEnabled(false);

        tabla_cl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_cl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_clMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_cl);

        BTN_GRABAR_CL.setText("GRABAR");
        BTN_GRABAR_CL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GRABAR_CLActionPerformed(evt);
            }
        });

        BTN_ELIMINAR_CL.setText("ELIMINAR");
        BTN_ELIMINAR_CL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ELIMINAR_CLActionPerformed(evt);
            }
        });

        BTN_NUEVO_CL.setText("NUEVO");
        BTN_NUEVO_CL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NUEVO_CLActionPerformed(evt);
            }
        });

        BTN_MODIFICAR_CL.setText("MODIFICAR");
        BTN_MODIFICAR_CL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_MODIFICAR_CLActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("ID PAIS:");

        cmb_pais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(33, 33, 33)
                                .addComponent(txt_apellidos_cl))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_id_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nombre_cl, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(cmb_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txt_email_cl)))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN_MODIFICAR_CL, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_NUEVO_CL, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_GRABAR_CL, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_ELIMINAR_CL, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_id_cl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_nombre_cl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_apellidos_cl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_email_cl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cmb_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_NUEVO_CL, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_GRABAR_CL, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_ELIMINAR_CL, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_MODIFICAR_CL, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(29, 29, 29))))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Mantenimiento Clientes", jPanel3);

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Nombre:");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("ID:");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setText("Descripcion:");

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setText("Precio:");

        txt_nombre_art.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_artActionPerformed(evt);
            }
        });

        txt_precio_art.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precio_artActionPerformed(evt);
            }
        });

        txt_id_art.setEnabled(false);

        tabla_art.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_art.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_artMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabla_art);

        BTN_GRABAR_ART.setText("GRABAR");
        BTN_GRABAR_ART.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GRABAR_ARTActionPerformed(evt);
            }
        });

        BTN_ELIMINAR_ART.setText("ELIMINAR");
        BTN_ELIMINAR_ART.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ELIMINAR_ARTActionPerformed(evt);
            }
        });

        BTN_NUEVO_ART.setText("NUEVO");
        BTN_NUEVO_ART.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NUEVO_ARTActionPerformed(evt);
            }
        });

        BTN_MODIFICAR_ART.setText("MODIFICAR");
        BTN_MODIFICAR_ART.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_MODIFICAR_ARTActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel15.setText("ID categoria:");

        cmb_categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        txt_descripcion_art.setColumns(20);
        txt_descripcion_art.setRows(5);
        jScrollPane4.setViewportView(txt_descripcion_art);

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel16.setText("Foto:");

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel17.setText("Foto:");

        txt_foto_art.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_foto_artActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN_NUEVO_ART, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_MODIFICAR_ART, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN_ELIMINAR_ART, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_GRABAR_ART, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(33, 33, 33)
                        .addComponent(cmb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_id_art, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre_art, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(txt_precio_art, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_foto_art, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_id_art, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txt_nombre_art, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(txt_precio_art, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)
                                    .addComponent(txt_foto_art, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cmb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_NUEVO_ART, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_GRABAR_ART, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_MODIFICAR_ART, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_ELIMINAR_ART, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 8, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Mantenimiento Artriculo", jPanel4);

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel18.setText("Usuario:");

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel19.setText("ID:");

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel20.setText("Password:");

        txt_usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuActionPerformed(evt);
            }
        });

        txt_id_usu.setEnabled(false);

        tabla_usu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_usu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_usuMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tabla_usu);

        BTN_GRABAR_ART1.setText("GRABAR");
        BTN_GRABAR_ART1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GRABAR_ART1ActionPerformed(evt);
            }
        });

        BTN_ELIMINAR_ART1.setText("ELIMINAR");
        BTN_ELIMINAR_ART1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ELIMINAR_ART1ActionPerformed(evt);
            }
        });

        BTN_NUEVO_ART1.setText("NUEVO");
        BTN_NUEVO_ART1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NUEVO_ART1ActionPerformed(evt);
            }
        });

        BTN_MODIFICAR_ART1.setText("MODIFICAR");
        BTN_MODIFICAR_ART1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_MODIFICAR_ART1ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel23.setText("Foto:");

        txt_pass_usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pass_usuActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel21.setText("Empleado:");

        txt_emp_usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emp_usuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN_NUEVO_ART1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_MODIFICAR_ART1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN_ELIMINAR_ART1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_GRABAR_ART1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_emp_usu, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_id_usu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_usu, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel23))
                            .addComponent(txt_pass_usu, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txt_id_usu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(txt_usu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(txt_pass_usu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txt_emp_usu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_NUEVO_ART1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_GRABAR_ART1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_MODIFICAR_ART1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_ELIMINAR_ART1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 8, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Mantenimiento Usuarios", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombre_emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre_emActionPerformed

    private void BTN_GRABAR_EMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GRABAR_EMActionPerformed
    Empleado em = new Empleado();
    em.setNombre(txt_nombre_em.getText());
    em.setApepat(txt_apepa_em.getText());
    em.setApemat(txt_apema_em.getText());
    em.setCargo(txt_cargo_em.getText());
    EmpleadoDAO.insertar(em);
    listarempleados();
    LimpiarEmpleado();
    }//GEN-LAST:event_BTN_GRABAR_EMActionPerformed

    private void BTN_ELIMINAR_EMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ELIMINAR_EMActionPerformed
        if(!txt_id_em.getText().equals("")){
            EmpleadoDAO.eliminar(Integer.valueOf(txt_id_em.getText()));
            listarempleados();
            LimpiarEmpleado();
        }
    }//GEN-LAST:event_BTN_ELIMINAR_EMActionPerformed

    private void BTN_NUEVO_EMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NUEVO_EMActionPerformed
        LimpiarEmpleado();
    }//GEN-LAST:event_BTN_NUEVO_EMActionPerformed

    private void BTN_MODIFICAR_EMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_MODIFICAR_EMActionPerformed
        if(!txt_id_em.getText().equals("")){
            Empleado em = new Empleado();
            em.setNombre(txt_nombre_em.getText());
            em.setApepat(txt_apepa_em.getText());
            em.setApemat(txt_apema_em.getText());
            em.setCargo(txt_cargo_em.getText());
            em.setIdempleado(Integer.valueOf(txt_id_em.getText()));
            EmpleadoDAO.modificar(em);
            listarempleados();
            LimpiarEmpleado();
        }else{
            mensaje("Seleciona un empleado.");
        }
    }//GEN-LAST:event_BTN_MODIFICAR_EMActionPerformed

    private void tabla_emMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_emMouseClicked
        int fila = tabla_em.getSelectedRow();
        if(fila>=0){
            txt_id_em.setText(tabla_em.getValueAt(fila, 0).toString());
            txt_nombre_em.setText(tabla_em.getValueAt(fila, 1).toString());
            txt_apepa_em.setText(tabla_em.getValueAt(fila, 2).toString());
            txt_apema_em.setText(tabla_em.getValueAt(fila, 3).toString());
            txt_cargo_em.setText(tabla_em.getValueAt(fila, 4).toString());
        }else{
            mensaje("selecione un empleado.");
        }
    }//GEN-LAST:event_tabla_emMouseClicked

    private void txt_nombre_clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_clActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre_clActionPerformed

    private void tabla_clMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_clMouseClicked
       int fila = tabla_cl.getSelectedRow();
       if(fila>=0){
      txt_id_cl.setText(tabla_cl.getValueAt(fila, 0).toString());
      txt_apellidos_cl.setText(tabla_cl.getValueAt(fila, 1).toString());
      txt_nombre_cl.setText(tabla_cl.getValueAt(fila, 2).toString());
      txt_email_cl.setText(tabla_cl.getValueAt(fila, 3).toString());
       cmb=Integer.valueOf(tabla_cl.getValueAt(fila, 4).toString())-1;
            cmb_pais.setSelectedIndex(cmb);
      
       }else{
           mensaje("Selecione un cliente.");
       }
    }//GEN-LAST:event_tabla_clMouseClicked

    private void BTN_GRABAR_CLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GRABAR_CLActionPerformed
       Cliente cl = new Cliente();
       cl.setApellidos(txt_apellidos_cl.getText());
       cl.setNombre(txt_nombre_cl.getText());
       cl.setEmail(txt_email_cl.getText());
       //-------incremento index combobox------
      
       cmb=cmb_pais.getSelectedIndex()+1;
       cl.setPais(cmb);
       ClienteDAO.insertar(cl);
       listarcliente();
       LimpiarCliente();
       
    }//GEN-LAST:event_BTN_GRABAR_CLActionPerformed

    private void BTN_ELIMINAR_CLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ELIMINAR_CLActionPerformed
      if(!txt_id_cl.getText().equals("")){
          ClienteDAO.eliminar(Integer.valueOf(txt_id_cl.getText()));
          listarcliente();
          LimpiarCliente();
      }else{
          mensaje("Seleccione el cliente que desee eliminar.");
      }
    }//GEN-LAST:event_BTN_ELIMINAR_CLActionPerformed

    private void BTN_NUEVO_CLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NUEVO_CLActionPerformed
     LimpiarCliente();
    }//GEN-LAST:event_BTN_NUEVO_CLActionPerformed

    private void BTN_MODIFICAR_CLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_MODIFICAR_CLActionPerformed
        if(!txt_id_cl.getText().equals("")){
        Cliente cl = new Cliente();
       cl.setApellidos(txt_apellidos_cl.getText());
       cl.setNombre(txt_nombre_cl.getText());
       cl.setEmail(txt_email_cl.getText());
        cmb=cmb_pais.getSelectedIndex()+1;
       cl.setPais(cmb);
       cl.setIdcliente(Integer.valueOf(txt_id_cl.getText()));
       ClienteDAO.modificar(cl);
       listarcliente();
       LimpiarCliente();
        }else{
            mensaje("Selecione el cliente que desee modificar.");
        }
    }//GEN-LAST:event_BTN_MODIFICAR_CLActionPerformed

    private void txt_email_clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_email_clActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_email_clActionPerformed

    private void txt_nombre_artActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_artActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre_artActionPerformed

    private void txt_precio_artActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precio_artActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precio_artActionPerformed

    private void tabla_artMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_artMouseClicked
        int fila = tabla_art.getSelectedRow();
        if(fila>=0){
            txt_id_art.setText(tabla_art.getValueAt(fila, 0).toString());
            txt_nombre_art.setText(tabla_art.getValueAt(fila, 1).toString());
            txt_descripcion_art.setText(tabla_art.getValueAt(fila, 2).toString());
            cmb=Integer.valueOf(tabla_art.getValueAt(fila, 3).toString())-1;
            cmb_categoria.setSelectedIndex(cmb);
            txt_precio_art.setText(tabla_art.getValueAt(fila, 4).toString());
             txt_foto_art.setText(tabla_art.getValueAt(fila, 5).toString());
            
        }else{
            mensaje("seleccione un articulo.");
        }
    }//GEN-LAST:event_tabla_artMouseClicked

    private void BTN_GRABAR_ARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GRABAR_ARTActionPerformed
       Articulo art = new Articulo();
       cmb=cmb_categoria.getSelectedIndex()+1;
       art.setIdCategoria(cmb);
       art.setNombre(txt_nombre_art.getText());
       art.setDescripcion(txt_descripcion_art.getText());
       art.setFoto(txt_foto_art.getText());
       art.setPrecio(Double.valueOf(txt_precio_art.getText()));
       ArticuloDAO.insertar(art);
       
       listararticulos();
       limpiararticulo();
    }//GEN-LAST:event_BTN_GRABAR_ARTActionPerformed

    private void BTN_ELIMINAR_ARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ELIMINAR_ARTActionPerformed
        if(!txt_id_art.getText().equals("")){
          ArticuloDAO.eliminar(Integer.valueOf(txt_id_art.getText()));
          listararticulos();
          limpiararticulo();
        }else{
            mensaje("Seleccione un articulo.");
        }
    }//GEN-LAST:event_BTN_ELIMINAR_ARTActionPerformed

    private void BTN_NUEVO_ARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NUEVO_ARTActionPerformed
        limpiararticulo();
    }//GEN-LAST:event_BTN_NUEVO_ARTActionPerformed

    private void BTN_MODIFICAR_ARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_MODIFICAR_ARTActionPerformed
        if(!txt_id_art.getText().equals("")){
           Articulo art = new Articulo();
       cmb=cmb_categoria.getSelectedIndex()+1;
       art.setIdCategoria(cmb);
       art.setNombre(txt_nombre_art.getText());
       art.setDescripcion(txt_descripcion_art.getText());
       art.setFoto(txt_foto_art.getText());
       art.setPrecio(Double.valueOf(txt_precio_art.getText()));
       art.setIdarticulo(Integer.valueOf(txt_id_art.getText()));
       ArticuloDAO.modificar(art);
       
       listararticulos();
       limpiararticulo(); 
            
        }
        else{
            mensaje("Seleccione un articulo.");
        }
    }//GEN-LAST:event_BTN_MODIFICAR_ARTActionPerformed

    private void txt_foto_artActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_foto_artActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_foto_artActionPerformed

    private void txt_usuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuActionPerformed

    private void tabla_usuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_usuMouseClicked
        int fila = tabla_usu.getSelectedRow();
        if(fila>=0){
            txt_id_usu.setText(tabla_usu.getValueAt(fila, 0).toString());
            txt_usu.setText(tabla_usu.getValueAt(fila, 1).toString());
            txt_pass_usu.setText(tabla_usu.getValueAt(fila, 2).toString());
            txt_emp_usu.setText(tabla_usu.getValueAt(fila, 3).toString());
            
        }else{
          mensaje("seleccione un usuario");  
        }
    }//GEN-LAST:event_tabla_usuMouseClicked

    private void BTN_GRABAR_ART1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GRABAR_ART1ActionPerformed
       Usuario us = new Usuario();
       us.setUsuario(txt_usu.getText());
       us.setPass(Integer.valueOf(txt_pass_usu.getText()));
       ArrayList<Usuario> lu = UsuarioDAO.convertirusu(txt_emp_usu.getText());
       for(Usuario x: lu)
           us.setIdempleado(x.getIdempleado());
       
       UsuarioDAO.insertarusu(us);
       listarusuario();
       limpiarusuario();
    }//GEN-LAST:event_BTN_GRABAR_ART1ActionPerformed

    private void BTN_ELIMINAR_ART1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ELIMINAR_ART1ActionPerformed
       if(!txt_id_usu.getText().equals("")){
           UsuarioDAO.eliminarusu(Integer.valueOf(txt_id_usu.getText()));
           listarusuario();
           limpiarusuario();
       }else{
           mensaje("seleccione un usuario");
       }
    }//GEN-LAST:event_BTN_ELIMINAR_ART1ActionPerformed

    private void BTN_NUEVO_ART1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NUEVO_ART1ActionPerformed
       limpiarusuario();
    }//GEN-LAST:event_BTN_NUEVO_ART1ActionPerformed

    private void BTN_MODIFICAR_ART1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_MODIFICAR_ART1ActionPerformed
        if(!txt_id_usu.getText().equals("")){
            Usuario usu= new Usuario();
            usu.setUsuario(txt_usu.getText());
            usu.setPass(Integer.valueOf(txt_pass_usu.getText()));
            ArrayList<Usuario> lu = UsuarioDAO.convertirusu(txt_emp_usu.getText());
       for(Usuario x: lu){
           usu.setIdempleado(x.getIdempleado());
       }  
           usu.setIdusu(Integer.valueOf(txt_id_usu.getText()));
           UsuarioDAO.modificarusu(usu);
           listarusuario();
           limpiarusuario();
        }else{
            mensaje("selecione un usuario");
        }
    }//GEN-LAST:event_BTN_MODIFICAR_ART1ActionPerformed

    private void txt_pass_usuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pass_usuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pass_usuActionPerformed

    private void txt_emp_usuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emp_usuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emp_usuActionPerformed
private void mensaje(String m){
    JOptionPane.showMessageDialog(this, m);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_ELIMINAR_ART;
    private javax.swing.JButton BTN_ELIMINAR_ART1;
    private javax.swing.JButton BTN_ELIMINAR_CL;
    private javax.swing.JButton BTN_ELIMINAR_EM;
    private javax.swing.JButton BTN_GRABAR_ART;
    private javax.swing.JButton BTN_GRABAR_ART1;
    private javax.swing.JButton BTN_GRABAR_CL;
    private javax.swing.JButton BTN_GRABAR_EM;
    private javax.swing.JButton BTN_MODIFICAR_ART;
    private javax.swing.JButton BTN_MODIFICAR_ART1;
    private javax.swing.JButton BTN_MODIFICAR_CL;
    private javax.swing.JButton BTN_MODIFICAR_EM;
    private javax.swing.JButton BTN_NUEVO_ART;
    private javax.swing.JButton BTN_NUEVO_ART1;
    private javax.swing.JButton BTN_NUEVO_CL;
    private javax.swing.JButton BTN_NUEVO_EM;
    private javax.swing.JComboBox<String> cmb_categoria;
    private javax.swing.JComboBox<String> cmb_pais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabla_art;
    private javax.swing.JTable tabla_cl;
    private javax.swing.JTable tabla_em;
    private javax.swing.JTable tabla_usu;
    private javax.swing.JTextField txt_apellidos_cl;
    private javax.swing.JTextField txt_apema_em;
    private javax.swing.JTextField txt_apepa_em;
    private javax.swing.JTextField txt_cargo_em;
    private javax.swing.JTextArea txt_descripcion_art;
    private javax.swing.JTextField txt_email_cl;
    private javax.swing.JTextField txt_emp_usu;
    private javax.swing.JTextField txt_foto_art;
    private javax.swing.JTextField txt_id_art;
    private javax.swing.JTextField txt_id_cl;
    private javax.swing.JTextField txt_id_em;
    private javax.swing.JTextField txt_id_usu;
    private javax.swing.JTextField txt_nombre_art;
    private javax.swing.JTextField txt_nombre_cl;
    private javax.swing.JTextField txt_nombre_em;
    private javax.swing.JTextField txt_pass_usu;
    private javax.swing.JTextField txt_precio_art;
    private javax.swing.JTextField txt_usu;
    // End of variables declaration//GEN-END:variables
}
