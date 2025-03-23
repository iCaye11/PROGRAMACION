package Clase3;

import java.util.Scanner;

public class Clase3 {
    public static void main(String[] args) {

        //CONSTANTES, OPERADORES Y EXPRESIONES

        //1️⃣ Crea una constante llamada GRAVEDAD con el valor 9.81 y muestra su valor por pantalla.
        String gravedad = "9.81";
        System.out.println("El valor de la gravedad es " + gravedad + " m/s2");

        //2️⃣ Declara dos variables a = 25 y b = 7. Realiza todas las operaciones aritméticas entre ellas e imprime los resultados.
        int a = 25;
        int b = 7;
        System.out.println("Suma: " + (a+b));
        System.out.println("Resta: " + (a-b));
        System.out.println("Multiplicación: " + (a*b));
        System.out.println("División: " + (a/b));
        System.out.println("Módulo: " + (a%b));

        //3️⃣ Declara una variable edad e imprime si la persona es mayor de edad (>= 18) o menor de edad (< 18).
        int Edad = 18;
        int edadPersona1 = 16;
        int edadPersona2 = 21;
        System.out.println("La persona 1 tiene 16 años. Es la persona 1 mayor de 18 años?: " + (edadPersona2 > Edad));
        System.out.println("La persona 2 tiene 21 años. Es la persona 2 mayor de 18 años?: " + (edadPersona1 < Edad));

       // 4️⃣ Crea un programa que reciba dos números y determine cuál es mayor, menor o si son iguales.
        int num1 = 5;
        int num2 = 7;
        System.out.println("Es el 5 mayor que 7?: "+(5>7));
        System.out.println("Es 5 menor que 7?: "+(5<7));
        System.out.println("Es 5 igual que 7?: "+(5==7));

        //5️⃣ Escribe un programa que evalúe la siguiente expresión lógica: (5 > 3) && (10 < 20). ¿Cuál es el resultado?
        //6️⃣ Modifica el programa anterior y evalúa también (5 > 3) || (10 > 20).

        System.out.println((5 > 3) && (10 < 20));
        System.out.println((5 > 3) || (10 > 20));

        //7️⃣ Declara tres variables x = 10, y = 20, z = 30. Compara x + y con z utilizando operadores relacionales.
        int x = 10;
        int y = 20;
        int z = 30;
        System.out.println((x+y)==z);
        System.out.println((x+y)!=z);
        System.out.println((x+y)>z);
        System.out.println((x+y)<z);

        //8️⃣ Crea un programa que pida al usuario dos números y evalúe si son múltiplos (num1 % num2 == 0).
//        Scanner scanner = new Scanner(System.in);
//        int numero1;
//        int numero2;
//        System.out.println("Dame un número: ");
//        numero1 = scanner.nextInt();
//        System.out.println("Dame otro numero: ");
//        numero2 = scanner.nextInt();
//        if (numero1 % numero2 == 0) {
//        System.out.println("El " + numero1 + " es múltiplo de " + numero2);}
//        else {System.out.println("El "+numero1+" no es multiplo de "+numero2);}
//        scanner.close();

        //9️⃣ Escribe un código que reciba un número e indique si es par o impar usando el operador módulo (%).
        Scanner scannerr = new Scanner(System.in);
        System.out.println("Un numerito please: ");
        int numero3 = scannerr.nextInt();
        if (numero3 % 2 == 0){
            System.out.println("El numero es par");}

        else {
            System.out.println("El numero es impar");}
        scannerr.close();

        //🔟 Define una constante TASA_CAMBIO con el valor 1.12 (dólar a euro).
        // Convierte una cantidad de dólares ingresada por el usuario a euros.
        //TODAVÍA NO SABEMOS CONVERTIR



    }
}
