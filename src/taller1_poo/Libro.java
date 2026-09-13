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
    Libro libro1 = new Libro();//Instancia de la clase taller1_poo.Libro, utilizando constructor por defecto

    //Constructor parametrizado
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    Libro libro2 = new Libro(//Instancia de la clase libro, utilizando constructor parametrizado
            "Cien años de soledad",
            "Gabriel Garcia Marquez",
            200
    );

    public void mostrarLibro() {//Metodo para mostrar detalles del libro
        System.out.println("Titulo: " + titulo);
        System.out.println("\nAutor: " + autor);
        System.out.println("\nNumero de páginas: " + numeroPaginas);
    }
}
