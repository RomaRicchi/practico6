/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package jFrame;

import clases.Gestiones;
import javax.swing.table.DefaultTableModel;
import clases.Producto;
import java.util.TreeSet;

/**
 *
 * @author Roma
 */
public class BusquedaPorPrecio extends javax.swing.JInternalFrame {
 private DefaultTableModel modelo= new DefaultTableModel(){
            
        public boolean isCellEditable(int fila, int column){
           
            return false;// evita la modificacion de datos en las celdas
        }
    };
    /**
     * Creates new form BusquedaPorPrecio
     */
    public BusquedaPorPrecio() {
        initComponents();
        armarModelo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTituloxPrecio = new javax.swing.JLabel();
<<<<<<< HEAD
        jLLetras = new javax.swing.JLabel();
        jTPrecio1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablexPrecio = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTPrecio2 = new javax.swing.JTextField();

        jLTituloxPrecio.setText("PRODUCTOS POR PRECIO");

        jLLetras.setText("Ingrese precio entre:");

        jTPrecio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPrecio1ActionPerformed(evt);
            }
        });
        jTPrecio1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTPrecio1KeyReleased(evt);
            }
        });
=======
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablexPrecio = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTPrecioMin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTPrecioMax = new javax.swing.JTextField();

        jLTituloxPrecio.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLTituloxPrecio.setText("Listado por Producto");
>>>>>>> rama2

        jTablexPrecio.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablexPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTablexPrecioKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTablexPrecio);

<<<<<<< HEAD
        jLabel1.setText("y");

        jTPrecio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPrecio2ActionPerformed(evt);
=======
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Entre $");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("y");

        jTPrecioMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTPrecioMaxKeyReleased(evt);
>>>>>>> rama2
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLTituloxPrecio))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                        .addComponent(jTPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(jTPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
                        .addComponent(jTPrecioMin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTPrecioMax, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> rama2
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLTituloxPrecio)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
<<<<<<< HEAD
                    .addComponent(jLLetras)
                    .addComponent(jTPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
                    .addComponent(jLabel1)
                    .addComponent(jTPrecioMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTPrecioMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
>>>>>>> rama2
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
    private void jTPrecio1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPrecio1KeyReleased
       borrarFilas(); // Limpia la tabla al iniciar la búsqueda.
    String textoBusqueda = jTPrecio1.getText().trim(); // Obtiene el texto ingresado y elimina espacios en blanco.
    
    if (!textoBusqueda.isEmpty()) { // Solo busca si hay texto en el campo.
        try {
            double codigoBusqueda = Integer.parseInt(textoBusqueda); // Convierte el texto a entero.
            for (Producto prod : MenuPrincipal.listaProductos) {
                if (prod.getCodigo() == codigoBusqueda) { // Compara el código del producto con la entrada.
                    modelo.addRow(new Object[]{
                        prod.getCodigo(),
                        prod.getDescripcion(),
                        prod.getStock(),
                        prod.getPrecio(),
                        prod.getRubro(),
                    });
                }
             }
        } catch (NumberFormatException e) {
            // Si el texto ingresado no es un número válido, no hace nada.
            // Podrías mostrar un mensaje de error o simplemente ignorar la entrada inválida.
            System.out.println("Por favor ingresa un número válido.");
        }
    }
    }//GEN-LAST:event_jTPrecio1KeyReleased

    private void jTPrecio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPrecio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPrecio2ActionPerformed

    private void jTPrecio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPrecio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPrecio1ActionPerformed
=======
    private void jTablexPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTablexPrecioKeyTyped
        modelo.setRowCount(0);
        
        Gestiones gestiones = new Gestiones();
        String textprecio1= jTPrecioMin.getText();
        double precioMin = Double.parseDouble(textprecio1);
        String textprecio2= jTPrecioMax.getText();
        double precioMax = Double.parseDouble(textprecio2);
                
        TreeSet<Producto> filtrado = gestiones.buscarXPrecio(precioMin, precioMax);
        for(Producto productos : filtrado){
            modelo.addRow(new Object[]{productos.getCodigo(), 
                                      productos.getDescripcion(),
                                      productos.getPrecio(),
                                      productos.getRubro(),
                                      productos.getStock()}
            );
        }
    
    }//GEN-LAST:event_jTablexPrecioKeyTyped

    private void jTPrecioMaxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPrecioMaxKeyReleased
         modelo.setRowCount(0);
        
        Gestiones gestiones = new Gestiones();
        String textprecio1= jTPrecioMin.getText();
        double precioMin = Double.parseDouble(textprecio1);
        String textprecio2= jTPrecioMax.getText();
        double precioMax = Double.parseDouble(textprecio2);
                
        TreeSet<Producto> filtrado = gestiones.buscarXPrecio(precioMin, precioMax);
        for(Producto productos : filtrado){
            modelo.addRow(new Object[]{productos.getCodigo(), 
                                      productos.getDescripcion(),
                                      productos.getPrecio(),
                                      productos.getRubro(),
                                      productos.getStock()}
            );
        }
    
    }//GEN-LAST:event_jTPrecioMaxKeyReleased
>>>>>>> rama2


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLTituloxPrecio;
    private javax.swing.JLabel jLabel1;
<<<<<<< HEAD
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTPrecio1;
    private javax.swing.JTextField jTPrecio2;
=======
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTPrecioMax;
    private javax.swing.JTextField jTPrecioMin;
>>>>>>> rama2
    private javax.swing.JTable jTablexPrecio;
    // End of variables declaration//GEN-END:variables
public void armarModelo(){
       modelo.addColumn("Codigo");
       modelo.addColumn("Descripcion");
       modelo.addColumn("Stock");
       modelo.addColumn("Precio");
       modelo.addColumn("Rubro");
       jTablexPrecio.setModel(modelo);
    }

    private void borrarFilas(){
        int fila=jTablexPrecio.getRowCount()-1;
        for(int f=fila; f>=0;f--){
            modelo.removeRow(f);
        }
    }



}
