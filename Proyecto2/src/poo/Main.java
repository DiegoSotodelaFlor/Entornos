package poo;
public class Main {
    public static void main(String[] args) throws Exception {
       
        //personapoo
        persona persona1=new usuario("Mbappe",26, "Calle larga","Perez", "34567823S","persona1@gmail.com","657483929","carpintero",20);
        persona persona2=new empleado("Lamine",18,"Calle Corta","Letran","34567890N","persona2@gmail.com","657338153","fontanero",0);
        persona1.mostrarInformacion();
    


        //libro
        librofisico libro1 = new librofisico("La vida de Asier", "978-84-376-0494-7", "Anaya", "Español", 1967, true, 60, "España");
        librodigital libro2 = new librodigital("La vida de Asier Segunda Parte", "978-0-7475-3269-9", "Ibrea", "Inglés",  1997, false,"pdf",20);
        libro2.mostrarInformacionDigital();
    

        //biblioteca
        biblioteca biblioteca = new biblioteca("Biblioteca Central", "Av. del Ejército 10", 9, 18);
        biblioteca.mostrarInformacion();
        biblioteca.buscarLibroPorTitulo("La vida de asier").mostrarInformacion();

        
        //sala
        sala sala1 = new salaEstudio("Sala de Estudio 1", 20, true, true);
        sala sala2 = new salaLectura("Sala Infantil", 15, false, false);
        sala1.mostrarInformacion();
  
    }
}