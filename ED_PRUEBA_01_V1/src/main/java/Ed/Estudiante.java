package Ed;

public class Estudiante extends Persona {
    double promedio;
    boolean matriculado;

    Estudiante(int run, String nombre, String direccion, String fecha, double promedio, boolean matriculado){
            this.run=run;
            this.nombre=nombre;
            this.direccion=direccion;
            this.fecha=fecha;
            this.promedio=promedio;
            this.matriculado=matriculado;
    }

    public int compareTo(Estudiante e) {
        if (promedio < e.promedio) {
            return -1;
        }
        if (promedio > e.promedio) {
            return 1;
        }
        return 0;
    }

    public String imprimir() {
        String mat="si";
        if(!matriculado){mat="no";}
        return nombre+", "+run+", "+direccion+" ,"+fecha+" ,"+mat+" ,"+promedio;
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

    public double getPromedio() {
        return promedio;
    }
}
