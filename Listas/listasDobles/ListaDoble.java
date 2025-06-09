package Listas.listasDobles;

public class ListaDoble {
    Nodo cabeza, cola;

    public void insertarNodo(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        // Para el primer nodo
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo; // Establecer cola para el primer nodo
        } else {
            cola.siguiente = nuevoNodo; // Enlazar el nodo anterior con el nuevo
            nuevoNodo.anterior = cola; // Establecer el nodo anterior
            cola = nuevoNodo; // Actualizar la cola al nuevo nodo
        }
    }

    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
        System.out.println("");
    }
}
