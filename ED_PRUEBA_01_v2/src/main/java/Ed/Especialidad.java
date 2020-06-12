package Ed;

public enum Especialidad {

    BIOLOGIA("Biología"),MATEMATICA("Matemática"), HISTORIA("Historia");

    public final String nombre;

    Especialidad(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return this.nombre;
    }
}