package taller1_poo;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

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

    //Getters & Setters
    public String getTitulo() {//Metodo get para leer el valor de un atributo
        return titulo;
    }
    public void setTitulo(String titulo) {//Metodo set para modificar el valor de un atributo
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }


    public void mostrarLibro() {//Metodo para mostrar detalles del libro
        System.out.println("Libro: "+titulo+", autor: "+autor+", paginas: "+numeroPaginas);
    }

    @Override //Notacion override para identificar que se esta escribiendo este metodo de una clase padre
    public String toString() {//Este metodo manda a imprimir los valores de los atributos de la clase
        return "Titulo: " +this.titulo+ ", Autor: " +this.autor+ ", Numero de páginas: " +this.numeroPaginas;
    }

}
