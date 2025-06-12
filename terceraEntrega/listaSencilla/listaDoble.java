package terceraEntrega.listaSencilla;

import java.util.ArrayList;

public class listaDoble {
    NodoListaDoble cabeza, cola;

    public void insertarNodo(int dato) {
        NodoListaDoble nuevoNodo = new NodoListaDoble(dato);

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
        NodoListaDoble actual = cabeza;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
        System.out.println("");
    }

     public ArrayList<Integer> obtenerValores() {
    ArrayList<Integer> valores = new ArrayList<>();
    if (cabeza == null) return valores;

    NodoListaDoble actual = cabeza;
    do {
        valores.add(actual.dato);
        actual = actual.siguiente;
    } while (actual != cabeza);

    return valores;
}
}
