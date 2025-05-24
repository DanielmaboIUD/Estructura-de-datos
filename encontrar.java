import java.util.Scanner;

public class encontrar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int [10];
        for (int i = 0; i < numeros.length; i++) {
            int valor;
            do {
                System.out.println("Número " + (i + 1) + ":");
                valor = sc.nextInt();
                if(valor <1 || valor > 60){
                    System.out.println("EL número que ingresas debe estar en 1 y 60, ingrese el valor nuevamente");


                }
            } while (valor <1 || valor > 60);
            numeros [i] = valor;

        }

        System.out.println("Ingresa el númeor que deseas buscar: ");
            int buscar;
            buscar = sc.nextInt();
            boolean encontrado = false;
            for (int j = 0; j < numeros.length; j++) {
                
                if(buscar == numeros[j]){
                    System.out.println("El número " + buscar + " se encuentra en el arreglo" );
                    encontrado = true;
                };
            }

            if (!encontrado) {
                System.out.println("El número " + buscar + " no encontrado en el arreglo");
            }

    }
}
