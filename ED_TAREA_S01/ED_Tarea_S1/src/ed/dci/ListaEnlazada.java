package ed.dci;

public class ListaEnlazada {
    // variables miembro de la clase Lista Enlazada
    Nodo cabeza = null;
    Nodo cola = null;

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
     *  Formato de salida: [1,2,3] o []
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

    public static void main(String[] args) {

    }

}
