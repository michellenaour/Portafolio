package Ed;

public class Mecanico extends Empleado {

    public Mecanico(String nombre, int rut, Especialidad especialidad, double sueldoMensualBase, double valorHorasExtra) {
        super(nombre, rut, especialidad, sueldoMensualBase, valorHorasExtra);
    }

    public String toString(){
        return "\nMecánico: Nombre: "+getNombre()+" | Rut: "+getRut()+" | Especialidad: "+getEspecialidad()+" | Pertenece al Departamento: "+getDepto().getNombreDepto();
    }

    public void hacerMantenimiento(){}

    @Override
    public void print() {
        super.print();
    }
}
