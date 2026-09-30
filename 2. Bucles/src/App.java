import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        ejercicio6();
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

    //Mostrar numeros del 1 al N
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

    //Detectar negativos
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

    //Detectar cuantos negativos
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

    //Detectar negativos y positivos hasta que se escriba un 0
    public static void ejercicio8(){
        int num;
        int positivos = 0;
        int negativos = 0;

        do {
            System.out.print("Introduzca un numero (0 para terminar): ");
            num = sc.nextInt();

            if(num > 0){
                positivos++;
            }
            else if(num < 0){
                negativos++;
            }

        } while(num != 0);

        System.out.println("Se han introducido " + positivos + " números positivos.");
        System.out.println("Se han introducido " + negativos + " números negativos.");

        if(negativos > 0){
            System.out.println("Se ha detectado al menos un número negativo.");
        }
        else{
            System.out.println("No se ha detectado ningún número negativo.");
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
}
