package Listas.listasDobles;

public class Nodo {

    int dato;
    Nodo siguiente, anterior;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}