public class Libro {
    String titulo;
    String autor;
    int numeroPaginas;

    //Constructor por defecto
    public Libro() {
        titulo = "Harry Potter";
        autor = "JK Rowling";
        numeroPaginas = 150;
    }

    //Constructor parametrizado
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }



}
