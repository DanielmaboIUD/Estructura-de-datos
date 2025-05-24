import javax.swing.JOptionPane;

public class bidimemcionales {
    public static void main(String[] args) {
        int tamanoMatriz = 3;

        int [][] matriz  = new int[tamanoMatriz][tamanoMatriz];

        int tamanoVector = Integer.parseInt(JOptionPane.showInputDialog("Por favor introduce los valores de las matriz: "));
        
        
        
        int [] vector = new int[tamanoVector];
        
        for (int i = 0; i < tamanoVector; i++) {
            
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa los valores para el vector: "));
            
            }

        for (int i = 0; i < tamanoMatriz; i++) {
            for (int j = 0; j < tamanoMatriz; j++) {
                JOptionPane.showInputDialog("Por Favor introduce los valores de las matriz: ");
            }
            
        }


    }
}
