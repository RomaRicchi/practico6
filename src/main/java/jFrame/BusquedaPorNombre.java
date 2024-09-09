/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package jFrame;

import javax.swing.table.DefaultTableModel;
import laboratorio.practica6.Producto;

/**
 *
 * @author Tomas
 */
public class BusquedaPorNombre extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo= new DefaultTableModel(){
            
        public boolean isCellEditable(int fila, int column){
           
            return false;// evita la modificacion de datos en las celdas
        }
    };
    /**
     * Creates new form BusquedaPorNombre
     */
    public BusquedaPorNombre() {
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

        jLTituloxNom = new javax.swing.JLabel();
        jLLetras = new javax.swing.JLabel();
        jTBusxNom = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablexNom = new javax.swing.JTable();

        setClosable(true);

        jLTituloxNom.setText("PRODUCTOS POR NOMBRE");

        jLLetras.setText("Ingrese primeras letras");

        jTBusxNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBusxNomKeyReleased(evt);
            }
        });

        jTablexNom.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTablexNom);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLTituloxNom))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLLetras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTBusxNom, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLTituloxNom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLLetras)
                    .addComponent(jTBusxNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTBusxNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBusxNomKeyReleased
        borrarFilas(); // Limpia la tabla al iniciar la búsqueda.
    String textoBusqueda = jTBusxNom.getText().trim(); // Obtiene el texto ingresado y elimina espacios en blanco.
    
    if (!textoBusqueda.isEmpty()) { // Solo busca si hay texto en el campo.
        for (Producto prod : MenuPrincipal.listaProductos) {
            if (prod.getDescripcion().toLowerCase().startsWith(textoBusqueda.toLowerCase())) { // Compara ignorando mayúsculas/minúsculas.
                modelo.addRow(new Object[]{
                    prod.getCodigo(),
                    prod.getDescripcion(),
                    prod.getStock(),
                    prod.getPrecio(),
                    prod.getRubro(),
                });
            }
        }
    }
    }//GEN-LAST:event_jTBusxNomKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLLetras;
    private javax.swing.JLabel jLTituloxNom;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBusxNom;
    private javax.swing.JTable jTablexNom;
    // End of variables declaration//GEN-END:variables
    public void armarModelo(){
       modelo.addColumn("Codigo");
       modelo.addColumn("Descripcion");
       modelo.addColumn("Stock");
       modelo.addColumn("Precio");
       modelo.addColumn("Rubro");
       jTablexNom.setModel(modelo);
    }

    private void borrarFilas(){
        int fila=jTablexNom.getRowCount()-1;
        for(int f=fila; f>=0;f--){
            modelo.removeRow(f);
        }
    }
    


}
