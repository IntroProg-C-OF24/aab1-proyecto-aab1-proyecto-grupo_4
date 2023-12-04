import java.util.Random;

public class Prueba {
    public static void main(String[] args) {
        String[] prefijos = {"Ana", "Juan", "María", "Carlos", "Laura"};
        String[] sufijos = {"Gómez", "Pérez", "López", "Fernández", "Martínez"};

        // Generador de números aleatorios
        Random random = new Random();

        // Generar nombres aleatorios
        for (int i = 0; i < 5; i++) {
            String nombreAleatorio = generarNombreAleatorio(prefijos, sufijos, random);
            System.out.println(nombreAleatorio);
        }
    }

    // Método para generar nombres aleatorios
    private static String generarNombreAleatorio(String[] prefijos, String[] sufijos, Random random) {
        String nombreAleatorio = prefijos[random.nextInt(prefijos.length)] + " " + sufijos[random.nextInt(sufijos.length)];
        return nombreAleatorio;
    }
}