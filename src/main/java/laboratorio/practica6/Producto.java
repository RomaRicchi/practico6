
package laboratorio.practica6;

import java.util.Objects;

public class Producto {
    
    private int Codigo;
    private String Descripcion;
    private double precio;
    private String rubro;
    private int stock;

    public Producto(int Codigo, String Descripcion, double precio, String rubro, int stock) {
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.precio = precio;
        this.rubro = rubro;
        this.stock = stock;
    }

    public Producto() {
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "Codigo=" + Codigo + ", Descripcion=" + Descripcion + ", precio=" + precio + ", rubro=" + rubro + ", stock=" + stock + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.Codigo;
        hash = 29 * hash + Objects.hashCode(this.Descripcion);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.rubro);
        hash = 29 * hash + this.stock;
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
        if (this.Codigo != other.Codigo) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (this.stock != other.stock) {
            return false;
        }
        if (!Objects.equals(this.Descripcion, other.Descripcion)) {
            return false;
        }
        return Objects.equals(this.rubro, other.rubro);
    }
    
}
