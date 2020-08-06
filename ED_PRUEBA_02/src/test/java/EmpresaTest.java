import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.*;

public class EmpresaTest {
    Empresa TransportesMN= new Empresa();
    Operaciones operacionesMN;

    @Test
     public void testCamionesConLaMantencionAlDia(){
        AgregarFlota();
        operacionesMN=new Operaciones(TransportesMN);

        System.out.println("Camiones con mantencion al dia");
        System.out.print(TransportesMN.ImprimirLista(operacionesMN.CrearListaCamionesMantencionAlDia()));
        assertEquals("WWAZ56",operacionesMN.CrearListaCamionesMantencionAlDia().get(0).patente);
        assertEquals(1,operacionesMN.CrearListaCamionesMantencionAlDia().size());
    }

    @Test
    public void testBusesConLaMantencionAlDia(){
        AgregarFlota();
        operacionesMN=new Operaciones(TransportesMN);
        System.out.println("\nBuses con mantencion al dia");
        System.out.print(TransportesMN.ImprimirLista(operacionesMN.CrearListaBusesMantencionAlDia()));
        assertEquals(0,operacionesMN.CrearListaBusesMantencionAlDia().size());
    }

    @Test
    public void VehiculosQueRequierenMantencionConKilometrajeMenorA60000km(){
        AgregarFlota();
        operacionesMN=new Operaciones(TransportesMN);

        System.out.println("Vehiculos que  requieren mantencion con kilometraje menor a 60.000 km");
        System.out.print(TransportesMN.ImprimirLista(operacionesMN.CrearListaVehiculosQueRequierenMantencionConKilometrajeMenorA60km()));
        assertEquals(3,operacionesMN.CrearListaVehiculosQueRequierenMantencionConKilometrajeMenorA60km().size());
        assertEquals("GDLZ21",operacionesMN.CrearListaVehiculosQueRequierenMantencionConKilometrajeMenorA60km().get(0).patente);
        assertEquals("HIOO99",operacionesMN.CrearListaVehiculosQueRequierenMantencionConKilometrajeMenorA60km().get(1).patente);
        assertEquals("LMAS32",operacionesMN.CrearListaVehiculosQueRequierenMantencionConKilometrajeMenorA60km().get(2).patente);
    }


    @Test
    public void testCamionesQueRequierenMantencionPorCategoria(){
        AgregarFlota();
        operacionesMN=new Operaciones(TransportesMN);

        System.out.println("Camiones de Carga de alimentos que  Requieren mantencion");
        System.out.print(TransportesMN.ImprimirLista(operacionesMN.CrearListaCamionesDeAlimentosRequierenMantencion()));
        assertEquals(3,operacionesMN.CrearListaCamionesDeAlimentosRequierenMantencion().size());
        assertEquals("TYDEF32",operacionesMN.CrearListaCamionesDeAlimentosRequierenMantencion().get(0).patente);
        assertEquals("HIOO99",operacionesMN.CrearListaCamionesDeAlimentosRequierenMantencion().get(1).patente);
        assertEquals("LMWW18",operacionesMN.CrearListaCamionesDeAlimentosRequierenMantencion().get(2).patente);


        System.out.println("\nCamiones de Carga de materiales de construcción que  Requieren mantencion");
        System.out.print(TransportesMN.ImprimirLista(operacionesMN.CrearListaCamionesDeMaterialesQueRequierenMantencion()));
        assertEquals(0,operacionesMN.CrearListaCamionesDeMaterialesQueRequierenMantencion().size());

    }

    @Test
    public void testBusesQueRequierenMantencionPorCategoriaDePiso(){
        AgregarFlota();
        operacionesMN=new Operaciones(TransportesMN);

        System.out.println("\nBuses de 1 piso que Requieren mantencion");
        System.out.print(TransportesMN.ImprimirLista(operacionesMN.CrearListaBusesDe1PisoQueRequierenMantencion()));
        assertEquals(1,operacionesMN.CrearListaBusesDe1PisoQueRequierenMantencion().size());
        assertEquals("FNYH29",operacionesMN.CrearListaBusesDe1PisoQueRequierenMantencion().get(0).patente);

        System.out.println("\nBuses de 2 pisos que Requieren mantencion");
        System.out.print(TransportesMN.ImprimirLista(operacionesMN.CrearListaBusesDe2PisosQueRequierenMantencion()));
        assertEquals(3,operacionesMN.CrearListaBusesDe2PisosQueRequierenMantencion().size());
        assertEquals("GDLZ21",operacionesMN.CrearListaBusesDe2PisosQueRequierenMantencion().get(0).patente);
        assertEquals("MHZP18",operacionesMN.CrearListaBusesDe2PisosQueRequierenMantencion().get(1).patente);
        assertEquals("LMAS32",operacionesMN.CrearListaBusesDe2PisosQueRequierenMantencion().get(2).patente);
    }

