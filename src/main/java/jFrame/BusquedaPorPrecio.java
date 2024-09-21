/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package jFrame;

import clases.Gestiones;
import javax.swing.table.DefaultTableModel;
import clases.Producto;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Tomas
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablexPrecio = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTPrecioMin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTPrecioMax = new javax.swing.JTextField();

        jLTituloxPrecio.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLTituloxPrecio.setText("Listado por Producto");

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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Entre $");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("y");

        jTPrecioMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTPrecioMaxKeyReleased(evt);
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
                        .addComponent(jTPrecioMin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTPrecioMax, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jLabel1)
                    .addComponent(jTPrecioMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTPrecioMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTablexPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTablexPrecioKeyTyped
    
    }//GEN-LAST:event_jTablexPrecioKeyTyped

    private void jTPrecioMaxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPrecioMaxKeyReleased
       modelo.setRowCount(0);
        
        Gestiones gestiones = new Gestiones();
        String textprecio1= jTPrecioMin.getText();
        String textprecio2= jTPrecioMax.getText();
        
        try{
        double precioMin = Double.parseDouble(textprecio1);
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
        }catch (NumberFormatException e){
        }
    
    }//GEN-LAST:event_jTPrecioMaxKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLTituloxPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTPrecioMax;
    private javax.swing.JTextField jTPrecioMin;
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
