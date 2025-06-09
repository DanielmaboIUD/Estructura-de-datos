package Listas.listasDobles.listasDoblesAplicadas;

public class ClienteFilas {
    Cliente cabeza, cola;
    int turno = 1;
   
    public void agregarCliente(String nombre) {
        Cliente nuevoCliente = new Cliente(nombre, turno++); // Crear un nuevo cliente con el turno incrementado

        // Para el primer cliente
        if (cabeza == null) {
            cabeza = nuevoCliente;
            cola = nuevoCliente; // Establecer cola para el primer cliente
        } else {
            cola.siguiente = nuevoCliente; // Enlazar el cliente anterior con el nuevo
            nuevoCliente.anterior = cola; // Establecer el cliente anterior
            cola = nuevoCliente; // Actualizar la cola al nuevo cliente
        }
        System.out.println("Cliente agregado: " + nombre + " con turno " + nuevoCliente.turno);
    }

    public void mostrarTurnos() {
        System.out.println("Lista de turnos: ");
        Cliente actual = cabeza;
        while (actual != null) {
            System.out.println("Turno: "+actual.turno+", Nombre: " + actual.nombre + ", Estado: " + actual.estado);
            actual = actual.siguiente;
        }
    }
    public void atenderSiguiente() {
        Cliente actual = cabeza;
        while(actual != null){
            if (actual.estado.equals("En espera")) {
                actual.atender(); // Cambiar el estado del cliente a "Atendido"
                System.out.println("Turno " + actual.turno + ", nombre" + actual.nombre + " ha sido atendido.");
                return; // Salir del método después de atender al primer cliente en espera
            }
            actual = actual.siguiente; // Avanzar al siguiente cliente
        }
        System.out.println("No hay clientes en espera.");
    }
}
