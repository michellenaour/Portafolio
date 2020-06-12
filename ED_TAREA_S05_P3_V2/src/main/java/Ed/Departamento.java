package Ed;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Departamento {

    String nombreDepto;
    List<Mecanico> mecanicos = new ArrayList<>();
    Director directorDpto;
    Printer impresora = new Printer();

    Departamento(String nombreDepto) {
        this.nombreDepto = nombreDepto;
    }

    void agreagarMecanico(Mecanico mecanico) {
        mecanicos.add(mecanico);
    }

    void mostrarMecanicos(){
        Iterator<Mecanico> iterator=mecanicos.iterator();
        while (iterator.hasNext()){
            impresora.imprimir(iterator.next());
        }
    }

    String getNombreDepto() {
        return nombreDepto;
    }

    Director getDirectorDpto() {
        return directorDpto;
    }

    void setDirectorDpto(Director directorDpto) {
        this.directorDpto = directorDpto;
    }


}
