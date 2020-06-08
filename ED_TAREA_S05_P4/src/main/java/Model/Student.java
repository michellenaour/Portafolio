package Model;

public class Student extends Person{
    int id;

    Student(String name, String address,int id) {
        super(name, address);
        this.id=id;
    }

    public void print(){
        System.out.print("Estudiante: "+getName()+" | Id: "+getId()+" | Dirección: "+getAddress()+"\n");
    }

    public int getId() {
        return id;
    }
}
