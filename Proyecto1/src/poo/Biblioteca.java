package poo;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    String nombre;
    String direccion;
    int horaapertura; //hora por defecto 9
    int horacierre; //hora por defecto 22
    List<libro> libros;
    List<sala> salas;

    public Biblioteca (String nombre,String direccion, int horadeapertura, int horacierre){
        this.nombre=nombre;
        this.direccion=direccion;
        this.horaapertura=9;
        this.horacierre=22;
        this.libros=new ArrayList<libro>();
        this.salas=new ArrayList<sala>();
    } 

     public String getNombre(){
        return nombre;
    }

    public String getDireccion(){
        return direccion;
    }

    public int getHoraApertura(){
        return horaapertura;
    }

    public int getHoraCierre(){
        return horacierre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setDireccion(String direccion){
        this.direccion=direccion;
    }

    public void setHoraApertura(int horaapertura){
        this.horaapertura=horaapertura;
    }

    public void setHoraCierre(int horacierre){
        this.horacierre=horacierre;
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
    //extranjero o no
    //preguntar azahara
    /*public void esExtranjero(String pais){
        if(!pais.equalsIgnoreCase("España")){
            System.out.println("El libro " + nombre + " es extranjero (" + pais + ").");
        } 
        else{
            System.out.println("El libro " + nombre + " es español.");
        }
    }*/
    //mostrar
        public void mostrarInformacion(){
        System.out.println("Biblioteca: "+nombre+", "+direccion+". Abierto de "+horaapertura+":00 a "+horacierre+":00.");
    }
}