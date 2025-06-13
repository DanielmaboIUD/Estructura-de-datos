package terceraEntrega.EjerciciosListas;

import java.util.ArrayList;

public class listaSencilla {
    Nodo cabeza;

    public void agregarNodo(int dato){

        Nodo nodoNuevo = new Nodo(dato);
        
        if (cabeza == null) {
            cabeza = nodoNuevo;
        } else {
            Nodo actual = cabeza;
            while(actual.siguiente != null){
                actual = actual.siguiente;
            }
            actual.siguiente = nodoNuevo;
        }
    }

    public void mostrar(){
        Nodo actual = cabeza;

        while (actual != null){
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
        System.out.println("");
    }

    public ArrayList<Integer> obtenerValores() {
    ArrayList<Integer> valores = new ArrayList<>();
    Nodo actual = cabeza;
    while (actual != null) {
        valores.add(actual.dato);
        actual = actual.siguiente;
    }
    return valores;
}
}
