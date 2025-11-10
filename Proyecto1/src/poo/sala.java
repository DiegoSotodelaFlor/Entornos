package poo;

public class sala {
private String nombre;
    private int capacidad;
    private boolean pizarra;
    private String tipo;
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
        this.nombre=nombre;
    }
    public void setCapacidad(int capacidad){
        this.capacidad=capacidad;
    }
    public void setPizarra(boolean pizarra){
        this.pizarra=pizarra;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public void setDisponible(boolean disponible){
        this.disponible=disponible;
    }

    public void estaDisponible(){
        if(disponible){
            System.out.println("Esta disponible para su reserva.");
        } 
        else{
            System.out.println("No esta disponible para su reserva.");
        }
    }

    public void tienePizarra(){
        if (pizarra) {
            System.out.println("Tiene pizarra.");
        } 
        else {
            System.out.println("No tiene pizarra.");
        }
    }

    public void mostrarInformacion() {
        String textoPizarra="";
        String textoDisponible="";
        if(pizarra){
            textoPizarra="tiene pizarra";
        }
        else{
            textoPizarra="no tiene pizarra";
        }

        if(disponible){
            textoDisponible="esta disponible para reserva";
        }
        else{
            textoDisponible="no esta disponible para reserva";
        }
        System.out.println("Sala: "+nombre+", "+capacidad+" personas. Se utiliza para "+tipo+", "+textoPizarra+" y "+textoDisponible+".");
    }
}