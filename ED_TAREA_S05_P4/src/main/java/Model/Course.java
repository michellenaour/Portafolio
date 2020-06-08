package Model;

public class Course implements Printable{
    String name;
    int hours;

    public Course(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    public void print(){
        System.out.print("Nombre del Curso: "+getName()+" | Horas: "+getHours()+"\n");
    }
    public float getCredits(){
        return 0;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }
}
