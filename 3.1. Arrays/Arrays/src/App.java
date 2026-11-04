import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

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
        ejercicios.put(15, App::ejercicio15);
        ejercicios.put(16, App::ejercicio16);
        ejercicios.put(17, App::ejercicio17);
        ejercicios.put(18, App::ejercicio18);
        ejercicios.put(19, App::ejercicio19);
        ejercicios.put(20, App::ejercicio20);

        boolean running = true;

        do{

            System.out.println();
            System.out.println("========== MENÚ ==========");
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("6. ");
            System.out.println("7. ");
            System.out.println("8. ");
            System.out.println("9. ");
            System.out.println("10. ");
            System.out.println("11. ");
            System.out.println("12. ");
            System.out.println("13. ");
            System.out.println("14. ");
            System.out.println("15. ");
            System.out.println("16. ");
            System.out.println("17. ");
            System.out.println("18. ");
            System.out.println("19. ");
            System.out.println("20. ");
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
        }while(running);

    }

    public static void ejercicio1(){
        double[] numeros = new double[10];

        System.out.println("Por favor, introduce 10 números reales:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        System.out.println("\\nLos valores guardados en el array son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición [" + i + "]: " + numeros[i]);
        }
    }

    public static void ejercicio2(){
        double[] numeros = new double[10];
        double suma = 0;

        System.out.println("Por favor, introduce 10 números reales:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        System.out.println("\\nLa suma de todos los valores ingresados es: " + suma);
    }

    public static void ejercicio3(){

        double[] numeros = new double[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número:");
            numeros[i] = sc.nextDouble();
        }

        double maximo = numeros[0];
        double minimo = numeros[0];

        // Recorremos el array para buscar el máximo y el mínimo
        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }

            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        // Mostramos los resultados
        System.out.println("El número máximo es: " + maximo);
        System.out.println("El número mínimo es: " + minimo);
    }

    public static void ejercicio4(){
        // Creamos el array
        int[] numeros = new int[20];

        // Pedimos los veinte números
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número entero:");
            numeros[i] = sc.nextInt();
        }

        // Inicializamos las sumas
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        // Recorremos el array y sumamos según el signo
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
            }

            if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
            }
        }

        // Mostramos los resultados
        System.out.println("La suma de los positivos es: " + sumaPositivos);
        System.out.println("La suma de los negativos es: " + sumaNegativos);
    }

    public static void ejercicio5(){
        // Creamos el array
        double[] numeros = new double[20];

        // Pedimos los veinte números
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número real:");
            numeros[i] = sc.nextDouble();
        }

        // Inicializamos la suma
        double suma = 0;

        // Recorremos el array y sumamos todos los valores
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        // Calculamos la media
        double media = suma / numeros.length;

        // Mostramos el resultado
        System.out.println("La media de los números es: " + media);
    }

    public static void ejercicio6(){
        // Pedimos los dos valores
        System.out.println("Introduce el tamaño del array (N):");
        int n = sc.nextInt();

        System.out.println("Introduce el valor que quieres guardar (M):");
        int m = sc.nextInt();

        // Creamos el array con tamaño N
        int[] numeros = new int[n];

        // Guardamos M en todas las posiciones
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = m;
        }

        // Mostramos el contenido del array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static void ejercicio7(){
        // Pedimos los valores P y Q
        System.out.println("Introduce el valor inicial (P):");
        int p = sc.nextInt();

        System.out.println("Introduce el valor final (Q):");
        int q = sc.nextInt();

        // Calculamos el tamaño del array
        int[] numeros = new int[q - p + 1];

        // Rellenamos el array con los valores desde P hasta Q
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = p + i;
        }

        // Mostramos el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static void ejercicio8(){
        // Creamos el array
        double[] numeros = new double[100];

        // Rellenamos el array con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Math.random();
        }

        // Pedimos el valor R
        System.out.println("Introduce un valor real:");
        double r = sc.nextDouble();

        // Contamos los números iguales o superiores a R
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= r) {
                contador++;
            }
        }

        // Mostramos el resultado
        System.out.println("Hay " + contador + " números iguales o superiores a " + r);
    }

    public static void ejercicio9(){
        // Creamos el array
        int[] numeros = new int[100];

        // Rellenamos el array con números aleatorios del 1 al 10
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (1 + Math.random() * 10);
        }

        // Pedimos el número N
        System.out.println("Introduce un número entre 1 y 10:");
        int n = sc.nextInt();

        // Buscamos las posiciones donde aparece N
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == n) {
                System.out.println("El número aparece en la posición: " + i);
                encontrado = true;
            }
        }

        // Comprobamos si ha aparecido alguna vez
        if (!encontrado) {
            System.out.println("El número no aparece en el array.");
        }
    }

    public static void ejercicio10(){
        // Pedimos la cantidad de personas
        System.out.println("Introduce el número de personas:");
        int n = sc.nextInt();

        // Creamos el array de alturas
        double[] alturas = new double[n];

        // Pedimos las alturas
        for (int i = 0; i < alturas.length; i++) {
            System.out.println("Introduce la altura de la persona " + (i + 1) + " en metros:");
            alturas[i] = sc.nextDouble();
        }

        // Inicializamos las variables
        double suma = 0;
        double maximo = alturas[0];
        double minimo = alturas[0];

        // Recorremos el array para calcular la suma, máximo y mínimo
        for (int i = 0; i < alturas.length; i++) {

            suma += alturas[i];

            if (alturas[i] > maximo) {
                maximo = alturas[i];
            }

            if (alturas[i] < minimo) {
                minimo = alturas[i];
            }
        }

        // Calculamos la media
        double media = suma / alturas.length;

        // Contamos las personas por encima y por debajo de la media
        int porEncima = 0;
        int porDebajo = 0;

        for (int i = 0; i < alturas.length; i++) {

            if (alturas[i] > media) {
                porEncima++;
            }

            if (alturas[i] < media) {
                porDebajo++;
            }
        }

        // Mostramos los resultados
        System.out.println("Altura media: " + media + " metros");
        System.out.println("Altura máxima: " + maximo + " metros");
        System.out.println("Altura mínima: " + minimo + " metros");
        System.out.println("Personas por encima de la media: " + porEncima);
        System.out.println("Personas por debajo de la media: " + porDebajo);
    }

    public static void ejercicio11(){
        
    }

    public static void ejercicio12(){
        
    }

    public static void ejercicio13(){
        
    }

    public static void ejercicio14(){
        
    }

    public static void ejercicio15(){
        
    }

    public static void ejercicio16(){
        
    }

    public static void ejercicio17(){
        
    }

    public static void ejercicio18(){
        
    }

    public static void ejercicio19(){
        
    }

    public static void ejercicio20(){
        
    }

    // --- METODOS AUXILIARES ---

    public static int auxLeerInt(){
        int aux = sc.nextInt();
        sc.nextLine();
        return aux;
    }
}
