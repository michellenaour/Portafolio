package Ed;

public class Profesor extends Persona{

    private int agnosExp;

    private Especialidad especialidad;

    Profesor(int run, String nombre, String direccion, String fecha, Especialidad especialidad, int agnosExp){
        this.run=run;
        this.nombre=nombre;
        this.direccion=direccion;
        this.fecha=fecha;
        this.especialidad=especialidad;
        this.agnosExp=agnosExp;
    }

    public String imprimir(){
        return getNombre()+", "+getEspecialidad().toString()+", "+getAgnosExp();
    }

    public Especialidad getEspecialidad() { return especialidad; }

    public int getAgnosExp() {
        return agnosExp;
    }


}
