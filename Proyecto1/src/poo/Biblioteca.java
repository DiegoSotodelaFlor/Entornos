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

