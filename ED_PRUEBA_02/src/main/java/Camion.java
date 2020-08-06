
import java.time.LocalDate;

public class Camion extends Vehiculo {
    TipoCargaCamion carga;

    Camion(String patente, String chasis, int ejes, Marca marca, LocalDate fechaCompra,
           int KmActual, int KmUltMantencion, LocalDate fechaUltMantencion, TipoCargaCamion carga) {
        super(patente, chasis, ejes, marca, fechaCompra, KmActual, KmUltMantencion, fechaUltMantencion);
        this.carga=carga;
    }

    public String toString() {
        return "Patente:"+getPatente()+"  Chasís:"+getChasis()+"  Ejes:"+getEjes()
                +"  Marca:"+getMarca()+"  Fecha de compra:"+getFechaCompra()
                +"  Kilometraje actual:"+getKmActual()
                +"  Kilometraje última mantención:"+getKmUltMantencion()
                +" Fecha última mantención:"+getFechaUltMantencion()
                +" Tipo de Carga:"+getCarga();
    }

    private String getCarga() {
        return carga.nombre;
    }

    boolean llevaAlimento(){
        return this.carga == TipoCargaCamion.ALIMENTO;
    }
    boolean llevaMateriales(){
        return this.carga == TipoCargaCamion.MATERIAL;
    }
}
