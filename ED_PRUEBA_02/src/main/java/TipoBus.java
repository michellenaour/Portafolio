public enum TipoBus {
    UNO("1 piso"),
    DOS("2 pisos");

    public final String nombre;

    TipoBus(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return this.nombre;
    }
}
