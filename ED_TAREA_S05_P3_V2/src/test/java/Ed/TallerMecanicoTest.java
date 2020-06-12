package Ed;

import org.junit.Test;

import static org.junit.Assert.*;

public class TallerMecanicoTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @Test
    public void TestTallerMecanico(){
        TallerMecanico tallerTemuco = new TallerMecanico();

        tallerTemuco.agregarDepto("Control de Calidad");
        tallerTemuco.agregarDepto("Ventas");

        Director dir1= new Director("Felipe Gómez", 172836748,Especialidad.FRENOS,
                1000000.0,40000.0);
        Director dir2= new Director("Camila Enriquez", 156473247,Especialidad.MOTOR,
                1200000.0,43000.0);
        Mecanico m1= new Mecanico("Diego Mellado",183562451,Especialidad.GASES,
                800000.0,27000.0);
        Mecanico m2= new Mecanico("Hector Torres",183562451,Especialidad.MOTOR,
                7800000.0,20000.0);
        Mecanico m3= new Mecanico("Emilio López",156739813,Especialidad.FRENOS,
                9100000.0,30000.0);
        Mecanico m4= new Mecanico("Alejandro Ortega",91325839,Especialidad.MOTOR,
                870000.0,22000.0);
        Mecanico m5= new Mecanico("Karla Mora",126362321,Especialidad.GASES,
                850000.0,28000.0);

        tallerTemuco.asignarDirector(dir1,tallerTemuco.buscarDptoPorNombre("Ventas"));
        tallerTemuco.asignarDirector(dir2,tallerTemuco.buscarDptoPorNombre("Control de Calidad"));

        tallerTemuco.agreagarMecanicoaDepto(m1,tallerTemuco.buscarDptoPorNombre("Control de Calidad"));
        tallerTemuco.agreagarMecanicoaDepto(m2,tallerTemuco.buscarDptoPorNombre("Control de Calidad"));
        tallerTemuco.agreagarMecanicoaDepto(m3,tallerTemuco.buscarDptoPorNombre("Control de Calidad"));
        tallerTemuco.agreagarMecanicoaDepto(m4,tallerTemuco.buscarDptoPorNombre("Ventas"));
        tallerTemuco.agreagarMecanicoaDepto(m5,tallerTemuco.buscarDptoPorNombre("Ventas"));

        tallerTemuco.mostarDirectoresDeDepartamento();
        tallerTemuco.buscarDptoPorNombre("Ventas").mostrarMecanicos();
        tallerTemuco.buscarDptoPorNombre("Control de Calidad").mostrarMecanicos();



    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
}