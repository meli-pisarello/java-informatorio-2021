package complementarios_level1;

import java.util.Scanner;

class Ejercicio6 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Ingresa la base");
    int base = scan.nextInt();

    System.out.println("Ingresa el exponente");
    int exponente = scan.nextInt();

    int potencia = 0;

    for (int i = 0; i < exponente; i++) {
      potencia *= base;
    }

    System.out.printf("%d elevado a %d = %d%n", base, exponente, potencia);

    scan.close();
  }
}
