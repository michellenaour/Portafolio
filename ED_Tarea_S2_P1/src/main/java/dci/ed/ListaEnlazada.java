package dci.ed;

public class ListaEnlazada {

    Nodo cabeza = null;
    Nodo cola = null;

    /*
     *  Método que permite si un valor particular
     *  existe en la Lista Enlazada
     */
    public boolean contiene(int valor){
        Nodo actual=cabeza;
        if(cabeza!=null){
            while (actual != null){
                if ( actual.valor == valor ) {
                    return true;
                }
                actual = actual.siguiente;}
        }

        return false;
    }

    /*
     *  Método que permite obtener un valor determinado
     *  en una posición específica de una la Lista Enlazada
     */
    public int getPorIndice(int index){
        if(cabeza==null){
            throw new NullPointerException();
        }else{
            if ( index < 0 ) {
                throw new IndexOutOfBoundsException();
            } else {
                Nodo actual = cabeza;
                for ( int i = 0; i < index; i++ ) {
                    if ( actual == null || actual.siguiente == null ) {
                        throw new IndexOutOfBoundsException();
                    }
                    actual = actual.siguiente;
                }
            return actual.valor;
        }}
    }

    /*
     *  Método que permite remover un valor
     *  desde el frente de una la Lista Enlazada
     */
    public void removerDesdeFrente(){
        if ( cabeza != null ) {
            cabeza = cabeza.siguiente;
        }
        if ( cabeza == null ) {
            cola = null;
            throw new NullPointerException();
        }

    }

    /*
     *  Método que permite remover un valor
     *  desde la rear una la Lista Enlazada
     */
    public void removerDesdeCola(){
        if ( cabeza == null ) { // Lista vacía
            throw new NullPointerException();
        } else if ( cabeza.equals(cola) ) { // sólo un elemento en la lista
            cabeza = null;
            cola = null;
        } else {
            Nodo actual = cabeza;
            while ( actual.siguiente != cola ) {
                actual = actual.siguiente;
            }
            cola = actual;
            actual.siguiente = null;
        }


    }

    /*
     *  Método que permite remover un valor determinado
     *  en una posición específica de una la Lista Enlazada
     */
    public void removerEnIndice(int index){
        if(index<0){
            throw new IndexOutOfBoundsException();
        }else if(cabeza==null){
            throw new NullPointerException();
        }else if(index==0){
            removerDesdeFrente();
        }else{
            Nodo actual = cabeza;
            for(int i =0; i<index;i++){
                if ( actual == null || actual.siguiente == null ) {
                    throw new IndexOutOfBoundsException();
                }
                actual.siguiente=actual.siguiente.siguiente;
            }
        }

    }

    /*
     *  Método que permite agregar un elemento
     *  al frente de la Lista Enlazada
     */
    public void agregarFrente(int valor){
        Nodo nodoNuevo= new Nodo(valor);
        nodoNuevo.siguiente=cabeza;
        cabeza=nodoNuevo;
        if(nodoNuevo .siguiente==null){cola=nodoNuevo;}

    }

    /*
     *  Método que permite agregar un elemento
     *  al final la Lista Enlazada
     */
    public void agregarFinal(int valor){
        Nodo nodoNuevo= new Nodo(valor);
        if (cola==null){
            cabeza=nodoNuevo;
        }else {
            cola.siguiente=nodoNuevo;}
        cola=nodoNuevo;
    }

    /*
     *  Método que permite agregar un elemento
     *  en un índice específico de la Lista Enlazada
     */
    public void agregarEnIndice(int index, int valor){
        if(index<0){
            throw new IndexOutOfBoundsException();
        } else if(index==0){
            agregarFrente(valor);
        } else {
            Nodo nodoNuevo= new Nodo(valor);
            Nodo actual=cabeza;
            for(int i=0;i<index-1;i++) {
                if (actual==null){ throw new IndexOutOfBoundsException();
                }
                actual=actual.siguiente;
            }
            if(actual.siguiente==null){
                agregarFinal(valor);
            } else {
                nodoNuevo.siguiente=actual.siguiente;
                actual.siguiente=nodoNuevo;}

        }
    }

    /*
     *  Método que permite imprimir los elementos
     *  de la Lista Enlazada
     */
    public void imprimirLista(ListaEnlazada nombreLista){
        Nodo actual=cabeza;
        System.out.print("[");

        if(cabeza!=null){
            do{
                System.out.print(actual.valor);
                if(actual.siguiente!=null){System.out.print(",");}
                actual=actual.siguiente;
            } while(actual!=null);
        }

        System.out.print("] ");
    }

}
