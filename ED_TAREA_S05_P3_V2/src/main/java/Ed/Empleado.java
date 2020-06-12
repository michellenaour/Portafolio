package Ed;

 class Empleado implements Printable  {

    String nombre;
    int rut;
    Especialidad especialidad;
    double sueldoMensualBase;
    int horasExtra;
    double valorHorasExtra;
    Departamento depto;

    Empleado(String nombre, int rut, Especialidad especialidad, double
            sueldoMensualBase, double valorHorasExtra) {
        super();
        this.nombre=nombre;
        this.rut=rut;
        this.especialidad=especialidad;
        this.sueldoMensualBase=sueldoMensualBase;
        this.valorHorasExtra=valorHorasExtra;
        this.horasExtra=0;

    }

    @Override
    public void print() {
        System.out.print(toString());
    }

    public String toString(){
        return"\nNombre:"+getNombre()+" RUT:"+getRut()
                +" Especialidad"+getEspecialidad() +
                " Sueldo Base:"+getSueldoMensualBase();
    }

    public double calcularSueldoTotal(){
        double sueldo=getSueldoMensualBase()+getHorasExtra()*getValorHorasExtra();
        return sueldo;
    }

    public String getEspecialidad() {
        return especialidad.nombre;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public double getValorHorasExtra() {
        return valorHorasExtra;
    }

    public double getSueldoMensualBase() {
        return sueldoMensualBase;
    }
    public String getNombre() {
        return nombre;
    }

    public int getRut() {
        return rut;
    }

    public void setDepto(Departamento depto){
         this.depto=depto;
     }

     public Departamento getDepto() {
         return depto;
     }
}
