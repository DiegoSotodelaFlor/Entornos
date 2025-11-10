package poo;

public class sala {
private String nombre;
    private int capacidad;
    private boolean pizarra;
    private String tipo; // estudio, lectura o infantil
    private boolean disponible;

    public sala(String nombre, int capacidad, boolean pizarra, String tipo, boolean disponible) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.pizarra = pizarra;
        this.tipo = tipo;
        this.disponible = disponible;
    }

    public String getNombre(){
        return nombre;
    }

    public int getCapacidad(){
        return capacidad;
    }

    public boolean isPizarra(){
        return pizarra;
    }

    public String getTipo(){
        return tipo;
    }

    public boolean isDisponible(){
        return disponible;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }

    public void setPizarra(boolean pizarra){
        this.pizarra = pizarra;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    public void estaDisponible(){
        if(disponible){
            System.out.println("La sala "+nombre+" está disponible para su reserva.");
        } 
        else{
            System.out.println("La sala "+nombre+" no está disponible para su reserva.");
        }
    }

    public void tienePizarra(){
        if (pizarra) {
            System.out.println("La sala "+nombre+" dispone de pizarra.");
        } 
        else {
            System.out.println("La sala "+nombre+" no dispone de pizarra.");
        }
    }

    public void mostrarInformacion() {
        String textoPizarra=pizarra?"dispone de pizarra":"no dispone de pizarra";
        String textoDisponible=disponible?"está disponible para su reserva":"no está disponible para su reserva";

        System.out.println("Sala: "+nombre+", "+capacidad+" personas. Se utiliza para "+tipo+", "+textoPizarra+" y "+textoDisponible+".");
    }
}