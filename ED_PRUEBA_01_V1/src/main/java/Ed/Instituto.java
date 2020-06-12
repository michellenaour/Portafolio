package Ed;


import java.util.*;

public class Instituto {
    public static List<Estudiante> listaEstudiantes= new ArrayList<>();
    public List<Profesor> listaProfesores = new ArrayList<>();
    public List <Personal_admin> listaPersonal= new ArrayList<>();


    public void registrarEstudiante(Estudiante e){
        listaEstudiantes.add(e);
    }
    public void registrarProfesor(Profesor p){
        listaProfesores.add(p);
    }
    public void registrarPersonal(Personal_admin p_A){
        listaPersonal.add(p_A);
    }

    public void imprimirEstudiantes(){
        ordenarEstudiantes();
        String documento="Nombre || run || direccion || fecha Ingreso || promedio";
        for (int i=0; i<listaEstudiantes.size(); i++){
            documento=documento+"\n"+listaEstudiantes.get(i).imprimir();
        }
        Impresora.imprimir(documento);
    }
    public void imprimirProfesores(){
        String documento="Nombre || especialidad || años de experiencia";
        for (int i=0; i<listaProfesores.size(); i++){
            documento=documento+"\n"+listaProfesores.get(i).imprimir();
        }
        Impresora.imprimir(documento);
    }
    public void imprimirPersonal(){
        String documento="Nombre    || Profesion";

        for (int i=0; i<listaPersonal.size(); i++){
            documento=documento+"\n"+listaPersonal.get(i).imprimir();
        }
        Impresora.imprimir(documento);
    }

    private static void ordenarEstudiantes(){
        listaEstudiantes.sort(Comparator.comparing(Estudiante::getPromedio));
    }

}
