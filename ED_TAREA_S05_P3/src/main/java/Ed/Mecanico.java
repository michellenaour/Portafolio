package Ed;

public class Mecanico extends Empleado {

    Departamento depto;
    public Mecanico(String nombre, int rut, Especialidad especialidad, double sueldoMensualBase, double valorHorasExtra) {
        super(nombre, rut, especialidad, sueldoMensualBase, valorHorasExtra);
    }

    public String toString(){
        return "Mecánico: Nombre: "+getNombre()+" | Rut: "+getRut()+" | Especialidad: "+getEspecialidad()+"Pertenece al Departamento: "+getDepto().getNombreDepto();
    }

    public void hacerMantenimiento(){}

    public void setDepto(Departamento depto){
        this.depto=depto;
    }

    public Departamento getDepto() {
        return depto;
    }


}
