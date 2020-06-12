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

    public String imprimir() {

            return nombre+" ,"+profesion;
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
