package Taller1;

public class Libro {
    private String titulo;
    private String autor;
    private int nrmPaginas;

    //CONSTRUCTORES

    public Libro(){
        titulo="Sin titulo";
        autor="Sin autor";
        nrmPaginas=0;
    }
    public Libro(String titulo, String autor, int nrmPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.nrmPaginas = nrmPaginas;
    }
    //GETTERS Y SETTERS
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getNrmPaginas() {
        return nrmPaginas;
    }

    //METODOS

    public void mostrarDetallesLibro(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("NRM paginas: " + getNrmPaginas());

    }

}
