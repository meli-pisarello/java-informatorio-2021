package complementarios_level1;

import java.util.Scanner;

class Ejercicio4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Ingresa un número entero");
    int a = scan.nextInt();
    int factorial = 1;

    for (int i = 2; i <= a; i++) {
      factorial *= i;
    }

    System.out.printf("El factorial de %d es: %d%n", a, factorial);

    scan.close();
  }
}
