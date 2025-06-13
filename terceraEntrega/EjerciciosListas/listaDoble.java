package terceraEntrega.EjerciciosListas;

import java.util.ArrayList;

public class listaDoble {
    NodoListaDoble cabeza, cola;

    public void insertarNodo(int dato) {
        NodoListaDoble nuevoNodo = new NodoListaDoble(dato);

        
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo; 
        } else {
            cola.siguiente = nuevoNodo; 
            nuevoNodo.anterior = cola; 
            cola = nuevoNodo; 
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
        NodoListaDoble actual = cabeza;
        while (actual != null) {
            valores.add(actual.dato);
            actual = actual.siguiente;
        }
        return valores;
    }

    public void eliminarDuplicados() {
    NodoListaDoble actual = cabeza;

    while (actual != null) {
        NodoListaDoble comparador = actual.siguiente;

        while (comparador != null) {
            if (actual.dato == comparador.dato) {
                if (comparador.anterior != null) {
                    comparador.anterior.siguiente = comparador.siguiente;
                }
                if (comparador.siguiente != null) {
                    comparador.siguiente.anterior = comparador.anterior;
                }
                if (comparador == cola) {
                    cola = comparador.anterior;
                }
            }
            comparador = comparador.siguiente;
        }

        actual = actual.siguiente;
    }
    }

    public void mostrarPrimos() {
    NodoListaDoble actual = cabeza;
    while (actual != null) {
        if (esPrimo(actual.dato)) {
            System.out.print(actual.dato + " ");
        }
        actual = actual.siguiente;
    }

    System.out.println();
    }

    private boolean esPrimo(int n) {
    if (n <= 1) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;

    for (int i = 3; i <= Math.sqrt(n); i += 2) {
        if (n % i == 0) return false;
    }

    return true;
    }

    public void mostrarPrimosHasta(int limite) {
    NodoListaDoble actual = cabeza;
    System.out.println("Primos menores o iguales a " + limite + ":");

    while (actual != null) {
        if (esPrimo(actual.dato) && actual.dato <= limite) {
            System.out.print(actual.dato + " ");
        }
        actual = actual.siguiente;
    }

    System.out.println();
}


    


}
