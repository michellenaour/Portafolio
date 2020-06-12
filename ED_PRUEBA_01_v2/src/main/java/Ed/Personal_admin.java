package Ed;

public class Personal_admin extends Persona{

    String profesion;

    Personal_admin(int run, String nombre, String direccion, String fecha, String profesion){
        this.run=run;
        this.nombre=nombre;
        this.direccion=direccion;
        this.fecha=fecha;
        this.profesion = profesion;
    }

    public String imprimir() {return getNombre()+", "+getProfesion(); }

    public String getProfesion() { return profesion; }

}
