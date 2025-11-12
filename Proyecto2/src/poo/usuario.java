package poo;

import java.util.ArrayList;
import java.util.List;

public class usuario extends persona {
    private String numSocio;
    private List<libro> ListaLibrosPrestados;
     public usuario (String nombre, int edad,String direccion,String apellidos,String DNI,String email,String telefono,String profesion,int añosdeexperiencia){
    super(nombre, edad, direccion, apellidos, DNI, email, telefono, profesion, añosdeexperiencia);
    this.numSocio=numSocio;
    this.ListaLibrosPrestados=new ArrayList<libro>();
}
public void mostrarInformacionUsuario(){
        mostrarInformacion();
        System.out.println(numSocio+ListaLibrosPrestados);
}
}