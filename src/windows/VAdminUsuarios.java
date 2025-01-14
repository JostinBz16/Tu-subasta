/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package windows;

import Domain.Usuario;
import Metodos.TextPrompt;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import metodos.imgTabla;

/**
 *
 * @author USUARIO
 */
public class VAdminUsuarios extends javax.swing.JFrame {

    ArrayList<Usuario> ListaUsuarios = new ArrayList<>();
    TextPrompt ph;

    int i;

    public VAdminUsuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.extraerdatos();
        this.mostrar();

        tb_adminU.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tb_adminU.getTableHeader().setOpaque(false);
        tb_adminU.getTableHeader().setBackground(new Color(32, 136, 203));
        tb_adminU.getTableHeader().setForeground(new Color(255, 255, 255));
        tb_adminU.setRowHeight(25);

        ph = new TextPrompt("Busque el usuario que necesite", txt_buscar);
        tb_adminU.setDefaultRenderer(Object.class, new imgTabla());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_usuarios = new javax.swing.JLabel();
        btn_p = new javax.swing.JLabel();
        btn_categoria = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_eliminarCuenta = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        buscar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_adminU = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(228, 228, 228));
        jLabel2.setText("OFFERED & SOLD");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/subasta (3).png"))); // NOI18N

        btn_usuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_usuarios.setForeground(new java.awt.Color(255, 255, 255));
        btn_usuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_usuarios.setText("Usuarios Registrados");
        btn_usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_usuariosMouseClicked(evt);
            }
        });

        btn_p.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_p.setForeground(new java.awt.Color(255, 255, 255));
        btn_p.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_p.setText("Productos ");
        btn_p.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pMouseClicked(evt);
            }
        });

        btn_categoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_categoria.setForeground(new java.awt.Color(255, 255, 255));
        btn_categoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_categoria.setText("Agregar una Categoria");
        btn_categoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_categoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_categoriaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_categoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(btn_p, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(btn_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btn_p, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btn_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("x");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Usuarios Registrados");

        btn_eliminarCuenta.setBackground(new java.awt.Color(222, 4, 4));
        btn_eliminarCuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_eliminarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminarCuenta.setText("ELIMINAR CUENTA");
        btn_eliminarCuenta.setEnabled(false);
        btn_eliminarCuenta.setFocusable(false);
        btn_eliminarCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarCuentaMouseClicked(evt);
            }
        });

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscarKeyTyped(evt);
            }
        });

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });

        tb_adminU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Número identificación", "Correo", "Telefono", "Dirección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_adminU.setFocusable(false);
        tb_adminU.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tb_adminU.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tb_adminU.setShowVerticalLines(false);
        tb_adminU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_adminUMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_adminU);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(284, 284, 284)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_eliminarCuenta)
                                .addGap(47, 47, 47))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(buscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 71, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscar)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btn_eliminarCuenta)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
        Wadmin wa = new Wadmin();
        wa.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btn_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuariosMouseClicked
        this.dispose();
        VAdminUsuarios vau = new VAdminUsuarios();
        vau.setVisible(true);
    }//GEN-LAST:event_btn_usuariosMouseClicked

    private void btn_pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pMouseClicked
        this.dispose();
        VAdminProduc vap = new VAdminProduc();
        vap.setVisible(true);
    }//GEN-LAST:event_btn_pMouseClicked

    private void btn_categoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_categoriaMouseClicked
        this.dispose();
        CrearCategoria cc = new CrearCategoria();
        cc.setVisible(true);
    }//GEN-LAST:event_btn_categoriaMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btn_eliminarCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarCuentaMouseClicked
        Usuario usuario = new Usuario();
        usuario.setNombre(this.txt_buscar.getText());

        this.txt_buscar.setText("");
        JOptionPane.showMessageDialog(null, "¿Desea eliminar?");
        this.ListaUsuarios.remove(i);
        this.limpiar();
        this.almcenardatos();
        this.mostrar();
        this.Desabilitar();
    }//GEN-LAST:event_btn_eliminarCuentaMouseClicked

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked

    }//GEN-LAST:event_buscarMouseClicked

    private void txt_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyTyped

        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel) this.tb_adminU.getModel();

        this.limpiar();

        Usuario aux = this.buscar(this.txt_buscar.getText().toString());

        if (aux == null) {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
        } else {
            modelo.setNumRows(1);
            modelo.setValueAt(this.ListaUsuarios.get(i).getNombre(), i, 0);
            modelo.setValueAt(this.ListaUsuarios.get(i).getIdentificacion(), i, 1);
            modelo.setValueAt(this.ListaUsuarios.get(i).getCorreo(), i, 2);
            modelo.setValueAt(this.ListaUsuarios.get(i).getTelefono(), i, 4);
            modelo.setValueAt(this.ListaUsuarios.get(i).getDireccion(), i, 5);
        }
        mostrar();
    }//GEN-LAST:event_txt_buscarKeyTyped

    private void tb_adminUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_adminUMouseClicked

        i = this.tb_adminU.getSelectedRow();
        this.txt_buscar.setText(this.tb_adminU.getModel().getValueAt(i, 0).toString());

        habilitar();

    }//GEN-LAST:event_tb_adminUMouseClicked

    public void mostrar() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel) this.tb_adminU.getModel();
        modelo.setNumRows(this.ListaUsuarios.size());
        for (int i = 0; i < this.ListaUsuarios.size(); i++) {

            modelo.setValueAt(this.ListaUsuarios.get(i).getNombre(), i, 0);
            modelo.setValueAt(this.ListaUsuarios.get(i).getIdentificacion(), i, 1);
            modelo.setValueAt(this.ListaUsuarios.get(i).getCorreo(), i, 2);
            modelo.setValueAt(this.ListaUsuarios.get(i).getTelefono(), i, 3);
            modelo.setValueAt(this.ListaUsuarios.get(i).getDireccion(), i, 4);

        }
    }

    public void almcenardatos() {
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("usuarios.dat"));

            salida.writeObject(this.ListaUsuarios);
            System.out.println("archivo creado");

            salida.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo " + e.getMessage());
        }
    }

    public void extraerdatos() {

        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("usuarios.dat"));
            this.ListaUsuarios = (ArrayList<Usuario>) entrada.readObject();

            entrada.close();
        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo " + e.getMessage());
        }

    }

    public void limpiar() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel) this.tb_adminU.getModel();

        for (int k = 0; k <= modelo.getRowCount(); k++) {
            modelo.removeRow(0);
        }
    }

    public Usuario buscar(String clave) {
        Usuario aux = null;
        for (int k = 0; k <= this.ListaUsuarios.size(); k++) {
            if (this.ListaUsuarios.get(k).getNombre().equals(clave)) {
                aux = this.ListaUsuarios.get(k);
                i = k;
                break;
            }
        }

        return aux;
    }
    
    public void habilitar(){
        
        btn_eliminarCuenta.setEnabled(true);
        btn_eliminarCuenta.setFocusable(true);
        
    }   
    public void Desabilitar(){
        btn_eliminarCuenta.setEnabled(false);
        btn_eliminarCuenta.setFocusable(false);
    }
    

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
            java.util.logging.Logger.getLogger(VAdminUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VAdminUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VAdminUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VAdminUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VAdminUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_categoria;
    private javax.swing.JButton btn_eliminarCuenta;
    private javax.swing.JLabel btn_p;
    private javax.swing.JLabel btn_usuarios;
    private javax.swing.JLabel buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tb_adminU;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
