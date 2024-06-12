import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EjerciciosLambdas {

    public static void main(String[] args) {

        //lambdas, son funciones anonimas que implementan interfaces funcionales

        // Escribir un programa que tome una lista de números enteros
        // y los filtre para obtener solo los números pares.
        System.out.println("Ejercicio 01");

        List<Integer> listaNumerosEnteros = new ArrayList<>();
        listaNumerosEnteros.add(2);
        listaNumerosEnteros.add(5);
        listaNumerosEnteros.add(6);
        listaNumerosEnteros.add(7);
        listaNumerosEnteros.add(9);

        //listaNumerosEnteros.forEach( (numero) -> System.out.println(numero) );
        listaNumerosEnteros.forEach((numero) -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }

        });

        System.out.println();
        // Escribir un programa que tome una lista de cadenas y las ordene alfabéticamente.
        System.out.println("Ejercicio 02");

        List<String> cadenas = new ArrayList<>();
        cadenas.add("Perro");
        cadenas.add("Gato");
        cadenas.add("Elefante");

        Collections.sort(cadenas, (cadena1, cadena2) -> cadena1.compareTo(cadena2));
        System.out.println(cadenas);


        System.out.println();
        // Escribir un programa que tome una lista de personas y las
        // filtre para obtener solo aquellas cuya edad sea mayor de 18 años.
        System.out.println("Ejercicio 03");

        Persona persona1 = new Persona();
        persona1.setNombre("Pepe");
        persona1.setEdad(20);

        Persona persona2 = new Persona();
        persona2.setNombre("Juana");
        persona2.setEdad(30);

        List<Persona> personaList = new ArrayList<>();
        personaList.add(persona1);
        personaList.add(persona2);

        personaList.forEach((persona) -> {
            if (persona.getEdad() > 18) {
                System.out.println(persona.toString());
            }
        });

        System.out.println();
        // Escribir un programa que tome una lista de cadenas
        // y devuelva una lista con todas las cadenas convertidas a mayúsculas.
        System.out.println("Ejercicio 04");

        List<String> cadenasList = new ArrayList<>();
        cadenasList.add("nombre");
        cadenasList.add("apellido");
        cadenasList.add("direccion");

        cadenasList.forEach(cadena -> System.out.println(cadena.toUpperCase()));


        System.out.println();
        // Escribir un programa que tome una lista de números enteros y
        // devuelva una los números impares multiplicados por 2.

        System.out.println("Ejercicio 05");

        List<Integer> numerosEnterosList = new ArrayList<>();
        numerosEnterosList.add(1);
        numerosEnterosList.add(2);
        numerosEnterosList.add(3);

        numerosEnterosList.forEach((numero) -> {

            if (numero % 2 != 0) {
                System.out.println(numero * 2);
            }

        });


    }

}
