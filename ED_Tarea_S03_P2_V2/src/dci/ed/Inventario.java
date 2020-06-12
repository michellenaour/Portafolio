package dci.ed;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventario {
    public List<Guitarra> listaGuitarras;

    public Inventario() {
        listaGuitarras = new LinkedList();
    }

    /**
     Metodo que agrega una guitarra a la lista de guitarras
     * @param modelo modelo de la guitarra que se busca
     * @return si encunetra una guitarra con estas características retorna la guitarra, sino retorna null
     *
     * */
    public void agregarGuitarra(String numeroSerie, double precio,
                                String fabricante, String modelo, Tipo tipo,
                                String maderaPosterior, String maderaFrontal) {
        Guitarra guitarra = new Guitarra(numeroSerie, precio, fabricante,
                modelo, tipo, maderaPosterior, maderaFrontal);
        listaGuitarras.add(guitarra);
    }

    /**
     Metodo que agrega una guitarra a la lista de guitarras
     * @param guitarra que se quiere agregar
     * @return si encunetra una guitarra con estas características retorna la guitarra, sino retorna null
     *
     * */
    public void agregarGuitarra(Guitarra guitarra){
        listaGuitarras.add(guitarra);
    }

    /**
     Metodo que busca una guitarra a partir de su numero de Serie
     * @param numeroSerie numero de serie de la guitarra que se busca
     * @return si encunetra una guitarra con estas características retorna la guitarra, sino retorna null
     * */
    public Guitarra obtenerPorNroSerie(String numeroSerie) {
        Iterator<Guitarra> iterador = listaGuitarras.iterator();
        while (iterador.hasNext()) {
            Guitarra guitarra = iterador.next();
            if (guitarra.getNumeroSerie().equals(numeroSerie)) {
                return guitarra;
            }
        }
        return null;
    }

    /**
    Metodo que busca una guitarra a partir de su fabricante, modelo, tipo,
    madera Posterior y frontal.
     * @param fabricante fabricante de la guitarra que se busca
     * @param modelo modelo de la guitarra que se busca
     * @param tipo tipo de la guitarra que se busca
     * @param mF tipo de madera frontal de la guitarra que se busca
     * @param mP tipo de madera frontal de la guitarra que se busca
     * @return si encunetra una guitarra con estas características retorna la guitarra, sino retorna null
     *
     */
    public Guitarra buscar(String fabricante, String modelo, Tipo tipo,
                           String mP, String mF) {

        Iterator<Guitarra> iterador = listaGuitarras.iterator();

        while (iterador.hasNext()) {
            Guitarra guitarra = iterador.next();
            if (!fabricante.equals(guitarra.getFabricante())) {

                continue;
            }

            if (!modelo.equals(guitarra.getModelo())){
                continue;
            }

            if (!tipo.getNombre().equals(guitarra.getTipo())){
                continue;
            }

            if (!mP.equals(guitarra.getMaderaPosterior())){
                continue;
            }

            if (!mF.equals(guitarra.getMaderaFrontal())){
                continue;
            }

            return guitarra;
        }
        return null;
    }

    /**
     Metodo que busca una guitarra a partir de su modelo
     * @param modelo modelo de la guitarra que se busca
     * @return si encunetra una guitarra con estas características retorna la guitarra, sino retorna null
     *
     * */
    public Guitarra buscarPorModelo(String modelo){
        Iterator<Guitarra> iterador = listaGuitarras.iterator();
        while (iterador.hasNext()) {
            Guitarra guitarra = iterador.next();
            if (guitarra.getModelo().equals(modelo)) {
                return guitarra;
            }
        }
        return null;
    }

    /**
     Metodo que busca una guitarra a partir de su  tipo
     * @param tipo  tipo de la guitarra que se busca
     * @return si encunetra una guitarra con estas características retorna la guitarra, sino retorna null
     * */
    public  Guitarra buscarPorTipo(Tipo tipo){
        Iterator<Guitarra> iterador = listaGuitarras.iterator();
        while (iterador.hasNext()) {
            Guitarra guitarra = iterador.next();
            if (guitarra.getTipo().equals(tipo)) {
                return guitarra;
            }
        }
        return null;
    }

    /**
     Metodo que busca una guitarra a partir de su fabricante
     * @param fabricante fabricante de la guitarra que se busca
     * @return si encunetra una guitarra con estas características retorna la guitarra, sino retorna null
     *
     * */
    public Guitarra buscarPorFabricante(String fabricante){
        Iterator<Guitarra> iterador = listaGuitarras.iterator();
        while (iterador.hasNext()) {
            Guitarra guitarra = iterador.next();
            if (guitarra.getFabricante().equals(fabricante)) {
                return guitarra;
            }
        }
        return null;
    }





}
