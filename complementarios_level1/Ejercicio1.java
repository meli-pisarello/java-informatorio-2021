package complementarios_level1;

import java.util.Scanner;

class Ejercicio1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Ingresa tu nombre");
    String nombre = scan.nextLine();
    System.out.printf("HOLA %s!!!%n", nombre);

    scan.close();
  }
}
