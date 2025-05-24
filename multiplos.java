import java.util.Scanner;

public class multiplos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] multiplos={4,8,15,16,23,42};

        System.out.println("Ingrese el valor: ");

        int x = sc.nextInt();

        boolean encontrado = false;

        for (int numero : multiplos) {

            if (numero % x  == 0) {

                System.out.println("El número " + numero + " es múltiplo de " + x);

                encontrado = true;

            }
        }
        if (!encontrado) {
            
            System.out.println("El número " + x  + " no tiene múltiplos");        
        }
    }
}
