package poo;

public class librofisico extends libro{
    private int numPaginas;
    private String ubicacion;
    public librofisico (String titulo, String isbn, String editorial, String idioma, int anyo, boolean disponible, int numPaginas, String ubicacion){
        super ( titulo,  isbn,  editorial,  idioma,  anyo,  disponible);
        this.numPaginas=numPaginas;
        this.ubicacion=ubicacion;
    }
    public void mostrarInformacionFisico(){
        mostrarInformacion();
        System.out.println(numPaginas+ubicacion);
    }
}
