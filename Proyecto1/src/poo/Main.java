package poo;
public class Main {
    public static void main(String[] args) throws Exception {
       

        PersonaPoo persona1=new PersonaPoo("Mbappe",26);
        PersonaPoo persona2=new PersonaPoo("Lamine",18);

        persona1.setDireccion("Madrid,10");
        persona2.setDireccion("Barca, 10");

        persona1.mostrarInformacion();
        persona2.mostrarInformacion();



    }
}
