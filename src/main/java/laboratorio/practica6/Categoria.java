/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio.practica6;

/**
 *
 * @author Roma
 */
public class Categoria {
    private int idCategoria;
    private String nomCategoria;

    public Categoria() {
    }

    public Categoria(int idCategoria, String nomCategoria) {
        this.idCategoria = idCategoria;
        this.nomCategoria = nomCategoria;
    }

    public Categoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNomCategoria() {
        return nomCategoria;
    }

    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }
    
    @Override
    public String toString(){
        return nomCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.idCategoria;
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
        final Categoria other = (Categoria) obj;
        if (this.idCategoria != other.idCategoria){
            return false;
        }
        return true;
    }
    
    
   
}


