package poo;

import java.util.ArrayList;
import java.util.List;

public class sala {
private String nombre;
    private int capacidad;
    private boolean pizarra;
    private String tipo;
    private boolean disponible;
    private List<persona> personas;
    private persona responsable;

    public sala(String nombre, int capacidad, boolean pizarra, String tipo, boolean disponible) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.pizarra = pizarra;
        this.tipo = tipo;
        this.disponible = disponible;
        this.personas=new ArrayList<persona>();
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

public void entrarPersona(persona p){
    if(personas.size()<this.capacidad){
        personas.add(p);
    }
    else System.out.println("La sala esta llena");
}

public void salirPersona(persona p){
    if(!personas.isEmpty()){
        personas.remove(p);
    }
    else System.out.println("la sala esta vacia");
}

    public void mostrarPersonas(){
        persona p;
        for(int i=0;i<personas.size();i++){
            p=personas.get(i);
            System.out.println(i+" Nombre: "+p.getNombre()+" Apellidos: "+p.getApellidos()+" Edad: "+p.getEdad()+" Email: "+p.getEmail());
        }
    }
    public int getPersonaSize(){
        return personas.size();
    }
    public void asignarResponsable(persona p){
        this.responsable=p;
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