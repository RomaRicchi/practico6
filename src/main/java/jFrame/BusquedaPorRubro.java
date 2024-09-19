/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package jFrame;

import clases.Producto;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Roma
 */
public class BusquedaPorRubro extends javax.swing.JInternalFrame {
 private DefaultTableModel modelo= new DefaultTableModel(){
            
        public boolean isCellEditable(int fila, int column){
           
            return false;// evita la modificacion de datos en las celdas
        }
    };
    /**
     * Creates new form BusquedaPorRubro
     */
    public BusquedaPorRubro() {
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

        jLTituloxRubro = new javax.swing.JLabel();
        jLLetras = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablexRubro = new javax.swing.JTable();
        Rubro = new javax.swing.JComboBox<>();

        jLTituloxRubro.setText("PRODUCTOS POR RUBRO");

        jLLetras.setText("Seleccione el rubro");

        jTablexRubro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title ", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablexRubro);

        Rubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Limpieza", "Comestible", "Perfumeria" }));
        Rubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RubroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLTituloxRubro))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLLetras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Rubro, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTituloxRubro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLLetras)
                    .addComponent(Rubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RubroActionPerformed
       borrarFilas();
       for (Producto prod : MenuPrincipal.listaProductos) {
            if (prod.getRubro()==Rubro.getSelectedItem()) { // Compara ignorando mayúsculas/minúsculas.
                modelo.addRow(new Object[]{
                    prod.getCodigo(),
                    prod.getDescripcion(),
                    prod.getStock(),
                    prod.getPrecio(),
                    prod.getRubro(),
                });
            }
        }
       
       
       
        
        
    }//GEN-LAST:event_RubroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Rubro;
    private javax.swing.JLabel jLLetras;
    private javax.swing.JLabel jLTituloxRubro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablexRubro;
    // End of variables declaration//GEN-END:variables
public void armarModelo(){
       modelo.addColumn("Codigo");
       modelo.addColumn("Descripcion");
       modelo.addColumn("Stock");
       modelo.addColumn("Precio");
       modelo.addColumn("Rubro");
       jTablexRubro.setModel(modelo);
    }

    private void borrarFilas(){
        int fila=jTablexRubro.getRowCount()-1;
        for(int f=fila; f>=0;f--){
            modelo.removeRow(f);
        }
    }

}
