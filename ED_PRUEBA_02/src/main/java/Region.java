public enum Region {
    AP("Arica y Parinacota"),
    TA("Tarapacá"),
    AN("Antofagasta"),
    AT("Atacama"),
    CO("Coquimbo"),
    VA("Valparaiso"),
    RM("Metropolitana"),
    OH("O'Higgins"),
    ML("Maule"),
    NB("Ñuble"),
    BI("Biobío"),
    AR("Araucanía"),
    LR("Los Ríos"),
    LL("Los Lagos"),
    AI("Aysen"),
    MA("Magallanes y Antártica");

    public final String nombre;

    Region(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return this.nombre;
    }
}
