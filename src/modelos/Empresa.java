package modelos;
// Generated 14-abr-2015 21:45:23 by Hibernate Tools 4.3.1



/**
 * Empresa generated by hbm2java
 */
public class Empresa  implements java.io.Serializable {


     private Integer idEmpresa;
     private String razonSocial;
     private String nombre;
     private String apellidos;
     private String nif;
     private String nifR;
     private String domicilio;
     private String cp;
     private String poblacion;
     private String provincia;
     private String pais;
     private String telefono;
     private String mail;

    public Empresa() {
    }

	
    public Empresa(String razonSocial, String nombre, String apellidos, String nif, String domicilio, String cp, String poblacion, String provincia, String pais) {
        this.razonSocial = razonSocial;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.domicilio = domicilio;
        this.cp = cp;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.pais = pais;
    }
    public Empresa(String razonSocial, String nombre, String apellidos, String nif, String nifR, String domicilio, String cp, String poblacion, String provincia, String pais, String telefono, String mail) {
       this.razonSocial = razonSocial;
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.nif = nif;
       this.nifR = nifR;
       this.domicilio = domicilio;
       this.cp = cp;
       this.poblacion = poblacion;
       this.provincia = provincia;
       this.pais = pais;
       this.telefono = telefono;
       this.mail = mail;
    }
   
    public Integer getIdEmpresa() {
        return this.idEmpresa;
    }
    
    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getMail() {
        return this.mail;
    }
    
    public void setMail(String mail) {
        this.mail = mail;
    }




}


