package complementarios_level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Ejercicio3 {
  static ArrayList<Integer> valores = new ArrayList<>() {
    {
      add(2);
      add(3);
      add(4);
      add(5);
      add(6);
      add(7);
      add(8);
      add(9);
      add(10);
    }
  };

  public static void main(String[] args) {
    imprimirLista();
    valores.sort(Comparator.reverseOrder());
    imprimirLista();
    Collections.shuffle(valores);
    imprimirLista();
  }

  public static void imprimirLista() {
    for (int valor : valores) {
      System.out.print(valor + " ");
    }
    System.out.println();
  }
}
