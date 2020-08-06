import java.time.LocalDate;
import java.util.*;

public class Empresa {
    Map<String,Vehiculo> flota;
    Set<Sucursal> sucursales;

    Empresa(){
        flota = new HashMap();
        sucursales=new HashSet<>();
    }

    /**
     * crea un vehiculo, llama al constructor de bus y le pasa los parametros
     * agrega el vehiculo a la flota
     * */
    public void AgregarBus(String patente, String chasis, int ejes, Marca marca, LocalDate fechaCompra, int KmActual,
                           int KmUltMantencion, LocalDate fechaUltMantencion, TipoBus pisos, TipoCargaBus carga){
        Vehiculo bus =new Bus(patente,chasis,ejes,marca,fechaCompra,KmActual,KmUltMantencion,fechaUltMantencion,pisos,carga);
        flota.put(patente,bus);
    }

    /**
     * crea un vehiculo, llama al constructor de camión y le pasa los parametros
     * agrega el vehiculo a la flota
     * */
    public void AgregarCamion(String patente, String chasis, int ejes, Marca marca, LocalDate fechaCompra,
                              int KmActual, int KmUltMantencion, LocalDate fechaUltMantencion, TipoCargaCamion carga){
        Vehiculo cam =new Camion(patente,chasis,ejes,marca,fechaCompra,KmActual,KmUltMantencion,fechaUltMantencion,carga);
        flota.put(patente,cam);

    }

    /**
     * @param lista es una lista que contiene vehiculos
     * @return un String conla infomación de todos los vehículos de la lista */
    String ImprimirLista(List<Vehiculo> lista){
        Iterator iterator = lista.iterator();
        String salida="";
        while (iterator.hasNext()){
            salida+=iterator.next().toString()+"\n";
        }
        return salida;
    }

}