    @Test
    public void testBusesQueRequierenMantencionPorCategoriaDeCarga(){
        AgregarFlota();
        operacionesMN=new Operaciones(TransportesMN);

        System.out.println("\nBuses de pasajeros que Requieren mantencion");
        System.out.print(TransportesMN.ImprimirLista(operacionesMN.CrearListaBusesDePasajerosQueRequierenMantencion()));
        assertEquals(2,operacionesMN.CrearListaBusesDePasajerosQueRequierenMantencion().size());
        assertEquals("LMAS32",operacionesMN.CrearListaBusesDePasajerosQueRequierenMantencion().get(0).patente);
        assertEquals("FNYH29",operacionesMN.CrearListaBusesDePasajerosQueRequierenMantencion().get(1).patente);

        System.out.println("\nBuses de encomienda que Requieren mantencion");
        System.out.print(TransportesMN.ImprimirLista(operacionesMN.CrearListaBusesDeEncomiendasQueRequierenMantencion()));
        assertEquals(2,operacionesMN.CrearListaBusesDeEncomiendasQueRequierenMantencion().size());
        assertEquals("GDLZ21",operacionesMN.CrearListaBusesDeEncomiendasQueRequierenMantencion().get(0).patente);
        assertEquals("MHZP18",operacionesMN.CrearListaBusesDeEncomiendasQueRequierenMantencion().get(1).patente);

    }


    private void AgregarFlota(){
        TransportesMN.AgregarBus("FNYH29","NMK898735",2,Marca.MERCEDES,
                LocalDate.of(2017,04,21),110000,4000,
                LocalDate.of(2020,07,21),TipoBus.UNO,TipoCargaBus.PASAJEROS);
        TransportesMN.AgregarBus("MHZP18","PTG852853",4,Marca.MERCEDES,
                LocalDate.of(2016,12,21),85000,18000,
                LocalDate.of(2015,12,9),TipoBus.DOS,TipoCargaBus.ENCOMIENDAS);
        TransportesMN.AgregarBus("GDLZ21","KHJ667261",2,Marca.MERCEDES,
                LocalDate.of(2019,5,23),50000,47000,
                LocalDate.of(2013,12,19),TipoBus.DOS,TipoCargaBus.ENCOMIENDAS);
        TransportesMN.AgregarBus("LMAS32","MVB777254",4,Marca.SCANIA,
                LocalDate.of(2019,2,28),20000,15000,
                LocalDate.of(2015,12,19),TipoBus.DOS,TipoCargaBus.PASAJEROS);

        TransportesMN.AgregarCamion("HIOO99","AAJF44411",2,Marca.VOLVO,
                LocalDate.of(2015,05,4),35000,34000,
                LocalDate.of(2013,12,19),TipoCargaCamion.ALIMENTO);

        TransportesMN.AgregarCamion("LMWW18","KDJ887441",2,Marca.VOLVO,
                LocalDate.of(2018,04,6),111000,23000,
                LocalDate.of(2013,12,19),TipoCargaCamion.ALIMENTO);

        TransportesMN.AgregarCamion("WWAZ56","JJJ637344",2,Marca.SCANIA,
                LocalDate.of(2019,9,9),11000,5000,
                LocalDate.of(2020,7,19),TipoCargaCamion.ALIMENTO);

        TransportesMN.AgregarCamion("TYDEF32","KDD662311",2,Marca.SCANIA,
                LocalDate.of(2013,03,1),211000,200000,
                LocalDate.of(2013,12,19),TipoCargaCamion.ALIMENTO);
    }



}