package ed.dci;

public class Gato implements Animal {


    @Override
    public void comer() {
        System.out.print("Ñam Ñam");

    }

    @Override
    public void hacerSonido() {
        System.out.print("Miau Miua");
    }
}
