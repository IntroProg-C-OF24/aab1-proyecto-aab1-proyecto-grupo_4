package frecuenciascardiacasaleatorio;

import java.util.Scanner;
import java.util.Random;
/**
 * @author Ricardo Espinosa y Juan Diego Guerrero Camargo
 */
public class FrecuenciasCardiacasAleatorio {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String[] prefijos = {"Pedro", "Jesus", "Alfredo", "Claudio", "Juan", "Maria", "Luisa", "Mia", "Gabriela", "Omar", "Pablo", "Diego", "ismael"};
        Random random = new Random();
        String seguir = "s", seguir1 = "n";
        int anioActual = 2023, mesActual = 12, diaActual = 02, frecMax, dia = 0, cont = 0;
        double frecRango1, frecRango2;
        for (int i = 0; i < 1; i++) {
            String nombreAleatorio = NombreAleatorio(prefijos, random);
        }
        int diaNacimiento = (int) (Math.random() * 31) + 1;
        int mesNacimiento = (int) (Math.random() * 12) + 1;
        int anioNacimiento = 1900 + (int) (Math.random() * (2024 - 1900));
        int edad = (int) (Math.random() * 100) + 1;
        //Calculo de edad
        edad = anioActual - anioNacimiento;
        if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
            edad--;
        }
        //Frecuencia Maxima y Rango de frecuencia
        frecMax = 220 - edad;
        frecRango1 = frecMax * 0.50;
        frecRango2 = frecMax * 0.85;

        System.out.println("\nFrecuencias cardiacas de " + NombreAleatorio(prefijos, random));
        System.out.println("Fecha de Nacimiento: " + diaNacimiento + "/" + mesNacimiento + "/" + anioNacimiento);
        System.out.println("Edad: " + edad);
        System.out.println("Frecuencia cardiaca maxima: " + frecMax + " lpm");
        System.out.printf("%s %.0f %s %.0f %s", "Rango de frecuencia cardiaca: ", frecRango1, " lpm /", frecRango2, " lpm\n");
        //Arreglos
        int tamanoArreglo = 5;
        int[] historial = new int[tamanoArreglo];
        int[] hora = new int[tamanoArreglo];
        //Historial de frecuencias cardiacas
        System.out.println("\nDesea crear un historial de frecuencias cardiacas por un dia a su eleccion");
        System.out.println("s/n");
        seguir1 = tc.next();
        if (seguir1.equals("s")) {
             for (int i = 0; i < tamanoArreglo; i++) {
                historial[i] = 60 + random.nextInt(141);
                hora[i] = random.nextInt(25);
            }   
            System.out.println("\nDe que dia es el registro");
            System.out.println("[1] Lunes");
            System.out.println("[2] Martes");
            System.out.println("[3] Miercoles");
            System.out.println("[4] Jueves");
            System.out.println("[5] Viernes");
            System.out.println("[6] Sabado");
            System.out.println("[7] Domingo");
            dia = tc.nextInt();
            switch (dia) {
                case 1:
                    System.out.println("\nHistorial de frecuencias cardiacas de " + NombreAleatorio(prefijos, random) + " del dia Lunes");
                    break;
                case 2:
                    System.out.println("\nHistorial de frecuencias cardiacas de " + NombreAleatorio(prefijos, random) + " del dia Martes");
                    break;
                case 3:
                    System.out.println("\nHistorial de frecuencias cardiacas de " + NombreAleatorio(prefijos, random) + " del dia Miercoles");
                    break;
                case 4:
                    System.out.println("\nHistorial de frecuencias cardiacas de " + NombreAleatorio(prefijos, random) + " del dia Jueves");
                    break;
                case 5:
                    System.out.println("\nHistorial de frecuencias cardiacas de " + NombreAleatorio(prefijos, random) + " del dia Viernes");
                    break;
                case 6:
                    System.out.println("\nHistorial de frecuencias cardiacas de " + NombreAleatorio(prefijos, random) + " del dia Sabado");
                    break;
                case 7:
                    System.out.println("\nHistorial de frecuencias cardiacas de " + NombreAleatorio(prefijos, random) + " del dia Domingo");
                    break;
            }
            System.out.printf("%s \t %s \n", "Frecuencia ", " Hora");
            for (int i = 0; i < tamanoArreglo; i++) {
                System.out.printf("%d %s \t\t %d \n", historial[i], " lpm", hora[i]);
            }
        }
        System.out.println("\nInforme terminado");
        
    }
    private static String NombreAleatorio(String[] prefijos, Random random) {
        String nombreAleatorio = prefijos[random.nextInt(prefijos.length)];
        return nombreAleatorio;
    }

}
