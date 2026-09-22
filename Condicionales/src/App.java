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
                    ejercicio8();
                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10();
                    break;
                default:
                    System.out.println("El valor introducido no corresponde con ningún ejercicio.");
            }
        }while(running);
        

        sc.close();
    }

    //--- EJERCICIOS CONDICIONALES EXTRA ---

    //El triángulo válido y su tipo
    public static void ejercicio1(){
        System.out.println("\n--- VALIDADOR DE TRIÁNGULOS ---\n");

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

    //Días del mes y año bisiesto
    public static void ejercicio2(){
        System.out.println("\n--- CALCULADOR DE DÍAS DEL MES ---\n");

        System.out.println("Introduzca el número del mes:");
        int mes = sc.nextInt();

        System.out.println("Introduzca el año:");
        int anyo = sc.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("El mes introducido no es válido.");
        } else {
            int dias;

            if (mes == 2) {
                if (esBisiesto(anyo)) {
                    dias = 29;
                } else {
                    dias = 28;
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                dias = 30;
            } else {
                dias = 31;
            }

            System.out.println("El mes introducido tiene " + dias + " días.");
        }
    }

    //Validador de fecha completa
    public static void ejercicio3(){
        System.out.println("\n--- VALIDADOR DE FECHA ---\n");

        System.out.println("Introduzca un día:");
        int dia = sc.nextInt();

        System.out.println("Introduzca un mes:");
        int mes = sc.nextInt();

        System.out.println("Introduzca un año:");
        int anyo = sc.nextInt();

        boolean fechaValida = false;

        if (mes >= 1 && mes <= 12 && dia >= 1) {

            int diasDelMes;

            if (mes == 2) {
                if (esBisiesto(anyo)) {
                    diasDelMes = 29;
                } else {
                    diasDelMes = 28;
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                diasDelMes = 30;
            } else {
                diasDelMes = 31;
            }

            if (dia <= diasDelMes) {
                fechaValida = true;
            }
        }

        if (fechaValida) {
            System.out.println("La fecha introducida es válida.");
        } else {
            System.out.println("La fecha introducida no es válida.");
        }
    }

    //Aparcamiento por tramos
    public static void ejercicio4(){
        System.out.println("\n--- TARIFA DE APARCAMIENTO ---\n");

        System.out.println("Introduzca los minutos estacionados:");
        int minutos = sc.nextInt();

        double precioFinal;

        if (minutos <= 0) {
            precioFinal = 0;
            System.out.println("El número de minutos no es válido.");
            return;
        }

        if (minutos <= 30) {
            precioFinal = 0;
        } else if (minutos <= 120) {
            precioFinal = (minutos - 30) * 0.05;
        } else if (minutos <= 360) {
            precioFinal = (90 * 0.05) + ((minutos - 120) * 0.03);
        } else {
            precioFinal = 18;
        }

        System.out.println("El precio a pagar es de " + precioFinal + " euros.");
    }

    //Clasificacion de cuadrantes y ejes
    public static void ejercicio5(){
        System.out.println("\n--- CLASIFICACIÓN DEL PUNTO ---\n");

        System.out.println("Introduzca la coordenada X:");
        int x = sc.nextInt();

        System.out.println("Introduzca la coordenada Y:");
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("El punto se encuentra en el origen.");
        } else if (y == 0) {
            System.out.println("El punto se encuentra sobre el eje X.");
        } else if (x == 0) {
            System.out.println("El punto se encuentra sobre el eje Y.");
        } else if (x > 0 && y > 0) {
            System.out.println("El punto se encuentra en el primer cuadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("El punto se encuentra en el segundo cuadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("El punto se encuentra en el tercer cuadrante.");
        } else {
            System.out.println("El punto se encuentra en el cuarto cuadrante.");
        }
    }

    //Descuento de tienda por categoria y volumen
    public static void ejercicio6(){
        System.out.println("\n--- DESCUENTO DE TIENDA ---\n");

        System.out.println("Introduzca su categoría de cliente (VIP / ESTANDAR):");
        String categoria = sc.next();

        System.out.println("Introduzca el importe bruto:");
        double precio = sc.nextDouble();

        double descuento = 0;

        if (categoria.equalsIgnoreCase("VIP")) {
            descuento = 15;
        } else if (categoria.equalsIgnoreCase("ESTANDAR")
                || categoria.equalsIgnoreCase("ESTÁNDAR")) {
            descuento = 5;
        } else {
            System.out.println("La categoría introducida no es válida.");
            return;
        }

        if (precio > 200) {
            descuento += 5;
        }

        double precioFinal = precio - (precio * descuento / 100);

        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Precio final: " + precioFinal + " euros.");
    }

    //Calculadora de piedra papel o tijera
    public static void ejercicio7(){
        System.out.println("\n--- PIEDRA, PAPEL O TIJERA ---\n");

        System.out.println("1 = Piedra");
        System.out.println("2 = Papel");
        System.out.println("3 = Tijera");

        System.out.println("Jugador 1:");
        int j1 = sc.nextInt();

        System.out.println("Jugador 2:");
        int j2 = sc.nextInt();

        if (j1 < 1 || j1 > 3 || j2 < 1 || j2 > 3) {
            System.out.println("Las jugadas introducidas no son válidas.");
        } else if (j1 == j2) {
            System.out.println("Empate.");
        } else if ((j1 == 1 && j2 == 3)
                || (j1 == 2 && j2 == 1)
                || (j1 == 3 && j2 == 2)) {
            System.out.println("Gana el jugador 1.");
        } else {
            System.out.println("Gana el jugador 2.");
        }
    }

    //Ordenacion de 3 numeros
    public static void ejercicio8(){
        System.out.println("\n--- ORDENACIÓN DE TRES NÚMEROS ---\n");

        System.out.println("Introduzca el primer número:");
        int num1 = sc.nextInt();

        System.out.println("Introduzca el segundo número:");
        int num2 = sc.nextInt();

        System.out.println("Introduzca el tercer número:");
        int num3 = sc.nextInt();

        int aux;

        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        if (num1 > num3) {
            aux = num1;
            num1 = num3;
            num3 = aux;
        }

        if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        }

        System.out.println(num1 + ", " + num2 + ", " + num3);
    }

    //Nomina con horas extras nocturnas
    public static void ejercicio9(){
        System.out.println("\n--- NÓMINA ---\n");

        System.out.println("Introduzca las horas semanales diurnas:");
        int horasDiurnas = sc.nextInt();

        System.out.println("Introduzca las horas semanales nocturnas:");
        int horasNocturnas = sc.nextInt();

        int totalHoras = horasDiurnas + horasNocturnas;

        double salarioBruto;

        if (totalHoras <= 40) {
            salarioBruto = (horasDiurnas * 10) + (horasNocturnas * 15);
        } else {
            int horasExtra = totalHoras - 40;

            int horasExtraNocturnas = Math.min(horasExtra, horasNocturnas);
            int horasExtraDiurnas = horasExtra - horasExtraNocturnas;

            int horasNocturnasNormales = horasNocturnas - horasExtraNocturnas;
            int horasDiurnasNormales = horasDiurnas - horasExtraDiurnas;

            salarioBruto = (horasDiurnasNormales * 10)
                    + (horasNocturnasNormales * 15)
                    + (horasExtraDiurnas * 10 * 1.5)
                    + (horasExtraNocturnas * 15 * 1.5);
        }

        System.out.println("El salario bruto por semana es de "
                + salarioBruto + " euros.");
    }

    //Calculadora de IMC detallada
    public static void ejercicio10(){
        System.out.println("\n--- CALCULADORA DE IMC ---\n");

        System.out.println("Introduzca su peso en kilos:");
        double peso = sc.nextDouble();

        System.out.println("Introduzca su altura en metros:");
        double altura = sc.nextDouble();

        System.out.println("Introduzca su edad:");
        int edad = sc.nextInt();

        double imc = peso / (altura * altura);

        System.out.println("Su IMC es: " + imc);

        if (imc < 18.5) {
            System.out.println("Bajo peso.");

            if (edad > 65) {
                System.out.println(
                    "Atención: Riesgo elevado para la tercera edad."
                );
            }

        } else if (imc < 25) {
            System.out.println("Peso normal.");

        } else if (imc < 30) {
            System.out.println("Sobrepeso.");

        } else {
            System.out.println("Obesidad.");
        }
    }

    //---MÉTODOS AUXILIARES---
    public static boolean esBisiesto(int anyo) {
        return (anyo % 4 == 0 && anyo % 100 != 0)
                || anyo % 400 == 0;
    }
}
