package windows;

import Domain.*;
import Metodos.TextPrompt;
import java.awt.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import metodos.imgTabla;

/**
 *
 * @author USUARIO
 */
public class GUIProductos extends javax.swing.JFrame {

    TextPrompt ph;
    Usuario usuarios;
    Producto producto;
    Subasta subasta;
    ArrayList<Subasta> ListaSubasta = new ArrayList<>();
    ArrayList<Usuario> ListaUsuarios = new ArrayList<>();
    ArrayList<Producto> ListaProductos = new ArrayList<>();
    ArrayList<Categorias> ListaCategorias = new ArrayList<>();

    //Imagen
    JFileChooser Selec = new JFileChooser();
    File archivo;
    byte[] imagen;
    FileInputStream Entrada;
    FileOutputStream Salida;
    int i, j;

    public GUIProductos(Usuario usuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.usuarios = usuario;

        ph = new TextPrompt("Ingrese el nombre del producto ", txt_nombre);
        ph = new TextPrompt("Ingrese el valor del producto ", txt_valorMinimo);
        ph = new TextPrompt("dd/MM/YYYY hh:mm (Hora militar)", txt_fechaFin);
        ph = new TextPrompt("Ingrese Descripcion del producto", txt_desc);
        ph = new TextPrompt("Nuevo o Usado", txt_estado);
        ph = new TextPrompt("Imagen 150*200", txt_imagen);

        tablaProdctos.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tablaProdctos.getTableHeader().setOpaque(false);
        tablaProdctos.getTableHeader().setBackground(new Color(32, 136, 203));
        tablaProdctos.getTableHeader().setForeground(new Color(255, 255, 255));
        tablaProdctos.setRowHeight(160);
        tablaProdctos.setDefaultRenderer(Object.class, new imgTabla());

        this.extraerdatos();
        this.extraerCategorias();
        this.mostrar();
    }

    public GUIProductos() {
    }

    //Metodos Imagen
    public byte[] Abrir(File Archivo) throws IOException {
        byte[] Imagen = new byte[400 * 100];
        try {
            Entrada = new FileInputStream(Archivo);
            Entrada.read(Imagen);
        } catch (FileNotFoundException e) {
        }
        return Imagen;
    }

    public String Guardar(File Archivo, byte[] imagen) {
        String Mensaje = null;
        try {
            Salida = new FileOutputStream(Archivo);
            Salida.write(imagen);
            Mensaje = "Imgen Guardada";
        } catch (IOException e) {
        }
        return Mensaje;
    }

    //Fecha final de subasta
    public Date fechaFinal() {

        try {
            String fechaFin = txt_fechaFin.getText();
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            Date date;
            date = (Date) formatter.parse(fechaFin);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return date;
        } catch (ParseException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        in_user = new javax.swing.JLabel();
        txt_estado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_imagen = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cmb_categorias = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_desc = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_valorMinimo = new javax.swing.JTextField();
        txt_fechaFin = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProdctos = new javax.swing.JTable();
        btn_agregar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        labelFoto = new javax.swing.JLabel();
        lbl_mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("OFFERED & SOLD");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Agrega tu Producto");

        in_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        in_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iniciar-sesion (1).png"))); // NOI18N
        in_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        in_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                in_userMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(in_user, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(271, 271, 271)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(in_user, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        txt_estado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Nombre : ");

        txt_imagen.setEditable(false);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Categoria :");

        cmb_categorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga una categoria...", " " }));
        cmb_categorias.setBorder(null);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Estado :");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Descripcion :");

        txt_desc.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_valorMinimo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_fechaFin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel8.setBackground(new java.awt.Color(102, 102, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Añadir imagen");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Valor Minimo :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Fecha de cierre :");

        tablaProdctos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripción", "Estado", "categoria", "fecha registro", "Fecha de fin", "Valor minimo ", "Imagen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
            tablaProdctos.getColumnModel().getColumn(2).setPreferredWidth(20);
            tablaProdctos.getColumnModel().getColumn(3).setPreferredWidth(25);
            tablaProdctos.getColumnModel().getColumn(6).setPreferredWidth(20);
            tablaProdctos.getColumnModel().getColumn(7).setPreferredWidth(115);
        }

        btn_agregar.setBackground(new java.awt.Color(0, 204, 102));
        btn_agregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setText("Agregar Producto");
        btn_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarMouseClicked(evt);
            }
        });

