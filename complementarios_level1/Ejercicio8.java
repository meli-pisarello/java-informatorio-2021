package complementarios_level1;

import java.util.Scanner;

class Ejercicio8 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Persona p = new Persona();

    System.out.println("Nombre y Apellido:");
    p.nombre = scan.nextLine();

    System.out.println("Edad:");
    p.edad = scan.nextLine();

    System.out.println("Dirección:");
    p.direccion = scan.nextLine();

    System.out.println("Ciudad:");
    p.ciudad = scan.nextLine();

    System.out.println(p);

    scan.close();
  }
}

class Persona {
  String nombre;
  String edad;
  String direccion;
  String ciudad;

  public String toString() {
    return String.format("%s - %s - %s - %s", ciudad, direccion, edad, nombre);
  }
}
