package Listas.listasDobles.listasDoblesAplicadas.arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        Cliente cliente1 = new Cliente("Esteban", "1032569784");
        Cliente cliente2 = new Cliente("Karen", "1039566321");
        Cliente cliente3 = new Cliente("David", "1214897564");
        Cliente cliente4 = new Cliente("Mauricio", "1220658973");

        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        listaClientes.add(cliente4);

    }
}
