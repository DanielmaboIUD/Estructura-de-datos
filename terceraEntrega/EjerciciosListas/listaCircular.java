package terceraEntrega.EjerciciosListas;

import java.util.ArrayList;

public class listaCircular {

    Nodo cabeza, cola;

    public void agregarNodo(int dato){

        Nodo nodoNuevo = new Nodo(dato);
        
        if (cabeza == null) {
            cabeza = nodoNuevo;
            cola = nodoNuevo;
            cola.siguiente = cabeza;
        } else {
            cola.siguiente = nodoNuevo;
            nodoNuevo.siguiente = cabeza;
            cola = nodoNuevo;
        }
    }

    public void mostrar(int vueltas){

        if(cabeza == null){
            System.out.println("La lista no tiene valores para mostrar");

            return;
        }

        Nodo actual = cabeza;
        int contador = 0;

        do{
            System.out.println(actual.dato);
            actual = actual.siguiente;
            contador++;
        }while(actual != cabeza && contador < vueltas);
        System.out.println("");
    }

    public ArrayList<Integer> obtenerValores() {
    ArrayList<Integer> valores = new ArrayList<>();
    if (cabeza == null) return valores;

    Nodo actual = cabeza;
    do {
        valores.add(actual.dato);
        actual = actual.siguiente;
    } while (actual != cabeza);

    return valores;
}


}
