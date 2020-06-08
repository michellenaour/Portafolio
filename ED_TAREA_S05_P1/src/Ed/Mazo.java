package Ed;

import java.util.*;


public class Mazo {
    static List<Carta> cartas= new LinkedList<>();

    public static void mezclarCartas(){
        Collections.shuffle(cartas);
    }
    public static void sacarCarta(){
        Carta c= cartas.get(cartas.size()-1);
        System.out.println(c);
        cartas.remove(c);
    }
    public static void agregarCarta(Carta c){
        cartas.add(c);
    }
    public static void verCartas(){
        Iterator<Carta> iterator=cartas.iterator();
        while (iterator.hasNext()){System.out.print(iterator.next().toString());}
        System.out.print("\n");
    }
    public  static void completarMazo(){
        Carta c;
        for(int t = 0; t< Tipo.values().length; t++) {
            for(int r = 0; r< Rango.values().length; r++) {
                c = new Carta(Tipo.values()[t], Rango.values()[r]);
                agregarCarta(c);
            }
        }
    }

}
