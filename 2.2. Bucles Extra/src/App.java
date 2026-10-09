import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        Map<Integer, Runnable> ejercicios = new HashMap<>();

        ejercicios.put(1, App::ejercicio1);
        ejercicios.put(2, App::ejercicio2);
        ejercicios.put(3, App::ejercicio3);
        ejercicios.put(4, App::ejercicio4);

        boolean running = true;

        do {

            System.out.println();
            System.out.println("========== MENÚ ==========");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
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

    public static void ejercicio1(){
        int num = 0;

        System.out.println("Introduzca un día de la semana (1-7) o el número 0 para salir: ");
        do{
            num = auxLeerInt();

            if(num == 1) System.out.println("Lunes");
            else if (num == 2) System.out.println("Martes");
            else if (num == 3) System.out.println("Miércoles");
            else if (num == 4) System.out.println("Jueves");
            else if (num == 5) System.out.println("Viernes");
            else if (num == 6) System.out.println("Sábado");
            else if (num == 7) System.out.println("Domingo");
            else {System.out.println("El número introducido no es válido.");}

        }while(num != 0);

        
    }

    public static void ejercicio2(){
        System.out.println("Introduzca la longitud en cm del primer lado:");
        int lado1 = sc.nextInt();

        System.out.println("Introduzca la longitud en cm del segundo lado:");
        int lado2 = sc.nextInt();

        System.out.println("Introduzca la longitud en cm del tercer lado:");
        int lado3 = sc.nextInt();

        boolean valido = lado1 > 0 && lado2 > 0 && lado3 > 0
                && lado1 + lado2 > lado3
                && lado1 + lado3 > lado2
                && lado2 + lado3 > lado1;

        if (valido) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triángulo es isósceles.");
            } else {
                System.out.println("El triángulo es escaleno.");
            }
        } else {
            System.out.println("El triángulo no es válido.");
        }
    }

    public static void ejercicio3(){
        int num = 0;
        int res = 0;

        System.out.println("Introduzca un número positivo: ");
        num = auxLeerInt();

        for(int i = 0; i <= 10; i++){
            System.out.println(num + " x " + i + " = ");
            res = auxLeerInt();

            if(res != (num * i)) System.out.println("Resultado incorrecto");
            else System.out.println("Correcto");
        }

    }

    public static void ejercicio4(){
        
    }



    // --- METODOS AUXILIARES ---
    
    public static int auxLeerInt(){
            int aux = sc.nextInt();
            sc.nextLine();
            return aux;
        }
}




