package poo;

public class libro {
    private String titulo;
    private String isbn;
    private String editorial;
    private String idioma;
    private int numPaginas;
    private int anyo;
    private boolean disponible;

    public libro(String titulo, String isbn, String editorial, String idioma, int numPaginas, int anyo, boolean disponible) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
        this.idioma = idioma;
        this.numPaginas = numPaginas;
        this.anyo = anyo;
        this.disponible = disponible;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getIsbn(){
        return isbn;
    }
    public String getEditorial(){
        return editorial;
    }
    public String getIdioma(){
        return idioma;
    }
    public int getNumPaginas(){
        return numPaginas;
    }
    public int getAnio(){
        return anyo;
    }
    public boolean getDisponible(){
        return disponible;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setIsbn(String isbn){
        this.isbn=isbn;
    }
    public void setEditorial(String editorial){
        this.editorial=editorial;
    }
    public void setIdioma(String idioma){
        this.idioma=idioma;
    }
    public void setNumPaginas(int numPaginas){
        this.numPaginas=numPaginas;
    }
    public void setAnio(int anyo){
        this.anyo=anyo;
    }
    public void setDisponible(boolean disponible){
        this.disponible=disponible;
    }

    public void estaDisponible(){
        if (disponible) {
            System.out.println("Esta disponible para reserva.");
        } else {
            System.out.println("No esta disponible para reserva.");
        }
    }

    public void esExtranjero(){
        if (!idioma.equalsIgnoreCase("español")) {
            System.out.println("Esta escrito en un idioma extranjero.");
        } else{
            System.out.println("Esta escrito en español.");
        }
    }
    
    public void mostrarInformacion() {
        String estado="";
        if(disponible){
            estado="Esta disponible";
        }
        else{
            estado="Esta disponible";
        }
        
        System.out.println("Libro: "+titulo+", "+editorial+","+anyo+", "+idioma+", "+numPaginas+" paginas, "+estado+".");
    }
    }
