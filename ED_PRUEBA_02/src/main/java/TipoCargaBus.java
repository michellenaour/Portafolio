public enum TipoCargaBus {

    PASAJEROS("Pasajeros"),
    ENCOMIENDAS("Encomiendas");

    public final String nombre;

    TipoCargaBus(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return this.nombre;
    }
}
