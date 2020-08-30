import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArbolBinarioTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void agregar() {
    }

    @Test
    public void buscar() {
    }

    @Test
    public void eliminar() {
    }

    @Test
    public void n_valor_preOrden() {
        ArbolBinario arbolGenerado= new ArbolBinario(8);
        arbolGenerado.agregar(4);
        arbolGenerado.agregar(10);
        arbolGenerado.agregar(1);
        arbolGenerado.agregar(5);
        System.out.print(arbolGenerado.N_valor_preOrden(5));


    }

    @Test
    public void es_lleno() {
        ArbolBinario arbolGenerado= new ArbolBinario(5);
        arbolGenerado.agregar(3);
        arbolGenerado.agregar(7);
        System.out.print(arbolGenerado.es_lleno());
    }

    @Test
    public void obtener_nivel(){
        ArbolBinario arbolGenerado= new ArbolBinario(8);
        arbolGenerado.agregar(4);
        arbolGenerado.agregar(10);
        arbolGenerado.agregar(1);
        arbolGenerado.agregar(5);
        System.out.print(arbolGenerado.obtener_nivel(1));
    }

    @Test
    public void obtener_mayor_por_nivel(){
        ArbolBinario arbolGenerado= new ArbolBinario(10);
        arbolGenerado.agregar(5);
        arbolGenerado.agregar(15);
        arbolGenerado.agregar(3);
        arbolGenerado.agregar(8);
        arbolGenerado.agregar(18);
        arbolGenerado.agregar(17);
        arbolGenerado.Valor_mas_grande_por_nivel();
    }
}