package dci.ed;

public class TesterBuscadorDeGuitarras {
    public static void main(String[] args) {

        Inventario inventarioGuitarStar = new Inventario();
        inicializarInventarioDeGuitarras(inventarioGuitarStar);

        Guitarra guitarra = inventarioGuitarStar.buscar("fender","stratocastor",
                Tipo.ELECTRICA, "Alder", "Alder");


        if(guitarra != null){
            System.out.println("Claudia, te podría gustar esta " + guitarra.getFabricante() +
                    " " + guitarra.getModelo() + " " + guitarra.getTipo() + " guitarra:\n " +
                    guitarra.getMaderaPosterior() + " madera posterior,\n " +
                    guitarra.getMaderaFrontal() + " madera frontal.\n Puedes tenerla por solo: $" +
                    guitarra.getPrecio() + "!");
        }else {
            System.out.println("Lo siento Claudia, no tenemos nada para ti.");
        }
    }

    private static void inicializarInventarioDeGuitarras(Inventario inventarioGuitarStar){
        inventarioGuitarStar.agregarGuitarra("V5693",1550.9, "fender",
                "stratocastor", Tipo.ELECTRICA, "Alder", "Alder");

    }


}
