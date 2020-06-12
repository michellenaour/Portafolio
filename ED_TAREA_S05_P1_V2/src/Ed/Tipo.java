package Ed;

public enum Tipo {
    CORAZON("♥"),PICA("♠"),DIAMANTE("♦"),TREBOL("♣");
    public final String simbolo;
    Tipo(String simbolo) {this.simbolo=simbolo; }
    public String toString(){return this.simbolo;}
}
