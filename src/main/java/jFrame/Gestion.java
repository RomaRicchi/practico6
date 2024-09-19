/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package jFrame;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import clases.Producto;
import static jFrame.MenuPrincipal.listaProductos;
import clases.Gestiones;
import java.awt.Component;
import java.util.Iterator;
import java.util.TreeSet;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Roma
 */
public class Gestion extends javax.swing.JInternalFrame {
     private DefaultTableModel modelo= new DefaultTableModel(){

            
        public boolean isCellEditable(int fila, int column){
            return false;// evita la modificacion de datos en las celdas
        }
    };
 
    /**
     * Creates new form Gestion
     */
    public Gestion() {
        initComponents();
        CargarCategoria();
        armarModelo();
       // cd = new CategoriaData();
       // llenarCombos();
        desactivarCampos();
        TablasxFiltrado("Comestible");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCRubro = new javax.swing.JComboBox<>();
        jLTituloGestionP = new javax.swing.JLabel();
        jLRubro1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablexRubro = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLStock = new javax.swing.JLabel();
        jsStock = new javax.swing.JSpinner();
        jcRubro = new javax.swing.JComboBox<>();
        jLRubro2 = new javax.swing.JLabel();
        jLPrecio = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField();
        jtDescripcion = new javax.swing.JTextField();
        jLDescripcion = new javax.swing.JLabel();
        jLCodigo = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jBNuevo = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBActualizar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jbBuscador = new javax.swing.JButton();

        setTitle("De todo S.A: Productos");

        jCRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCRubroActionPerformed(evt);
            }
        });

        jLTituloGestionP.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLTituloGestionP.setText("GESTIÓN DE PRODUCTOS ");

        jLRubro1.setText("Filtrar por Categoria:");

        jTablexRubro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTablexRubro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablexRubroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablexRubro);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLStock.setText("Stock");

        jsStock.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jsStock.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jsStockFocusLost(evt);
            }
        });

        jLRubro2.setText("Rubro:");

        jLPrecio.setText("Precio");

        jtPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtPrecioFocusLost(evt);
            }
        });
        jtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecioActionPerformed(evt);
            }
        });

        jtDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtDescripcionFocusLost(evt);
            }
        });

        jLDescripcion.setText("Descripcion:");

        jLCodigo.setText("Codigo:");

        jtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtCodigoFocusLost(evt);
            }
        });
        jtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDescripcion)
                    .addComponent(jLCodigo)
                    .addComponent(jLPrecio)
                    .addComponent(jLRubro2)
                    .addComponent(jLStock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsStock, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigo)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDescripcion)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPrecio)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLRubro2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLStock, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jBNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-new.png"))); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-save.png"))); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.setEnabled(false);
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aprov.png"))); // NOI18N
        jBActualizar.setText("Confirmar");
        jBActualizar.setEnabled(false);
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        jBBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/basura.png"))); // NOI18N
        jBBorrar.setText("Eliminar");
        jBBorrar.setEnabled(false);
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cruz.png"))); // NOI18N
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jbBuscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-update.png"))); // NOI18N
        jbBuscador.setText("Editar");
        jbBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLTituloGestionP)
                                .addGap(84, 84, 84))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLRubro1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jCRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbBuscador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 2, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLTituloGestionP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRubro1)
                    .addComponent(jCRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        crearProducto();
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPrecioActionPerformed

    private void jtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCodigoActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
       activarCampos();
       jBGuardar.setEnabled(true);
       jBBorrar.setEnabled(false);
       jBActualizar.setEnabled(false);
       vaciarCampos(jPanel1);//Vaciamos los campos, Despues de presionar nuevo
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCodigoFocusLost
       String val="[0-9]*";//Expresiones regulares: uso de num entre 0 y 9
       if(!jtCodigo.getText().matches(val)) {
           JOptionPane.showMessageDialog(this, "Debe ingresar solo numeros");
           jtCodigo.requestFocus(); // vuelve hasta que ingrese correctamente
       }  
    }//GEN-LAST:event_jtCodigoFocusLost

    private void jtDescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDescripcionFocusLost
       if(jtDescripcion.getText().length()==0) {
           JOptionPane.showMessageDialog(this, "La descripcion no debe estar vacia.");
           jtDescripcion.requestFocus(); // vuelve hasta que ingrese correctamente
       } 
    }//GEN-LAST:event_jtDescripcionFocusLost

    private void jtPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtPrecioFocusLost
      
    }//GEN-LAST:event_jtPrecioFocusLost

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jCRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCRubroActionPerformed
        String categoria = (String)jCRubro.getSelectedItem();
        TablasxFiltrado(categoria);
    }//GEN-LAST:event_jCRubroActionPerformed

    private void jTablexRubroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablexRubroMouseClicked
        
    }//GEN-LAST:event_jTablexRubroMouseClicked

    private void jbBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscadorActionPerformed
        
        int filaSeleccionada = jTablexRubro.getSelectedRow();
        try{
        jtCodigo.setText(jTablexRubro.getValueAt(filaSeleccionada, 0).toString());
        jtDescripcion.setText(jTablexRubro.getValueAt(filaSeleccionada, 1).toString());
        jtPrecio.setText(jTablexRubro.getValueAt(filaSeleccionada, 2).toString());
        jcRubro.setSelectedItem(jTablexRubro.getValueAt(filaSeleccionada, 3).toString());
        jsStock.setValue(Integer.parseInt(jTablexRubro.getValueAt(filaSeleccionada, 4).toString()));
        jBActualizar.setEnabled(true);
        jBBorrar.setEnabled(true);
        activarCampos();
        jBGuardar.setEnabled(false);
        jtCodigo.setEnabled(false);
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "No hay ninguna fila selecciona de la tabla!","Error" ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbBuscadorActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        int filaSeleccionada = jTablexRubro.getSelectedRow();
        try{
        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(this, "No hay ninguna fila selecciona de la tabla!","Error" ,JOptionPane.ERROR_MESSAGE);
        }else{
        boolean condicion = true;
        ActualizarProducto(condicion);//Nos permite agregar el producto
        }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "No hay ninguna fila selecciona de la tabla!","Error" ,JOptionPane.ERROR_MESSAGE);
        }
        
        jBActualizar.setEnabled(false);
        jBBorrar.setEnabled(false);
        vaciarCampos(jPanel1);
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        int filaSeleccionada = jTablexRubro.getSelectedRow();
        try{
        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(this, "No hay ninguna fila selecciona de la tabla!","Error" ,JOptionPane.ERROR_MESSAGE);
        }else{
        boolean condicion = false;
        ActualizarProducto(condicion);//Nos permite agregar el producto
        }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "No hay ninguna fila selecciona de la tabla!","Error" ,JOptionPane.ERROR_MESSAGE);
        }
        
        jBActualizar.setEnabled(false);
        jBBorrar.setEnabled(false);
        vaciarCampos(jPanel1);
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jsStockFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jsStockFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jsStockFocusLost
    
    
    
    //private void llenarCombos(){
    //    CategoriaData cd = new CategoriaData();
    //    for(Categoria c:cd.obtenerCategorias()){
    //        jCRubro.addItem(c);
    //        jcRubro.addItem(c);
    //    }
    //}
    
    private void activarCampos(){
        jtCodigo.setEnabled(true);
        jtDescripcion.setEnabled(true);
        jtPrecio.setEnabled(true);
        jsStock.setEnabled(true);              
        jcRubro.setEnabled(true);
    }
    
    private void desactivarCampos(){
        jtCodigo.setEnabled(false);
        jtDescripcion.setEnabled(false);
        jtPrecio.setEnabled(false);
        jsStock.setEnabled(false);
        jcRubro.setEnabled(false);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCRubro;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JLabel jLPrecio;
    private javax.swing.JLabel jLRubro1;
    private javax.swing.JLabel jLRubro2;
    private javax.swing.JLabel jLStock;
    private javax.swing.JLabel jLTituloGestionP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablexRubro;
    private javax.swing.JButton jbBuscador;
    private javax.swing.JComboBox<String> jcRubro;
    private javax.swing.JSpinner jsStock;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTextField jtPrecio;
    // End of variables declaration//GEN-END:variables

    public void armarModelo(){ //Armamos las columnas de tabla
       modelo.addColumn("Codigo");
       modelo.addColumn("Descripcion");
       modelo.addColumn("Precio");
       modelo.addColumn("Categoria");
       modelo.addColumn("Stock");
       jTablexRubro.setModel(modelo);
    }
    
    //Nos sirve para crear un producto nuevo, Tambien es reutilizado el metodo para Actualizar un producto
    public void crearProducto(){
        //Nos sirve para validar si los campos estan llenos, En caso contrario, Le obliga a llenarlos para proceder
        if(!validarCamposVacios(jPanel1)){
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos!", "Error", JOptionPane.ERROR_MESSAGE);
            return; //Detenemos el metodo
        }
        
        Gestiones gestiones = new Gestiones(); //Instanciamos para poder usar sus metodos
        
        try{
        int codigo = Integer.parseInt(jtCodigo.getText());
        String descripcion = jtDescripcion.getText();
        double precio = Double.parseDouble(jtPrecio.getText());
        String rubro = (String)jcRubro.getSelectedItem();
        int stock = (int) jsStock.getValue();

        Producto productos = new Producto(codigo, descripcion, precio, rubro, stock);
        
        boolean existente = false;
        //Control para que no se pueda agregar un producto con el mismo codigo
        for(Producto producto : listaProductos){
            if(producto.getCodigo() == codigo){
                existente = true;
                break;
            }
        }
        //Si el producto no tiene el mismo codigo, Se va agregar
        if(!existente){
            gestiones.agregarProducto(productos);
        }else{ //En caso contrario, No dejara agregarlo y debera ingresar otro codigo
            JOptionPane.showMessageDialog(this, "No se puede agregar un producto existente!", "Error" ,JOptionPane.ERROR_MESSAGE);
        }
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Ingreso un valor invalido en un campo!", "Error" ,JOptionPane.ERROR_MESSAGE);
            return;
        
        }
        //Nos sirve para actualizar la tabla anterior
        String categoria = (String)jCRubro.getSelectedItem();
        TablasxFiltrado(categoria);  
        
    }
    
    public void CargarCategoria(){ //Nos permite cargar las categorias del ComboBox
        jcRubro.addItem("Comestible");
        jcRubro.addItem("Limpieza");
        jcRubro.addItem("Perfumeria");
        
        jCRubro.addItem("Comestible");
        jCRubro.addItem("Limpieza");
        jCRubro.addItem("Perfumeria");    
    }
    
    public void TablasxFiltrado(String filtradoRubro){        
        modelo.setRowCount(0);
        
        Gestiones gestiones = new Gestiones();
        TreeSet<Producto> filtrado = gestiones.filtrarxRubro(filtradoRubro);
        for(Producto productos : filtrado){
            modelo.addRow(new Object[]{productos.getCodigo(), 
                                      productos.getDescripcion(),
                                      productos.getPrecio(),
                                      productos.getRubro(),
                                      productos.getStock()}
            );
        }
        
    }
    
    public void ActualizarProducto(boolean condicion){ //Nos permite borrar o actualizar un producto
        int obtenerCodigo = Integer.parseInt(jtCodigo.getText());        
        Iterator<Producto> it = listaProductos.iterator();
        
        while(it.hasNext()){
            Producto producto = it.next();
            if(producto.getCodigo() == obtenerCodigo){
                it.remove();//Borramos un elemento del TreeSet
            }
        }
        if(condicion){
            JOptionPane.showMessageDialog(this, "El producto fue actualizado");
            crearProducto();//Y volvemos a usar el metodo, Para crearlo denuevo al elemento
        }else{
            JOptionPane.showMessageDialog(this, "El producto fue borrado con exito!");
            vaciarCampos(jPanel1); //Despues de borrar el producto, Vaciamos los campos
            //Nos sirve para actualizar la tabla anterior
            
            String categoria = (String)jCRubro.getSelectedItem();
            TablasxFiltrado(categoria);
        }
    }
    
// El método regresa true si todos los campos están llenos
// false si alguno está vacío
    public boolean validarCamposVacios(JPanel jPanel) {
    for (Component c : jPanel.getComponents()) {
        if (c instanceof JTextField) {
            JTextField caja = (JTextField) c;
            if (caja.getText().trim().isEmpty()) {
                return false;
            }
        }
    }
    return true;
}

    public void vaciarCampos(JPanel jPanel) {
    JComboBox combo = null;
    
    //Nos sirve para vaciar los textAField
    for (Component c : jPanel.getComponents()) {
        if (c instanceof JTextField) {
            JTextField caja = (JTextField) c;
            caja.setText("");
        }
    }
    //nos sirve para vaciar los ComboBox
    for (int i = 0; i < jPanel.getComponents().length; i++) {
        if (jPanel.getComponents()[i] instanceof JTextField) {
            JTextField caja = (JTextField) jPanel.getComponents()[i];
            caja.setText("");
        }
        
        if (jPanel.getComponents()[i] instanceof JComboBox) {
            combo = (JComboBox) jPanel.getComponents()[i];
            combo.setSelectedIndex(-1);
        }
    }
    //Vaciamos el Spinner
    jsStock.setValue(0);
}
    
}
