package complementarios_level1;

import java.util.Scanner;

class Ejercicio3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Ingresa un número entero");
    int a = scan.nextInt();

    for (int i = 1; i <= a; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }

    scan.close();
  }
}
