package entidades;
// Generated 18-jul-2019 7:59:39 by Hibernate Tools 4.3.1



/**
 * MascotaporclienteId generated by hbm2java
 */
public class MascotaporclienteId  implements java.io.Serializable {


     private int idMascota;
     private int codigoCliente;

    public MascotaporclienteId() {
    }

    public MascotaporclienteId(int idMascota, int codigoCliente) {
       this.idMascota = idMascota;
       this.codigoCliente = codigoCliente;
    }
   
    public int getIdMascota() {
        return this.idMascota;
    }
    
    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }
    public int getCodigoCliente() {
        return this.codigoCliente;
    }
    
    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MascotaporclienteId) ) return false;
		 MascotaporclienteId castOther = ( MascotaporclienteId ) other; 
         
		 return (this.getIdMascota()==castOther.getIdMascota())
 && (this.getCodigoCliente()==castOther.getCodigoCliente());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdMascota();
         result = 37 * result + this.getCodigoCliente();
         return result;
   }   


}


