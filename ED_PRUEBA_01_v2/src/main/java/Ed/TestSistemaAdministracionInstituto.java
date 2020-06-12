package Ed;

public class TestSistemaAdministracionInstituto {
    static Instituto InstitutoLosValles = new Instituto();

    public static void main(String[]args){
        InicializarAlumnos();
        InicializarPersonal();
        InicializarProfesores();

        InstitutoLosValles.imprimirEstudiantesMatriculados();
        InstitutoLosValles.imprimirEstudiantesListaDeEspera();
        InstitutoLosValles.imprimirProfesores();
        InstitutoLosValles.imprimirPersonal();
    }
    /**
     *registra Estudiantes en el Instituto
     **/
    private static void InicializarAlumnos() {
        Estudiante e1 =new Estudiante(204562649,"Camilo Flores",
                "los sauces 128", "3-mayo-2017",6.3,true);
        Estudiante e2 =new Estudiante(201756354,"Javiera perez",
                "las araucarias 418", "15-marzo-2017",6.7,true);
        Estudiante e3 =new Estudiante(217297355,"Eduardo Morales",
                "las lilas 774", "13-Agosto-2018",4.3,true);
        Estudiante e4 =new Estudiante(217283011,"Andrea Soto",
                "los gorriones 201", "5-marzo-2018",6.3,false);
        Estudiante e5 =new Estudiante(226475342,"Cesar Mellado",
                "Granada 546", "7-marzo-2019",6.1,true);
        Estudiante e6 =new Estudiante(216376342,"Camilo Martinez",
                "Urrutia 1735", "8-marzo-2020",4.5,false);
        Estudiante e7 =new Estudiante(2127463534,"Catalina Barrera",
                "angamos 634", "21-Agosto-2018",5.6,true);


        InstitutoLosValles.registrarEstudiante(e1);
        InstitutoLosValles.registrarEstudiante(e2);
        InstitutoLosValles.registrarEstudiante(e3);
        InstitutoLosValles.registrarEstudiante(e4);
        InstitutoLosValles.registrarEstudiante(e5);
        InstitutoLosValles.registrarEstudiante(e6);
        InstitutoLosValles.registrarEstudiante(e7);


    }
    /**
     *registra miembros del personal en el Instituto
     **/
    private static void InicializarPersonal() {
        Personal_admin p_a1 = new Personal_admin(89067455,"Fernando Puentes",
                "Prat 465","4-julio-2012","Contador");
        Personal_admin p_a2 = new Personal_admin(105479387,"Alejandra Gómez",
                "los volcanes 637","5-marzo-2014","Enfermera");
        Personal_admin p_a3 = new Personal_admin(97466461,"Camila Medina",
                "21 de mayo 880","1-enero-2009","Secretaria");
        Personal_admin p_a4 = new Personal_admin(177486357,"Viviana Contreras",
                "Lagos 7020","10-marzo-2010","Psicologa");
        InstitutoLosValles.registrarPersonal(p_a1);
        InstitutoLosValles.registrarPersonal(p_a2);
        InstitutoLosValles.registrarPersonal(p_a3);
        InstitutoLosValles.registrarPersonal(p_a4);
    }
    /**
     *Registra profesores en el Instituto
     **/
    private static void InicializarProfesores() {
        Profesor p1 = new Profesor(78266354,"Marco Aravena",
                "San Martin 735","10-enero-2020",Especialidad.BIOLOGIA,6);
        Profesor p2 = new Profesor(130937721,"Cristian Arzola",
                "Las Heras 675","5-mayo-2012",Especialidad.HISTORIA,9);
        Profesor p3 = new Profesor(53729808,"Monica Mora",
                "Los molinos","7-marzo-2015",Especialidad.MATEMATICA,15);
        Profesor p4 = new Profesor(102536510,"Gabriela Aguayo",
                "Lagos 278","8-abril-2013",Especialidad.MATEMATICA,12);
        InstitutoLosValles.registrarProfesor(p1);
        InstitutoLosValles.registrarProfesor(p2);
        InstitutoLosValles.registrarProfesor(p3);
        InstitutoLosValles.registrarProfesor(p4);

    }
}
