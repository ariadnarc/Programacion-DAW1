import java.util.Scanner;
import java.util.function.Predicate;


public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        ejercicio3();
        sc.close();
    }

    //--- EJERCICIOS CONDICIONALES EXTRA ---

    //El triángulo válido y su tipo
    public static void ejercicio1(){
        System.out.println("\n VALIDADOR DE TRIÁNGULOS \n ");

        System.out.println("\nIntroduzca la longitud en cm del primer lado: ");
        int lado1 = sc.nextInt();
        System.out.println("\nIntroduzca la longitud en cm del segundo lado: ");
        int lado2 = sc.nextInt();
        System.out.println("\nIntroduzca la longitud en cm del tercer lado: ");
        int lado3 = sc.nextInt();

        boolean valido = lado1 + lado2 > lado3 ? true : false;

        if(valido){
            String res = " ";
            if(lado1 == lado2 && lado2 == lado3) res = "equilátero";
            else if ((lado1 == lado2 && lado1 != lado3) || (lado1 == lado3 && lado1 != lado2) || (lado2 == lado3 && lado2 != lado1)) res = "isósceles";
            else res = "escaleno";
            System.out.println("El triángulo es " + res + ".");
        }
        else System.out.println("\nEl triángulo no es válido.");

    }

    //Días del mes y año bisiesto
    public static void ejercicio2(){
        System.out.println("\n CALCULADOR DE DÍAS DEL MES \n ");
        System.out.println("\nIntroduzca el número del mes: ");
        int mes = sc.nextInt();
        System.out.println("\nIntroduzca el año: ");
        int anyo = sc.nextInt();


        if(mesValido.test(mes)){
            int res = 0;
            cuantosDiasTiene(mes, anyo, res);
            System.out.println("El mes introducido tiene " + res + " días.");
        }
        else System.out.println("\nEl mes introducido no es válido.");
    }

    //Validador de fecha completa
    public static void ejercicio3(){
        System.out.println("\nIntroduzca un día: ");
        int dia = sc.nextInt();
        System.out.println("\nintroduzca un mes:");
        int mes = sc.nextInt();
        System.out.println("\nintroduzca un año:");
        //int anyo = sc.nextInt();

        if(diaValido.test(dia) && mesValido.test(mes)){
            
        }
        else System.out.println("El formato de la fecha no es correcto.");
    }

    //Aparcamiento por tramos
    public static void ejercicio4(){

    }

    //---MÉTODOS AUXILIARES---
    public static Predicate<Integer> diaValido = dia -> dia >= 1 && dia <= 31;
    public static Predicate<Integer> mesValido = mes -> mes > 0 && mes <= 12;
    public static Predicate<Integer> bisiesto = year -> year % 4 == 0 && year % 100 != 0;

    public static void cuantosDiasTiene(int mes, int anyo, int res){
        if(mes == 2 && bisiesto.test(anyo)) res = 29;
            else if (mes == 2) res = 28;
            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) res = 30;
            else res = 31;
    }
}
