package entidades;
// Generated 18-jul-2019 7:59:39 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Reservarcita generated by hbm2java
 */
public class Reservarcita  implements java.io.Serializable {


     private Integer idreservarcita;
     private Cliente cliente;
     private Personal personal;
     private Tiporeserva tiporeserva;
     private Date fecha;

    public Reservarcita() {
    }

	
    public Reservarcita(Cliente cliente, Personal personal, Tiporeserva tiporeserva) {
        this.cliente = cliente;
        this.personal = personal;
        this.tiporeserva = tiporeserva;
    }
    public Reservarcita(Cliente cliente, Personal personal, Tiporeserva tiporeserva, Date fecha) {
       this.cliente = cliente;
       this.personal = personal;
       this.tiporeserva = tiporeserva;
       this.fecha = fecha;
    }
   
    public Integer getIdreservarcita() {
        return this.idreservarcita;
    }
    
    public void setIdreservarcita(Integer idreservarcita) {
        this.idreservarcita = idreservarcita;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Personal getPersonal() {
        return this.personal;
    }
    
    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
    public Tiporeserva getTiporeserva() {
        return this.tiporeserva;
    }
    
    public void setTiporeserva(Tiporeserva tiporeserva) {
        this.tiporeserva = tiporeserva;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }




}


