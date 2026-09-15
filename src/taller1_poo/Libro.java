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

    public void mostrarLibro() {//Metodo para mostrar detalles del libro
        System.out.println("Libro: "+titulo+", autor: "+autor+", paginas: "+numeroPaginas);
    }

    @Override //Notacion override para identificar que se esta escribiendo este metodo de una clase padre
    public String toString() {
        return "Titulo: " +this.titulo+ ", Autor: " +this.autor+ ", Numero de páginas: " +this.numeroPaginas;
    }

}
