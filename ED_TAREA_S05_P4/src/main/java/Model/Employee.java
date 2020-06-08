package Model;

public class Employee extends Person{
    int id;

    Employee(String name, String address, int id) {
        super(name, address);
        this.id=id;
    }



}
