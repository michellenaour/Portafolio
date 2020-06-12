package Ed;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TallerMecanico {
    List<Departamento> deptos=new ArrayList<>();
    Printer impresora = new Printer();

    void agregarDepto(String nombreDepto){
        Departamento depto= new Departamento(nombreDepto);
        deptos.add(depto);
    }

    void mostarDirectoresDeDepartamento(){
        Iterator<Departamento> iterator=deptos.iterator();
        while (iterator.hasNext()){
            impresora.imprimir(iterator.next().getDirectorDpto());
        }
    }

    void agreagarMecanicoaDepto(Mecanico mecanico, Departamento departamento) {
        departamento.agreagarMecanico(mecanico);
        mecanico.setDepto(departamento);
    }

    void asignarDirector(Director directorDpto, Departamento departamento) {
        departamento.setDirectorDpto(directorDpto);
        directorDpto.setDepto(departamento);
    }

    Departamento buscarDptoPorNombre(String nombre){
        for(int i=0; i<deptos.size(); i++){
           if(deptos.get(i).getNombreDepto().equals(nombre)){ return deptos.get(i); }
        }
        return null;
    }



}
