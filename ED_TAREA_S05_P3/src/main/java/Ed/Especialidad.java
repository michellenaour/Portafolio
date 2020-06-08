package Ed;

public enum Especialidad {
    FRENOS("frenos"),
    GASES("gases"),
    MOTOR("motor");
    final String nombre;
    Especialidad(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

}
