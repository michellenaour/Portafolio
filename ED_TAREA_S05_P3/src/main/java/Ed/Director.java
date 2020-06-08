package Ed;

public class Director extends Empleado {
    Departamento deptoDirigido;

    public Director(String nombre, int rut, Especialidad especialidad,
                    double sueldoMensualBase, double valorHorasExtra) {
        super(nombre, rut, especialidad, sueldoMensualBase, valorHorasExtra);

    }

    public void gestionarVentas(){}

    public void setDeptoDirigido(Departamento deptoDirigido){
        this.deptoDirigido=deptoDirigido;
    }

    public Departamento getDeptoDirigido() {
        return deptoDirigido;
    }

    public String toString(){

        return "Director: Nombre: "+getNombre()+" | Rut: "+getRut()+" | Especialidad: "+getEspecialidad()+" | Departamento dirigido: "+getDeptoDirigido().getNombreDepto();
    }
}
