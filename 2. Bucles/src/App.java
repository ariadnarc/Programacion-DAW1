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

        System.out.println("Bienvenido, pulse cualquier número + ENTER para comenzar.");
        sc.nextInt(); sc.nextLine();

        boolean running = true;

        do {
            System.out.println("\nIntroduzca un número del 1 al 13 para ejecutar un ejercicio:");
            if(sc.hasNextInt()){
                int ej = auxLeerInt();

                Runnable ejercicio = ejercicios.get(ej);

                if(ejercicio != null){
                    ejercicio.run();
                } else {
                    System.out.println("El valor introducido no coincide con ningún ejercicio.");
                }
            } else {
                System.out.println("Por favor, introduzca un número válido.");
                sc.next();
            }

        } while (running);

        sc.close();

    }

    // Mostrar por pantalla numeros del 1 al 20
    public static void ejercicio1(){

        for(int i = 1; i <= 20; i++){
            if(i == 20) System.out.print(i + ".");
            else System.out.print(i + ", ");
        }
    }

    // Mostrar por pantalla pares del 1 al 200 (sumando 2)
    public static void ejercicio2(){

        for(int i = 2; i <= 200; i+= 2){
            if(i == 200) System.out.print(i + ".");
            else System.out.print(i + ", ");
        }
    }

    // Mostrar numeros pares entre el 1 y el 200 (sumando 1)
    public static void ejercicio3(){

        for(int i = 1; i <= 200; i++){
            if(i % 2 == 0){
                if(i == 200) System.out.print(i + ".");
                else System.out.print(i + ", ");
            }
        }
    }

    // Mostrar numeros del 1 al N
    public static void ejercicio4(){
        System.out.println("Introduzca un numero: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(i == n) System.out.print(i + ".");
            else System.out.print(i + ", ");
        }
    }

    // Calcular y mostrar factorial
    public static void ejercicio5(){
        
        int n = auxLeerEnteroFraseRango("Introduzca un numero: ", 0, 12);

        System.out.print(n + "! = ");

        for(int i = n; i >= 1; i--){
            if(i == 1) System.out.print(i + ".\n");
            else System.out.print(i + " * ");
        }

        System.out.println("El factorial de " + n + " es " + factorialBucle(n) + ".");
    }

    // Detectar negativos
    public static void ejercicio6(){

        System.out.println("Se le pediran 10 numeros no nulos:");

        int[] listaNums = new int[10];
        boolean negativo = false;

        for(int i = 0; i < listaNums.length; i++){
            System.out.print("Número " + (i + 1) + ": ");
            listaNums[i] = sc.nextInt();
        }

        for(int i = 0; i < listaNums.length; i++){
            if(listaNums[i] < 0){
                negativo = true;
            }
        }

        System.out.println(
            negativo
            ? "Se ha detectado al menos un numero negativo."
            : "No se ha detectado ningun numero negativo."
        );
    }

    // Detectar cuantos negativos
    public static void ejercicio7(){
        System.out.println("Se le pediran 10 numeros no nulos:");

        int[] listaNums = new int[10];

        int positivos = 0;
        int negativos = 0;

        for(int i = 0; i < listaNums.length; i++){
            System.out.print("Número " + (i + 1) + ": ");
            listaNums[i] = sc.nextInt();
        }

        for(int i = 0; i < listaNums.length; i++){

            if(listaNums[i] > 0){
                positivos++;
            }
            else if(listaNums[i] < 0){
                negativos++;
            }
        }

        System.out.println("Hay " + positivos + " números positivos.");
        System.out.println("Hay " + negativos + " números negativos.");
        
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

        int[] listaNums = new int[10]; //array con los numeros del 1 al 10
        int auxSuma = 0; //auxiliar para almacenar la suma
        long auxMult = 1; //auxiliar para almacenar la multiplicacion

        // relleno el array con el indice + 1 para que empiece en 1 y no en 0
        for(int i = 0; i < listaNums.length; i++){
            listaNums[i] = i+1;
            System.out.println(listaNums[i]);
        }

        //relleno las variables auxiliares
        for(int i = 0; i< listaNums.length; i++){
            auxSuma += listaNums[i];
            auxMult *= listaNums[i];
        }

        System.out.println("La suma de los numeros es igual a " + auxSuma);
        System.out.println("El producto de los numeros es igual a " + auxMult);
    }

    // Leer secuencia de notas
    public static void ejercicio10(){
        int nota; //variable que va almacenando la nota que se escriba
        boolean diez = false; //booleano que se activa solo si recibe un 10

        //do-while: primero pido la nota y luego miro si es -1 para salir
        do {
            System.out.print("Introduzca una nota del 1 al 10 (-1 para salir): ");
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

        System.out.println("La suma de los pares del 100 al 200 es " + sumaPar + " y la suma de los impares del 100 al 200 es " + sumaImpar);
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

        do{
            System.out.println("¿Es mayor que " + ((min + max) / 2) + "?  (0: No / 1: SÍ / 2: ¡ES MI NÚMERO! ) ");
            int res = auxLeerInt();
            if(res == 0){
                max /= 2;
            } else if (res == 1) {
                min = ((min + max) / 2);
            } else {
                acertado = true;
            }

        } while(!acertado);

        System.out.println("Su número es " + ((min + max) / 2));
    }

    // Billetes necesarios
    public static void ejercicio14(){
        
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
