package complementarios_level1;

import java.util.Scanner;

class Ejercicio7 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Ingresa una palabra o frase");
    String input = scan.nextLine();
    System.out.println(toUpperCase(input));

    scan.close();
  }

  public static String toUpperCase(String str) {
    String minusculas = "abcdefghijklmnñopqrstuvwxyz";
    String mayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    String strConvertido = "";

    for (int i = 0; i < str.length(); i++) {
      char cha = str.charAt(i);
      int index = minusculas.indexOf(cha);
      strConvertido += index > -1 ? mayusculas.charAt(index) : cha;
    }

    return strConvertido;
  }
}
