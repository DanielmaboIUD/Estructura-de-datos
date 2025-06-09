package Listas.ListasSimples;

public class Main {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        
        // Insertar nodos en la lista
        lista.insertarNodo(10);
        lista.insertarNodo(20);
        lista.insertarNodo(30);
        
        // Mostrar los elementos de la lista
        lista.mostrar();
    }
}
