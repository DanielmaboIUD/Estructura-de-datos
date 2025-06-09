package Listas.listasDobles.listasDoblesAplicadas;

public class Cliente {
    String nombre;
    String estado;
    int turno;
    Cliente siguiente, anterior;

   public Cliente(String nombre, int turno) {
       this.nombre = nombre;
       this.turno = turno;
       this.estado = "En espera";
       this.siguiente = null;
       this.anterior = null;
   }

   public void atender(){
         this.estado = "Atendido";
   }
}
