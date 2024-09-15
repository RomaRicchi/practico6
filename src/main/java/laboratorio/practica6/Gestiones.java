
package laboratorio.practica6;

import java.util.Iterator;
import java.util.TreeSet;
import javax.swing.JTable;

public class Gestiones{

    private TreeSet<Producto> productos ; //Almacenamos todos los productos del TreeSet
    private JTable tablaProductos; //La tabla de los productos

    public Gestiones(TreeSet<Integer> productos) {
        this.productos = new TreeSet<>();
    }

    public void agregarProducto(Producto unProducto){
        productos.add(unProducto);
    }
    
    public void borrarProducto(Producto unProducto){
        productos.remove(unProducto);
    }
    
    public TreeSet<Producto> filtrarxRubro(String unRubro){ //Se usa el TreeSet y el Iterator
        
        TreeSet<Producto> filtRubro = new TreeSet<>();
        Iterator<Producto> it = productos.iterator(); //Creamos el iterator para recorrer a los productos
        
        while(it.hasNext()){
            Producto producto = it.next();
            if(producto.getRubro().contains(unRubro)){ //Comparamos los rubros con el rubro del ComboBox
                filtRubro.add(producto); //Agregamos el producto al TreeSet de filtRubro
            }
        }
        return filtRubro; //Retornamos el TreeSet
    }
    
    
    public TreeSet<Producto> buscarXPrecio(double precioMin, double precioMax){
        
        TreeSet<Producto> buscarPrecio = new TreeSet<>();
        Iterator<Producto> it = productos.iterator(); //Creamos el iterator para recorrer a los productos
        
        while(it.hasNext()){
            Producto producto = it.next();
            if((producto.getPrecio() >= precioMin) && (producto.getPrecio() <= precioMax)){ //Comparamos los rubros con el rubro del ComboBox
                buscarPrecio.add(producto); //Agregamos el producto al TreeSet de filtRubro
            }
        }
        return buscarPrecio; //Retornamos el TreeSet
    }
    
    public TreeSet<Producto> buscarDescripcion(String unDescripcion){
        TreeSet<Producto> buscarDescripcion = new TreeSet<>();
        Iterator<Producto> it = productos.iterator(); //Creamos el iterator para recorrer a los productos
        
        while(it.hasNext()){
            Producto producto = it.next();
            if(producto.getDescripcion().contains(unDescripcion)){ //Comparamos los rubros con el rubro del ComboBox
                buscarDescripcion.add(producto); //Agregamos el producto al TreeSet de filtRubro
            }
        }
        return buscarDescripcion; //Retornamos el TreeSet
    }
    
}
