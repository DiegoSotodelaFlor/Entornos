package poo;
public class Main {
    public static void main(String[] args) throws Exception {
       
        //personapoo
        PersonaPoo persona1=new PersonaPoo("Mbappe",26, "Calle larga","Perez", "34567823S","persona1@gmail.com","657483929","carpintero",20);
        PersonaPoo persona2=new PersonaPoo("Lamine",18,"","","","","","",0);
        persona1.mostrarInformacion();
        persona1.estaJubilado();
        persona2.estaJubilado();


        //libro
        libro libro1 = new libro("Harry Potter 1", "978-84-376-0494-7", "Sudamericana", "Español", 471, 1967, true);
        libro libro2 = new libro("Harry Potter 2", "978-0-7475-3269-9", "Bloomsbury", "Inglés", 223, 1997, false);
        libro1.mostrarInformacion();
        libro1.estaDisponible();
        libro1.esExtranjero();
        libro2.mostrarInformacion();
        libro2.estaDisponible();
        libro2.esExtranjero();

        //biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca El Puerto", "Av. del Ejército 10", 9, 18);
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