package poo;

public class libro {
    private String titulo;
    private String isbn;
    private String editorial;
    private String idioma;
    private int numPaginas;
    private int anio;
    private boolean disponible;

    public libro(String titulo, String isbn, String editorial, String idioma, int numPaginas, int anio, boolean disponible) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
        this.idioma = idioma;
        this.numPaginas = numPaginas;
        this.anio = anio;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getIdioma() {
        return idioma;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public int getAnio() {
        return anio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void estaDisponible() {
        if (disponible) {
            System.out.println("El libro \"" + titulo + "\" está disponible para reserva.");
        } else {
            System.out.println("El libro \"" + titulo + "\" no está disponible para reserva.");
        }
    }

    public void esExtranjero() {
        if (!idioma.equalsIgnoreCase("español")) {
            System.out.println("El libro " + titulo + " está escrito en un idioma extranjero (" + idioma + ").");
        } else {
            System.out.println("El libro " + titulo + " está escrito en español.");
        }
    }

    public void informacion() {
        String estado = disponible ? "Está disponible" : "No está disponible";
        System.out.println("Libro: " + titulo + ", " + editorial + "," + anio + ", " + idioma + ", " + numPaginas + " paginas, " + estado + ".");
    }

}
