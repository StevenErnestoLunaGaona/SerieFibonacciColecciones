import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la posicion de la que desea obtener el numero de Fibonacci: ");
        int position = scanner.nextInt();

        int fibonacciNumber = fibonacci.getFibonacciNumber(position);
        System.out.println("El numero de Fibonacci en la posicion " + position + " es: " + fibonacciNumber);

        System.out.print("Ingrese el numero del que desee obtener su posicion en la serie de Fibonacci: ");
        int number = scanner.nextInt();

        int numberPosition = fibonacci.getPosition(number);
        if (numberPosition != -1) {
            System.out.println("El numero " + number + " está en la posicion " + numberPosition + " de la serie de Fibonacci.");
        } else {
            System.out.println("El numero " + number + " no esta en la serie de Fibonacci.");
        }

        scanner.close();
    }
}