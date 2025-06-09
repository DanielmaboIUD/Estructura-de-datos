package Listas.ListasSimples;

public class ListaSimple{
    Nodo cabeza;

    public void insertarNodo(int dato){

        Nodo nuevoNodo = new Nodo(dato);

        //para el primer nodo
         if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public void mostrar(){
        Nodo actual = cabeza;
            while(actual != null){
                System.out.println(actual.dato);
                actual = actual.siguiente;
            }
            System.out.println("");

    }
}