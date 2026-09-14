package taller1_poo;

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

    public String mostrarLibro() {//Metodo para mostrar detalles del libro
        System.out.print("Titulo: " + titulo);
        System.out.print("\nAutor: " + autor);
        System.out.print("\nNumero de páginas: " + numeroPaginas);
    }

    @Override
    public String toString() {
        return "Titulo: " +this.titulo+ ", Autor: " +this.autor+ ", Numero de páginas: " +this.numeroPaginas;
    }

}
