package Ejercicio4;

public class Manipulador {

    public static String invertir(String s) {
        // TODO: usar StringBuilder.reverse()
        StringBuilder inv = new StringBuilder(s);
        inv.reverse();
        return inv.toString();
    }

    public static boolean esPalindromo(String s) {
         //TODO: limpiar (toLowerCase, replaceAll espacios)
        s = s.toLowerCase().replaceAll("\\s+", "");
        String invertida = invertir(s);
        return s.equals(invertida.toString());
        // TODO: comparar con su version invertida

    }

    public static int contarVocales(String s) {
        int count = 0;
        String vocales = "aeiouAEIOU";
        StringBuilder mur = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            char letra = s.charAt(i); // Obtenemos la letra en la posición 'i'
            if (vocales.indexOf(letra) != -1) { //indexOf sirve para buscar la primera aparición de una coincidencia
                count++; // Si la encuentra, aumentamos el contador
            }

        }
        // TODO: recorrer cada caracter, verificar si es vocal

        return count;
    }

    public static String construirPiramide(int niveles) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= niveles; i++) {
            // TODO: agregar espacios (niveles - i)
            // TODO: agregar asteriscos (2*i - 1)
            // TODO: agregar salto de linea
            sb.append(" ".repeat(niveles - i));
            sb.append("*".repeat(2 * i - 1));
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Invertir 'Hola Mundo': "
                + invertir("Hola Mundo"));
        System.out.println("'Anita lava la tina' es palindromo: "
                + esPalindromo("Anita lava la tina"));
        System.out.println("Vocales en 'Murcielago': "
                + contarVocales("Murcielago"));
        System.out.println("Piramide de 5 niveles:");
        System.out.println(construirPiramide(5));
    }
}
