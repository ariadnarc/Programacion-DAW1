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
        for(int i = 2; i <= 200; i++){
            if(i == 200) System.out.print(i + ".");
            else {
                System.out.print(i + ", ");
                i++;
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
        
        int n = auxLeerEnteroFraseRango("Introduzca un numero: ", 0, 100000);

        System.out.print(n + "! = ");

        for(int i = n; i >= 1; i--){
            if(i == 1) System.out.print(i + ".\n");
            else System.out.print(i + " * ");
        }
        System.out.println("El factorial de " + n + " es " + factorial(n) + ".");
    }

    //Detectar negativos
    public static void ejercicio6(){

        System.out.println("Se le pediran 10 numeros mayores que 0: ");
        int[] listaNums = {0,0,0,0,0,0,0,0,0,0,};
        boolean negativo = false;

        for(int i = 0; i < 10; i++){
            System.out.print("Número " + i + ": ");
            listaNums[i] = sc.nextInt();
        }

        for(int i = 0; i < listaNums.length; i++){
            if(i < 0) negativo = true;
            else negativo = false;
        }

        System.out.println(negativo ? "Se ha detectado al menos un numero negativo" : "Todos los números son positivos.");
    }

    //Detectar cuantos negativos
    public static void ejercicio7(){
        System.out.println("Se le pediran 10 numeros mayores que 0: ");
        int[] listaNums = {0,0,0,0,0,0,0,0,0,0,};
        boolean negativo = false;
        int aux = 0;

        for(int i = 0; i < 10; i++){
            System.out.print("Número " + i + ": ");
            listaNums[i] = sc.nextInt();
        }

        for(int i = 0; i < listaNums.length; i++){
            if(i < 0) {
                negativo = true;
                aux++;
            }
            else negativo = false;
        }

        if(negativo){
            System.out.println("Hay " + aux + " numeros negativos.");
        }
        else{
            System.out.println("Todos los números son positivos.");
        }
        
    }

    //Detectar negativos y positivos hasta que se escriba un 0
    public static void ejercicio8(){
        int num = 0;

        do {
            num = auxLeerEnteroFraseRango("Introduzca un numero o 0 para parar: ", 0, 10000);
        }while (num != 0);

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
}
