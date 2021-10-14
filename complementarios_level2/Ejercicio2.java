package complementarios_level2;

import java.util.ArrayList;
import java.util.Scanner;

class Ejercicio2 {
  static ArrayList<Integer> numeros = new ArrayList<Integer>();
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
      System.out.println("Ingrese un número: ");
      numeros.add(scan.nextInt());
    }

    imprimirNumeros();

    System.out.println("Ingrese un número: ");
    numeros.add(0, scan.nextInt());

    imprimirNumeros();

    System.out.println("Ingrese un número: ");
    numeros.add(scan.nextInt());

    imprimirNumeros();

    scan.close();
  }

  public static void imprimirNumeros() {
    System.out.println("-----------------------------");
    System.out.print("Lista: ");
    for (int numero : numeros) {
      System.out.print(numero + " ");
    }
    System.out.printf("%ntamaño: %d%n", numeros.size());
    System.out.println("-----------------------------");
  }
}
