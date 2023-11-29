import java.util.Scanner;

public class ActividadDepuracion {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //ejercicioUno();
        //ejercicioDos();
        //ejercicioTres();
        //ejercicioCuatro();
        //ejercicioCinco();
        //ejercicioSeis();
        //ejercicioSiete();
        ejercicioOcho();
        //ejercicioNueve();
        sc.close();
    }

    public static void ejercicioUno() {

        double radio, longitud, area;
        System.out.println("Introduce radio de la circunferencia:");
        radio = sc.nextDouble();
        longitud = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("Longitud de la circunferencia -> " + longitud);
        System.out.println("Area de la circunferencia -> " + area);
    }


    public static void ejercicioDos() {

        int N;

        System.out.print("Introduzca valor de N: ");
        N = sc.nextInt(); //
        System.out.println("Primera cifra de " + N + " -> " + (N / 100));
        System.out.println("Cifra central de " + N + " -> " + ((N % 100) / 10));
        System.out.println("Última cifra de " + N + " -> " + (N % 10));
    }

    public static void ejercicioTres() { //TODO Error con el numero mas largo

        int i;
        double suma = 0;
        double n;

        System.out.println("Introduce un número: ");
        n = sc.nextDouble();
        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                suma += i;
            }
        }
        if (suma == n) {
            System.out.println("Perfecto");
        } else {
            System.out.println("No es perfecto");
        }
    }

    public static void ejercicioCuatro() {  //TODO Falta

        int N, i, j;

        do {
            System.out.print("Introduce un numero > 0: ");
            N = sc.nextInt();

        } while (N <= 0);

        System.out.println("Números primos desde 1 hasta " + N);
        for (j = 2; j < N; j++) {
            i = 2;
            while (j % i == 0) {
                i++;
            }
            if (i != j) {
                System.out.println(j);
            }
        }
    }

    public static void ejercicioCinco() {

        int i;
        int pos = 0, neg = 0;
        int[] numeros = new int[10];
        double sumaPos = 0, sumaNeg = 0;
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }
        for (i = 0; i < 10; i++) {
            if (numeros[i] > 0) {
                sumaPos += numeros[i];
                pos++;
            } else if (numeros[i] < 0) {
                sumaNeg += numeros[i];
                neg++;
            }
        }
        //Calcular y mostrar las medias
        if (pos != 0) {
            System.out.println("Media de los valores positivos: " + sumaPos / pos);
        } else {
            System.out.println("No ha introducido numeros positivos");
        }
        if (neg != 0) {
            System.out.println("Media de los valores negativos: " + sumaNeg / neg);
        } else {
            System.out.println("No ha introducido numeros negativos");
        }
    }

    public static void ejercicioSeis() {    //TODO falta

        int N, aux, cifra, numeroCifras = 0;
        double suma;
        do {
            System.out.print("Introduce número entero positivo: ");
            N = sc.nextInt();
            if (N <= 0) {
                System.out.println("Error. Debe ser un número positivo");
            }
        } while (N <= 0);

        aux = N;
        while (aux != 0) {
            numeroCifras++;
            aux = aux % 10; //Poner un %
        }

        suma = 0;
        aux = N;
        while (aux != 0) {
            cifra = aux % 10;
            suma = Math.pow(numeroCifras, cifra);
            aux = aux / 10;
        }

        if (suma == N) {
            System.out.println("No es narcisista");
        } else {
            System.out.println("Es narcisista");
        }
    }

    public static void ejercicioSiete() {   //TODO falta

        int numfiguras;

        do {
            System.out.print("¿Cuántas figuras quieres?");
            numfiguras = sc.nextInt();
        } while (numfiguras < 2);

        int nfiguras = numfiguras;
        int numlinea;

        do {
            System.out.print("¿Cuántos asteriscos quieres?");
            numlinea = sc.nextInt();
        } while (numlinea < 2);

        int numespacios = 0;
        int posasterisco;
        int nespacios;

        while (numlinea > 0) {
            numfiguras = nfiguras;
            posasterisco = numlinea;
            nespacios = numespacios;
            while (numfiguras > 2) {
                while (posasterisco > 0) {
                    System.out.print("*");
                }
                while (nespacios-- > 0) {
                    System.out.print(" ");
                }
                if (numfiguras > 1) {
                    System.out.print("||");
                }
                numfiguras = numfiguras - 1;
            }
            System.out.println("");
            numlinea = numlinea - 1;
            numespacios = numespacios + 1;
        }
    }

    public static void ejercicioOcho() {    //TODO falta

        int num, i, aux, cont, cifra;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce numero entero positivo: ");
            num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Número no válido");
            }
        } while (num <= 0);

        aux = num;
        cont = 0; //variable para contar las cifras del número
        while (aux == 0) {
            aux = aux % 10;
            cont++;
        }

        //obtener cada una de las cifras comenzando por la izquierda
        for (i = cont - 1; i >= 0; i--) {
            //obtenemos la cifra de la izquierda
            cifra = num / (int) Math.pow(10, i);
            //mostramos su nombre

            switch (cifra) {
                case 0:
                    System.out.print("cero ");
                    break;
                case 1:
                    System.out.print("uno ");
                    break;
                case 2:
                    System.out.print("dos ");
                    break;
                case 3:
                    System.out.print("tres ");
                    break;
                case 4:
                    System.out.print("cuatro ");
                    break;
                case 5:
                    System.out.print("cinco ");
                    break;
                case 6:
                    System.out.print("seis ");
                    break;
                case 7:
                    System.out.print("siete ");
                    break;
                case 8:
                    System.out.print("ocho ");
                    break;
                case 9:
                    System.out.print("nueve ");
                    break;
            }

            if (i == 0) { //si no es la última cifra
                System.out.print(" - ");
                num = num % (int) Math.pow(10, i);
            }
        }

        System.out.println();
        System.out.println("Fin de programa");
    }

    public static void ejercicioNueve() {   //TODO falta

        Scanner sc = new Scanner(System.in);
        int N, aux, cifra, numeroCifras = 0;
        double suma;
        do {
            System.out.print("Introduce número entero positivo: ");
            N = sc.nextInt();
            if (N <= 0) {
                System.out.println("Error. Debe ser un número positivo");
            }
        } while (N >= 0);
        aux = N;
        while (aux != 0) {
            numeroCifras++;
            aux = aux % 10; //Poner un %
        }
        suma = 0;
        aux = N;
        while (aux != 0) {
            cifra = aux % 10;
            suma = Math.pow(numeroCifras, cifra);
            aux = aux / 10;
        }
        if (suma == N) {
            System.out.println("No es narcisista");
        } else {
            System.out.println("Es narcisista");
        }
    }
}
