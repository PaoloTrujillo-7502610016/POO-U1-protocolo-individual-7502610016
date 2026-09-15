package taller1_poo;

import taller1_poo.Libro;
import taller1_poo.CuentaBancaria;
import taller1_poo.Estudiante;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("** Inicio del Programa **\n");

        //Creacion de objetos
        System.out.println("1. Objetos de las clases con constructor predeterminado:\n");

        //Instancia de las clases con constructor predeterminado.
        Libro libro1 = new Libro();
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria();
        Estudiante estudiante1 = new Estudiante();

        libro1.mostrarLibro();//Metodo de la clase Libro que muestra en pantalla los detalles del libro1
        System.out.println("Cuenta bancaria: "+cuentaBancaria1.getNumeroCuenta()+", saldo: $"+cuentaBancaria1.getSaldo()+", tipo de cuenta: "+cuentaBancaria1.getTipoCuenta());
        System.out.println("Estudiante: "+estudiante1.getNombre()+", edad: "+estudiante1.getEdad()+" años, curso: "+estudiante1.getCurso());
        //Se utiliza el metodo get para leer el valor del atributo de la instancia.

        //Inicializacion de objetos con entrada de datos.
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n2. Objetos de las clases con entrada de datos. Ingrese los siguientes datos:\n");

            //Instancia de la clase Libro
        System.out.print("Ingrese el titulo del libro: ");
        String titulo = entrada.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = entrada.nextLine();
        System.out.print("Ingrese el numero de páginas: ");
        int numeroPaginas = entrada.nextInt();
        Libro libro2 = new Libro(titulo, autor, numeroPaginas);//Instancia de la clase libro con datos de entrada asignados a sus parámetros.

        //Instancia de la clase CuentaBancaria
        System.out.print("\nIngrese el numero de cuenta: ");
        int numeroCuenta = entrada.nextInt();
        System.out.print("Ingrese el tipo de cuenta: ");
        String tipoCuenta = entrada.next();
        System.out.print("Ingrese el saldo de la cuenta: ");
        double saldo = entrada.nextDouble();
        CuentaBancaria cuentaBancaria2 = new CuentaBancaria(tipoCuenta, numeroCuenta, saldo);//Instancia de la clase cuantaBancaria con datos de entrada asignados a sus parámetros.

        //Instancia de la clase Estudiante
        System.out.print("\nIngrese el nombre del estudiante: ");
        String nombre = entrada.next();
        System.out.print("Ingrese la edad del estudiante: ");
        int edad = entrada.nextInt();
        System.out.print("Ingrese el curso del estudiante: ");
        int curso = entrada.nextInt();
        Estudiante estudiante2 = new Estudiante(nombre, edad, curso);//Instancia de la clase Estudiante con datos de entrada asignados a sus parámetros.
        entrada.close();

        System.out.println("\nLos datos ingresados son:");
        System.out.println("Libro: "+libro2.getTitulo()+", autor: "+libro2.getAutor()+", paginas: "+libro2.getNumeroPaginas());
        System.out.println("Cuenta: "+cuentaBancaria2.getNumeroCuenta()+", tipo de cuenta: "+cuentaBancaria2.getTipoCuenta()+", saldo: $"+cuentaBancaria2.getSaldo());
        System.out.println("Estudiante: "+estudiante2.getNombre()+", edad: "+estudiante2.getEdad()+" años, curso: "+estudiante2.getCurso());

        //Detalles de los objetos con toString():
        System.out.println("\n3. Detalle de los objetos con el metodo toString:\n");
        System.out.println("Libro: "+libro1);
        System.out.println("Cuenta Bancaria: "+cuentaBancaria1);
        System.out.println("Estudiante: "+estudiante1);

    }
}
