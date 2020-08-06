package Ed;

import java.util.*;

public class Instituto {
    private List<Estudiante> listaEstudiantesMatriculados= new ArrayList<>();
    private List<Estudiante> listaEstudiantesEnListaDeEspera= new ArrayList<>();
    private List<Profesor> listaProfesores = new ArrayList<>();
    private List<Personal_admin> listaPersonal= new ArrayList<>();

    /** agrega un estudiante a ListaEstudiantesMatriculados si isMatriculado retorna true
     * si isMatriculado retorna false es agregado a ListaEstudiantesEnListaDeEspera
     * @param estudiante estudiante que es agregado a ListaEstudiantesMatriculados o ListaEstudiantesEnListaDeEspera
     * */
    public void registrarEstudiante(Estudiante estudiante){
        if(estudiante.isMatriculado()){listaEstudiantesMatriculados.add(estudiante);}
        else{listaEstudiantesEnListaDeEspera.add(estudiante);}
    }

    /**
     * agrega un profesor a ListaProfesores
     * @param profesor profesor añadido a ListaProfesores
     * */
    public void registrarProfesor(Profesor profesor){
        listaProfesores.add(profesor);
    }

    /**
     * agrega un miembro del personal administratico a ListaPersonal
     * @param personal_admin  miembro del personal administrativo añadido a ListaPersonal
    * */
    public void registrarPersonal(Personal_admin personal_admin){ listaPersonal.add(personal_admin); }


    /**
     * llama al metodo generarListaEstudianetsMatriculados para obtener los datos de los estudiantes matriculados
     * agrega un encabezado al String con los datos y
     * luego entrega este String a la impresora para ser impresos
     * */
    public void imprimirEstudiantesMatriculados(){
        String documento="\nLISTA ESTUDIANTES MATRICULADOS \n||   Nombre    ||   run   ||   Dirección   || Fecha de Ingreso || Promedio || ";
        documento+=generarListaEstudiantesMatriculados();
        Impresora.imprimir(documento);
    }

    /**
     * llama al metodo generarListaEstudiantesListaDeEspera para obtener los datos del los estudiantes en lista de espera
     * agrega un encabezado al String con los datos y
     * luego entrega este String a la impresora para ser impresos
     * */
    public void imprimirEstudiantesListaDeEspera(){
        String documento="\nESTUDIANTES EN LISTA DE ESPERA \n||   Nombre    ||   run   ||   Dirección   || Fecha de Ingreso || Promedio || ";
        documento+=generarListaEstudiantesListaDeEspera();
        Impresora.imprimir(documento);
    }

    /**
     * llama al metodo generarListaProfesores para obtener los datos de los profesores
     * agrega un encabezado al String con los datos y
     * luego entrega este String a la impresora para ser impresos
     * */
    public void imprimirProfesores(){
        String documento="\n LISTA PROFESORES \n||  Nombre  || especialidad || años de experiencia ||";
        documento+=generarListaProfesores();
        Impresora.imprimir(documento);
    }

    /**
     * llama al metodo generarListaPersonal para obtener los datos del personal
     * agrega un encabezado al String con los datos y
     * luego entrega este String a la impresora para ser impresos
     * */
    public void imprimirPersonal(){
        String documento="\n LISTA PERSONA ADMINISTRATIVO \n||  Nombre    || Profesion  ||";
        documento+=generarListaPersonal();
        Impresora.imprimir(documento);
    }

    /**
     * llama al metodo para ordenar los estudiantes
     * Itera sobre la lista de estudiantes matriculados para obtener sus datos
     * @return un string con los datos: nombre, run, dirección Fecha de Ingreso y Promedio
     * de cada Estudiante matriculado registrado
     * */
    public String generarListaEstudiantesMatriculados(){
        String documento="";
        ordenarEstudiantesPorPromedio();
        for (int i=0; i<listaEstudiantesMatriculados.size(); i++){
            documento+="\n"+listaEstudiantesMatriculados.get(i).imprimir();
        }
        if(listaEstudiantesMatriculados.size()==0 || documento==""){documento="\nNO HAY ESTUDIANTES REGISTRADOS";}
        return documento;
    }

    /**
     * Itera sobre la lista de estudiantes en lista de espera para obtener sus datos
     * @return un string con los datos: nombre, run, dirección Fecha de Ingreso y Promedio
     * de cada Estudiante en lista de espera registrado
     * */
    public String generarListaEstudiantesListaDeEspera() {
        String documento="";
        for (int i=0; i<listaEstudiantesEnListaDeEspera.size(); i++){
            documento+="\n"+listaEstudiantesEnListaDeEspera.get(i).imprimir();
        }
        if(listaEstudiantesEnListaDeEspera.size()==0 || documento==""){documento="\nNO HAY ESTUDIANTES REGISTRADOS";}
        return documento;
    }

    /**
     * Itera sobre la lista de los profesores para obtener sus datos
     * @return un string con los datos: nombre,especialidad y años de experiencia
     * de cada profesor registrado
     * */
    public String generarListaProfesores(){
        String documento="";
        for (int i=0; i<listaProfesores.size(); i++){
            documento=documento+"\n"+listaProfesores.get(i).imprimir();
        }
        if(listaProfesores.size()==0 || documento==""){documento="\nNO HAY PROFESORES REGISTRADOS";}
        return documento;
    }

    /**
     * Itera sobre la lista del personal administativo
     * @return un string con los datos: nombre y profesion
     * de cada integrante del personal Adminsitartivo registrado
     * */
    public String generarListaPersonal(){
        String documento="";
        for (int i=0; i<listaPersonal.size(); i++){
            documento=documento+"\n"+listaPersonal.get(i).imprimir();
        }
        if(listaPersonal.size()==0 || documento==""){documento="\nNO HAY PERSONAL ADMINISTRATIVO REGISTRADO";}
        return documento;
    }

    /**
    * ordena ListaEstudiantes matriculados de acuerdo a su promedio de forma descendente
    * */
    private  void ordenarEstudiantesPorPromedio(){
        listaEstudiantesMatriculados.sort(Comparator.comparing(Estudiante::getPromedio));
    }




}
