import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int n1,n2;
        var entrada= new Scanner(System.in);
        System.out.println("Ingrese dos numeros!");
        System.out.println("Ingrese el primer numero: ");
        n1=Integer.parseInt( entrada.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        n2=Integer.parseInt( entrada.nextLine());
        entrada.close();
        System.out.println("El resultado de la suma de los numeros es: " +(n1+n2));
        System.out.println("El resultado de la resta de los numeros es: " +(n1-n2));
        System.out.println("El resultado de la multiplicacion de los numeros es: " +(n1*n2));
        System.out.println("El resultado de la division de los numeros es: " +(n1/n2));
    }
}
