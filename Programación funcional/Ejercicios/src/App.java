import java.util.Scanner;
import java.util.function.Function;


public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        /*
        ejercicio1();

        ejercicio2();
        
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
        ejercicio11();
        ejercicio12();
        ejercicio13();
        ejercicio14();
        ejercicio15();
        ejercicio16();
        ejercicio17();
        ejercicio18();
        
        */

        sc.close();
    }

    //--- BATERIA EJERCICIOS INTRODUCCION A JAVA ---
    
    public static void ejercicio1(){
        System.out.println("Buenos días!");
    }
    
    public static void ejercicio2(){
        double lado = 5;

        Function<Double, Double> calcularArea = x -> x * x;

        double area = calcularArea.apply(lado);

        System.out.println("El área del cuadrado es: " + area);
    }
    
    public static void ejercicio3(){

        System.out.print("Introduce el lado del cuadrado: ");
        double lado = sc.nextDouble();

        Function<Double, Double> calcularArea = x -> x * x;

        double area = calcularArea.apply(lado);

        System.out.println("El área del cuadrado es: " + area);


        
    }

    public static void ejercicio4(){
        System.out.println("Introduzca la primera cifra: ");
        int num1 = sc.nextInt();
        System.out.println("Introduzca la segunda cifra: ");
        int num2 = sc.nextInt();


        System.out.println("La suma de " + num1 + " + " + num2 + " es igual a " + suma(num1, num2) );
        System.out.println("La resta de " + num1 + " - " + num2 + " es igual a " + resta(num1, num2) );
        System.out.println("El producto de " + num1 + " x " + num2 + " es igual a " + multiplicacion(num1, num2) );
        System.out.println("La división de " + num1 + " entre " + num2 + " es igual a " + division(num1, num2) );

    }

    public static void ejercicio5(){
        System.out.println("Introduzca la longitud del radio en cm: ");
        int radio = sc.nextInt();


        System.out.println("La longitud de la circunferencia es de " + longitudCircunferencia(radio) + "cm.");
        System.out.println("El área del círculo es de " + areaCircunferencia(radio) + "cm2.");
        System.out.println("El volumen de la esfera es de " + volumenEsfera(radio) + "cm3.");

    }

    public static void ejercicio6(){
        System.out.println("Introduzca el precio al que se vende el artículo: ");
        float precioFinal = sc.nextFloat();
        System.out.println("Introduzca el precio original del artículo: ");
        float precioOriginal = sc.nextFloat();


        float porcentajeCompra = (precioFinal *  100) / precioOriginal;
        float descuento = 100 - porcentajeCompra;


        System.out.println("El artículo presenta un " + descuento + "% de descuento.");
    }

    public static void ejercicio7(){
        System.out.println("Introduzca la distancia en millas marítimas: ");
        int millas = sc.nextInt();
        double metros = millas * 1.852;
        System.out.println("La distancia corresponde a " + metros + "metros.");
    }

    public static void ejercicio8(){
        System.out.println("Introduzca su edad: ");
        int edad = sc.nextInt();
        if(edad >= 18) System.out.println("Eres mayor de edad.");
    }

    public static void ejercicio9(){
        System.out.println("Introduzca su edad: ");
        int edad = sc.nextInt();
        if(edad >= 18) System.out.println("Eres mayor de edad.");
        else System.out.println("Eres menor de edad.");
    }

    public static void ejercicio10(){
        System.out.println("Introduzca la primera cifra: ");
        int num1 = sc.nextInt();
        System.out.println("Introduzca la segunda cifra: ");
        int num2 = sc.nextInt();


        System.out.println("La suma de " + num1 + " + " + num2 + " es igual a " + suma(num1, num2) );
        System.out.println("La resta de " + num1 + " - " + num2 + " es igual a " + resta(num1, num2) );
        System.out.println("El producto de " + num1 + " x " + num2 + " es igual a " + multiplicacion(num1, num2) );
        if(num2 != 0) System.out.println("La división de " + num1 + " entre " + num2 + " es igual a " + division(num1, num2) );
        else System.out.println("No es posible realizar esta división.");
    }

    public static void ejercicio11(){
        System.out.println("Introduzca la primera cifra: ");
        int num1 = sc.nextInt();
        System.out.println("Introduzca la segunda cifra: ");
        int num2 = sc.nextInt();


        if(num1 > num2) System.out.println(num1 + "es mayor que " + num2 );
        else System.out.println(num2 + " es mayor que " + num1 );
    }

    public static void ejercicio12(){
        System.out.println("Introduzca la cifra: ");
        int num = sc.nextInt();
        
        if(num >= 0) System.out.println("Es positivo.");
        else System.out.println("Es negativo.");
    }

    public static void ejercicio13(){
        System.out.println("Introduzca la primera cifra: ");
        int num1 = sc.nextInt();
        System.out.println("Introduzca la segunda cifra: ");
        int num2 = sc.nextInt();


        if(num1 > num2) System.out.println(num2 + ", " + num1 );
        else System.out.println(num1 + ", " + num2 );
    }

    public static void ejercicio14(){
        System.out.println("Introduzca la primera cifra: ");
        int num1 = sc.nextInt();
        System.out.println("Introduzca la segunda cifra: ");
        int num2 = sc.nextInt();


        if(num1 > num2) System.out.println(num1 + " es mayor que " + num2 );
        else if (num1 < num2) System.out.println(num2 + " es mayor que " + num1 );
        else System.out.println("Las cifras son iguales.");
    }

    public static void ejercicio15(){
        System.out.println("Introduzca la primera cifra: ");
        int num1 = sc.nextInt();
        System.out.println("Introduzca la segunda cifra: ");
        int num2 = sc.nextInt();
        System.out.println("Introduzca la tercera cifra: ");
        int num3 = sc.nextInt();


        if(num1 > num2 && num1 > num3) System.out.println(num1 + " es la cifra mayor.");
        else if (num2 > num1 && num2 > num3) System.out.println(num2 + " es la cifra mayor.");
        else System.out.println(num3 + " es la cifra mayor.");
    }

    public static void ejercicio16(){
        System.out.println("Introduzca la nota: ");
        double nota = sc.nextDouble();


        if (nota >= 0 && nota < 3) System.out.println("Muy deficiente.");
        else if (nota < 5) System.out.println("Insuficiente.");
        else if (nota < 6) System.out.println("Bien.");
        else if (nota < 9) System.out.println("Notable.");
        else if (nota <= 10) System.out.println("Sobresaliente.");
        else System.out.println("La nota introducida no es válida.");
    }

    public static void ejercicio17(){
        System.out.print("Introduce las horas: ");
        int horas = sc.nextInt();

        System.out.print("Introduce los minutos: ");
        int minutos = sc.nextInt();

        System.out.print("Introduce los segundos: ");
        int segundos = sc.nextInt();

        segundos++;

        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }

        if (minutos == 60) {
            minutos = 0;
            horas++;
        }

        if (horas == 24) {
            horas = 0;
        }

        System.out.println("La hora dentro de un segundo será: "
                + horas + ":" + minutos + ":" + segundos);
    }

    public static void ejercicio18(){
        System.out.print("Introduce el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce las horas trabajadas: ");
        double horas = sc.nextDouble();

        System.out.print("Introduce la tarifa por hora: ");
        double tarifa = sc.nextDouble();

        // Calcular salario bruto
        double salarioBruto;

        if (horas <= 35) {
            salarioBruto = horas * tarifa;
        } else {
            salarioBruto = (35 * tarifa) + ((horas - 35) * tarifa * 1.5);
        }

        // Calcular impuestos
        double impuestos;

        if (salarioBruto <= 500) {
            impuestos = 0;
        } else if (salarioBruto <= 900) {
            impuestos = (salarioBruto - 500) * 0.25;
        } else {
            impuestos = (400 * 0.25) + ((salarioBruto - 900) * 0.45);
        }

        // Calcular salario neto
        double salarioNeto = salarioBruto - impuestos;

        // Mostrar resultados
        System.out.println("\n--- DATOS DEL TRABAJADOR ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario bruto: " + salarioBruto + " €");
        System.out.println("Impuestos: " + impuestos + " €");
        System.out.println("Salario neto: " + salarioNeto + " €");
    }


    //--- METODOS AUXILIARES ---
    public static int suma(int a, int b){
        return a + b;
    }

    public static int resta(int a, int b){
        return a - b;
    }

    public static int multiplicacion(int a, int b){
        return a * b;
    }

    public static double division(int a, int b){
        return (double) a / b;
    }

    public static double longitudCircunferencia(int radio){
        return 2 * Math.PI * radio;
    }

    public static double areaCircunferencia(int radio){
        return (radio * radio) * Math.PI;
    }

    public static double volumenEsfera(int radio){
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }


}
