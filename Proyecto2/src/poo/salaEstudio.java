package poo;

public class salaEstudio extends sala {
    private int numMesas;
public salaEstudio (String nombre, int capacidad, boolean pizarra, boolean disponible){
    super (nombre, capacidad, pizarra, disponible);
this.numMesas=numMesas;
}
public void mostrarInformacionEstudio(){
    mostrarInformacion();
    System.out.println(numMesas);
}
}