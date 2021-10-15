package complementarios_level2;

import java.util.ArrayList;
import java.util.Arrays;

class Ejercicio5 {
  public static void main(String[] args) {
    ArrayList<Integer> horasTrabajadas = new ArrayList<>(Arrays.asList(6, 7, 8, 4, 5));
    ArrayList<Integer> valorPorHora = new ArrayList<>(Arrays.asList(350, 345, 550, 600, 320));
    ArrayList<Integer> totales = new ArrayList<>();
    int total = 0;

    for (int i = 0; i < 5; i++) {
      int suma = horasTrabajadas.get(i) * valorPorHora.get(i);
      totales.add(suma);
      total += suma;
    }

    System.out.println(totales);
    System.out.println("Total Final: $ " + total);
  }
}
