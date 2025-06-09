package Listas.listasDobles;

public class Main {
    public static void main(String[] args) {
        ListaDoble listaDoble = new ListaDoble();
        
        // Insertar nodos en la lista doble
        listaDoble.insertarNodo(10);
        listaDoble.insertarNodo(20);
        listaDoble.insertarNodo(30);
        
        // Mostrar los elementos de la lista doble
        System.out.println("Elementos de la lista doble:");
        listaDoble.mostrar();
    }
}
