/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package windows;

import Domain.Categorias;
import Domain.Producto;
import Metodos.TextPrompt;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import metodos.imgTabla;

/**
 *
 * @author USUARIO
 */
public class VAdminProduc extends javax.swing.JFrame {

    TextPrompt ph;
    ArrayList<Producto> ListaProductos = new ArrayList<>();
    int i;
    //Imagen
    JFileChooser Selec = new JFileChooser();
    File archivo;
    byte[] imagen;
    FileInputStream Entrada;
    FileOutputStream Salida;
    
    public VAdminProduc() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        tb_adminP.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tb_adminP.getTableHeader().setOpaque(false);
        tb_adminP.getTableHeader().setBackground(new Color(32, 136, 203));
        tb_adminP.getTableHeader().setForeground(new Color(255, 255, 255));
        tb_adminP.setRowHeight(160);
        tb_adminP.setDefaultRenderer(Object.class, new imgTabla());
        
        ph = new TextPrompt("Busque el producto que necesite", txt_buscar);
        
        extraerdatos();
        mostrar();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_adminP = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(82, 82, 82))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_p, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(btn_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btn_p, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btn_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        tb_adminP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Estado", "Categoria", "Fecha final", "Vendedor", "Imagen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_adminP.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tb_adminP.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tb_adminP);
        if (tb_adminP.getColumnModel().getColumnCount() > 0) {
            tb_adminP.getColumnModel().getColumn(2).setPreferredWidth(20);
            tb_adminP.getColumnModel().getColumn(4).setPreferredWidth(30);
            tb_adminP.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

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
        jLabel4.setText("Productos Registrados");

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(347, 347, 347)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(267, 267, 267))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
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

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
        Wadmin wa = new Wadmin();
        wa.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txt_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyTyped

        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel)this.tb_adminP.getModel();

        this.limpiar();

        Producto aux = this.buscar(this.txt_buscar.getText().toString());

        if(aux==null){
            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
        }else{
            modelo.setNumRows(1);
            modelo.setValueAt(this.ListaProductos.get(i).getNombre(), i,0);
            modelo.setValueAt(this.ListaProductos.get(i).getEstado(), i,1);
            modelo.setValueAt(this.ListaProductos.get(i).getCategoria(), i,2);
            modelo.setValueAt(this.ListaProductos.get(i).getFechaFinal(), i,3);
            modelo.setValueAt(this.ListaProductos.get(i).getVendedor(), i,4);
            modelo.setValueAt(this.ListaProductos.get(i).getImagen(), i,5);
        }
        mostrar();
    }//GEN-LAST:event_txt_buscarKeyTyped

    public void almcenardatos() {
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("productos.dat"));

            salida.writeObject(this.ListaProductos);
            JOptionPane.showMessageDialog(null, "Se ha registrado con exito");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo " + e.getMessage());
        }
    }

    public void extraerdatos() {

        try {
            try ( ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("productos.dat"))) {
                this.ListaProductos = (ArrayList<Producto>) entrada.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al escribir en el archivo " + e.getMessage());
        }
    }

    public void limpiar() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel) this.tb_adminP.getModel();

        for (int k = 0; k <= modelo.getRowCount(); k++) {
            modelo.removeRow(0);
        }
    }

    public Producto buscar(String clave) {
        Producto aux = null;
        for (int k = 0; k <= this.ListaProductos.size(); k++) {
            if (this.ListaProductos.get(k).getNombre().equals(clave)) {
                aux = this.ListaProductos.get(k);
                i = k;
                break;
            }
        }
        return aux;
    }

    public void mostrar() {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo = (DefaultTableModel) this.tb_adminP.getModel();
        modelo.setNumRows(this.ListaProductos.size());
        for (int j = 0; j < this.ListaProductos.size(); j++) {
            modelo.setValueAt(this.ListaProductos.get(j).getNombre(), j, 0);
            modelo.setValueAt(this.ListaProductos.get(j).getEstado(), j, 1);
            modelo.setValueAt(this.ListaProductos.get(j).getCategoria(), j, 2);
            modelo.setValueAt(this.ListaProductos.get(j).getFechaFinal(), j, 3);
            modelo.setValueAt(this.ListaProductos.get(j).getVendedor(), j, 4);
            JLabel jl = new JLabel();
            jl.setIcon(new ImageIcon(this.ListaProductos.get(j).getImagen()));
            modelo.setValueAt(jl, j, 5);

        }
    }


    public void limpiarFormulario() {
        txt_buscar.setText("");
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
            java.util.logging.Logger.getLogger(VAdminProduc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VAdminProduc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VAdminProduc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VAdminProduc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VAdminProduc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_categoria;
    private javax.swing.JLabel btn_p;
    private javax.swing.JLabel btn_usuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_adminP;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
