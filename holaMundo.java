import java.util.Scanner;

public class holaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola Mundo desde Java!");

        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Número " + (i + 1) + ":");
            numeros[i] = sc.nextInt();

        }    

    }
}
