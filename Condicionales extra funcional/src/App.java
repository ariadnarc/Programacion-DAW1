import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.HashMap;
import java.util.Map;

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

        System.out.println("Bienvenido, pulse cualquier número + ENTER para comenzar.");
        sc.nextInt(); sc.nextLine();

        boolean running = true;

        do {
            System.out.println("\nIntroduzca un número del 1 al 10 para ejecutar un ejercicio.");
            if (sc.hasNextInt()) {
                int ej = sc.nextInt(); sc.nextLine();

                Runnable ejercicio = ejercicios.get(ej);
                
                if (ejercicio != null) {
                    ejercicio.run();
                } else {
                    System.out.println( "El valor introducido no corresponde con ningún ejercicio." );
                }
            } else {
                System.out.println("Por favor, introduzca un número válido.");
                sc.next();
            }
        } while (running);

        sc.close();
    }

    // Validador de triangulos
    public static void ejercicio1() {
        System.out.println("\n--- VALIDADOR DE TRIÁNGULOS ---\n");

        System.out.println("Introduzca la longitud en cm del primer lado:");
        int lado1 = sc.nextInt(); sc.nextLine();

        System.out.println("Introduzca la longitud en cm del segundo lado:");
        int lado2 = sc.nextInt(); sc.nextLine();

        System.out.println("Introduzca la longitud en cm del tercer lado:");
        int lado3 = sc.nextInt(); sc.nextLine();

        BiFunction<Integer, Integer, Boolean> mayorQue = (a, b) -> a > b;
        
        boolean valido =
        lado1 > 0
        && lado2 > 0
        && lado3 > 0
        && mayorQue.apply(lado1 + lado2, lado3)
        && mayorQue.apply(lado1 + lado3, lado2)
        && mayorQue.apply(lado2 + lado3, lado1);

        //clasifica el triangulo
        Function<int[], String> clasificarTriangulo = lados -> {
            int a = lados[0];
            int b = lados[1];
            int c = lados[2];

            if (a == b && b == c) {
                return "equilátero";
            }
            if (a == b || a == c || b == c) {
                return "isósceles";
            }
            return "escaleno";
        };
        
        if (valido) {
            System.out.println( "El triángulo es "
            + clasificarTriangulo.apply(new int[]{lado1, lado2, lado3}) + "." );
        } else {
            System.out.println("El triángulo no es válido.");
        }
    }

    // Calculador de dias del mes
    public static void ejercicio2() {
        System.out.println("\n--- CALCULADOR DE DÍAS DEL MES ---\n");
        
        System.out.println("Introduzca el número del mes:");
        int mes = sc.nextInt(); sc.nextLine();
        
        System.out.println("Introduzca el año:");
        int anyo = sc.nextInt(); sc.nextLine();
        
        Map<Integer, Integer> diasPorMes = Map.ofEntries(
            Map.entry(1, 31),
            Map.entry(2, 28),
            Map.entry(3, 31),
            Map.entry(4, 30),
            Map.entry(5, 31),
            Map.entry(6, 30),
            Map.entry(7, 31),
            Map.entry(8, 31),
            Map.entry(9, 30),
            Map.entry(10, 31),
            Map.entry(11, 30),
            Map.entry(12, 31)
        );
            
        Predicate<Integer> mesValido = m -> m >= 1 && m <= 12;
        Function<Integer, Integer> obtenerDias = m -> diasPorMes.get(m);
        
        if (!mesValido.test(mes)) {
            System.out.println("El mes introducido no es válido.");
        } else {
            int dias = obtenerDias.apply(mes);

            if (mes == 2 && esBisiesto.test(anyo)) {
                dias = 29;
            }
            System.out.println( "El mes introducido tiene " + dias + " días." );
        }
        
    }

    // Validador de fecha
    public static void ejercicio3() {
        System.out.println("\n--- VALIDADOR DE FECHA ---\n");

        System.out.println("Introduzca un día:");
        int dia = sc.nextInt(); sc.nextLine();
        
        System.out.println("Introduzca un mes:");
        int mes = sc.nextInt(); sc.nextLine();
        
        System.out.println("Introduzca un año:");
        int anyo = sc.nextInt(); sc.nextLine();
        
        Map<Integer, Integer> diasPorMes = Map.ofEntries(
            Map.entry(1, 31),
            Map.entry(2, 28),
            Map.entry(3, 31),
            Map.entry(4, 30),
            Map.entry(5, 31),
            Map.entry(6, 30),
            Map.entry(7, 31),
            Map.entry(8, 31),
            Map.entry(9, 30),
            Map.entry(10, 31),
            Map.entry(11, 30),
            Map.entry(12, 31)
        );
            
        BiPredicate<Integer, Integer> diaDentroDelMes = (d, m) -> {
            if (m == 2 && esBisiesto.test(anyo)) {
                return d >= 1 && d <= 29;
            }
            return d >= 1 && d <= diasPorMes.get(m);
        };
        
        boolean fechaValida = mes >= 1 && mes <= 12 && diaDentroDelMes.test(dia, mes);

        if (fechaValida) { System.out.println("La fecha introducida es válida.");

        } else {
            System.out.println("La fecha introducida no es válida.");
        }
    }

    // Tarifa de aparcamiento
    public static void ejercicio4() {
        System.out.println("\n--- TARIFA DE APARCAMIENTO ---\n");

        System.out.println("Introduzca los minutos estacionados:");
        int minutos = sc.nextInt(); sc.nextLine();
        
        Function<Integer, Double> calcularPrecio = m -> {
            if (m <= 0) { return 0.0; }
            if (m <= 30) { return 0.0; }
            if (m <= 120) { return (m - 30) * 0.05; }
            if (m <= 360) { return (90 * 0.05) + ((m - 120) * 0.03); }
            return 18.0;
        };

        if (minutos <= 0) {
            System.out.println("El número de minutos no es válido.");
        } else {
            double precio = calcularPrecio.apply(minutos);
            System.out.println( "El precio a pagar es de " + precio + " euros." );
        }
    }

    // Clasificacion de un punto
    public static void ejercicio5() {
        System.out.println("\n--- CLASIFICACIÓN DE UN PUNTO ---\n");

        System.out.println("Introduzca la coordenada X:");
        int x = sc.nextInt(); sc.nextLine();
        
        System.out.println("Introduzca la coordenada Y:");
        int y = sc.nextInt(); sc.nextLine();
        
        BiFunction<Integer, Integer, String> clasificarPunto = (x1, y1) -> {
            if (x1 == 0 && y1 == 0) { return "el origen"; }
            if (y1 == 0) { return "el eje X"; }
            if (x1 == 0) { return "el eje Y"; }
            if (x1 > 0 && y1 > 0) { return "el primer cuadrante"; }
            if (x1 < 0 && y1 > 0) { return "el segundo cuadrante"; }
            if (x1 < 0 && y1 < 0) { return "el tercer cuadrante"; }
            return "el cuarto cuadrante";
        };
        
        System.out.println( "El punto se encuentra sobre " + clasificarPunto.apply(x, y) + "." );
    }

    // Descuento de tienda
    public static void ejercicio6() {
        System.out.println("\n--- DESCUENTO DE TIENDA ---\n");
        
        System.out.println( "Introduzca su categoría de cliente (VIP / ESTANDAR):" );
        String categoria = sc.next(); sc.nextLine();
        
        System.out.println("Introduzca el importe bruto:");
        double precio = sc.nextDouble(); sc.nextLine();
        
        Function<String, Double> descuentoBase = categoriaCliente -> {
            if (categoriaCliente.equalsIgnoreCase("VIP")) { return 15.0; }
            if (categoriaCliente.equalsIgnoreCase("ESTANDAR")
                || categoriaCliente.equalsIgnoreCase("ESTÁNDAR")) { return 5.0; }
            return -1.0;
        };
        
        double descuento = descuentoBase.apply(categoria);
        if (descuento == -1) {
            System.out.println("La categoría introducida no es válida.");
            return;
        }
        if (precio > 200) { descuento += 5; }
        
        double precioFinal = precio - (precio * descuento / 100);

        System.out.println( "Descuento aplicado: " + descuento + "%" );
        System.out.println( "Precio final: " + precioFinal + " euros." );
    }

    // Piedra papel o tijera
    public static void ejercicio7() {
        System.out.println("\n--- PIEDRA, PAPEL O TIJERA ---\n");
        
        System.out.println("1 = Piedra");
        System.out.println("2 = Papel");
        System.out.println("3 = Tijera");
        
        System.out.println("Jugador 1:");
        int j1 = sc.nextInt(); sc.nextLine();
        
        System.out.println("Jugador 2:");
        int j2 = sc.nextInt(); sc.nextLine();
        
        BiFunction<Integer, Integer, String> resultado = (a, b) -> {
            if (a < 1 || a > 3 || b < 1 || b > 3) {
                return "Las jugadas introducidas no son válidas.";
            }
            if (a == b) { return "Empate."; }
            if ((a == 1 && b == 3) || (a == 2 && b == 1) || (a == 3 && b == 2)) {
                return "Gana el jugador 1.";
            }
            return "Gana el jugador 2.";
        };
        
        System.out.println(resultado.apply(j1, j2));
    }

    // Ordenacion de tres numeros
    public static void ejercicio8() {
        System.out.println("\n--- ORDENACIÓN DE TRES NÚMEROS ---\n");
        
        System.out.println("Introduzca el primer número:");
        int num1 = sc.nextInt(); sc.nextLine();
        
        System.out.println("Introduzca el segundo número:");
        int num2 = sc.nextInt(); sc.nextLine();
        
        System.out.println("Introduzca el tercer número:");
        int num3 = sc.nextInt(); sc.nextLine();
    
        Function<int[], int[]> ordenar = numeros -> {
            int[] resultado = numeros.clone();

            if (resultado[0] > resultado[1]) {
                int aux = resultado[0]; resultado[0] = resultado[1]; resultado[1] = aux;
            }

            if (resultado[0] > resultado[2]) {
                int aux = resultado[0]; resultado[0] = resultado[2]; resultado[2] = aux;
            }
            
            if (resultado[1] > resultado[2]) {
                int aux = resultado[1]; resultado[1] = resultado[2]; resultado[2] = aux;
            }
            return resultado;
        };
        
        int[] resultado = ordenar.apply( new int[]{num1, num2, num3} );
        
        System.out.println( resultado[0] + ", " + resultado[1] + ", " + resultado[2] );
    }

    // Calculador de nomina
    public static void ejercicio9() {
        System.out.println("\n--- NÓMINA ---\n");

        System.out.println("Introduzca las horas semanales diurnas:");
        int horasDiurnas = sc.nextInt(); sc.nextLine();

        System.out.println("Introduzca las horas semanales nocturnas:");
        int horasNocturnas = sc.nextInt(); sc.nextLine();
        
        BiFunction<Integer, Integer, Double> calcularSalario = (diurnas, nocturnas) -> {
            int total = diurnas + nocturnas;
            if (total <= 40) {
                return (diurnas * 10.0) + (nocturnas * 15.0);
            }
            
        int horasExtra = total - 40;
        int extraNocturnas = Math.min(horasExtra, nocturnas);
        int extraDiurnas = horasExtra - extraNocturnas;
        int nocturnasNormales = nocturnas - extraNocturnas;
        int diurnasNormales = diurnas - extraDiurnas;
        return (diurnasNormales * 10.0) + (nocturnasNormales * 15.0) + (extraDiurnas * 10.0 * 1.5) + (extraNocturnas * 15.0 * 1.5);
        };
        
        double salario = calcularSalario.apply(horasDiurnas, horasNocturnas);
        
        System.out.println( "El salario bruto por semana es de " + salario + " euros." );
    }

    // Calculador de IMC
    public static void ejercicio10() {
        System.out.println("\n--- CALCULADORA DE IMC ---\n");
        
        System.out.println("Introduzca su peso en kilos:");
        double peso = sc.nextDouble(); sc.nextLine();
        
        System.out.println("Introduzca su altura en metros:");
        double altura = sc.nextDouble(); sc.nextLine();
        
        System.out.println("Introduzca su edad:");
        int edad = sc.nextInt(); sc.nextLine();
        
        Function<Double, Double> calcularIMC = p -> p / (altura * altura);
        Function<Double, String> clasificarIMC = imc -> {
            if (imc < 18.5) { return "Bajo peso."; }
            if (imc < 25) { return "Peso normal."; }
            if (imc < 30) { return "Sobrepeso."; }
            return "Obesidad.";
        };
        
        double imc = calcularIMC.apply(peso);

        System.out.println("Su IMC es: " + imc);
        System.out.println(clasificarIMC.apply(imc));

        Predicate<Double> riesgoTerceraEdad = valor -> valor < 18.5 && edad > 65;
        if (riesgoTerceraEdad.test(imc)) {
            System.out.println( "Atención: Riesgo elevado para la tercera edad." );
        }
    }

    //---- MÉTODOS AUXILIARES ----

    public static BiPredicate<Integer, Integer> isEqual = (a, b) -> a.equals(b);
    
    public static BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
    
    public static Predicate<Integer> esBisiesto = anyo -> (anyo % 4 == 0 && anyo % 100 != 0) || anyo % 400 == 0;
}

