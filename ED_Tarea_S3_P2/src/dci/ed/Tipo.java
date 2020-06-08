package dci.ed;

public enum Tipo {
    ACUSTICA("Acústica"),
    ELECTROACUSTICA("ElectroAcústica"),
    SEMEACUSTICA("SemiAcústica"),
    ELECTRICA("Eléctrica");


    private String nombre;

    Tipo(String nombre) {
         this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
