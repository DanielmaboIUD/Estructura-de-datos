package terceraEntrega.listaSencilla;

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

        while (actuaL != null){
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
        System.out.println("");
    }
}
