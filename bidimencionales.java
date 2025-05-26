import javax.swing.JOptionPane;

public class bidimencionales {
    public static void main(String[] args) {
        //mostramos un mensaje de bienvenida
        JOptionPane.showMessageDialog(null, "Bienvenido a la calculadora de matrices y vectores");

  
        
        int tamanoVector = Integer.parseInt(JOptionPane.showInputDialog("Por favor indica el tamaño del vector: "));
        
        int [] vector = new int[tamanoVector];
        
        for (int i = 0; i < tamanoVector; i++) {

            int valor;
            do {
                valor = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa los valores para el vector: "));

                if(valor < 0){
                     JOptionPane.showMessageDialog(null, "EL valor ingresado debe ser un número positivo, por favor ingrese el valor nuevamente");
                }
            } while (valor < 0);
            vector[i] = valor;
        }   

        int tamanoMatriz1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor indica el tamaño de la matriz: "));
        
        int [][] matriz1  = new int[tamanoMatriz1][tamanoMatriz1];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Por Favor introduce los valores de las matriz: "));
            }
            
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("Vector:\n");
        for (int i = 0; i < vector.length; i++) {
            sb.append(vector[i]).append(" ");
        }
        sb.append("\nMatriz:\n");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                sb.append(matriz1[i][j]).append(" ");
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    
        boolean encontrado = false;
        int contador = 0;
        
         for (int v = 0; v < vector.length; v++) {
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[i].length; j++) {
                    if (matriz1[i][j] == vector[v]) {
                        JOptionPane.showMessageDialog(null, 
                            "El número " + vector[v] + " del vector (posición " + v + ") " +
                            "se encuentra en la matriz en la posición [" + i + "][" + j + "]");
                        encontrado = true;
                        contador++;
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(null,"Se encontraron " + contador + " coincidencias");

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se encontraron coincidencias entre el vector y la matriz");
        }

        JOptionPane.showMessageDialog(null, "Ahora vamos a multiplicar la matriz por un número que tú elijas");

        int escalar = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa el valor del escalar: "));

        int[][] matriz2 = new int[matriz1.length][matriz1.length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz2[i][j] = matriz1[i][j] * escalar;
            }
        }

        StringBuilder sb2 = new StringBuilder();
        sb2.append("Matriz multiplicada por ").append(escalar).append(":\n");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                sb2.append(matriz2[i][j]).append(" ");
            }
            sb2.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb2.toString());

                JOptionPane.showMessageDialog(null, "Ahora vamos a sumar la matriz 1 y la matriz 2 para genrar una nueva matriz");
        int[][] matrizSuma = new int[matriz1.length][matriz1.length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Matriz suma:\n");
        for (int i = 0; i < matrizSuma.length; i++) {
            for (int j = 0; j < matrizSuma[i].length; j++) {
                sb3.append(matrizSuma[i][j]).append(" ");
            }
            sb3.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb3.toString());
    }

}
