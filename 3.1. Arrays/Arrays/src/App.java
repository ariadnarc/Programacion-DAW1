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
