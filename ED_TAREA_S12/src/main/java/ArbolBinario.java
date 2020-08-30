import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class ArbolBinario {

    protected Nodo root;

    /**
     * Creación de un árbol binario con un valor inicial.
     *
     * @param valor Valor inicial (Esta será la raíz).
     */
    ArbolBinario(int valor) {
        root = new Nodo(valor);
    }

    /**
     * Creación de un árbol binario sin valor inicial.
     */
    ArbolBinario() {
        root = null;
    }

    /**
     * Método recursivo que crea un nodo si el nodo es nulo o desiga a la derecha o izquierda del nodo actual (Según
     * orden numérico, de ser igual lo agrega a la derecha), un valor dado.
     *
     * @param actual Nodo actual en el que esta trabajando.
     * @param valor  Valor que tiene que agregar.
     * @return si el nodo es nulo, agrega uno con el valor, sino devuelve su mismo nodo (para no destruir el árbol)
     */
    private Nodo agregarNodo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        } else {
            if (valor < actual.valor) {
                actual.nodoIzquierdo = agregarNodo(actual.nodoIzquierdo, valor);
            } else {
                actual.nodoDerecho = agregarNodo(actual.nodoDerecho, valor);
            }
            return actual;
        }
    }

    /**
     * Método público que llama al método privado para que este agregue un nodo con el valor dado.
     *
     * @param value Valor a agregar.
     */
    public void agregar(int value) {
        root = agregarNodo(root, value);
    }

    /**
     * Si el nodo entregado tiene el valor entrega verdadero, sino y si tiene algún hijo, busca en sus hijos y en caso de
     * que nunguno se cumpla devueve falso.
     *
     * @param actual Nodo en el que trabaja.
     * @param valor  Valor que busca.
     * @return si se encuentra el valor en el nodo o en algun nodo se su sub-árbol.
     */
    private boolean buscarNodo(Nodo actual, int valor) {
        if (actual.valor == valor) {
            return true;
        } else if (actual.nodoDerecho != null || actual.nodoIzquierdo != null) {
            if (actual.nodoIzquierdo != null && valor < actual.valor) {
                return buscarNodo(actual.nodoIzquierdo, valor);
            }
            if (actual.nodoDerecho != null && valor > actual.valor) {
                return buscarNodo(actual.nodoDerecho, valor);
            }
            return false;
        } else {
            return false;
        }
    }

    /**
     * Método público que inicia el método privado y recursivo de busqueda.
     *
     * @param valor Valor a buscar.
     * @return Respuesta de la busqueda.
     */
    public boolean buscar(int valor) {
        if (root == null) {
            return false;
        } else {
            return buscarNodo(root, valor);
        }
    }

    /**
     * @param actual Nodo en el que se trabaja.
     * @param valor  Valor a eliminar.
     * @return
     */
    private Nodo eliminarNodo(Nodo actual, int valor) {
        if (actual == null) {
            throw new NullPointerException("Nodo no encontrado.");
        } else if (valor < actual.valor) {
            Nodo izquierdo = eliminarNodo(actual.nodoIzquierdo, valor);
            actual.nodoIzquierdo = izquierdo;
        } else if (valor > actual.valor) {
            Nodo derecho = eliminarNodo(actual.nodoDerecho, valor);
            actual.nodoDerecho = derecho;
        } else {
            Nodo aEliminar = actual;
            if (aEliminar.nodoDerecho == null) {
                actual = aEliminar.nodoIzquierdo;
            } else if (aEliminar.nodoIzquierdo == null) {
                actual = aEliminar.nodoDerecho;
            } else {
                aEliminar = reemplazarNodo(aEliminar);
            }
            aEliminar = null;
        }
        return actual;
    }

    private Nodo reemplazarNodo(Nodo aEliminar) {
        Nodo padre = aEliminar;
        Nodo hijoMayor = aEliminar.nodoIzquierdo;
        while (hijoMayor.nodoDerecho != null) {
            padre = hijoMayor;
            hijoMayor = hijoMayor.nodoDerecho;
        }
        aEliminar.valor = hijoMayor.valor;
        if (padre == aEliminar) {
            padre.nodoIzquierdo = hijoMayor.nodoIzquierdo;
        } else {
            padre.nodoDerecho = hijoMayor.nodoIzquierdo;
        }
        return hijoMayor;
    }

    /**
     * @param valor - Valor a eliminar.
     */
    public void eliminar(int valor) {
        if (root == null) {
            System.err.println("Árbol vacío");
        } else {
            root = eliminarNodo(root, valor);

        }
    }

    private Queue<Nodo> cola_preOrden(Nodo nodo, Queue<Nodo> cola) {
        if (nodo == null) {
            return cola;
        }
        cola.add(nodo);
        cola_preOrden(nodo.nodoIzquierdo, cola);
        cola_preOrden(nodo.nodoDerecho, cola);
        return cola;
    }

    public int N_valor_preOrden(int n) {
        Queue<Nodo> cola = new LinkedList<Nodo>();
        Queue<Nodo> preorden = cola_preOrden(root, cola);
        for (int i = 1; i < n; i++) {
            preorden.poll();
        }
        return preorden.poll().valor;
    }

    public boolean es_lleno() {
        return dos_o_cero_hijos(root);
    }

    private boolean dos_o_cero_hijos(Nodo nodo) {
        if (nodo == null) {
            return false;
        }
        if (nodo.nodoDerecho != null && nodo.nodoIzquierdo != null) {
            dos_o_cero_hijos(nodo.nodoIzquierdo);
            dos_o_cero_hijos(nodo.nodoDerecho);
        } else if (nodo.nodoIzquierdo != null) {
            return false;
        } else if (nodo.nodoDerecho != null) {
            return false;
        }
        return true;
    }

    public int obtener_nivel(int valor) {
        return obtener_nivel_nodo(root, valor, 0);
    }

    private int obtener_nivel_nodo(Nodo nodo, int valor, int contador) {
        if (nodo == null) {
            return 0;
        }
        if(nodo.valor==valor){return contador+1;}
        if(nodo.valor<valor){
            return obtener_nivel_nodo(nodo.nodoDerecho,valor,contador+1);
        }else{
            return obtener_nivel_nodo(nodo.nodoIzquierdo,valor,contador+1);
        }
    }

    private void helper(Vector<Integer> res, Nodo root, int d)
    {
        if (root == null)
            return;

        if (d == res.size())
            res.add(root.valor);

        else
            res.set(d, Math.max(res.get(d), root.valor));

        helper(res, root.nodoIzquierdo, d + 1);
        helper(res, root.nodoDerecho, d + 1);
    }

    private Vector<Integer> largestValues(Nodo root)
    {
        Vector<Integer> res = new Vector<>();
        helper(res, root, 0);
        return res;
    }

    public void Valor_mas_grande_por_nivel(){
        Vector<Integer> res = largestValues(root);
        for (int i = 0; i < res.size(); i++){
            System.out.print(res.get(i)+" ");
        }
    }



}
