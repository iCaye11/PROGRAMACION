package Clase1;

public class Clase1 {
    public static void main(String[] args) {

        // 📌 EJERCICIO 1:
        // Crea una variable de cada tipo entero y asígnale valores distintos.
        // Luego imprímelas con System.out.println().

        int numeroInt = 10;
        byte numeroByte = 2;
        short numeroShort = 1;
        long numeroLong = 100000000000000L; //IMPORTANTE LA L AL FINAL DE UN LONG
        System.out.println("Numero Int: " + numeroInt);
        System.out.println("Numero Short: " + numeroShort);
        System.out.println("Numero long: " + numeroLong);


        // 📌 EJERCICIO 2:
        // Declara una variable de tipo float y otra de tipo double con valores distintos.
        // Imprímelas en la consola.
        float numeroFloat = 3.14f; //IMPORTANTE, f AL FINAL
        double numeroDouble = 3.1415164978998; //NUMERO DECIMAL CON MUCHA PRECISION
        System.out.println("Numero float: " + numeroFloat);
        System.out.println("Numero double: "+ numeroDouble);

        // 📌 EJERCICIO 3:
        // Declara una variable boolean y asígnale un valor falso.
        // Luego usa un `if` para imprimir un mensaje si es true o false.
        boolean Verdadero = true;
        boolean Falso = false;
        System.out.println("Tengo 16 años: "+ false);
        System.out.println("Tengo 26 años: "+ true);
        System.out.println("Soy mayor de 20 años?: " + true);

        // 📌 EJERCICIO 4:
        // Declara una variable de tipo char con tu inicial y otra con un símbolo especial.
        // Imprímelas en la consola.

        char letra = 'Y'; //Char es solo para una letra
        char unicode = '\u2764';
        System.out.println("Mi letra favorita es la " + letra + " y mi figura favorita es un " + unicode);

        // 📌 EJERCICIO 5:
        // Declara una variable String con tu nombre y otra con tu lenguaje favorito.
        // Concátalas en un mensaje y muestra el resultado.
        String anime = "Mi anime favorito es Naruto";
        System.out.println("¿Cual es tu anime favorito?\n" + anime);

        // 📌 EJERCICIO 6:
        // Declara un array de 5 nombres y muéstralos en la consola usando un bucle.

        int [] arrays = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Imprimo array de la 1º posición: " + arrays[0]);

        // 📌 EJERCICIO 7:
        // Usa literales para imprimir en consola:
        // Un número entero, un decimal, un booleano y una cadena de texto.
        int numEntero = 100;
        boolean Verdaderus = true;
        boolean Falsus = false;
        String miTexto = "este es mi último ejercicio.";
        System.out.println("Es "+false+" que este es el ejercicio número "+numEntero+ ", pero, \n" +
                "sí que es cierto que " + miTexto);
    }

}
