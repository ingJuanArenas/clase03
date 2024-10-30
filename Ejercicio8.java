import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        double longitud;
        double ancho;
        System.out.println("Vamos a calcular el área de un rectangulo");
        var entrada = new Scanner(System.in);
        System.out.println("Ingrese la longitud del rectangulo: ");
        longitud= Double.parseDouble(entrada.nextLine());
        System.out.println("Ingrese el ancho del rectangulo: ");
        ancho= Double.parseDouble(entrada.nextLine());
        entrada.close();
        System.out.println("El area del rectangulo es: "+(longitud*ancho));
    }
}
