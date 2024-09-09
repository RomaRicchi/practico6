/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package jFrame;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import laboratorio.practica6.Categoria;
import Data.CategoriaData;

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
 
    private CategoriaData cd;
    /**
     * Creates new form Gestion
     */
    public Gestion() {
        initComponents();
        armarModelo();
        cd = new CategoriaData();
        llenarCombos();
        desactivarCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLStock = new javax.swing.JLabel();
        jCRubro1 = new javax.swing.JComboBox<>();
        jTextCodigo = new javax.swing.JTextField();
        jLTituloGestionP = new javax.swing.JLabel();
        jTextDescripcion = new javax.swing.JTextField();
        jLRubro1 = new javax.swing.JLabel();
        jCRubro2 = new javax.swing.JComboBox<>();
        jTextPrecio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablexRubro = new javax.swing.JTable();
        jSpinnerStock = new javax.swing.JSpinner();
        jBNuevo = new javax.swing.JButton();
        jLCodigo = new javax.swing.JLabel();
        jBGuardar = new javax.swing.JButton();
        jLDescripcion = new javax.swing.JLabel();
        jBActual = new javax.swing.JButton();
        jLPrecio = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jLRubro2 = new javax.swing.JLabel();
        jBBorrar = new javax.swing.JButton();

        jLStock.setText("Stock");

        jTextCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextCodigoFocusLost(evt);
            }
        });
        jTextCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCodigoActionPerformed(evt);
            }
        });

        jLTituloGestionP.setText("GESTION DE PRODUCTOS ");

        jTextDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextDescripcionFocusLost(evt);
            }
        });

        jLRubro1.setText("Seleccione el rubro");

        jTextPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextPrecioFocusLost(evt);
            }
        });
        jTextPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPrecioActionPerformed(evt);
            }
        });

        jTablexRubro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTablexRubro);

        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jLCodigo.setText("Codigo");

        jBGuardar.setText("Guardar");
        jBGuardar.setEnabled(false);
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jLDescripcion.setText("Descripcion");

        jBActual.setText("Actualizar");
        jBActual.setEnabled(false);

        jLPrecio.setText("Precio");

        jBSalir.setText("Salir");

        jLRubro2.setText("Rubro");

        jBBorrar.setText("Borrar");
        jBBorrar.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLTituloGestionP))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLRubro1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCRubro1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLCodigo)
                                        .addComponent(jLDescripcion)
                                        .addComponent(jLPrecio)
                                        .addComponent(jLRubro2)
                                        .addComponent(jLStock))
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCRubro2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSpinnerStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                            .addComponent(jTextPrecio, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(jTextDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBNuevo)
                                    .addGap(30, 30, 30)
                                    .addComponent(jBGuardar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBActual)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBBorrar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBSalir))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTituloGestionP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRubro1)
                    .addComponent(jCRubro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigo)
                    .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDescripcion)
                    .addComponent(jTextDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPrecio)
                    .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRubro2)
                    .addComponent(jCRubro2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLStock, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBGuardar)
                    .addComponent(jBActual)
                    .addComponent(jBSalir)
                    .addComponent(jBBorrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jTextPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPrecioActionPerformed

    private void jTextCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCodigoActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
       activarCampos();
       jBGuardar.setEnabled(true);   
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jTextCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextCodigoFocusLost
       String val="[0-9]*";//Expresiones regulares: uso de num entre 0 y 9
       if(!jTextCodigo.getText().matches(val)) {
           JOptionPane.showMessageDialog(this, "Debe ingresar solo numeros");
           jTextCodigo.requestFocus(); // vuelve hasta que ingrese correctamente
       }  
    }//GEN-LAST:event_jTextCodigoFocusLost

    private void jTextDescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextDescripcionFocusLost
       if(jTextDescripcion.getText().length()==0) {
           JOptionPane.showMessageDialog(this, "La descripcion no debe estar vacia.");
           jTextDescripcion.requestFocus(); // vuelve hasta que ingrese correctamente
       } 
    }//GEN-LAST:event_jTextDescripcionFocusLost

    private void jTextPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextPrecioFocusLost
      
    }//GEN-LAST:event_jTextPrecioFocusLost
    
    
    
    private void llenarCombos(){
        CategoriaData cd = new CategoriaData();
        for(Categoria c:cd.obtenerCategorias()){
            jCRubro1.addItem(c);
            jCRubro2.addItem(c);
        }
    }
    
    private void activarCampos(){
        jTextCodigo.setEnabled(true);
        jTextDescripcion.setEnabled(true);
        jTextPrecio.setEnabled(true);
        jTablexRubro.setEnabled(true);
        jSpinnerStock.setEnabled(true);              
    }
    
    private void desactivarCampos(){
        jTextCodigo.setEnabled(false);
        jTextDescripcion.setEnabled(false);
        jTextPrecio.setEnabled(false);
        jTablexRubro.setEnabled(false);
        jSpinnerStock.setEnabled(false);           
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActual;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Categoria> jCRubro1;
    private javax.swing.JComboBox<Categoria> jCRubro2;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JLabel jLPrecio;
    private javax.swing.JLabel jLRubro1;
    private javax.swing.JLabel jLRubro2;
    private javax.swing.JLabel jLStock;
    private javax.swing.JLabel jLTituloGestionP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerStock;
    private javax.swing.JTable jTablexRubro;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextDescripcion;
    private javax.swing.JTextField jTextPrecio;
    // End of variables declaration//GEN-END:variables

    public void armarModelo(){
       modelo.addColumn("Codigo");
       modelo.addColumn("Descripcion");
       modelo.addColumn("Stock");
       modelo.addColumn("Precio");
       modelo.addColumn("Rubro");
       jTablexRubro.setModel(modelo);
    }

}
