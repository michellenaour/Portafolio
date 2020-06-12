package dci.ed;

public class Cola {
    // agregar los elementos que permiten implementar una Cola
    Nodo rear =null;
    Nodo front= null;


    /*
     *  Método que permite agregar al final de la rear
     */
    public void agregarEnCola(int valor){
        Nodo nodoNuevo= new Nodo(valor);
        if (rear==null){
            front=nodoNuevo;
        }else {
            rear.siguiente=nodoNuevo;}
        rear=nodoNuevo;
    }

    /*
     *  Método que permite remover desde el frente de la rear
     */
    public void removerDesdeFrente(){
        if ( front!= null ) {
            front =front.siguiente;
        }else if ( front == null ) {
            rear = null;
            throw new NullPointerException();
        }


    }

}
