package dci.ed;

public class Pila {
    // agregar los elementos que permiten implementar una Pila
    Nodo top =null;

    /*
     *  Método que permite agregar un elemento desde el frente de la pila
     */
    public void push(int valor){
        Nodo nodoNuevo= new Nodo(valor);
        nodoNuevo.siguiente=top;
        top=nodoNuevo;
    }

    /*
     *  Método que permite eliminar un elemento desde el frente de la pila
     */
    public void pop(){
        if ( top != null ) {
            top = top.siguiente;
        }else{
            throw new NullPointerException();
        }

    }
}
