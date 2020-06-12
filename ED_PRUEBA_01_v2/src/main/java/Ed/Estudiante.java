package Ed;

public class Estudiante extends Persona {

    private double promedio;
    private boolean matriculado;

    Estudiante(int run, String nombre, String direccion, String fecha, double promedio, boolean matriculado){
            this.run=run;
            this.nombre=nombre;
            this.direccion=direccion;
            this.fecha=fecha;
            this.promedio=promedio;
            this.matriculado=matriculado;
    }

    public String imprimir() { return getNombre()+", "+getRun()+", "+getDireccion()+", "+getFecha()+", "+getPromedio(); }

    public double getPromedio() {
        return promedio;
    }

    public boolean isMatriculado() {
        return matriculado;
    }


}
