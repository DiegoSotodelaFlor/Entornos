package poo;
public class Main {
    public static void main(String[] args) throws Exception {
       
        //personapoo
        usuario persona1=new usuario("Mbappe",26, "Calle larga","Perez", "34567823S","persona1@gmail.com","657483929","carpintero",20);
        empleado persona2=new empleado("Lamine",18,"Calle Corta","Letran","34567890N","persona2@gmail.com","657338153","fontanero",0);
        persona1.mostrarInformacionUsuario();
        persona2.mostrarInformacionEmpleado();
    


        //libro
        librofisico libro1=new librofisico("La vida de Asier", "978-84-376-0494-7", "Anaya", "Español", 1967, true, 60, "España");
        librodigital libro2=new librodigital("La vida de Asier Segunda Parte", "978-0-7475-3269-9", "Ibrea", "Inglés",  1997, false,"pdf",20);
        libro1.mostrarInformacionFisico();
        libro2.mostrarInformacionDigital();
        //biblioteca
        biblioteca biblioteca=new biblioteca("Biblioteca Central", "Av. del Ejército 10", 9, 18);
        biblioteca.mostrarInformacion();
        biblioteca.asignarResponsable(sala1, persona1).mostrarInformacion();
         //sala
        salaEstudio sala1=new salaEstudio("Sala de Estudio 1", 20, true, true);
        salaLectura sala2=new salaLectura("Sala de Lectura 2", 15, false, false);
        salaInformatica sala3=new salaInformatica("Sala de Informatica 3", 10, false, true)
        sala1.mostrarInformacionEstudio();
        sala2.mostrarInformacionLectura();
        sala3.mostrarInformacionInformatica();

        

        
       
  
    }
}