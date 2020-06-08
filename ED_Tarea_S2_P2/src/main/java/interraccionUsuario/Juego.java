package interraccionUsuario;

import contextoProblema.Gato;
import contextoProblema.Perro;

public class Juego {

    public void Jugar(){
        Perro perro = new Perro();
        Gato gato = new Gato();
        perro.hacerSonido();
        perro.comer();
        gato.hacerSonido();
        gato.comer();
    }

}

