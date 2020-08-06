public enum Marca {
    SCANIA("Scania"),
    VOLVO("Volvo"),
    MERCEDES("Mercedes Benz");

    public final String nombre;

    Marca(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return this.nombre;
    }
}
