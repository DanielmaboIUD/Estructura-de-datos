package Listas.listasDobles.listasDoblesAplicadas.arrayList;

public class Cliente {
    private String nombre;
    private String cedula;

    public Cliente(String nombre, String cedula){
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCedula(){
        return cedula;
    }

    @Override
    public String toString(){
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                '}';
    }
}
