package Ed;

import Ed.Tipo;

public class Carta {

    Tipo tipo;
    Rango rango;

    Carta(Tipo tipo, Rango rango){
        this.tipo=tipo;
        this.rango=rango;
    }

    public String toString(){
        String carta=" |"+getTipo()+" "+getRango()+"| ";
        return carta;
    }
    public Tipo getTipo() {
        return tipo;
    }

    public Rango getRango() {
        return rango;
    }




}
