package Entornos.Practica6;

import java.util.Date;

/*clase Estudiante
atributos: private boolean repetidor
método: public void inscribirse(Curso c):Matricula
 */
public class Estudiante extends Persona {
    private boolean repetidor;

    public Estudiante(String dni, String nombre, Date fechaNacimiento, int edad,boolean repetidor){
        super (dni, nombre,fechaNacimiento,edad);
        this.repetidor=repetidor;
    }
    public void inscribirse(Curso c){
        
    }
}
