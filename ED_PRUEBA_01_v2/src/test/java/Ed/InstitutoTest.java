package Ed;


import org.junit.Test;


import static org.junit.Assert.*;

public class InstitutoTest {

    @Test
    public void generarListaEstudiantesMatriculados() {
        Instituto InstitutoPrueba = new Instituto();
        Estudiante e1=new Estudiante(1,"nombre1","direccion1", "01-enero-2020",5.4,false);
        InstitutoPrueba.registrarEstudiante(e1);
        String esperado="\nNO HAY ESTUDIANTES REGISTRADOS";
        String actual = InstitutoPrueba.generarListaEstudiantesMatriculados();
        assertEquals(actual,esperado);
    }
    @Test
    public void generarListaEstudiantesMatriculados1() {
        Instituto InstitutoPrueba = new Instituto();
    Estudiante e1=new Estudiante(1,"nombre1","direccion1", "01-enero-2020",5.4,true);
    Estudiante e2=new Estudiante(2,"nombre2","direccion2", "01-enero-2020",6.7,true);
    Estudiante e3=new Estudiante(3,"nombre3","direccion3", "01-enero-2020",5.2,true);
    Estudiante e4=new Estudiante(4,"nombre4","direccion4", "01-enero-2020",5.1,true);
    Estudiante e5=new Estudiante(5,"nombre5","direccion5", "01-enero-2020",5.9,true);
    InstitutoPrueba.registrarEstudiante(e1);
    InstitutoPrueba.registrarEstudiante(e2);
    InstitutoPrueba.registrarEstudiante(e3);
    InstitutoPrueba.registrarEstudiante(e4);
    InstitutoPrueba.registrarEstudiante(e5);
    String actual = InstitutoPrueba.generarListaEstudiantesMatriculados();
    String esperado= "\n"+e4.imprimir()+"\n"+e3.imprimir()+"\n"+e1.imprimir()+"\n"+e5.imprimir()+"\n"+e2.imprimir();
    assertEquals(esperado,actual);
    }

    @Test
    public void generarListaEstudiantesListaDeEspera1() {
        Instituto InstitutoPrueba = new Instituto();
        Estudiante e1=new Estudiante(1,"nombre1","direccion1", "01-enero-2020",5.4,false);
        Estudiante e2=new Estudiante(2,"nombre2","direccion2", "01-enero-2020",6.7,false);
        Estudiante e3=new Estudiante(3,"nombre3","direccion3", "01-enero-2020",5.2,false);
        Estudiante e4=new Estudiante(4,"nombre4","direccion4", "01-enero-2020",5.1,false);
        Estudiante e5=new Estudiante(5,"nombre5","direccion5", "01-enero-2020",5.9,false);
        InstitutoPrueba.registrarEstudiante(e1);
        InstitutoPrueba.registrarEstudiante(e2);
        InstitutoPrueba.registrarEstudiante(e3);
        InstitutoPrueba.registrarEstudiante(e4);
        InstitutoPrueba.registrarEstudiante(e5);
        String actual = InstitutoPrueba.generarListaEstudiantesListaDeEspera();
        String esperado= "\n"+e1.imprimir()+"\n"+e2.imprimir()+"\n"+e3.imprimir()+"\n"+e4.imprimir()+"\n"+e5.imprimir();
        assertEquals(esperado,actual);
    }
    @Test
    public void generarListaEstudiantesListaDeEspera2() {
        Instituto InstitutoPrueba = new Instituto();
        Estudiante e1=new Estudiante(1,"nombre1","direccion1", "01-enero-2020",5.4,true);
        InstitutoPrueba.registrarEstudiante(e1);
        String esperado="\nNO HAY ESTUDIANTES REGISTRADOS";
        String actual = InstitutoPrueba.generarListaEstudiantesListaDeEspera();
        assertEquals(actual,esperado);
    }
    @Test
    public void generarListaProfesores2() {
        Instituto InstitutoPrueba = new Instituto();
        String actual =InstitutoPrueba.generarListaProfesores();
        String esperado= "\nNO HAY PROFESORES REGISTRADOS";
        assertEquals(esperado,actual);
    }
    @Test
    public void generarListaProfesores1() {
        Instituto InstitutoPrueba = new Instituto();
        Profesor p1= new Profesor(111,"nombre1",
                "direccion1","01-enero-2020", Especialidad.MATEMATICA,1);
        Profesor p2= new Profesor(222,"nombre2",
                "direccion2","01-enero-2020", Especialidad.HISTORIA,2);
        Profesor p3= new Profesor(333,"nombre3",
                "direccion3","01-enero-2020", Especialidad.BIOLOGIA,3);
        InstitutoPrueba.registrarProfesor(p1);
        InstitutoPrueba.registrarProfesor(p2);
        InstitutoPrueba.registrarProfesor(p3);
        String esperado= "\n"+p1.imprimir()+"\n"+p2.imprimir()+"\n"+p3.imprimir();
        String actual=InstitutoPrueba.generarListaProfesores();
        assertEquals(esperado,actual);

    }
    @Test
    public void generarListaPersonal1() {
        Instituto InstitutoPrueba = new Instituto();
        String actual1 =InstitutoPrueba.generarListaPersonal();
        String esperado1= "\nNO HAY PERSONAL ADMINISTRATIVO REGISTRADO";
        assertEquals(esperado1,actual1);
    }
    @Test
    public void generarListaPersonal2() {
        Instituto InstitutoPrueba = new Instituto();
        Personal_admin pa1 = new Personal_admin(11111111,"Juan Perez",
                "direccion", "01-enero-2020","Psicólogo");
        InstitutoPrueba.registrarPersonal(pa1);
        String esperado2="\nJuan Perez, Psicólogo";
        String actual2 = InstitutoPrueba.generarListaPersonal();
        assertEquals(esperado2,actual2);
    }


}