import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjerciciosStreams {

    public static void main(String[] args) {

        // Escribir un programa que tome una lista de números enteros
        // y los filtre para obtener solo los números mayores que 10.

        System.out.println("Ejercicio 01");

        List<Integer> numerosEnteros = Arrays.asList(1,20,40);

        List<Integer> resultados = numerosEnteros.stream()
                        .filter( numero -> numero > 10)
                        .collect(Collectors.toList());

        System.out.println(resultados);

        // Escribir un programa que tome una lista de cadenas
        // y las ordene alfabéticamente en orden inverso.

        System.out.println("Ejercicio 02");

        List<String> cadenas = Arrays.asList("Pedro","María","Alex");

        List<String> cadenasOrdenadas = cadenas.stream()
                                                .sorted((s1, s2) -> s2.compareTo(s1))
                                                .collect(Collectors.toList());
        System.out.println(cadenasOrdenadas);

        // Escribir un programa que tome una lista de personas y
        // las filtre para obtener solo aquellas cuyo nombre comience con la letra 'J'.

        System.out.println("Ejercicio 03");

        List<Persona> personaList = Arrays.asList(
                new Persona("Juan", 25),
                new Persona("María", 30),
                new Persona("José", 40),
                new Persona("Pedro", 35),
                new Persona("Javier", 28)
        );

        List<Persona> personaListFiltrados = personaList.stream()
                                                        .filter( persona -> persona.getNombre().startsWith("J") )
                                                        .toList();

        //personaListFiltrados.forEach( persona -> System.out.println(persona.toString()) );
        personaListFiltrados.forEach(System.out::println); // Método referenciado

        // Escribir un programa que tome una lista de números enteros
        // y devuelva la suma de los cuadrados de todos los números.

        System.out.println("Ejercicio 04");

        List<Integer> numerosEnterosList = Arrays.asList(2,3,4,5);

        int sumaCuadrados = numerosEnterosList.stream()
                                .mapToInt(numero -> numero * numero)
                                .sum();

        System.out.println(sumaCuadrados);

        // Escribir un programa que tome una lista de cadenas
        // y devuelva una lista con todas las cadenas concatenadas en una sola.

        System.out.println("Ejercicio 05");
        List<String> cadenaList = Arrays.asList("mano","pie","brazo");

        String cadenaConcatenadas = cadenaList.stream()
                                              .collect(Collectors.joining());
        System.out.println(cadenaConcatenadas);


        // Escribir un programa que tome una lista de números enteros
        // y devuelva la raíz cuadrada de cada número.

        System.out.println("Ejercicio 06");
        List<Integer> numeros = Arrays.asList(1, 4, 9, 16, 25);

        List<Double> raices = numeros.stream()
                .map(Math::sqrt)
                .collect(Collectors.toList());

        System.out.println("Raíces cuadradas: " + raices);

        // Escribir un programa que tome una lista de personas
        // y devuelva una lista con las edades de todas las personas.

        System.out.println("Ejercicio 07");

        List<Persona> personas = Arrays.asList(
                new Persona("Juan", 25),
                new Persona("María", 30),
                new Persona("José", 40),
                new Persona("Pedro", 35),
                new Persona("Javier", 28)
        );

        List<Integer> edades = personas.stream()
                .map(Persona::getEdad)
                .collect(Collectors.toList());

        System.out.println("Edades de personas: " + edades);

        // Escribir un programa que tome una lista de números enteros
        // y devuelva una lista con los números impares divididos por 2.

        System.out.println("Ejercicio 08");

        List<Integer> numeros8 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Double> resultado = numeros8.stream()
                .filter(num -> num % 2 != 0)
                .map(num -> num / 2.0)
                .collect(Collectors.toList());

        System.out.println("Números impares divididos por 2: " + resultado);

        // Escribir un programa que tome una lista de cadenas
        // y las filtre para obtener solo aquellas que tengan más de 5 caracteres.

        System.out.println("Ejercicio 09");

        List<String> cadenas9 = Arrays.asList("Java", "Python", "JavaScript", "C++", "Ruby");

        List<String> resultado9 = cadenas9.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());

        System.out.println("Cadenas con más de 5 caracteres: " + resultado9);

        // Escribir un programa que tome una lista de números enteros
        // y devuelva la multiplicación de todos los números.

        System.out.println("Ejercicio 10");

        List<Integer> numeros10 = Arrays.asList(1, 2, 3, 4, 5);

        int multiplicacion = numeros10.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Multiplicación de todos los números: " + multiplicacion);


    }

}
