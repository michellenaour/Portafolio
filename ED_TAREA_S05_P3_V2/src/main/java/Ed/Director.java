package Ed;

public class Director extends Empleado {

    public Director(String nombre, int rut, Especialidad especialidad,
                    double sueldoMensualBase, double valorHorasExtra) {
        super(nombre, rut, especialidad, sueldoMensualBase, valorHorasExtra);

    }

    public void gestionarVentas(){}

    public String toString(){
        return "\nDirector: Nombre: "+getNombre()+" | Rut: "+getRut()+" | Especialidad: "+getEspecialidad()+" | Departamento dirigido: "+getDepto().getNombreDepto();
    }

    @Override
    public void print() {
        super.print();
    }
}
