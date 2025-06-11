package Listas.listasCirculares;

public class Main {
    public static void main(String[] args) {
        listaCircular lista = new listaCircular();

        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);

        System.out.println("Elementos de la lista circulñar: ");
        lista.mostrar(3);
    }
}
