package Model;

public class Person implements Printable {
    String name;
    String address;
    @Override
    public void print() {
        System.out.print("Nombre: "+getName()+" | Dirección: "+getAddress()+"\n");
    }

    Person(String name, String address){
        this.name=name;
        this.address=address;
    }

    public String getAddress() {
        return address;
    }


    public String getName() {
        return name;
    }

}
