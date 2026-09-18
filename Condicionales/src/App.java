import java.util.Scanner;
import java.util.function.Predicate;


public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        ejercicio6();
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
        int anyo = sc.nextInt();

        boolean valido = false;

        if(diaValido.test(dia) && mesValido.test(mes)){
            if(bisiesto.test(anyo) || febrero.test(mes)) valido = dia > 0 && dia <= 29;
            else if (febrero.test(mes)) valido = dia > 0 && dia <= 28;
            else if (mesDe30.test(mes)) valido = dia > 0 && dia <= 30;
            else valido = dia > 0 && dia <= 31;
            if(valido) System.out.println("La fecha introducida existe.");
            else System.out.println("La fecha introducida no existe.");
        }
        else System.out.println("El formato de la fecha no es correcto.");
    }

    //Aparcamiento por tramos
    public static void ejercicio4(){
        System.out.println("Introduzca los minutos estacionados en el parking: ");
        int minutos = sc.nextInt();

        double precioFinal = 0;

        if(minutos - 360 > 0) precioFinal = 18;
        else if ( minutos - 120 > 0) { precioFinal += (((minutos - 120) * 0.03) + ((120 - 30) * 0.05)); }
        else if (minutos - 30 > 0) { precioFinal += ((minutos - 30) * 0.05);}

        System.out.println("El precio a pagar es de " + precioFinal + " euros.");
    }

    //Clasificacion de cuadrantes y ejes
    public static void ejercicio5(){
        System.out.println("Introduzca la coordenada x: ");
        int x = sc.nextInt();
        System.out.println("Introduzca la coordenada y: ");
        int y = sc.nextInt();

        boolean origen =  x == 0 && y == 0;
        boolean ejeX = x == 0 && y != 0;
        boolean ejeY = y == 0 && x != 0;

        if (origen) System.out.println("El punto se encuentra sobre el origen.");
        else if (ejeX) System.out.println("El punto se encuentra sobre el eje X.");
        else if (ejeY) System.out.println("El punto se encuentra sobre el eje Y.");
        else if (x < 0 && y > 0) System.out.println("El punto se encuentra en el primer cuadrante.");
        else if (x > 0 && y > 0) System.out.println("El punto se encuentra en el segundo cuadrante.");
        else if (x > 0 && y < 0) System.out.println("El punto se encuentra en el cuarto cuadrante");
        else if (x < 0 && y < 0) System.out.println("El punto se encuentra en el tercer cuadrante.");
    }

    //Descuento de tienda por categoria y volumen
    public static void ejercicio6(){
        System.out.println("Introduzca su categoría de cliente (VIP / ESTANDAR): ");
        String cat = sc.nextLine();
        System.out.println("Introduzca el importe a pagar: ");
        double precio = sc.nextInt();

        double descuento = 0;
        if(cat == "VIP" || cat == "vip" || cat == "Vip") descuento = 15;
        else if (cat == "ESTANDAR" || cat == "estandar" || cat == "ESTÁNDAR" || cat == "estándar" || cat == "Estándar" || cat == "Estandar") descuento = 5;

        if (precio >= 200) descuento += 5;

        double precioFinal = precio - ((precio * descuento) / 100);

        System.out.println(("El precio final es de " + precioFinal + " euros."));
    }

    //---MÉTODOS AUXILIARES---
    public static Predicate<Integer> diaValido = dia -> dia >= 1 && dia <= 31;
    public static Predicate<Integer> mesValido = mes -> mes > 0 && mes <= 12;
    public static Predicate<Integer> bisiesto = year -> year % 4 == 0 && year % 100 != 0;
    public static Predicate<Integer> mesDe30 = m -> m == 4 || m == 6 || m == 9 || m == 11;
    public static Predicate<Integer> febrero = m -> m == 2;

    public static void cuantosDiasTiene(int mes, int anyo, int res){
        if(mes == 2 && bisiesto.test(anyo)) res = 29;
            else if (febrero.test(mes)) res = 28;
            else if (mesDe30.test(mes)) res = 30;
            else res = 31;
    }
}
