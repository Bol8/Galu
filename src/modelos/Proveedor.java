package modelos;
// Generated 14-abr-2015 21:45:23 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Proveedor generated by hbm2java
 */
public class Proveedor  implements java.io.Serializable {


     private Integer idProv;
     private Estados estados;
     private String razonSocial;
     private String nif;
     private String nifR;
     private String domicilio;
     private String cp;
     private String poblacion;
     private String provincia;
     private String pais;
     private Date fechaA;
     private String imagen;
     private Set pedidoPs = new HashSet(0);

    public Proveedor() {
    }

	
    public Proveedor(Estados estados, String razonSocial, String nif, String domicilio, String poblacion, Date fechaA) {
        this.estados = estados;
        this.razonSocial = razonSocial;
        this.nif = nif;
        this.domicilio = domicilio;
        this.poblacion = poblacion;
        this.fechaA = fechaA;
    }
    public Proveedor(Estados estados, String razonSocial, String nif, String nifR, String domicilio, String cp, String poblacion, String provincia, String pais, Date fechaA, String imagen, Set pedidoPs) {
       this.estados = estados;
       this.razonSocial = razonSocial;
       this.nif = nif;
       this.nifR = nifR;
       this.domicilio = domicilio;
       this.cp = cp;
       this.poblacion = poblacion;
       this.provincia = provincia;
       this.pais = pais;
       this.fechaA = fechaA;
       this.imagen = imagen;
       this.pedidoPs = pedidoPs;
    }
   
    public Integer getIdProv() {
        return this.idProv;
    }
    
    public void setIdProv(Integer idProv) {
        this.idProv = idProv;
    }
    public Estados getEstados() {
        return this.estados;
    }
    
    public void setEstados(Estados estados) {
        this.estados = estados;
    }
    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getNif() {
        return this.nif;
    }
    
    public void setNif(String nif) {
        this.nif = nif;
    }
    public String getNifR() {
        return this.nifR;
    }
    
    public void setNifR(String nifR) {
        this.nifR = nifR;
    }
    public String getDomicilio() {
        return this.domicilio;
    }
    
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public String getCp() {
        return this.cp;
    }
    
    public void setCp(String cp) {
        this.cp = cp;
    }
    public String getPoblacion() {
        return this.poblacion;
    }
    
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
    public String getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    public Date getFechaA() {
        return this.fechaA;
    }
    
    public void setFechaA(Date fechaA) {
        this.fechaA = fechaA;
    }
    public String getImagen() {
        return this.imagen;
    }
    
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public Set getPedidoPs() {
        return this.pedidoPs;
    }
    
    public void setPedidoPs(Set pedidoPs) {
        this.pedidoPs = pedidoPs;
    }




}


