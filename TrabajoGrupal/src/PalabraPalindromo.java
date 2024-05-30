public class PalabraPalindromo {
    public static boolean esPalindromo(String palabra) {
        String Limpiar = palabra.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String Regresar = new StringBuilder(Limpiar).reverse().toString();
        return Limpiar.equals(Regresar);

        //mm
    }
}
