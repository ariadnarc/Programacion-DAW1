import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        System.out.println("Bienvenido, pulse cualquier número + ENTER para comenzar.");
        int ej = sc.nextInt();
        boolean running = true;

        do{
            //--- MENU INICIAL ---
            System.out.println("\n Introduzca un número del 1 al 10 para ejecutar un ejercicio.");

            if(sc.hasNextInt()){
                ej = sc.nextInt();
            }
            else {
                System.out.println("Por favor, introduzca un número válido.");
                sc.next();
                continue;
            }

            switch(ej){
                case 1:
                    //ejercicio1();
                    break;
                case 2:
                    //ejercicio2();
                    break;
                case 3:
                    //ejercicio3();
                    break;
                case 4:
                    //ejercicio4();
                    break;
                case 5:
                    //ejercicio5();
                    break;
                case 6:
                    //ejercicio6();
                    break;
                case 7:
                    //ejercicio7();
                    break;
                case 8:
                    //ejercicio8();
                    break;
                case 9:
                    //ejercicio9();
                    break;
                case 10:
                    //ejercicio10();
                    break;
                default:
                    System.out.println("El valor introducido no corresponde con ningún ejercicio.");
            }
        }while(running);
        

        sc.close();
    }
}
