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

}
