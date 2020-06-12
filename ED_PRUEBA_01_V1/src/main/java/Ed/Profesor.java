package Ed;

public class Profesor extends Persona{
    Especialidad especialidad;
    int agnosExp;

    Profesor(int run, String nombre, String direccion, String fecha, Especialidad especialidad, int ae){
        this.run=run;
        this.nombre=nombre;
        this.direccion=direccion;
        this.fecha=fecha;
        this.especialidad=especialidad;
        this.agnosExp=ae;
    }

    public String imprimir(){
        return nombre+" ,"+especialidad+" ,"+agnosExp;
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
