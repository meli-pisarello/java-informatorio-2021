package complementarios_level2;

import java.util.HashMap;
import java.util.HashSet;

class Ejercicio6 {
  public static void main(String[] args) {
    HashSet<Empleado> empleados = new HashSet<>();
    empleados.add(new Empleado("Juan Perez", "33444555", 160, 250));
    empleados.add(new Empleado("Ezequiel Diaz", "32444565", 155, 250));
    empleados.add(new Empleado("Cristian Benitez", "33444555", 160, 250));
    empleados.add(new Empleado("José Duarte", "214237575", 90, 300.5));
    empleados.add(new Empleado("David Fernández", "40123123", 160, 200));

    HashMap<String,Double> sueldos = new HashMap<>();

    for (Empleado e : empleados) {
      sueldos.put(e.DNI, e.getSueldo());
    }

    System.out.println(sueldos);
  }
}

class Empleado {
  String nombre;
  String DNI;
  int horasTrabajadas;
  double valorPorHora;

  public Empleado(
    String nombre,
    String DNI,
    int horasTrabajadas,
    double valorPorHora
  ) {
    this.nombre = nombre;
    this.DNI = DNI;
    this.horasTrabajadas = horasTrabajadas;
    this.valorPorHora = valorPorHora;
  }

  public Double getSueldo() {
    return horasTrabajadas * valorPorHora;
  }
}
