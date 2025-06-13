package terceraEntrega.EjerciciosListas;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a la creación de listas.");

        listaSencilla listaSen = new listaSencilla();

        System.out.println("Cuántos números deseas agregar a la lista sencilla?");

        int tamanoListaSen = sc.nextInt();

        if (tamanoListaSen < 0) {

            System.out.println("EL valor ingresado debe ser un número positivo, por favor ingrese el valor nuevamente");
            
        } else {
            
            for (int i = 0; i < tamanoListaSen; i++) {
                
                int valorNodo = 0;

                do {
                    System.out.println("Por favor ingresa los valores para la lista sencilla en la posición: " + (i+1));

                    valorNodo = sc.nextInt();

                    if (valorNodo < 0) {
                        System.out.println("EL valor ingresado debe ser un número positivo, por favor ingrese el valor nuevamente");
                    }
                    listaSen.agregarNodo(valorNodo);
                } while (valorNodo < 0);

            }
            System.out.println("Los numeros ingresados en la lista sencilla son: ");

            listaSen.mostrar();

        }
        
        listaCircular listaCir = new listaCircular();

        System.out.println("Cuántos números deseas agregar a la lista Circular?");

        int tamanoListaCir = sc.nextInt();

        if (tamanoListaCir < 0) {

            System.out.println("EL valor ingresado debe ser un número positivo, por favor ingrese el valor nuevamente");
            
        } else {
            
            for (int i = 0; i < tamanoListaCir; i++) {
                
                int valorNodo = 0;

                do {
                    System.out.println("Por favor ingresa los valores para la lista circular en la posisción " + (i+1) );

                    valorNodo = sc.nextInt();

                    if (valorNodo < 0) {
                        System.out.println("EL valor ingresado debe ser un número positivo, por favor ingrese el valor nuevamente");
                    }
                    listaCir.agregarNodo(valorNodo);
                } while (valorNodo < 0);

            }

            System.out.println("Cuantas veces deseas iterar la lista circular? ");

            int vueltas = sc.nextInt();

            System.out.println("Los numeros ingresados a la lista circular son: ");

            listaCir.mostrar(vueltas);

    }

        // LISTA DOBLEMENTE ENLAZADA

        listaDoble listaDob = new listaDoble();

        for(int valor: listaSen.obtenerValores()){
        listaDob.insertarNodo(valor);
        }
 

        for(int valor: listaCir.obtenerValores()){
        listaDob.insertarNodo(valor);
        }

        System.out.println("Los valores de la lista doble fueron: ");
        listaDob.mostrar();

        //ORDENAR LOS VALORES 

        ArrayList<Integer> valoresOrdenados = listaDob.obtenerValores();
        Collections.sort(valoresOrdenados);

        listaDoble listaOrdenada = new listaDoble();

        for (int valor : valoresOrdenados) {
            listaOrdenada.insertarNodo(valor);
        }

        System.out.println("Lista doble ordenada ascendentemente:");
        listaOrdenada.mostrar();

        System.out.println("Los valores ordenados son: " + valoresOrdenados);

        // LISTA SIN DUPLICADOS

        listaDob.eliminarDuplicados();
        System.out.println("Lista sin duplicados:");

        // LISTA DE PRIMOS

        listaDob.mostrar();
            System.out.println("Números primos en la lista doble:");

        listaDob.mostrarPrimos();


        // LISTA PRIMOS COMPARADA
        
        System.out.print("Ingresa un número para ver primos menores o iguales a ese valor: ");
        int limite = sc.nextInt();

        listaDob.mostrarPrimosHasta(limite);



}
}
