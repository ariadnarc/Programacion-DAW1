import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;


public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        System.out.println("¡Bienvenido! Pulse cualquier número + ENTER para comenzar.");
        int ej = sc.nextInt();
        boolean running = true;
        
        do{
            //--- MENU INICIAL ---
            System.out.println("\n Introduzca un número del 1 al 18 para ejecutar un ejercicio.");

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
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;
                case 8:
                    ejercicio8y9(false);
                    break;
                case 9:
                    ejercicio8y9(true);
                    break;
                case 10:
                    ejercicio10();
                    break;
                case 11:
                    ejercicio11();
                    break;
                case 12:
                    ejercicio12();
                    break;
                case 13:
                    ejercicio13();
                    break;
                case 14:
                    ejercicio14();
                    break;
                case 15:
                    ejercicio15();
                    break;
                case 16:
                    ejercicio16();
                    break;
                case 17:
                    ejercicio17();
                    break;
                case 18:
                    ejercicio18();
                    break;
                default:
                    System.out.println("El valor introducido no corresponde con ningún ejercicio.");
            }
        }while(running);
        
        sc.close();
    }

    //--- BATERIA EJERCICIOS INTRODUCCION A JAVA ---
    
    public static void ejercicio1(){
        System.out.println("¡Buenos días!");
    }
    
    public static void ejercicio2(){
        double lado = 5;

        double area = calcularArea.apply(lado);

        System.out.println("El área del cuadrado es: " + area);
    }
    
    public static void ejercicio3(){

        System.out.print("Introduce el lado del cuadrado: ");
        double lado = sc.nextDouble();
        
        double area = calcularArea.apply(lado);
        
        System.out.println("El área del cuadrado es: " + area);
        
    }
    
    public static void ejercicio4(){
        System.out.println("Introduzca la primera cifra: ");
        int num1 = sc.nextInt();
        System.out.println("Introduzca la segunda cifra: ");
        int num2 = sc.nextInt();
        
        System.out.println("La suma de " + num1 + " + " + num2 + " es igual a " + ADD.apply(num1, num2) );
        System.out.println("La resta de " + num1 + " - " + num2 + " es igual a " + SUBSTRACT.apply(num1, num2) );
        System.out.println("El producto de " + num1 + " x " + num2 + " es igual a " + MULTIPLY.apply(num1, num2) );
        System.out.println("La división de " + num1 + " entre " + num2 + " es igual a " + DIVIDE.apply(num1, num2) );
        
    }
    
    public static void ejercicio5(){
        System.out.println("Introduzca la longitud del radio en cm: ");
        double radio = sc.nextDouble();
        
        
        System.out.println("La longitud de la circunferencia es de " + circleLength.apply(radio) + "cm.");
        System.out.println("El área del círculo es de " + circleSurface.apply(radio) + "cm2.");
        System.out.println("El volumen de la esfera es de " + sphereVolume.apply(radio) + "cm3.");
        
    }
    
    public static void ejercicio6(){
        System.out.println("Introduzca el precio al que se compró el artículo: ");
        double precioCompra = sc.nextDouble();
        System.out.println("Introduzca el precio original del artículo: ");
        double precioOriginal = sc.nextDouble();
        
        BinaryOperator<Double> percentage = (a, b) -> (a * 100) / b;
        double descuento = 100 - percentage.apply(precioCompra, precioOriginal);
        
        System.out.println("El artículo presenta un " + descuento + "% de descuento.");
    }
    
    public static void ejercicio7(){
        System.out.println("Introduzca la distancia en millas marítimas: ");
        double millas = sc.nextInt();

        Function<Double, Double> milesConversor = (a) -> a * 1.852;

        System.out.println("La distancia corresponde a " + milesConversor.apply(millas) + " metros.");
    }
    
    public static void ejercicio8y9(boolean res){
        System.out.println("Introduzca su edad: ");
        int edad = sc.nextInt();

        if(res) System.out.println(isAdult.test(edad) ? "Eres mayor de edad." : "Eres menor de edad.");
        else System.out.println(isAdult.test(edad) ? "Eres mayor de edad." : " ");
    }
    
    public static void ejercicio10(){
        System.out.println("Introduzca la primera cifra: ");
        int num1 = sc.nextInt();
        System.out.println("Introduzca la segunda cifra: ");
        int num2 = sc.nextInt();
        
        
        System.out.println("La suma de " + num1 + " + " + num2 + " es igual a " + ADD.apply(num1, num2) );
        System.out.println("La resta de " + num1 + " - " + num2 + " es igual a " + SUBSTRACT.apply(num1, num2) );
        System.out.println("El producto de " + num1 + " x " + num2 + " es igual a " + MULTIPLY.apply(num1, num2) );
        if(num2 != 0) System.out.println("La división de " + num1 + " entre " + num2 + " es igual a " + DIVIDE.apply(num1, num2) );
        else System.out.println("No es posible realizar esta división.");
    }
    
    public static void ejercicio11(){
        System.out.println("Introduzca la primera cifra: ");
        int num1 = sc.nextInt();
        System.out.println("Introduzca la segunda cifra: ");
        int num2 = sc.nextInt();
        
        System.out.println(num1>num2 ? num1 + "es mayor que " + num2 : num2 + " es mayor que " + num1);
    }
    
    public static void ejercicio12(){
        System.out.println("Introduzca la cifra: ");
        int num = sc.nextInt();
        
        System.out.println(num >= 0 ? "Es positivo." : "Es negativo.");
    }
    
    public static void ejercicio13(){
        System.out.println("Introduzca la primera cifra: ");
        int num1 = sc.nextInt();
        System.out.println("Introduzca la segunda cifra: ");
        int num2 = sc.nextInt();
        
        System.out.println(num1>num2 ? num2 + ", " + num1 : num1 + ", " + num2);
    }
    
    public static void ejercicio14(){
        System.out.println("Introduzca la primera cifra: ");
        int num1 = sc.nextInt();
        System.out.println("Introduzca la segunda cifra: ");
        int num2 = sc.nextInt();
        
        if(isBigger.test(num1, num2)) System.out.println(num1 + " es mayor que " + num2 );
        else if (isBigger.test(num2, num1)) System.out.println(num2 + " es mayor que " + num1 );
        else System.out.println("Las cifras son iguales.");
    }
    
    public static void ejercicio15(){
        System.out.println("Introduzca la primera cifra: ");
        int num1 = sc.nextInt();
        System.out.println("Introduzca la segunda cifra: ");
        int num2 = sc.nextInt();
        System.out.println("Introduzca la tercera cifra: ");
        int num3 = sc.nextInt();
        
        
        if(isBigger.test(num1, num2) && isBigger.test(num1, num3)) System.out.println(num1 + " es la cifra mayor.");
        else if (isBigger.test(num2, num1) && isBigger.test(num2, num3)) System.out.println(num2 + " es la cifra mayor.");
        else System.out.println(num3 + " es la cifra mayor.");
    }
    
    public static void ejercicio16(){
        System.out.println("Introduzca la nota: ");
        double nota = sc.nextDouble();
        
        System.out.println(calcularNota.apply(nota));
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
        
        salarioBruto = horas <= 35 ? horas * tarifa : (35 * tarifa) + ((horas - 35) * tarifa * 1.5);
        
        // Calcular impuestos y salario neto
        double impuestos = calcularImpuestos.apply(salarioBruto);
        double salarioNeto = calcularNeto.apply(salarioBruto);
        
        // Mostrar resultados
        System.out.println("\n--- DATOS DEL TRABAJADOR ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario bruto: " + salarioBruto + " euros");
        System.out.println("Impuestos: " + impuestos + " euros");
        System.out.println("Salario neto: " + salarioNeto + " euros");
    }
    
    
    //--- METODOS AUXILIARES ---

    public static Function<Double, Double> calcularArea = x -> x * x;

    public static final BinaryOperator<Integer> ADD = (a, b) -> a + b;
    public static final BinaryOperator<Integer> SUBSTRACT = (a, b) -> a - b;
    public static final BinaryOperator<Integer> MULTIPLY = (a, b) -> a * b;
    public static final BinaryOperator<Integer> DIVIDE = (a, b) -> a / b;

    public static Function<Double, Double> circleLength = (r) -> 2 * Math.PI * r;
    public static Function<Double, Double> circleSurface = (r) -> (r * r) * Math.PI;
    public static Function<Double, Double> sphereVolume = (r) -> (4.0 / 3.0) * Math.PI * Math.pow(r, 3);

    public static Predicate<Integer> isAdult = age -> age >= 18;
    public static BiPredicate<Integer, Integer> isBigger = (a, b) -> a > b;

    public static Function<Double, String> calcularNota = nota -> {
    if (nota >= 0 && nota < 3) return "Muy deficiente.";
    if (nota < 5) return "Insuficiente.";
    if (nota < 6) return "Bien.";
    if (nota < 9) return "Notable.";
    if (nota <= 10) return "Sobresaliente.";
    return "La nota introducida no es válida.";
    };

    public static Function<Double, Double> calcularImpuestos = salario -> {
    if (salario <= 500) {
        return 0.0;
    } else if (salario <= 900) {
        return (salario - 500) * 0.25;
    } else {
        return (400 * 0.25) + ((salario - 900) * 0.45);
    }
    };
    public static Function<Double, Double> calcularNeto =
        salario -> salario - calcularImpuestos.apply(salario);

}
