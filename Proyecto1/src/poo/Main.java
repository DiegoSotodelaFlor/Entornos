package poo;
public class Main {
    public static void main(String[] args) throws Exception {
       

        PersonaPoo persona1=new PersonaPoo("Mbappe",26, "Calle larga","Perez", "34567823S","persona1@gmail.com","657483929","carpintero",20);
        PersonaPoo persona2=new PersonaPoo("Lamine",18,"","","","","","",0);
        persona1.setDireccion("Madrid,10");
        persona1.mostrarInformacion();



    }
}
