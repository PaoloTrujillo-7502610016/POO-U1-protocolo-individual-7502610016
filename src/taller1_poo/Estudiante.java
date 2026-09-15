package taller1_poo;

public class Estudiante {
    private String nombre;
    private int edad;
    private int curso;

    //Constructor por defecto
    public Estudiante(){
        nombre = "Paolo Trujillo";
        edad = 32;
        curso = 2;
    }

    //Constructor parametrizado con nombre y edad
    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //Constructor parametrizado y uso de this()
    public Estudiante(String nombre, int edad, int curso){
        this(nombre, edad);//llama al constructor anterior con los parametros nombre, edad
        this.curso = curso;
    }

    //Getters & Setters
    public String getNombre() {//Metodo get para leer un valor de un atributo
        return nombre;
    }
    public void setNombre(String nombre) {//Metodo set para modificar el valor de un atributo
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getCurso() {
        return curso;
    }
    public void setCurso(int curso) {
        this.curso = curso;
    }


    @Override//Notacion override para identificar que se esta escribiendo este metodo de una clase padre
    public String toString() {//Este metodo manda a imprimir los valores de los atributos de la clase
        return "Nombre del estudiante: " +this.nombre+ ", edad: " +this.edad+ " años, curso: " +this.curso;
    }


}
