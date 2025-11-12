package poo;
public class Main {
    public static void main(String[] args) throws Exception {
       
        //personapoo
        persona persona1=new persona("Mbappe",26, "Calle larga","Perez", "34567823S","persona1@gmail.com","657483929","carpintero",20);
        persona persona2=new persona("Lamine",18,"Calle Corta","Letran","34567890N","persona2@gmail.com","657338153","fontanero",0);
        persona1.mostrarInformacion();
        persona1.estaJubilado();
        persona2.mostrarInformacion();
        persona2.estaJubilado();


        //libro
        libro libro1 = new libro("La vida de Asier", "978-84-376-0494-7", "Anaya", "Español", 471, 1967, true);
        libro libro2 = new libro("La vida de Asier Segunda Parte", "978-0-7475-3269-9", "Ibrea", "Inglés", 223, 1997, false);
        libro1.mostrarInformacion();
        libro1.estaDisponible();
        libro1.esExtranjero();
        libro2.mostrarInformacion();
        libro2.estaDisponible();
        libro2.esExtranjero();

        //biblioteca
        biblioteca biblioteca = new biblioteca("Biblioteca El Puerto", "Av. del Ejército 10", 9, 18);
        biblioteca.mostrarInformacion();
        biblioteca.estaAbierta(10); 
        biblioteca.estaAbierta(20);
        
        //sala
        sala sala1 = new sala("Sala de Estudio 1", 20, true, "estudio", true);
        sala sala2 = new sala("Sala Infantil", 15, false, "infantil", false);
        sala1.mostrarInformacion();
        sala1.estaDisponible();
        sala1.tienePizarra();
        sala2.mostrarInformacion();
        sala2.estaDisponible();
        sala2.tienePizarra();
    }
}