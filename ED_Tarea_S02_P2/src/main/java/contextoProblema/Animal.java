package contextoProblema;

public class Animal {
     String sonido;
     String especie;
     protected static String comida= "ñam ñam";



    public   void comer(){
        System.out.println("El "+especie+" come "+comida+".");
    }
    public void hacerSonido(){
        System.out.println("El "+especie+" hace "+sonido+"!");
    }


}
