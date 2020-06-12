package Ed;

public enum Nivel {
    BASICO("básico"),INTERMEDIO("Intermedio"),AVANZADO("avanzado");
    String nombre;


    Nivel(String nombre) {
    }

    public String getNombre(){
        return nombre;
    }
}
