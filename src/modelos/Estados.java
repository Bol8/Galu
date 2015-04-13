package modelos;
// Generated 14-abr-2015 0:15:55 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Estados generated by hbm2java
 */
public class Estados  implements java.io.Serializable {


     private Integer idEstados;
     private String nombre;
     private Set clientes = new HashSet(0);
     private Set articulos = new HashSet(0);
     private Set proveedors = new HashSet(0);

    public Estados() {
    }

    public Estados(String nombre, Set clientes, Set articulos, Set proveedors) {
       this.nombre = nombre;
       this.clientes = clientes;
       this.articulos = articulos;
       this.proveedors = proveedors;
    }
   
    public Integer getIdEstados() {
        return this.idEstados;
    }
    
    public void setIdEstados(Integer idEstados) {
        this.idEstados = idEstados;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set clientes) {
        this.clientes = clientes;
    }
    public Set getArticulos() {
        return this.articulos;
    }
    
    public void setArticulos(Set articulos) {
        this.articulos = articulos;
    }
    public Set getProveedors() {
        return this.proveedors;
    }
    
    public void setProveedors(Set proveedors) {
        this.proveedors = proveedors;
    }




}


