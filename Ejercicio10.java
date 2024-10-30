import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        double n1,n2,n3,promedio;
        System.out.println("Vamos a calcular el promedio de 3 numeros");
        var entrada= new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        n1= Double.parseDouble(entrada.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        n2= Double.parseDouble(entrada.nextLine());
        System.out.println("Ingrese el tercer numero: ");
        n3= Double.parseDouble(entrada.nextLine());
        entrada.close();
        promedio= (n1+n2+n3)/3;
        System.out.println("el promedio de los 3 datos ingresados es : "+promedio);
    }
}
