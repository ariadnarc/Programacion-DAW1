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
        
    }

    public static void ejercicio2(){
        
    }

    public static void ejercicio3(){

    }

    public static void ejercicio4(){
        
    }

    public static void ejercicio5(){
        
    }

    public static void ejercicio6(){
        
    }

    public static void ejercicio7(){
        
    }

    public static void ejercicio8(){
        
    }

    public static void ejercicio9(){
        
    }

    public static void ejercicio10(){

    }

    // --- METODOS AUXILIARES ---

    public static int auxLeerInt(){
        int aux = sc.nextInt();
        sc.nextLine();
        return aux;
    }
}
