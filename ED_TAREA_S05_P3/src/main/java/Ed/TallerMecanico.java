package Ed;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TallerMecanico {
    List<Departamento> deptos=new ArrayList<>();

    public void agregarDepto(String nombreDepto){
        Departamento depto= new Departamento(nombreDepto);
        deptos.add(depto);
    }

    public void mostarDirectoresDeDepartamento(){
        Iterator<Departamento> iterator=deptos.iterator();
        while (iterator.hasNext()){System.out.println(iterator.next().getDirectorDpto());}
    }

    public void agreagarMecanicoaDepto(Mecanico mecanico, Departamento departamento) {
        departamento.agreagarMecanico(mecanico);
        mecanico.setDepto(departamento);
    }

    public void asignarDirector(Director directorDpto, Departamento departamento) {
        departamento.setDirectorDpto(directorDpto);
        directorDpto.setDeptoDirigido(departamento);
    }

    public Departamento buscarDptoPorNombre(String nombre){
        for(int i=0; i<deptos.size(); i++){
           if(deptos.get(i).getNombreDepto().equals(nombre)){
               return deptos.get(i);
           }
        }
        return null;
    }



}
