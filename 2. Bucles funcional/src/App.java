import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.List;


public class App {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        Map<Integer, Runnable> ejercicios = new HashMap<>();

        ejercicios.put(1, App::ejercicio1);
        ejercicios.put(2, App::ejercicio2);
        ejercicios.put(3, App::ejercicio3);
        ejercicios.put(4, App::ejercicio4);
        ejercicios.put(5, App::ejercicio5);
        ejercicios.put(6, App::ejercicio6);
        ejercicios.put(7, App::ejercicio7);
        ejercicios.put(8, App::ejercicio8);
        ejercicios.put(9, App::ejercicio9);
        ejercicios.put(10, App::ejercicio10);
        ejercicios.put(11, App::ejercicio11);
        ejercicios.put(12, App::ejercicio12);
        ejercicios.put(13, App::ejercicio13);
        ejercicios.put(14, App::ejercicio14);

        boolean running = true;

        do {

            System.out.println();
            System.out.println("========== MENÚ ==========");
            System.out.println("1. Mostrar por pantalla numeros del 1 al 20.");
            System.out.println("2. Mostrar por pantalla pares del 1 al 200 (sumando 2).");
            System.out.println("3. Mostrar numeros pares entre el 1 y el 200 (sumando 1).");
            System.out.println("4. Mostrar numeros del 1 al N.");
            System.out.println("5. Calcular y mostrar factorial.");
            System.out.println("6. Detectar negativos.");
            System.out.println("7. Detectar cuantos negativos.");
            System.out.println("8. Detectar negativos y positivos hasta que se escriba un 0.");
            System.out.println("9. Suma de 10 primeros numeros naturales.");
            System.out.println("10. Leer secuencia de notas.");
            System.out.println("11. Suma pares e impares.");
            System.out.println("12. Calcular potencia.");
            System.out.println("13. Adivinar numero del 1 al 100.");
            System.out.println("14. Billetes necesarios.");
            System.out.println("0. Salir");
            System.out.println("===========================");
            System.out.print("Seleccione un ejercicio: ");

            int ej = auxLeerInt();

            if(ej == 0){

                running = false;
                System.out.println("Programa finalizado.");

            } else {

                Runnable ejercicio = ejercicios.get(ej);

                if(ejercicio != null){

                    ejercicio.run();

                } else {

                    System.out.println("El número introducido no corresponde a ningún ejercicio.");
                }
            }

        } while(running);

