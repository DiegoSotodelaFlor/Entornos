package poo;

import java.util.ArrayList;
import java.util.List;

public class biblioteca {
    private  String nombre;
    private String direccion;
    private int horaapertura; //hora por defecto 9
    private int horacierre; //hora por defecto 22
    private List<libro> libros;
    private List<sala> salas;

    public biblioteca (String nombre,String direccion, int horadeapertura, int horacierre){
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

    public void addLibro(libro l){
        libros.add(l);
    }
    public void removeLibro(libro l){
        libros.remove(l);
    }
    public void addSala(sala s){
        salas.add(s);
    }
    public void removeSala(sala s){
        salas.remove(s);
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
    public void esExtranjero(String pais){
        if(!pais.equalsIgnoreCase("España")){
            System.out.println("El libro es extranjero ("+pais+").");
        } 
        else{
            System.out.println("El libro es español.");
        }
    }
    //mostrar libros
    public void mostrarLibros(){
        //variable temporal que almacena 1 libro
        libro libroa;
        //bucle que se ejecutara dependiendo del numero de libros que haya
        for(int i=0;i<libros.size();i++){
            //establecer la variable de libro con el libro en la posicion i
            libroa=libros.get(i);
            libroa.mostrarInformacion();
        }
    }
        //mostrar salas
        public void mostrarSalas(){
        //variable temporal que almacena 1 sala
        sala salaa;
        //bucle que se ejecutara dependiendo del numero de salas que haya
        for(int i=0;i<salas.size();i++){
            //establecer la variable de libro con el libro en la posicion i
            salaa=salas.get(i);
            salaa.mostrarInformacion();
        }
    }

    //mostrar salas libres
    public void mostrarSalasDisponibles(){
        sala s;
        int j=1;
        for(int i=0;i<salas.size();i++){
            s=salas.get(i);
            if(s.getPersonaSize()==0){
                System.out.print(j+ " ");
                s.mostrarInformacion();
                j++;
            }
        }
    }
    public void personasTotales(){
        int persona=0;
        for(sala s:salas){
            persona+=s.getPersonaSize();
        }
        System.out.println("Hay "+persona+" persona/s");
    }
    //buscar libro
    public libro buscarLibroPorTitulo(String titulo) {
        for (libro l : libros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l; 
            }
        }
        return null;
    }
    //mostrar
        public void mostrarInformacion(){
        System.out.println("Biblioteca: "+nombre+", "+direccion+". Abierto de "+horaapertura+":00 a "+horacierre+":00.");
    }
}