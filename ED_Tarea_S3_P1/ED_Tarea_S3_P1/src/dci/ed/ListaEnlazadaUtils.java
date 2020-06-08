package dci.ed;


import java.util.LinkedList;


public class ListaEnlazadaUtils {

    /* */
    public static void insertarOrdenado(LinkedList<Integer> lista, int valor) {
        if(lista.size()==0 ){
            lista.add(valor);
        }else{
            for(int i=0;i<lista.size() ;i++){
                if(lista.get(i)>valor){
                lista.add(i,valor);
                i=lista.size();
                }else if(i+1==lista.size()){
                lista.addLast(valor);
                i=lista.size();
                }
            }
        }

    }

    /* */
    public static void removerValoresMaximos(LinkedList<String> list, int N) {
        if(N<=0){
            list.clear();
        }else if(list.size()==0){

        }else {
            for(int elim=0; elim < N; elim++){
                String max = "-2147483648";
                int indexmax=-1;
                for(int i=0; i<list.size();i++){
                   if (max.compareTo(list.get(i))<0){
                        max=list.get(i);
                        indexmax=i;
                    }
                }
                list.remove(indexmax);
            }
        }

    }


    /* */
    public static boolean contieneSubsecuencia(LinkedList<Integer> one, LinkedList<Integer> two) {

        return  one.containsAll(two);
    }
}
