package Listas.listasSimplesEstudiantes;

public class Main {
    public static void main(String[] args) {
        ListaEstudiante lista = new ListaEstudiante();

        Estudiante estudiante1 = new Estudiante("Daniel", 34);

        // Agregar estudiantes
        lista.agregarEstudiante(new Estudiante("Oliver", 11));
        lista.agregarEstudiante(new Estudiante("Ana", 22));
        lista.agregarEstudiante(new Estudiante("Luis", 21));

        System.out.println("Lista de estudiantes: ");

        // Mostrar la lista de estudiantes
        lista.mostrar();
    }
}
