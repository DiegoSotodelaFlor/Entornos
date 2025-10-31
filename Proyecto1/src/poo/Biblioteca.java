package poo;


public class Biblioteca {
    String nombre;
    String direccion;
    int horaapertura; //hora por defecto 9
    int horacierre; //hora por defecto 22

    public Biblioteca (String nombre,String direccion){
        this.nombre=nombre;
        this.direccion=direccion;
        this.horaapertura=9;
        this.horacierre=22;
    } 
    //si esta abierta o no
    public void estaAbierta(int hora){
        if(hora>this.horaapertura && hora<this.horacierre){
            System.out.println("La biblioteca esta abierta");
        }
        else{
            System.out.println("La biblioteca esta cerrada");
        }
    }
}
