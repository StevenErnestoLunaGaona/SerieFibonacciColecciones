import java.util.ArrayList;
import java.util.List;
public class Fibonacci {
    //Atributos
    private List<Integer> fibonacciSeries;

    //Constructor
    public Fibonacci() {
        fibonacciSeries = new ArrayList<>();
        fibonacciSeries.add(1);
        fibonacciSeries.add(1);
    }
    //Metodos
    //Obtener numero Fibonacci
    public int getFibonacciNumber(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("La posición debe ser mayor o igual a cero");
        }

        if (position < fibonacciSeries.size()) {
            return fibonacciSeries.get(position);
        }

        for (int i = fibonacciSeries.size(); i <= position; i++) {
            int number = fibonacciSeries.get(i - 1) + fibonacciSeries.get(i - 2);
            fibonacciSeries.add(number);
        }

        return fibonacciSeries.get(position);
    }
    // Obtener posicion en la serie de Fibonacci
    public int getPosition(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("El numero debe ser mayor o igual a uno");
        }

        if (number == 1) {
            return 0;
        }

        int position = 1;
        int previous = fibonacciSeries.get(0);
        int current = fibonacciSeries.get(1);

        while (current < number) {
            int next = previous + current;
            previous = current;
            current = next;
            fibonacciSeries.add(current);
            position++;
        }

        if (current == number) {
            return position;
        } else {
            return -1;
        }
    }
}
