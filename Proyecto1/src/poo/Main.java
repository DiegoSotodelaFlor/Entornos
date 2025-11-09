package poo;
public class Main {
    public static void main(String[] args) throws Exception {
       

        PersonaPoo persona1=new PersonaPoo("Mbappe",26, "Calle larga","Perez", "34567823S","persona1@gmail.com","657483929","carpintero",20);
        PersonaPoo persona2=new PersonaPoo("Lamine",18,"","","","","","",0);

        persona1.mostrarInformacion();

        libro libro1 = new libro("Harry Potter 1", "978-84-376-0494-7", "Sudamericana", "Español", 471, 1967, true);
        libro libro2 = new libro("Harry Potter 2", "978-0-7475-3269-9", "Bloomsbury", "Inglés", 223, 1997, false);

        libro1.informacion();
        libro1.estaDisponible();
        libro1.esExtranjero();

        System.out.println();

        libro2.informacion();
        libro2.estaDisponible();
        libro2.esExtranjero();


                Biblioteca biblio = new Biblioteca("Biblioteca Central", "Av. Siempre Viva 742", 9, 18);

        biblio.informacion();
        biblio.estaAbierta(10); 
        biblio.estaAbierta(20); 
    }
}

    



