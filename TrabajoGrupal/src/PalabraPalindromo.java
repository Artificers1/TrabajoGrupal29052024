import java.util.Scanner;

public class PalabraPalindromo {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra : ");
        String palabraI = scanner.nextLine();

        if (esPalindromo(palabraI)) {
            System.out.println("La palabra ingresada es un palíndromo. ");
        } else {
            System.out.println("La palabra ingresada no es un palíndromo. ");
        }
    }

    public static boolean esPalindromo(String palabra) {
        String limpiar = palabra.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String regresar = new StringBuilder(limpiar).reverse().toString();
        return limpiar.equals(regresar);
    }
}
