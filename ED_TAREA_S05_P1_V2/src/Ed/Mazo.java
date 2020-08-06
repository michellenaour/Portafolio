package Ed;

import java.util.*;


public class Mazo {

    Queue<Carta> cartas= new LinkedList<>();
    List<Carta> todasLasCartas=new ArrayList<>();


    public  void sacarCarta(){
        if(cartas.peek()==null){
            System.out.println("El mazo de cartas está vacío");
        }else {
            System.out.println(cartas.peek().toString());
            cartas.poll();
         }
    }

    public  void verCartas(){
        Iterator<Carta> iterator=cartas.iterator();
        while (iterator.hasNext()){System.out.print(iterator.next().toString());}
        System.out.print("\n");
    }
    public void completarMazo(){
        Random r = new Random();
        completarTodasLasCartas();
        Carta c;
        while (todasLasCartas.size()>0){
            int max=todasLasCartas.size();
            int i = r.nextInt(max);
            c=todasLasCartas.get(i);
            todasLasCartas.remove(i);
            cartas.add(c);
        }

    }
    private  void completarTodasLasCartas(){
        Carta c;
        for(int t = 0; t< Tipo.values().length; t++) {
            for(int r = 0; r< Rango.values().length; r++) {
                c = new Carta(Tipo.values()[t], Rango.values()[r]);
                todasLasCartas.add(c);
            }
        }
    }



}
