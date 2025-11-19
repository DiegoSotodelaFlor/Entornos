package Entornos.Practica6;

import java.util.Date;

/*clase Persona
atributos: String dni, String nombre, Date fechaNacimiento. Todas privadas
métodos: public int getEdad()
 */
public class Persona {
    private String dni;
    private String nombre;
    private Date fechaNacimiento;
    private int edad;

    public Persona(String dni, String nombre, Date fechaNacimiento, int edad){
        this.dni=dni;
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;
        this.edad=edad;
    }
    public void setEdad (int edad){
            this.edad=edad;
        }
}
