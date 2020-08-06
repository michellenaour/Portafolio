

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Operaciones {
    private Map<String,Vehiculo> flota;

    Operaciones(Empresa empresa){
        this.flota=empresa.flota;
    }

    List<Vehiculo> CrearListaCamionesMantencionAlDia(){
        List<Vehiculo> CamionesMantencionAldia=new ArrayList();
        for(Vehiculo maquina: flota.values()){
            if(maquina.mantencionAlDia()){
                if(maquina instanceof Camion){ CamionesMantencionAldia.add(maquina);}
            }
        }
        return ordenarListasPorFecha(CamionesMantencionAldia);
    }

    List<Vehiculo> CrearListaBusesMantencionAlDia(){
        List<Vehiculo> BusesMantencionAldia=new ArrayList();
        for(Vehiculo maquina: flota.values()){
            if(maquina.mantencionAlDia()){
                if(maquina instanceof Bus){ BusesMantencionAldia.add(maquina);}
            }
        }
        return ordenarListasPorFecha(BusesMantencionAldia);
    }

    List<Vehiculo> CrearListaBusesQueRequierenMantencion(){
        List<Vehiculo> BusesRequierenMantencion=new ArrayList();
        for(Vehiculo maquina: flota.values()){
            if(!maquina.mantencionAlDia()){
                if(maquina instanceof Bus){ BusesRequierenMantencion.add(maquina);}
            }
        }
        return ordenarListasPorFecha(BusesRequierenMantencion);
    }

    List<Vehiculo> CrearListaCamionesQueRequierenMantencion(){
        List<Vehiculo> CamionesRequiereMantencion=new ArrayList();
        for(Vehiculo maquina: flota.values()){
            if(!maquina.mantencionAlDia()){
                if(maquina instanceof Camion){ CamionesRequiereMantencion.add(maquina);}
            }
        }
        return ordenarListasPorFecha(CamionesRequiereMantencion);
    }

    List<Vehiculo> CrearListaVehiculosQueRequierenMantencionConKilometrajeMenorA60km(){
        List<Vehiculo> VehiculosRequierenMantencionKmMenor60=new ArrayList();
        for(Vehiculo maquina: flota.values()){
            if(!maquina.mantencionAlDia()){
                if(menosDe60KKM(maquina)){
                    VehiculosRequierenMantencionKmMenor60.add(maquina);
                }
            }
        }
        return ordenarListasPorFecha(VehiculosRequierenMantencionKmMenor60);
    }

    List<Vehiculo> CrearListaCamionesDeAlimentosRequierenMantencion(){
        List<Vehiculo> CamionesDeAlimentosRequiereMantencion=new ArrayList();
        for(Vehiculo maquina: flota.values()){
            if(!maquina.mantencionAlDia()){
                if(maquina instanceof Camion){
                    Camion c= (Camion) maquina;
                        if(c.llevaAlimento()) { CamionesDeAlimentosRequiereMantencion.add(maquina); }
                }
            }
        }
        return ordenarListasPorFecha(CamionesDeAlimentosRequiereMantencion);

    }

    List<Vehiculo> CrearListaCamionesDeMaterialesQueRequierenMantencion(){
        List<Vehiculo> CamionesDeAlimentosRequiereMantencion=new ArrayList();
        for(Vehiculo maquina: flota.values()){
            if(!maquina.mantencionAlDia()){
                if(maquina instanceof Camion){
                    Camion c= (Camion) maquina;
                    if(c.llevaMateriales()) { CamionesDeAlimentosRequiereMantencion.add(maquina); }
                }
            }
        }
        return ordenarListasPorFecha(CamionesDeAlimentosRequiereMantencion);

    }

    List<Vehiculo> CrearListaBusesDe1PisoQueRequierenMantencion(){
        List<Vehiculo> BusesDe1pisoRequiereMantencion=new ArrayList();
        for(Vehiculo maquina: flota.values()){
            if(!maquina.mantencionAlDia()){
                if(maquina instanceof Bus){
                   Bus bus= (Bus) maquina;
                    if(bus.tiene1Piso()) { BusesDe1pisoRequiereMantencion.add(maquina); }
                }
            }
        }
        return ordenarListasPorFecha(BusesDe1pisoRequiereMantencion);

    }

    List<Vehiculo> CrearListaBusesDe2PisosQueRequierenMantencion(){
        List<Vehiculo> BusesDe2pisosRequiereMantencion=new ArrayList();
        for(Vehiculo maquina: flota.values()){
            if(!maquina.mantencionAlDia()){
                if(maquina instanceof Bus){
                    Bus bus= (Bus) maquina;
                    if(bus.tiene2Pisos()) { BusesDe2pisosRequiereMantencion.add(maquina); }
                }
            }
        }
        return ordenarListasPorFecha(BusesDe2pisosRequiereMantencion);

    }

    List<Vehiculo> CrearListaBusesDePasajerosQueRequierenMantencion(){
        List<Vehiculo> BusesDePasajerosRequiereMantencion=new ArrayList();
        for(Vehiculo maquina: flota.values()){
            if(!maquina.mantencionAlDia()){
                if(maquina instanceof Bus){
                    Bus bus= (Bus) maquina;
                    if(bus.llevaPasajeros()) { BusesDePasajerosRequiereMantencion.add(maquina); }
                }
            }
        }
        return ordenarListasPorFecha(BusesDePasajerosRequiereMantencion);

    }

    List<Vehiculo> CrearListaBusesDeEncomiendasQueRequierenMantencion(){
        List<Vehiculo> BusesDeEncomiendasRequiereMantencion=new ArrayList();
        for(Vehiculo maquina: flota.values()){
            if(!maquina.mantencionAlDia()){
                if(maquina instanceof Bus){
                    Bus bus= (Bus) maquina;
                    if(bus.llevaEncomiendas()) { BusesDeEncomiendasRequiereMantencion.add(maquina); }
                }
            }
        }
        return ordenarListasPorFecha(BusesDeEncomiendasRequiereMantencion);

    }

    private boolean menosDe60KKM(Vehiculo maquina){
        int km= maquina.KmActual;
        if(km<60000){return true;}
        return false;
    }

    /**
     * @param lista es una lista que contiene vehiculos
     * Usa un comparator para ordenar la lista por las fechas de mantencion de los vehiculos */
    private List<Vehiculo> ordenarListasPorFecha(List<Vehiculo> lista){
         lista.sort(Comparator.comparing(Vehiculo::getFechaUltMantencion));
         return lista;
    }


}
