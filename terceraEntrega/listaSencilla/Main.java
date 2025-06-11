package terceraEntrega.listaSencilla;
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido a la creación de listas.");

        int tamanoLista = Integer.parseInt(JOptionPane.showInputDialog("Cuántos números deseas agregar a la lista?"));


        for (int i = 0; i < tamanoLista; i++) {

            int valorNodo;
    
            do {
                valorNodo = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa los valores para la lista: "));

                    if(valorNodo < 0){
                    JOptionPane.showMessageDialog(null, "EL valor ingresado debe ser un número positivo, por favor ingrese el valor nuevamente");
                    
                    }       
               } while (valorNodo < 0);
            
        }
                
                    
    }
}
