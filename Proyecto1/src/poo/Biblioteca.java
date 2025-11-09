package poo;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    String nombre;
    String direccion;
    int horaApertura; //hora por defecto 9
    int horaCierre; //hora por defecto 22
List<libro> libros;
List<sala> salas;

    public Biblioteca (String nombre,String direccion, int horadeapertura, int horacierre){
        this.nombre=nombre;
        this.direccion=direccion;
        this.horaApertura=9;
        this.horaCierre=22;
        this.libros=new ArrayList<libro>();
        this.salas=new ArrayList<sala>();
    } 

     public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getHoraApertura() {
        return horaApertura;
    }

    public int getHoraCierre() {
        return horaCierre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setHoraApertura(int horaApertura) {
        this.horaApertura = horaApertura;
    }

    public void setHoraCierre(int horaCierre) {
        this.horaCierre = horaCierre;
    }
    //si esta abierta o no
    public void estaAbierta(int hora){
        if(hora>this.horaApertura && hora<this.horaCierre){
            System.out.println("La biblioteca esta abierta");
        }
        else{
            System.out.println("La biblioteca esta cerrada");
        }
    }
    //extranjero o no
    public void esExtranjero() {
        if (!pais.equalsIgnoreCase("España")) {
            System.out.println("La biblioteca " + nombre + " se encuentra en el extranjero (" + pais + ").");
        } else {
            System.out.println("La biblioteca " + nombre + " se encuentra en España.");
        }
    }
    //mostrar
        public void informacion() {
        System.out.println("Biblioteca: " + nombre + ", " + direccion +". Abierto de " + horaApertura + ":00 a " + horaCierre + ":00.");
    }

}

