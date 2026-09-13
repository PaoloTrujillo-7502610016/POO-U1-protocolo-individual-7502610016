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

    //Constructor parametrizado
    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }



    //Constructor parametrizado y uso de this()
    public Estudiante(int curso){
        this.curso = curso;
    }
    public Estudiante(String nombre, int edad, int curso){
        this.nombre = nombre;
        this.edad = edad;
        this(curso);//llama al constructor con el parámetro curso
    }

}
