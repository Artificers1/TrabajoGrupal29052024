import java.util.Scanner;

public class VocalA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("Ingresa una frase:");
    String frase = scanner.nextLine();


    int contar = 0;

    for (int i = 0; i < frase.length(); i++) {
        
        char letra = Character.toLowerCase(frase.charAt(i));
       
        if (letra == 'a') {
            contar++;
        }
    }

    System.out.println("La cantidad de veces que aparece la vocal 'A' en la frase son: " + contar);
   

     }
}
