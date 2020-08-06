package Ed;

public enum Nivel {

    BASICO("Básico"),INTERMEDIO("Intermedio"),AVANZADO("Avanzado");

    public final String nombre;

    Nivel(String nombre) { this.nombre=nombre; }

    public String toString(){
        return this.nombre;
    }
}
