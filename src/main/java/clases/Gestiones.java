
package clases;

import java.util.Iterator;
import java.util.TreeSet;
import jFrame.MenuPrincipal;

public class Gestiones{


    public Gestiones() {
    }

    public void agregarProducto(Producto unProducto){
        MenuPrincipal.listaProductos.add(unProducto);
    }
    
    public void borrarProducto(Producto unProducto){
        MenuPrincipal.listaProductos.remove(unProducto);
    }
    
    public TreeSet<Producto> filtrarxRubro(String unRubro){ //Se usa el TreeSet y el Iterator
        
        TreeSet<Producto> filtRubro = new TreeSet<>();
        Iterator<Producto> it = MenuPrincipal.listaProductos.iterator(); //Creamos el iterator para recorrer a los productos
        
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
        Iterator<Producto> it = MenuPrincipal.listaProductos.iterator(); //Creamos el iterator para recorrer a los productos
        
        while(it.hasNext()){
            Producto producto = it.next();
            if((producto.getPrecio() >= precioMin) && (producto.getPrecio() <= precioMax)){ //Comparamos los precios, Para que sea entre un Min y Max
                buscarPrecio.add(producto); //Agregamos el producto al TreeSet de buscarPrecio
            }
        }
        return buscarPrecio; //Retornamos el TreeSet
    }
    
    public TreeSet<Producto> buscarDescripcion(String unDescripcion){
        TreeSet<Producto> buscarDescripcion = new TreeSet<>();
        Iterator<Producto> it = MenuPrincipal.listaProductos.iterator(); //Creamos el iterator para recorrer a los productos
        
        while(it.hasNext()){
            Producto producto = it.next();
            if(producto.getDescripcion().contains(unDescripcion)){ //Comparamos la descripcion con la descripcion pasada por parametro
                buscarDescripcion.add(producto); //Agregamos el producto al TreeSet de buscarDescripcion
            }
        }
        return buscarDescripcion; //Retornamos el TreeSet
    }
    
}
