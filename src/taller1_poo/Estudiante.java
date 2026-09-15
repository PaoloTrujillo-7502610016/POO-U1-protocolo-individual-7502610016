package taller1_poo;

public class Estudiante {
    String nombre;
    int edad;
    int curso;

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

    @Override//Notacion override para identificar que se esta escribiendo este metodo de una clase padre
    public String toString() {
        return "Nombre del estudiante: " +this.nombre+ ", edad: " +this.edad+ " años, curso: " +this.curso;
    }


}
