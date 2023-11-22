import java.util.Scanner;

public class ActividadDepuracion {
    final Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        double radio, longitud, area;
        System.out.println("Introduce radio de la circunferencia:");
        radio = tec.nextDouble();
        longitud = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, Math.PI);
        System.out.println("Longitud de la circunferencia -> " + longitud);
        System.out.println("Area de la circunferencia -> " + area);
    }
}
