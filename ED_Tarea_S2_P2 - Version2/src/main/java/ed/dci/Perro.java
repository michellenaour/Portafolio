package ed.dci;

public class Perro implements Animal {


    @Override
    public void comer() {
        System.out.print("Ñam Ñam");
    }

    @Override
    public void hacerSonido() {
        System.out.print("Guau Guau");
    }
}
