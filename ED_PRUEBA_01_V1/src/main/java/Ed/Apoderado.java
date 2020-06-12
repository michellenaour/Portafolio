package Ed;

public class Apoderado extends Persona {

    Apoderado(int run, String nombre, String direccion, String fecha){
        this.run=run;
        this.nombre=nombre;
        this.direccion=direccion;
        this.fecha=fecha;

    }
    @Override
    public String getNombre() {
        return null;
    }

    @Override
    public String getFecha() {
        return null;
    }

    @Override
    public String getDireccion() {
        return null;
    }

    @Override
    public int getRun() {
        return 0;
    }
}
