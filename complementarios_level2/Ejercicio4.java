package complementarios_level2;

import java.util.ArrayList;
import java.util.List;

class Ejercicio4 {
  public static void main(String[] args) {
    ArrayList<String> estudiantes = new ArrayList<>() {
      {
        add("Juan");
        add("Ezequiel");
        add("Cristian");
        add("Marien");
        add("Lourdes");
        add("Carolina");
        add("Carlos");
        add("Sofía");
        add("Javier");
        add("Melina");
        add("Nadia");
        add("Lucas");
      }
    };

    System.out.println("Curso 1:");
    imprimirLista(estudiantes.subList(0, 4));
    System.out.println("Curso 2:");
    imprimirLista(estudiantes.subList(4, 8));
    System.out.println("Curso 3:");
    imprimirLista(estudiantes.subList(8, 12));
  }

  public static void imprimirLista(List<String> lista) {
    for (String item : lista) {
      System.out.printf("- %s%n", item);
    }
  }
}
