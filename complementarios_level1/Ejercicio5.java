package complementarios_level1;

import java.util.Scanner;

class Ejercicio5 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Ingresa un número entero");
    int a = scan.nextInt();

    System.out.println("Ingresa otro número entero");
    int b = scan.nextInt();

    int suma = 0;

    for (int i = 0; i < b; i++) {
      suma += a;
    }

    System.out.printf("%d x %d = %d%n", a, b, suma);

    scan.close();
  }
}
