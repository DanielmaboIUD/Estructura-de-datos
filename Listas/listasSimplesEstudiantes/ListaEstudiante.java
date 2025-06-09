package Listas.listasSimplesEstudiantes;

public class ListaEstudiante {
    NodoEstudiante cabeza;

    public void agregarEstudiante(Estudiante dato) {

        NodoEstudiante nuevoNodo = new NodoEstudiante(dato);

        // para el primer nodo
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoEstudiante actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public void mostrar() {
        NodoEstudiante actual = cabeza;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
        System.out.println("");
    }
}
