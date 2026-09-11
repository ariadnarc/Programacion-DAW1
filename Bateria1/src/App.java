import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
       
        /*
        ejercicio1();
        int ladoCuadrado = 5;
        ejercicio2(ladoCuadrado);
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

    }
   
    //--- BATERIA EJERCICIOS INTRODUCCION A JAVA ---
   
    public static void ejercicio1(){
        System.out.println("Buenos días!");
    }
   
    public static void ejercicio2(int lado){
        int area = multiplicacion(lado, lado);
        System.out.println("El área del cuadrado de lado " + lado + "cm es igual a " + area + "cm2.");
    }
   
    public static void ejercicio3(){
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduzca la longitud en cm del lado del cuadrado: ");
        int lado = teclado.nextInt();


        ejercicio2(lado);


        teclado.close();
    }

    public static void ejercicio4(){
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduzca la primera cifra: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduzca la segunda cifra: ");
        int num2 = teclado.nextInt();


        System.out.println("La suma de " + num1 + " + " + num2 + " es igual a " + suma(num1, num2) );
        System.out.println("La resta de " + num1 + " - " + num2 + " es igual a " + resta(num1, num2) );
        System.out.println("El producto de " + num1 + " x " + num2 + " es igual a " + multiplicacion(num1, num2) );
        System.out.println("La división de " + num1 + " entre " + num2 + " es igual a " + division(num1, num2) );


        teclado.close();
    }

    public static void ejercicio5(){
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduzca la longitud del radio en cm: ");
        int radio = teclado.nextInt();


        System.out.println("La longitud de la circunferencia es de " + longitudCircunferencia(radio) + "cm.");
        System.out.println("El área del círculo es de " + areaCircunferencia(radio) + "cm2.");
        System.out.println("El volumen de la esfera es de " + volumenEsfera(radio) + "cm3.");


        teclado.close();
    }

    public static void ejercicio6(){
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduzca el precio al que se vende el artículo: ");
        float precioFinal = teclado.nextFloat();
        System.out.println("Introduzca el precio original del artículo: ");
        float precioOriginal = teclado.nextFloat();


        float porcentajeCompra = (precioFinal *  100) / precioOriginal;
        float descuento = 100 - porcentajeCompra;


        System.out.println("El artículo presenta un " + descuento + "% de descuento.");


        teclado.close();
    }

    public static void ejercicio7(){
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduzca la distancia en millas marítimas: ");
        int millas = teclado.nextInt();
        double metros = millas * 1.852;
        System.out.println("La distancia corresponde a " + metros + "metros.");


        teclado.close();
    }

    public static void ejercicio8(){
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduzca su edad: ");
        int edad = teclado.nextInt();
        if(edad >= 18) System.out.println("Eres mayor de edad.");


        teclado.close();
    }

    public static void ejercicio9(){
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduzca su edad: ");
        int edad = teclado.nextInt();
        if(edad >= 18) System.out.println("Eres mayor de edad.");
        else System.out.println("Eres menor de edad.");


        teclado.close();
    }

    public static void ejercicio10(){
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduzca la primera cifra: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduzca la segunda cifra: ");
        int num2 = teclado.nextInt();


        System.out.println("La suma de " + num1 + " + " + num2 + " es igual a " + suma(num1, num2) );
        System.out.println("La resta de " + num1 + " - " + num2 + " es igual a " + resta(num1, num2) );
        System.out.println("El producto de " + num1 + " x " + num2 + " es igual a " + multiplicacion(num1, num2) );
        if(num2 != 0) System.out.println("La división de " + num1 + " entre " + num2 + " es igual a " + division(num1, num2) );
        else System.out.println("No es posible realizar esta división.");


        teclado.close();
    }

    public static void ejercicio11(){
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduzca la primera cifra: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduzca la segunda cifra: ");
        int num2 = teclado.nextInt();


        if(num1 > num2) System.out.println(num1 + "es mayor que " + num2 );
        else System.out.println(num2 + " es mayor que " + num1 );


        teclado.close();
    }

    public static void ejercicio12(){
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduzca la cifra: ");
        int num = teclado.nextInt();
       
        if(num >= 0) System.out.println("Es positivo.");
        else System.out.println("Es negativo.");


        teclado.close();
    }

    public static void ejercicio13(){
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduzca la primera cifra: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduzca la segunda cifra: ");
        int num2 = teclado.nextInt();


        if(num1 > num2) System.out.println(num2 + ", " + num1 );
        else System.out.println(num1 + ", " + num2 );


        teclado.close();
    }

    public static void ejercicio14(){
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduzca la primera cifra: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduzca la segunda cifra: ");
        int num2 = teclado.nextInt();


        if(num1 > num2) System.out.println(num1 + " es mayor que " + num2 );
        else if (num1 < num2) System.out.println(num2 + " es mayor que " + num1 );
        else System.out.println("Las cifras son iguales.");


        teclado.close();
    }

    public static void ejercicio15(){
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduzca la primera cifra: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduzca la segunda cifra: ");
        int num2 = teclado.nextInt();
        System.out.println("Introduzca la tercera cifra: ");
        int num3 = teclado.nextInt();


        if(num1 > num2 && num1 > num3) System.out.println(num1 + " es la cifra mayor.");
        else if (num2 > num1 && num2 > num3) System.out.println(num2 + " es la cifra mayor.");
        else System.out.println(num3 + " es la cifra mayor.");


        teclado.close();
    }

    public static void ejercicio16(){
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduzca la nota: ");
        double nota = teclado.nextDouble();


        if(nota >= 0 && nota < 3) System.out.println( "Muy deficiente.");
        if(nota >= 3 && nota < 5) System.out.println( "Insuficiente.");
        if(nota >= 5 && nota < 6) System.out.println( "Bien.");
        if(nota >= 6 && nota < 9) System.out.println( "Notable.");
        if(nota >= 9 && nota < 10) System.out.println( "Sobresaliente.");
        else System.out.println("La nota introducida no es válida.");


        teclado.close();
    }

    public static void ejercicio17(){
        Scanner sc = new Scanner(System.in);

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

        sc.close();
    }

    public static void ejercicio18(){
        Scanner sc = new Scanner(System.in);

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

        sc.close();
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

    public static int division(int a, int b){
        return a/b;
    }

    public static double longitudCircunferencia(int radio){
        return 2 * Math.PI * radio;
    }

    public static double areaCircunferencia(int radio){
        return (radio * radio) * Math.PI;
    }

    public static double volumenEsfera(int radio){
        return (4/3) * Math.PI * radio;
    }
   

}