        sc.close();

    }

    // Mostrar por pantalla numeros del 1 al 20
    public static void ejercicio1(){

        String resultado = IntStream.rangeClosed(1, 20)
                                .mapToObj(String::valueOf)
                                .collect(Collectors.joining(", "));

        System.out.println(resultado + ".");
    }

    // Mostrar por pantalla pares del 1 al 200 (sumando 2)
    public static void ejercicio2(){

        String resultado = IntStream.rangeClosed(1, 200)
                                .filter(i -> i % 2 == 0)
                                .mapToObj(String::valueOf)
                                .collect(Collectors.joining(", "));

        System.out.println(resultado + ".");
    }

    // Mostrar numeros pares entre el 1 y el 200 (sumando 1)
    public static void ejercicio3(){

        String resultado = IntStream.rangeClosed(1, 200)
                                .filter(i -> i % 2 == 0)
                                .mapToObj(String::valueOf)
                                .collect(Collectors.joining(", "));

        System.out.println(resultado + ".");
    }

    // Mostrar numeros del 1 al N
    public static void ejercicio4(){
        System.out.print("Introduzca un numero: ");
        int n = sc.nextInt();

        String resultado = IntStream.rangeClosed(1, n)
                                    .mapToObj(String::valueOf)
                                    .collect(Collectors.joining(", "));

        System.out.println(resultado + ".");
    }

    // Calcular y mostrar factorial
    public static void ejercicio5(){
        
        int n = auxLeerEnteroFraseRango("Introduzca un numero: ", 0, 12);

        long factorial = IntStream.rangeClosed(1, n)
                                .asLongStream()
                                .reduce(1, (resultado, numero) -> resultado * numero);

        System.out.println("El factorial de " + n + " es " + factorial + ".");
    }

    // Detectar negativos
    public static void ejercicio6(){

        System.out.println("Se le pediran 10 numeros no nulos:");

        List<Integer> numeros = IntStream.range(0, 10)
                                        .mapToObj(i -> {
                                            System.out.print("Número " + (i + 1) + ": ");
                                            return sc.nextInt();
                                        })
                                        .collect(Collectors.toList());

        boolean negativo = numeros.stream()
                                .anyMatch(numero -> numero < 0);

        System.out.println(
            negativo
            ? "Se ha detectado al menos un numero negativo."
            : "No se ha detectado ningun numero negativo."
        );
    }

    // Detectar cuantos negativos
    public static void ejercicio7(){
        System.out.println("Se le pediran 10 numeros no nulos:");

        List<Integer> numeros = IntStream.range(0, 10)
                                        .mapToObj(i -> {
                                            System.out.print("Número " + (i + 1) + ": ");
                                            return sc.nextInt();
                                        })
                                        .collect(Collectors.toList());

        boolean negativo = numeros.stream()
                                .anyMatch(numero -> numero < 0);

        System.out.println(
            negativo
            ? "Se ha detectado al menos un numero negativo."
            : "No se ha detectado ningun numero negativo."
        );
        
    }

    // Detectar negativos y positivos hasta que se escriba un 0
    public static void ejercicio8(){

        int num; //variable que va almacenando el numero que se escriba
        int positivos = 0;
        int negativos = 0;

        //do-while: primero pido el numero y luego miro si es 0 para salir
        do {
            System.out.print("Introduzca un numero (0 para terminar): ");
            num = sc.nextInt();

            if(num > 0){
                positivos++; //incremento cuenta de positivos
            }
            else if(num < 0){
                negativos++; //incremento cuenta de negativos
            }

        } while(num != 0);

        System.out.println("Se han introducido " + positivos + " números positivos.");
        System.out.println("Se han introducido " + negativos + " números negativos.");

        //compruebo si ha habido numeros negativos
        if(negativos > 0){
            System.out.println("Se ha detectado al menos un número negativo.");
        }
        else{
            System.out.println("No se ha detectado ningún número negativo.");
        }
    }

    // Suma de 10 primeros numeros naturales
    public static void ejercicio9(){

        int suma = 0;
        long producto = 1;

        for(int i = 1; i <= 10; i++){
            suma += i;
            producto *= i;
        }

        System.out.println("La suma de los 10 primeros números naturales es " + suma + ".");
        System.out.println("El producto de los 10 primeros números naturales es " + producto + ".");
    }

    // Leer secuencia de notas
    public static void ejercicio10(){
        int nota; //variable que va almacenando la nota que se escriba
        boolean diez = false; //booleano que se activa solo si recibe un 10

        //do-while: primero pido la nota y luego miro si es -1 para salir
        do {
            System.out.print("Introduzca una nota del 0 al 10 (-1 para salir): ");
            nota = sc.nextInt();

            if(nota == 10){
                diez = true; //hay un 10
            }

        } while(nota != -1);

        System.out.println(diez ? "Ha habido al menos un diez." : "No ha habido ningún diez.");
    }

    // Suma pares e impares
    public static void ejercicio11(){
        int sumaImpar = 0; //variable auxiliar para sumar los impares
        int sumaPar = 0; //variable auxiliar para sumar los pares

        //recorro todos los numeros del 100 al 200
        for(int i = 100; i <= 200; i++){
            if(i % 2 == 0) sumaPar += i; // si es par se lo sumo a la variable par
            else sumaImpar += i; // si es impar se lo sumo a la variable impar
        }

        System.out.println("La suma de los pares del 100 al 200 es " + sumaPar + ".");
        System.out.println("La suma de los impares del 100 al 200 es " + sumaImpar + ".");
    }

    // Calcular potencia
    public static void ejercicio12(){
        System.out.println("Se le pedirá un numero y a que potencia elevarlo: ");
        System.out.print("Número: ");
        int num = sc.nextInt();
        System.out.print("Elevado a: ");
        int potencia = sc.nextInt();
        int res = 1;

        for(int i = 0; i < potencia; i++){
            res *= num;
        }

        System.out.println("La potencia de " + num + " elevado a " + potencia + " es igual a " + res);

    }

    // Adivinar numero del 1 al 100
    public static void ejercicio13(){
        System.out.println("Piense en un número del 1 al 100.");

        boolean acertado = false;
        int min = 1;
        int max = 100;

        do {

            int intento = (min + max) / 2;

            System.out.println();
            System.out.println("¿Es " + intento + " su número?");
            System.out.println("0 - Mi número es menor");
            System.out.println("1 - Mi número es mayor");
            System.out.println("2 - ¡Has acertado!");

            int respuesta = auxLeerInt();

            if(respuesta == 0){

                max = intento - 1;

            } else if(respuesta == 1){

                min = intento + 1;

            } else if(respuesta == 2){

                acertado = true;

            } else {

                System.out.println("Respuesta no válida.");

            }

        } while(!acertado);

        System.out.println("¡He acertado! Tu número es " + ((min + max) / 2) + ".");
    }

    // Billetes necesarios
    public static void ejercicio14(){
        System.out.print("Introduzca una cantidad de euros (múltiplo de 5): ");
        int cantidad = sc.nextInt();

        if(cantidad <= 0 || cantidad % 5 != 0){

            System.out.println("La cantidad debe ser positiva y múltiplo de 5.");
            return;
        }

        int[] billetes = {500, 200, 100, 50, 20, 10, 5};

        for(int i = 0; i < billetes.length; i++){

            int cantidadBilletes = cantidad / billetes[i];

            if(cantidadBilletes > 0){

                System.out.println(
                    cantidadBilletes + " billete(s) de " + billetes[i] + " €."
                );

                cantidad = cantidad % billetes[i];
            }
        }
    }

    //---METODOS AUXILIARES---
    public static int auxLeerEnteroFraseRango(String fraseMostrada, int minimo, int maximo){
        System.out.println(fraseMostrada);
        System.out.println();
        int aux = sc.nextInt();
        sc.nextLine();
        if(aux < minimo || aux > maximo) System.out.println("El numero introducido no es valido");
        return aux;
    }
    
    public static int factorial(int n){
        if(n <= 1) return 1;
        return n * factorial(n-1);
    }

    public static int factorialBucle(int n){
        int resultado = 1;

        for(int i = 1; i <= n; i++){
            resultado *= i;
        }

        return resultado;
    }

    public static int auxLeerInt(){
        int aux = sc.nextInt();
        sc.nextLine();
        return aux;
    }
}
