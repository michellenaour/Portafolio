package Ed;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Departamento {



    String nombreDepto;
    List<Mecanico> mecanicos = new ArrayList<>();
    Director directorDpto;

    public Departamento(String nombreDepto) {
        this.nombreDepto = nombreDepto;
    }

    public void agreagarMecanico(Mecanico mecanico) {
        mecanicos.add(mecanico);
    }

    public void setDirectorDpto(Director directorDpto) {
        this.directorDpto = directorDpto;
    }

    public Director getDirectorDpto() {
        return directorDpto;
    }

    public void mostrarMecanicos(){
        Iterator<Mecanico> iterator=mecanicos.iterator();
        while (iterator.hasNext()){System.out.println(iterator.next().toString());}
    }
    public String getNombreDepto() {
        return nombreDepto;
    }

    public void setNombreDepto(String nombreDepto) {
        this.nombreDepto = nombreDepto;
    }

}
