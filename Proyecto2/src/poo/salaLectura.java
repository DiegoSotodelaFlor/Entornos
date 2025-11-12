package poo;
import java.util.ArrayList;
import java.util.List;
public class salaLectura extends sala {
    private List<libro> listaLibros;
    public salaLectura (String nombre, int capacidad, boolean pizarra, boolean disponible){
        super (nombre, capacidad, pizarra, disponible);
        this.listaLibros=new ArrayList<libro>();
    }
    public void mostrarInformacionLectura(){
    mostrarInformacion();
    System.out.println(listaLibros);
}
}