import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        double celsious;
        double fahrenheit;
        double kelvin;
        var entrada= new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados celcious");
        celsious=Double.parseDouble(entrada.nextLine());
        entrada.close();
        fahrenheit= celsious*9/5+32;
        kelvin=celsious+273.15;
        System.out.println(celsious+"En grados Fahrenheit es: " + fahrenheit);
        System.out.println(celsious+ "En grados Kelvin es: "+kelvin);
        

    }
}
