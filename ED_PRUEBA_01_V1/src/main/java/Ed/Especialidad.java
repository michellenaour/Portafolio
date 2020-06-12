package Ed;

public enum Especialidad {

    BIOLOGIA("biología"),MATEMATICA("Matemática"), HISTORIA("historia");

     String asignatura;

    Especialidad(String asignatura) {
    }

    public String getAsignatura(){
         return asignatura;
     }
}
