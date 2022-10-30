import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("bienvenido al ejercicio 1");
        ejercicio1();
        System.out.println("bienvenido al ejercicio 2");
        System.out.println(ejercicio2());
        System.out.println("bienvenido al ejercicio 3");
        ejercicio3();
        System.out.println("bienvenido al ejercicio 4");
        ejercicio4();
        System.out.println("bienvenido al ejercicio 5");
        ejercicio5();
        System.out.println("bienvenido al ejercicio 6");
        ejercicio6();
        System.out.println("bienvenido al ejercicio 7");
        ejercicio7();
        System.out.println("bienvenido al ejercicio 8");
        ejercicio8();
        System.out.println("bienvenido al ejercicio 9");
        ejercicio9();
        System.out.println("bienvenido al ejercicio 10");
        ejercicio10();
        System.out.println("bienvenido al ejercicio 11");
        ejercicio11();
        System.out.println("bienvenido al ejercicio 12");
        ejercicio12();
        System.out.println("bienvenido al ejercicio 13");
        ejercicio13();
        System.out.println("bienvenido al ejercicio 14");
        ejercicio14();
        System.out.println("bienvenido al ejercicio 15");
        ejercicio15();
        System.out.println("bienvenido al ejercicio 16");
        ejercicio16();
        System.out.println("bienvenido al ejercicio 17 ");
        ejercicio17();
        System.out.println("bienvenido al ejercicio 18 ");
        ejercicio18();
        System.out.println("bienvenido al ejercicio 19 ");
        ejercicio19();
        System.out.println("bienvenido al ejercicio 20");
        ejercicio20();
        System.out.println("bienvenido al ejercicio 21");
        ejercicio21();
        System.out.println("bienvenido al ejercicio 22");
        ejercicio22();
    }

    public static void ejercicio1() {
        char letter = 'D';
        System.out.println(letter);

        int value1 = 1;
        System.out.println(value1);

        float value2 = 2.4f;
        System.out.println(value2);

        double value3 = 85.55;
        System.out.println(value3);

        long value4 = 584895647L;
        System.out.println(value4);

        short value5 = 84;
        System.out.println(value5);

        byte value6 = 115;
        System.out.println(value6);

        boolean bool = true;
        System.out.println(bool);

    }

    static int ejercicio2() {
        final int variable = 58;
        return variable;
    }

    static void ejercicio3() {
        int edad = 24;
        System.out.println(edad);
        edad++;
        System.out.println("el proximo año tendras " + edad);
        edad -= 2;
        System.out.println("el año pasado tenias " + edad);
        edad = 24;
        System.out.println(edad * edad);
    }

    static void ejercicio4() {
        float valorado = 10152466.25F;
        byte valorado1 = 5;
        float valorador = valorado1 + valorado;
        System.out.println("float " + valorado);
        System.out.println("byte " + valorado1);
        System.out.println("resultado es igual a " + valorador);
    }

    static void ejercicio5() {
        // hora del computador//
        LocalTime miHora = LocalTime.now();
        System.out.println("esta es la hora del computador " + miHora);
        // fecha del computador//
        LocalDate miFecha = LocalDate.now();
        System.out.println("esta es la fecha del computador " + miFecha);
        /*
         * Una lección sin dolor no tiene sentido.
         * Eso es porque no se puede ganar algo sin sacrificar algo a cambio.
         * Sin embargo, una vez que hayas soportado el dolor y lo hayas superado,
         * ganarás un corazón que es más fuerte que todo lo demás. Así es, un corazón de
         * acero.
         * edward elric
         */
    }

    static void ejercicio6() {
        int valor = 10;
        if (valor < 5) {
            System.out.println("pequeño");

        } else {
            System.out.println("grande");
        }
        int newValor = 2;
        switch (newValor) {
            case 1:
                System.out.println("no");
                break;

            case 2:
                System.out.println("dos");
                break;

            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("ni uno, ni dos, ni tres");

        }
    }

    static void ejercicio7() {

        for (int valork = 0; valork < 5; valork++) {
            System.out.println(valork);
        }
    }

    static void ejercicio8() {
        for (int valork = 10; valork > 5; valork--) {
            System.out.println(valork);
        }
    }

    static void ejercicio9() {
        int valorm = 10;
        while (valorm < 15) {
            System.out.println(valorm++);
        }
        valorm = 16;
        while (valorm < 20) {
            System.out.println(valorm++);
        }

    }

    static void ejercicio10() {
        Scanner y1 = new Scanner(System.in);
        System.out.println("ingrese un valor numerico");
        int valor1 = y1.nextInt();
        Scanner y2 = new Scanner(System.in);
        System.out.println("ingrese un valor numerico nuevo");
        int valor2 = y2.nextInt();
        if (valor1 == valor2) {
            System.out.println("tanto " + valor1 + " 8como " + valor2 + " son iguales");
        } else {
            System.out.println(valor1 + " y " + valor2 + " no son iguales");
        }
    }

    static void ejercicio11() {
        System.out.print("ingrese una nota");
        System.out.println("del 0 al 10");
        Scanner delivery = new Scanner(System.in);
        int nota = delivery.nextInt();
        switch (nota) {
            case 0:
                System.out.println("la nota es insuficiente");
                break;
            case 1:
                System.out.println("la nota es insuficiente");
                break;
            case 2:
                System.out.println("la nota es insuficiente");
                break;
            case 3:
                System.out.println("la nota es insuficiente");
                break;
            case 4:
                System.out.println("la nota esta bien");
                break;
            case 5:
                System.out.println("la nota esta bien");
                break;
            case 6:
                System.out.println("la nota esta bien");
                break;
            case 7:
                System.out.println("la nota es suficiente");
                break;
            case 8:
                System.out.println("la nota es suficiente");
                break;
            case 9:
                System.out.println("la nota es suficiente");
                break;
            case 10:
                System.out.println("la nota es suficiente");
                break;
            default:
                System.out.println("esta nota no es permitida");
        }
        System.out.println("fin de la evaluacion de la nota");
    }

    static void ejercicio12() {
        int entrega = 0;
        int raiz = 0;
        System.out.println("bienvenido al juego del numero magico");
        System.out.println("ingresa un numero para empezar a jugar");
        Scanner delivery = new Scanner(System.in);
        entrega = delivery.nextInt();

        while (entrega > 0) {
            if (entrega > 0 && entrega < 20) {
                raiz = (int) Math.sqrt(entrega);
                System.out.println("esta es la raiz del numero que ingresaste " + raiz);
                System.out.println("debes volver a ingresar un numero");
                entrega = delivery.nextInt();
            }
            if (entrega > 20) {
                raiz = (int) Math.sqrt(entrega);
                System.out.println("esta es la raiz del numero que ingresaste " + raiz);
                System.out.println("te has ganado un comodin");
                System.out.println("debes ingresar un numero negativo para ganar el juego");
                entrega = delivery.nextInt();
            }
            if (entrega < 0) {
                System.out.println("felicidades has ganao");
            }
        }

    }

    static void ejercicio13() {
        Scanner delivery = new Scanner(System.in);
        System.out.println("ingrese el tamaño del arreglo");
        int entrega = delivery.nextInt();
        int suma = 0;
        int i;

        int arreglo[] = new int[entrega];
        System.out.println("ingresa un numero entero");
        for (i = 0; i < arreglo.length; i++) {
            arreglo[i] = delivery.nextInt();
            suma = suma + arreglo[i];
        }
        System.out.println("el resultado del contenido del array es: " + suma);
    }

    static void ejercicio14() {
        int arreglo[] = new int[15];
        System.out.println("ingrese 15 datos para el arreglo");

        for (int i = 0; i < 15; i++) {
            Scanner delivery = new Scanner(System.in);
            int entrega = delivery.nextInt();
            arreglo[i] = entrega;
        }

    }

    static void ejercicio15() {
        Scanner delivery = new Scanner(System.in);
        System.out.println("ingresa un numero entre 0 y 10");
        int multiplicando = delivery.nextInt();
        int resultado;
        if (multiplicando > 10) {
            System.out.println("lo sentimos, el valor ingresado no esta conteplado");
        } else {
            for (int multiplicador = 1; multiplicador < 13; multiplicador++) {
                resultado = (multiplicando * multiplicador);
                System.out.println(multiplicando + "*" + multiplicador + "=" + resultado);
            }
        }

    }

    static void ejercicio16() {
        int valorA = 0, valorB = 1, valorC = 0, valorD;
        for (int i = 0; i < 100; i++) {

            valorC = valorA + valorB;
            valorA = valorB;
            valorB = valorC;
            valorD = valorC;
            System.out.println(valorD + valorC);
        }
    }

    static void ejercicio17() {
        int valorA = 0, valorB = 1, valorC = 0, valorD;
        for (int i = 0; i < 1000; i++) {

            valorC = valorA + valorB;
            valorA = valorB;
            valorB = valorC;
            valorD = valorC;
            System.out.println(valorD + valorC / 1000);
        }

    }

    static void ejercicio18() {
        int valorA = 0, valorB = 1000, valorC = 0, valorD;
        for (int i = 0; i < 2000; i++) {
            System.out.println(valorA);
            valorC = valorA + valorB;
            valorA = valorB;
            valorB = valorC;
            valorD = valorC;

        }

    }

    static void ejercicio19() {
        Scanner delivery = new Scanner(System.in);
        int factorial;
        int valorK;
        System.out.println("ingresa un valor numerico");
        valorK = delivery.nextInt();
        factorial = 1;
        for (int i = valorK; i > 0; i--) {
            factorial = factorial * i;

        }
        System.out.println("el factorial de  " + valorK + " es " + factorial);

    }

    static void ejercicio20() {
        Scanner delivery = new Scanner(System.in);
        long factorial = 1;
        int num;
        Scanner numero = new Scanner(System.in);
        System.out.println("introduce un numero");
        num = numero.nextInt();
        for (int e = 1; e < num; e++) {
            factorial = 1;
            for (int i = e; i > 0; i--) {
                factorial = factorial * e;
            }
            System.out.println("El factorial de " + e + " es: " + factorial);

        }
    }

    static void ejercicio21() {
        int numero, contador, contador2, promedio, factorial, valor, suma;
        Scanner delivery = new Scanner(System.in);
        System.out.println("Escribe un numero entero mayor que 0: ");
        numero = delivery.nextInt();
        contador = 1;
        factorial = 1;
        valor = 1;
        suma = 0;
        promedio = 0;
        contador2 = 0;
        while (valor <= numero) {
            while (contador <= valor) {
                factorial = factorial * contador;
                contador = contador + 1;
            }
            suma = factorial + suma;
            valor = valor + 1;
        }
        promedio = suma / contador;
        System.out.println("El resultado deL promeio de los factoriales de todos los numeros entre 1 y " + numero
                + " es: " + promedio);
    }

    static void ejercicio22() {
        int numero, contador, factorial, variable, suma;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un numero entero mayor que 0: ");
        numero = teclado.nextInt();
        contador = 1;
        factorial = 1;
        variable = 1;
        suma = 0;
        while (variable <= numero) {
            while (contador <= variable) {
                factorial = factorial * contador;
                contador = contador + 1;
            }
            suma = factorial + suma;
            variable = variable + 1;
        }
        System.out.println("El resultado de la sumatoria de los factoriales de  todos los numeros entre 1 y " + numero
                + " es: " + suma);

    }
}
