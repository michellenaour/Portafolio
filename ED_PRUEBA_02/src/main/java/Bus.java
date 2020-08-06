import java.time.LocalDate;
import java.time.format.TextStyle;

public class Bus extends Vehiculo {
    TipoBus pisos;
    TipoCargaBus carga;

    Bus(String patente, String chasis, int ejes, Marca marca, LocalDate fechaCompra, int KmActual,
        int KmUltMantencion, LocalDate fechaUltMantencion, TipoBus pisos, TipoCargaBus carga) {
        super(patente, chasis, ejes, marca, fechaCompra, KmActual, KmUltMantencion, fechaUltMantencion);
        this.carga=carga;
        this.pisos=pisos;

    }

    private String getCarga() {
        return carga.nombre;
    }

    private String getPisos() {
        return pisos.nombre;
    }

    @Override
    public String toString() {
        return "Patente:"+getPatente()+"  Chasís:"+getChasis()+"  Ejes:"+getEjes()
                +"  Marca:"+getMarca()+"  Fecha de compra:"+getFechaCompra()
                +"  Kilometraje actual:"+getKmActual()
                +"  Kilometraje última mantención:"+getKmUltMantencion()
                +" Fecha última mantención:"+getFechaUltMantencion()+
                "  Tipo de bus:"+getPisos()+" Tipo de Carga:"+getCarga();
    }

    boolean tiene2Pisos(){
        return this.pisos == TipoBus.DOS;
    }

    boolean tiene1Piso(){return this.pisos==TipoBus.UNO; }
    boolean llevaPasajeros(){ return this.carga == TipoCargaBus.PASAJEROS; }
    boolean llevaEncomiendas(){ return this.carga == TipoCargaBus.ENCOMIENDAS; }


}
