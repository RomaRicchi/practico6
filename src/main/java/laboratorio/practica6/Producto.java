/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio.practica6;

/**
 *
 * @author Roma
 */
public class Producto implements Comparable<Producto> {
    private int idProducto;
    private int codigo;
    private String descripcion;
    private int stock;
    private double precio;
    private Categoria rubro;

    public Producto() {
    }
    
    public Producto(int codigo, String descripcion, int stock, double precio, Categoria rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.rubro = rubro;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    
   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getRubro() {
        return rubro;
    }

    public void setRubro(Categoria rubro) {
        this.rubro = rubro;
    }

    @Override
    public int compareTo(Producto o) {
        if(codigo == o.codigo){
            return 0;
        }else if(codigo > o.codigo){
            return 1;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", stock=" + stock + ", precio=" + precio + ", rubro=" + rubro + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.idProducto;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.idProducto!= other.idProducto){
            return false;
        }
        return true;
    }
    
    
    
}
