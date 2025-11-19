package Entornos.Practica6;

import java.util.Date;

/*clase Profesor
atributos: private double salario
método: public void asignarCurso(Curso c)
 */
public class Profesor extends Persona {
    private double salario;
    public Profesor(String dni, String nombre, Date fechaNacimiento, int edad,double salario){
        super (dni, nombre,fechaNacimiento,edad);
        this.salario=salario;
    }
    
    
    public void asignarCurso(Curso c){
        
    }
}
