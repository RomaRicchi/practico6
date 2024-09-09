/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.ArrayList;
import laboratorio.practica6.Producto;

/**
 *
 * @author Tomas
 */
public class ProductoData {
    private ArrayList<Producto> listaP= new ArrayList<>();
    
    public void guardarP(Producto p){
        p.setIdProducto(listaP.size()+1);
        listaP.add(p);
    }
    
    public ArrayList<Producto> obtenerProductos(){
        return listaP;
    }
    
    public void borrarP (Producto p){
        listaP.remove(p);
    }
    
    public void modificarP (Producto pNuevo){
        for( Producto prod: listaP){
            if(prod.getIdProducto() == pNuevo.getIdProducto()){
                prod.setCodigo(pNuevo.getCodigo());
                prod.setDescripcion(pNuevo.getDescripcion());
                prod.setStock(pNuevo.getStock());
                prod.setPrecio(pNuevo.getPrecio());
                prod.setRubro(pNuevo.getRubro());
                break;
            }
        
        }
    }
}
