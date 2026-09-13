package taller1_poo;

public class Estudiante {
    String nombre;
    int edad;
    int curso;

    //Constructor por defecto
    public Estudiante(){
        nombre = "Nombre";
        edad = 18;
        curso = 1;
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

}
