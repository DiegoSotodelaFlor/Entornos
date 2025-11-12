package poo;

public class empleado extends persona {
    private String puesto;
    private double sueldo;
    public empleado (String nombre, int edad,String direccion,String apellidos,String DNI,String email,String telefono,String profesion,int añosdeexperiencia){
        super(nombre, edad, direccion, apellidos, DNI, email, telefono, profesion, añosdeexperiencia);
        this.puesto=puesto;
        this.sueldo=sueldo;
}
public void mostrarInformacionEmpleado(){
        mostrarInformacion();
        System.out.println(puesto+sueldo);
}
}