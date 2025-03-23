package Ejercicios07032025;

import com.sun.source.doctree.EscapeTree;

public class Ejercicos0703 {
    public static void main(String[] args) {
        final double GRAVEDAD = 9.81;
        System.out.println("La aceleración de la gravedad es de: " + GRAVEDAD + "ms2");

        int a = 25;
        int b = 7;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a-b));
        System.out.println("Multiplicación: " + (a*b));
        System.out.println("Divisón: "+ (a/b));
        System.out.println("Módulo: " + (a%b));

        int EDAD = 18;
        int edadPersona1 = 17;
        int edadPersona2 = 19;
        System.out.println("La persona 1 tiene 17 años. Es la persona 1 mayor de 18 años?: " + (edadPersona1>EDAD));
        System.out.println("La persona 2 tiene 19 años. Es la persona 2 mayor de 18 años?: " + (edadPersona2>EDAD));

        int numero1 = 69;
        int numero2 = 96;
        System.out.println("Es el número " + numero1 + " mayor que " + numero2 + "?: " + (numero1>numero2));
        System.out.println("Es el número " + numero1 + " menor que " + numero2 + "?: " + (numero1<numero2));
        System.out.println("Es el número " + numero1 + " igual que " + numero2 + "?: " + (numero1==numero2));

        






    }
}



