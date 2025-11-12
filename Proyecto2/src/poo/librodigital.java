package poo;

public class librodigital extends libro{
    private String formato;
    private int tamanyoMB;
    public librodigital (String titulo, String isbn, String editorial, String idioma, int anyo, boolean disponible, String formato, int tamanyoMB){
        super ( titulo,  isbn,  editorial,  idioma,  anyo,  disponible);
        this.formato=formato;
        this.tamanyoMB=tamanyoMB;
    }
}
