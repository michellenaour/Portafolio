import java.io.Serializable;
import java.time.LocalDate;
public class Vehiculo {
    String patente;
    String chasis;
    int ejes;
    Marca marca;
    LocalDate fechaCompra;
    int KmActual;
    int KmUltMantencion;
    LocalDate fechaUltMantencion;


    Vehiculo( String patente, String chasis, int ejes, Marca marca, LocalDate fechaCompra, int KmActual, int KmUltMantencion, LocalDate fechaUltMantencion){
        this.patente=patente;
        this.chasis=chasis;
        this.ejes=ejes;
        this.marca=marca;
        this.fechaCompra=fechaCompra;
        this.KmActual=KmActual;
        this.KmUltMantencion=KmUltMantencion;
        this.fechaUltMantencion=fechaUltMantencion;
    }

    boolean mantencionAlDia(){
        if(mantencionHaceMenosde6Meses(this.fechaUltMantencion)&&
                mantencionKmAldia(this.getKmActual(),this.getKmUltMantencion())){
            return true;
        }
        return false;
    }


    private boolean mantencionHaceMenosde6Meses(LocalDate ultimaMantencion){
        LocalDate hoy = LocalDate.now();
        LocalDate mantencionPlanificada = ultimaMantencion.plusMonths(6);
        if(mantencionPlanificada.isAfter(hoy)){
            return true;
        }
        return false;
    }

    private boolean mantencionKmAldia(int kmactual,int kmMantencion){
        if(kmactual<15000){
            return true;
        }else{
            if(kmMantencion>15000){
                return true;
            }
        }
        return false;
    }

    String getPatente() {
        return patente;
    }

    String getChasis() {
        return chasis;
    }

    int getEjes() {
        return ejes;
    }

    String getMarca() {
        return marca.nombre;
    }

    LocalDate getFechaCompra() {
        return fechaCompra;
    }

    int getKmActual() {
        return KmActual;
    }

    int getKmUltMantencion() {
        return KmUltMantencion;
    }

    LocalDate getFechaUltMantencion() {
        return fechaUltMantencion;
    }


}
