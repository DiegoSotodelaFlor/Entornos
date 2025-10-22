package poo;

public class PersonaPoo {
    /*definicion de atributos de la persona */
    String nombre;
    int edad;
    String direccion;
    //definicion del comportamiento de la persona

    public PersonaPoo (String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public void mostrarInformacion(){
        System.out.println("Nombre: "+this.nombre+", edad: "+this.getEdad()+" y en la direccion: "+this.direccion);
        }
         public void setDireccion (String direccion){
            this.direccion=direccion;}
    

    private int getEdad (){
        return this.edad;
    }
}
