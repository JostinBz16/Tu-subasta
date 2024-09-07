/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package windows;

import Domain.Producto;
import Domain.Usuario;
import Metodos.TextPrompt;
import java.awt.Color;
import java.awt.Font;
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
public class TusProductos extends javax.swing.JFrame {

    TextPrompt ph;
    Usuario usuarios;
    Producto producto;
    ArrayList<Producto> ListaProductos = new ArrayList<>();
    
    //Imagen
    JFileChooser Selec = new JFileChooser();
    File archivo;
    byte[] imagen;
    FileInputStream Entrada;
    FileOutputStream Salida;
    int i, j;
    
    public TusProductos(Usuario usuario) {
        initComponents();
        this.usuarios = usuario;
        tablaProdctos.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tablaProdctos.getTableHeader().setOpaque(false);
        tablaProdctos.getTableHeader().setBackground(new Color(32, 136, 203));
        tablaProdctos.getTableHeader().setForeground(new Color(255, 255, 255));
        tablaProdctos.setRowHeight(160);
        tablaProdctos.setDefaultRenderer(Object.class, new imgTabla());
    
        this.extraerdatos();
        this.mostrar();
    }

    public TusProductos() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProdctos = new javax.swing.JTable();
        btn_eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos registrados por ti"));

        tablaProdctos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Estado", "categoria", "fecha registro", "Fecha de fin", "Valor minimo ", "Imagen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProdctos.setToolTipText("");
        tablaProdctos.setFocusable(false);
        tablaProdctos.setGridColor(new java.awt.Color(204, 204, 204));
        tablaProdctos.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tablaProdctos.setShowVerticalLines(false);
        tablaProdctos.getTableHeader().setReorderingAllowed(false);
        tablaProdctos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProdctosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProdctos);
        if (tablaProdctos.getColumnModel().getColumnCount() > 0) {
            tablaProdctos.getColumnModel().getColumn(1).setPreferredWidth(20);
            tablaProdctos.getColumnModel().getColumn(6).setPreferredWidth(120);
        }

        btn_eliminar.setBackground(new java.awt.Color(255, 0, 51));
        btn_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("Eliminar Producto");
        btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminar.setEnabled(false);
        btn_eliminar.setFocusable(false);
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" X ");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        txt_nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Nombre del producto : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addComponent(jLabel4)
                .addGap(47, 47, 47)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaProdctosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProdctosMouseClicked
        i = this.tablaProdctos.getSelectedRow();
        this.txt_nombre.setText(this.tablaProdctos.getModel().getValueAt(i, 0).toString());
        habilitar();
    }//GEN-LAST:event_tablaProdctosMouseClicked

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        Producto producto = new Producto();
        producto.setNombre(this.txt_nombre.getText());

        producto.setNombre(this.txt_nombre.getText());
        JOptionPane.showMessageDialog(null, "¿Desea eliminar la categoria?");
        this.ListaProductos.remove(i);
        txt_nombre.setText("");
        this.limpiar();
        this.almcenardatos();
        this.mostrar();
        this.Desabilitar();
    }//GEN-LAST:event_btn_eliminarMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
        Home hm = new Home(usuarios);
        hm.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

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
        modelo = (DefaultTableModel) this.tablaProdctos.getModel();

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
        String tipo = usuarios.getNombre();
        modelo = (DefaultTableModel) tablaProdctos.getModel();
        modelo.setNumRows(this.ListaProductos.size());
        for (int j = 0; j < ListaProductos.size(); j++) {
            if (ListaProductos.get(j).getVendedor().equals(usuarios)) {
                modelo.setValueAt(this.ListaProductos.get(j).getNombre(), j, 0);
                modelo.setValueAt(this.ListaProductos.get(j).getDescripcion(), j, 1);
                modelo.setValueAt(this.ListaProductos.get(j).getEstado(), j, 2);
                modelo.setValueAt(this.ListaProductos.get(j).getCategoria(), j, 3);
                modelo.setValueAt(this.ListaProductos.get(j).getFechaInificio(), j, 4);
                modelo.setValueAt(this.ListaProductos.get(j).getFechaFinal(), j, 5);
                modelo.setValueAt(this.ListaProductos.get(j).getValorMininimo(), j, 6);
                JLabel jl = new JLabel();
                jl.setIcon(new ImageIcon(this.ListaProductos.get(j).getImagen()));
                modelo.setValueAt(jl, j, 7);
            }
        }
    }
    public void habilitar() {
        btn_eliminar.setEnabled(true);
        btn_eliminar.setFocusable(true);
    }
    public void Desabilitar() {
        btn_eliminar.setEnabled(false);
        btn_eliminar.setFocusable(false);
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
            java.util.logging.Logger.getLogger(TusProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TusProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TusProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TusProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TusProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProdctos;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}