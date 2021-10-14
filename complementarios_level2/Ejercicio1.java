package complementarios_level2;

import java.util.ArrayList;
import java.util.Scanner;

class Ejercicio1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> ciudades = new ArrayList<String>();
    System.out.println("Ranking de ciudaddes favoritas");

    while (true) {
      System.out.println("Ingrese el nombre de una ciudad: ");
      ciudades.add(scan.nextLine());
      System.out.println("Desea cargar otra? (s/n)");
      if (scan.nextLine().charAt(0) == 'n') break;
    }

    System.out.println("Ciudades favoritas:");
    for (String ciudad : ciudades) {
      System.out.println(ciudad);
    }

    scan.close();
  }
}
