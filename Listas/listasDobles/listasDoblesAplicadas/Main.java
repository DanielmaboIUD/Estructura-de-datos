package Listas.listasDobles.listasDoblesAplicadas;

public class Main {
    public static void main(String[] args) {
        ClienteFilas fila = new ClienteFilas();
        
        // Agregar clientes a la fila
        fila.agregarCliente("Alice");
        fila.agregarCliente("Bob");
        fila.agregarCliente("Charlie");
        fila.agregarCliente("Diana");
        fila.mostrarTurnos();
        // Atender al siguiente cliente
        fila.atenderSiguiente();
        fila.atenderSiguiente();

        fila.mostrarTurnos();
    }
}