        btn_modificar.setBackground(new java.awt.Color(0, 153, 255));
        btn_modificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificar.setText("Modificar Producto");
        btn_modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_modificar.setEnabled(false);
        btn_modificar.setFocusable(false);
        btn_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modificarMouseClicked(evt);
            }
        });

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

        labelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbl_mensaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_mensaje.setForeground(new java.awt.Color(102, 102, 255));
        lbl_mensaje.setText("Si modificara el producto introduzca nuevamente la imagen..");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(18, 18, 18)
                            .addComponent(txt_desc))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel10))
                            .addGap(34, 34, 34)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_estado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(82, 82, 82)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel9))
                                    .addGap(24, 24, 24)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_fechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                        .addComponent(txt_valorMinimo)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txt_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lbl_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(30, 30, 30)
                        .addComponent(cmb_categorias, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btn_modificar)
                .addGap(153, 153, 153)
                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txt_valorMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_fechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmb_categorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txt_desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
        Home hm = new Home(usuarios);
        hm.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos de Archivo JPEG(*,JPG,*,JPEG)", "jpg", "jepg");
        JFileChooser Archivo = new JFileChooser();
        Archivo.addChoosableFileFilter(filtro);
        Archivo.setDialogTitle("Abrir archivo");
        File ruta = new File("C:\\Users\\USUARIO\\Downloads");
        Archivo.setCurrentDirectory(ruta);

        int ventana = Archivo.showOpenDialog(null);
        if (ventana == JFileChooser.APPROVE_OPTION) {
            File file = Archivo.getSelectedFile();
            this.archivo = Archivo.getSelectedFile();
            try {
                imagen = Abrir(this.archivo);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            txt_imagen.setText(String.valueOf(file));
            Image foto = getToolkit().getImage(txt_imagen.getText());
            foto = foto.getScaledInstance(170, 215, Image.SCALE_AREA_AVERAGING);
            labelFoto.setIcon(new ImageIcon(foto));
        }

    }//GEN-LAST:event_jLabel15MouseClicked

    private void in_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_in_userMouseClicked
        this.dispose();
        InfoUsuario iu = new InfoUsuario(this.usuarios);
        iu.setVisible(true);
    }//GEN-LAST:event_in_userMouseClicked

    private void btn_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMouseClicked
        File ruta = null;

        if (txt_nombre.getText().isEmpty() || txt_desc.getText().isEmpty() || txt_estado.getText().isEmpty() || txt_imagen.getText().isEmpty() || txt_valorMinimo.getText().isEmpty() || txt_fechaFin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Error Llene todos los campos");
        } else {
            //obtiene la informacion en los campos
            Producto producto = new Producto();
            producto.setNombre(this.txt_nombre.getText());
            producto.setDescripcion(this.txt_desc.getText());
            producto.setEstado(this.txt_estado.getText());
            producto.setCategoria(this.cmb_categorias.getSelectedItem().toString());
            producto.setValorMininimo(Float.parseFloat(this.txt_valorMinimo.getText()));
            producto.setVendedor(usuarios.getNombre());
            producto.setImagen(imagen);
            //fechas de inicio
            Calendar calendar = Calendar.getInstance();
            Date fechaRegistro = calendar.getTime();
            producto.setFechaInificio(fechaRegistro);
            //Fecha finakl de la subasta
            try {
                DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                String fecha = txt_fechaFin.getText();
                Date fechaFin = formatoFecha.parse(fecha);
            } catch (ParseException ex) {
                System.out.println("Digite el formato de fecha correctamente");
            }
            //Fecha final
            producto.setFechaFinal(fechaFinal());

            this.txt_nombre.setText("");
            this.ListaProductos.add(producto);
            this.almcenardatos();

            //información cuando creas el producto, no tendra postor o monto entonces tendra por defecto estos valores....
//            Subasta subastas = new Subasta();
//            subastas.setProducto(this.producto);
//            subastas.setNombrePostor("No tine postor");
//            subastas.setMonto(0);
//
//            this.ListaSubasta.add(subasta);
//            this.almcenardatosSubasta();
            //...........................................................................................................
        }
        this.mostrar();
        this.limpiarFormulario();
    }//GEN-LAST:event_btn_agregarMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cmb_categorias.removeAllItems();
        cmb_categorias.addItem("Elige una categorias...");
        cargarCategorias();
    }//GEN-LAST:event_formWindowOpened

    private void tablaProdctosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProdctosMouseClicked
        i = this.tablaProdctos.getSelectedRow();
        this.txt_nombre.setText(this.tablaProdctos.getModel().getValueAt(i, 0).toString());
        this.txt_desc.setText(this.tablaProdctos.getModel().getValueAt(i, 1).toString());
        this.txt_estado.setText(this.tablaProdctos.getModel().getValueAt(i, 2).toString());
        this.txt_valorMinimo.setText(this.tablaProdctos.getModel().getValueAt(i, 6).toString());
        this.txt_imagen.setText(this.tablaProdctos.getModel().getValueAt(i, 7).toString());
        cmb_categorias.setSelectedItem(this.tablaProdctos.getModel().getValueAt(i, 3));
        SimpleDateFormat sdp = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date fecha = ListaProductos.get(i).getFechaFinal();
        String fechaF = sdp.format(fecha);
        txt_fechaFin.setText(fechaF);
        this.habilitar();
    }//GEN-LAST:event_tablaProdctosMouseClicked

    private void btn_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseClicked
        File ruta = null;

        if (txt_nombre.getText().isEmpty() || txt_desc.getText().isEmpty() || txt_estado.getText().isEmpty() || txt_imagen.getText().isEmpty() || txt_valorMinimo.getText().isEmpty() || txt_fechaFin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Error coloque un nombre a la categoria");
        } else {
            //obtiene la informacion en los campos
            Producto producto = new Producto();
            producto.setNombre(this.txt_nombre.getText());
            producto.setDescripcion(this.txt_desc.getText());
            producto.setEstado(this.txt_estado.getText());
            producto.setCategoria(this.cmb_categorias.getSelectedItem().toString());
            producto.setValorMininimo(Float.parseFloat(this.txt_valorMinimo.getText()));
            producto.setVendedor(usuarios.getNombre());
            producto.setImagen(imagen);
            //fechas de inicio
            Calendar calendar = Calendar.getInstance();
            Date fechaRegistro = calendar.getTime();
            producto.setFechaInificio(fechaRegistro);
            //Fecha finakl de la subasta
            try {
                DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                String fecha = txt_fechaFin.getText();
                Date fechaFin = formatoFecha.parse(fecha);
            } catch (ParseException ex) {
                System.out.println("Digite el formato de fecha correctamente");
            }
            //Fecha final
            producto.setFechaFinal(fechaFinal());

            this.txt_nombre.setText("");
            this.ListaProductos.set(i, producto);
            this.almcenardatos();
        }

        this.mostrar();
        this.Desabilitar();
        limpiarFormulario();
    }//GEN-LAST:event_btn_modificarMouseClicked

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        Producto producto = new Producto();
        producto.setNombre(this.txt_nombre.getText());

        producto.setNombre(this.txt_nombre.getText());
        JOptionPane.showMessageDialog(null, "¿Desea eliminar la categoria?");
        this.ListaProductos.remove(i);
        limpiarFormulario();
        this.limpiar();
        this.almcenardatos();
        this.mostrar();
        this.Desabilitar();
    }//GEN-LAST:event_btn_eliminarMouseClicked

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

    public void almcenardatosSubasta() {
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("subasta.dat"));

            salida.writeObject(this.ListaSubasta);
            JOptionPane.showMessageDialog(null, "Se ha registrado con exito");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo " + e.getMessage());
        }
    }

    public void extraerdatosSubastas() {

        try {
            try ( ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("subasta.dat"))) {
                this.ListaSubasta = (ArrayList<Subasta>) entrada.readObject();
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
            if (ListaProductos.get(j).getVendedor().equals(tipo)) {
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

    public void cargarCategorias() {

        if (ListaCategorias == null || ListaCategorias.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe agregar las Categorias");
            return;
        }
        cmb_categorias.removeAllItems();
        cmb_categorias.addItem("Categorias...");
        for (Categorias c : ListaCategorias) {
            cmb_categorias.addItem(c.getNombre());
        }
    }

    public void extraerCategorias() {
        try {
            try ( ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("categorias.dat"))) {
                this.ListaCategorias = (ArrayList<Categorias>) entrada.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al escribir en el archivo " + e.getMessage());
        }
    }

    public void Desabilitar() {
        btn_agregar.setEnabled(true);
        btn_agregar.setFocusable(true);
        btn_eliminar.setEnabled(false);
        btn_eliminar.setFocusable(false);
        btn_modificar.setEnabled(false);
        btn_modificar.setFocusable(false);
    }

    public void habilitar() {
        btn_agregar.setEnabled(false);
        btn_agregar.setFocusable(false);
        btn_eliminar.setEnabled(true);
        btn_eliminar.setFocusable(true);
        btn_modificar.setEnabled(true);
        btn_modificar.setFocusable(true);
    }

    public void limpiarFormulario() {
        txt_nombre.setText("");
        txt_desc.setText("");
        txt_estado.setText("");
        txt_fechaFin.setText("");
        txt_valorMinimo.setText("");
        txt_imagen.setText("");
        cargarCategorias();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUIProductos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JComboBox<String> cmb_categorias;
    private javax.swing.JLabel in_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel lbl_mensaje;
    private javax.swing.JTable tablaProdctos;
    private javax.swing.JTextField txt_desc;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_fechaFin;
    private javax.swing.JTextField txt_imagen;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_valorMinimo;
    // End of variables declaration//GEN-END:variables
}
