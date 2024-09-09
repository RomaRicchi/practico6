/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import laboratorio.practica6.Categoria;
import java.util.ArrayList;

/**
 *
 * @author Roma
 */
public class CategoriaData {
    
    public ArrayList<Categoria> obtenerCategorias(){
    
    
        ArrayList<Categoria> listaCate= new ArrayList<>();
        listaCate.add(new Categoria(1, "Fiambres"));
        listaCate.add(new Categoria(2, "Lacteos"));
        listaCate.add(new Categoria(3, "Almacen"));
        listaCate.add(new Categoria(4, "Perfumeria"));
        listaCate.add(new Categoria(5, "Bazar"));
        listaCate.add(new Categoria(6, "Limpieza"));
        return listaCate;
    }
}
