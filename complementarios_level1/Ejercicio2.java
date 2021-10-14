package complementarios_level1;

import java.util.Scanner;

class Ejercicio2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Ingresa un número entero");
    int a = scan.nextInt();

    System.out.println("Ingresa otro número entero");
    int b = scan.nextInt();

    System.out.printf("%d + %d = %d%n", a, b, a + b);
    System.out.printf("%d - %d = %d%n", a, b, a - b);
    System.out.printf("%d * %d = %d%n", a, b, a * b);
    System.out.printf("%d / %d = %.2f%n", a, b, (float)a / b);
    System.out.printf("%d %% %d = %d%n", a, b, a % b);

    scan.close();
  }
}
