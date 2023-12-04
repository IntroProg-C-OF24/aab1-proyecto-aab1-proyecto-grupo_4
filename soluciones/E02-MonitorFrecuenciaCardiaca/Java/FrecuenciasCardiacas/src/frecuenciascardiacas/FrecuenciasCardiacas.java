package frecuenciascardiacas;

import java.util.Scanner;

/**
 * @author Ricardo Espinosa y Juan Diego Guerrero
 */
public class FrecuenciasCardiacas {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String nombre, seguir = "s", seguir1 = "n";
        int diaNacimiento, mesNacimiento, anioNacimiento, anioActual = 2023, mesActual = 12, diaActual = 02, frecMax, dia = 0, cont = 0, edad;
        double frecRango1, frecRango2;
        //Entrada de variables
        System.out.println("Contador de frecuencias cardiacas");
        System.out.println("Nombre");
        nombre = tc.next();
        System.out.println("Dia de nacimiento");
        diaNacimiento = tc.nextInt();
        System.out.println("Mes de nacimiento");
        mesNacimiento = tc.nextInt();
        System.out.println("Anio de nacimiento");
        anioNacimiento = tc.nextInt();
        //Calculo de edad
        edad = anioActual - anioNacimiento;
        if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
            edad--;
        }
        //Frecuencia Maxima y Rango de frecuencia
        frecMax = 220 - edad;
        frecRango1 = frecMax * 0.50;
        frecRango2 = frecMax * 0.85;

        System.out.println("\nFrecuencias cardiacas de " + nombre);
        System.out.println("Fecha de Nacimiento: " + diaNacimiento + "/" + mesNacimiento + "/" + anioNacimiento);
        System.out.println("Edad: " + edad);
        System.out.println("Frecuencia cardiaca maxima: " + frecMax + " lpm");
        System.out.printf("%s %.0f %s %.0f %s", "Rango de frecuencia cardiaca: ", frecRango1, " lpm /", frecRango2, " lpm\n");
        //Arreglos
        int[] historial = new int[10];
        int[] hora = new int[10];
        //Historial de frecuencias cardiacas
        System.out.println("\nDesea crear un historial de frecuencias cardiacas por un dia a su eleccion");
        System.out.println("s/n");
        seguir1 = tc.next();
        if (seguir1.equals("s")) {
            for (int i = 0; seguir.equals("s"); i++) {
                cont++;
                System.out.println("\nIngrese su " + cont + " registro");
                historial[i] = tc.nextInt();
                System.out.println("Ingrese la hora del " + cont + " registro");
                hora[i] = tc.nextInt();
                System.out.println("Desea ingresar otro registro");
                System.out.println("s/n");
                seguir = tc.next();
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
                    System.out.println("\nHistorial de frecuencias cardiacas de " + nombre + " del dia Lunes");
                    break;
                case 2:
                    System.out.println("\nHistorial de frecuencias cardiacas de " + nombre + " del dia Martes");
                    break;
                case 3:
                    System.out.println("\nHistorial de frecuencias cardiacas de " + nombre + " del dia Miercoles");
                    break;
                case 4:
                    System.out.println("\nHistorial de frecuencias cardiacas de " + nombre + " del dia Jueves");
                    break;
                case 5:
                    System.out.println("\nHistorial de frecuencias cardiacas de" + nombre + " del dia Viernes");
                    break;
                case 6:
                    System.out.println("\nHistorial de frecuencias cardiacas de " + nombre + " del dia Sabado");
                    break;
                case 7:
                    System.out.println("\nHistorial de frecuencias cardiacas de " + nombre + " del dia Domingo");
                    break;
            }
            System.out.printf("%s \t %s \n", "Frecuencia ", " Hora");
            for (int i = 0; i < cont; i++) {
                System.out.printf("%d %s \t %d \n", historial[i], " lpm", hora[i]);
            }
        }
        System.out.println("\nInforme terminado");
    }
}
