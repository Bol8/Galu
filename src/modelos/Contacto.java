package modelos;
// Generated 14-abr-2015 0:15:55 by Hibernate Tools 4.3.1



/**
 * Contacto generated by hbm2java
 */
public class Contacto  implements java.io.Serializable {


     private Integer idContacto;
     private String nombre;
     private String origen;
     private String producto;

    public Contacto() {
    }

	
    public Contacto(String nombre, String origen) {
        this.nombre = nombre;
        this.origen = origen;
    }
    public Contacto(String nombre, String origen, String producto) {
       this.nombre = nombre;
       this.origen = origen;
       this.producto = producto;
    }
   
    public Integer getIdContacto() {
        return this.idContacto;
    }
    
    public void setIdContacto(Integer idContacto) {
        this.idContacto = idContacto;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getOrigen() {
        return this.origen;
    }
    
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public String getProducto() {
        return this.producto;
    }
    
    public void setProducto(String producto) {
        this.producto = producto;
    }




}


