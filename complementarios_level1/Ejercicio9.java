package complementarios_level1;

import java.util.Scanner;

class Ejercicio9 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int contador = 0;

    System.out.println("Ingrese un texto: ");
    String texto = scan.nextLine();

    System.out.println("Ingrese la letra que desea contar");
    char ch = scan.next().charAt(0);

    for (int i = 0; i < texto.length(); i++) {
      if (texto.charAt(i) == ch) {
        contador++;
      }
    }

    System.out.println(contador);

    scan.close();
  }
}
