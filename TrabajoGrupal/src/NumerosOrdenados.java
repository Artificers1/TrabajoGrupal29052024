import java.util.Scanner;
import java.util.TreeSet;

public class NumerosOrdenados {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> numeros = new TreeSet<>();

        System.out.println("Ingrese números. Escriba 'salir' para terminar.");

        while (true) {
            System.out.print("Ingrese un número: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("salir")) {
                break;
            }

            try {
                int numero = Integer.parseInt(input);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido o 'salir' para terminar.");
            }
        }

        scanner.close();
        
        System.out.println("Números ingresados ordenados de menor a mayor:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

    }
    
}
