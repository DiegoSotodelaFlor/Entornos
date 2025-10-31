package poo;

public class PersonaPoo {
    /*definicion de atributos de la persona */
    String nombre;
    int edad;
    String direccion;
    String apellidos;
    String DNI;
    String email;
    String telefono;
    String profesion;
    int añosdeexperiencia;
    //definicion del comportamiento de la persona

    public PersonaPoo (String nombre, int edad,String direccion,String apellidos,String DNI,String email,String telefono,String profesion,int añosdeexperiencia){
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
        System.out.println("Nombre: "+this.nombre+", edad: "+this.getEdad()+" y en la direccion: "+this.direccion);
        }
         public void setDireccion (String direccion){
            this.direccion=direccion;
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
    public void setAxosdeexperiencia (int añosdeexperiencia){
            this.añosdeexperiencia=añosdeexperiencia;
        }
    public boolean estajubilado(){
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
    