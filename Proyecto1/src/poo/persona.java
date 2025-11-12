package poo;

public class persona{
    /*definicion de atributos de la persona */
    private String nombre;
    private int edad;
    private String direccion;
    private String apellidos;
    private String DNI;
    private String email;
    private String telefono;
    private String profesion;
    private int añosdeexperiencia;
    //definicion del comportamiento de la persona

    public persona (String nombre, int edad,String direccion,String apellidos,String DNI,String email,String telefono,String profesion,int añosdeexperiencia){
        this.nombre=nombre;
        this.edad=edad;
        this.direccion=direccion;
        this.apellidos=apellidos;
        this.DNI=DNI;
        this.email=email;
        this.telefono=telefono;
        this.profesion=profesion;
        this.añosdeexperiencia=añosdeexperiencia;
    }
    public void mostrarInformacion(){
        System.out.println("Nombre: "+this.nombre+", edad: "+this.edad+", en la direccion: "+this.direccion+", apellidos: "+this.apellidos+", DNI: "+this.DNI+", email"+this.email+"telefono: "+this.telefono+"profesion: "+this.profesion);
        }

         public void setDireccion (String direccion){
            this.direccion=direccion;
        }
        public void setNombre (String nombre){
            this.nombre=nombre;
        }
    public void setEdad (int edad){
            this.edad=edad;
        }
    public void setApellidos (String apellidos){
            this.apellidos=apellidos;
        }
    public void setDNI (String DNI){
            this.DNI=DNI;
        }
    public void setEmail (String email){
            this.email=email;
        }
    public void setTelefono (String telefono){
            this.telefono=telefono;
        }
    public void setProfesion (String profesion){
            this.profesion=profesion;
        }
    public void setAñosdeExperiencia (int añosdeexperiencia){
            this.añosdeexperiencia=añosdeexperiencia;
        }
   public String getNombre(){
    return nombre;
}
public int  getEdad(){
    return edad;
}
public String getApellidos(){
    return this.apellidos;
}
public String getDNI(){
    return DNI;
}
public String getEmail(){
    return email;
}
public String getTelefono(){
    return telefono;
}
public String getProfesion(){
    return profesion;
}
public int getAñosdeExperiencia(){
    return añosdeexperiencia;
}
    public boolean estaJubilado(){
        if(this.edad>65){
            System.out.println("La persona en cuestion se encuentra en la jubilacion");
            return true;
        }
        else{
            if(this.edad>=18){
            System.out.println("La persona en cuestion esta en edad de trabajar");
            }
            else{
                System.out.println("La persona es menor y no puede trabajar");
            }
            return false;
        }
    }
}   