public enum TipoCargaCamion {
    ALIMENTO("Alimento"),
    MATERIAL("Material de construcción");

    public final String nombre;

    TipoCargaCamion(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return this.nombre;
    }
}
