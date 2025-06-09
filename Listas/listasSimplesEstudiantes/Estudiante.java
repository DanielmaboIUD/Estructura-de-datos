package Listas.listasSimplesEstudiantes;

public class Estudiante {
    
    String nombre;
    int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString() {
        return
                "Nombre = " + nombre + ", edad = " + edad;
    }
}
