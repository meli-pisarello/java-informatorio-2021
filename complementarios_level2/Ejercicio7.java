package complementarios_level2;

import java.util.Scanner;

class Ejercicio7 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Ingresa el número de inicio");
    int inicio = scan.nextInt();

    System.out.println("Ingresa el número de fin");
    int fin = scan.nextInt();

    imprimirLista(fizzBuzzFunction(inicio, fin));

    scan.close();
  }

  public static String[] fizzBuzzFunction(int inicio, int fin) {
    if (inicio < fin) {
      int longitud = fin - inicio;
      int contador = 0;
      String[] items = new String[longitud];

      for (int i = inicio; i < fin; i++) {
        if (i % 2 == 0 && i % 3 == 0) {
          items[contador] = "FizzBuzz";
        } else if (i % 2 == 0) {
          items[contador] = "Fizz";
        } else if (i % 3 == 0) {
          items[contador] = "Buzz";
        } else {
          items[contador] = Integer.toString(i);
        }

        contador++;
      }

      return items;
    }

    return new String[0];
  }

  public static void imprimirLista(String[] lista) {
    System.out.print("[\"");
    System.out.printf(String.join("\", \"", lista));
    System.out.print("\"]");
  }
}
