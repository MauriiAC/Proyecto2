import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Persona persona1 = new Empleado("Mauricio", "Cuello", 32, "30123321", 1000, LocalTime.of(10, 30));
    // Empleado empleado1 = new Empleado("Lionel", "Messi", 35, "28111222", 2200, LocalTime.of(6, 50));
    // Seguridad seguridad1 = new Seguridad("Cristiano", "Ronaldo", 38, "25012345", 2000, LocalTime.of(6, 30), "Fiat 600", "M14");

    Scanner scanner = new Scanner(System.in);

    while (true) {
      try {
        System.out.println("Ingreso su peso en kg: ");
        int peso = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese su altura: ");
        double altura = Double.parseDouble(scanner.nextLine());
    
        double imc = calcularIMC(peso, altura);
        System.out.println(String.format("Tu indice de masa corporal es %.2f", imc));
        break;
      } catch (NumberFormatException e){
        System.out.println("Debe ingresar datos numéricos");
      } catch (IllegalArgumentException e){
        System.out.println(e.getMessage());
      } catch (Exception e) {
        System.out.println(e.getClass());
        System.out.println("Se produjo un error");
      } finally {
        System.out.println("Se ejecutó el finally");
      }
    }

    System.out.println("Ejecutando más lineas de código...");

    scanner.close();
  }

  public static double calcularIMC(int peso, double altura) {
    if (peso <= 0) {
      throw new IllegalArgumentException("El peso debe ser un número positivo");
    }
    if (altura <= 0) {
      throw new IllegalArgumentException("La altura debe ser un número positivo");
    }
    return peso / Math.pow(altura, 2);

  }

  public static void imprimirLongitud(Object objeto) {
    
    if (objeto instanceof CharSequence) {
      CharSequence secuencia = (CharSequence) objeto;
      int longitud = secuencia.length();
      System.out.println("Longitud: " + longitud);
    } else {
      System.out.println("El objeto no implementa length");
    }
  }

}