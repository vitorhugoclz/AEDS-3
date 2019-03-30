package fibonacci;
/**
 *
 * @author Vitor
 */
public class Fibonacci {

    public static long vetor[] = new long[101]; // declaração combinada
    public static int c = 0;

    public static long fibonacci(int n) {
        //função para checar se há valor no vetor[n]
        if (vetor[n] == 0) {
            calculaFib(n);
        }
        return vetor[n];
    }

    public static void calculaFib(int n) {
        c++;
        if (n < 3) {
            vetor[n] = 1;
        } else {
            if (vetor[n - 1] == 0 && vetor[n - 2] == 0) {
                //caso não tenhamos fibonacci de nenhum dos termos
                vetor[n] = fibonacci(n - 1) + fibonacci(n - 2);
            } else if (vetor[n - 1] == 0 && vetor[n - 2] != 0) {
                //caso tenhamos fibonacci do primeiro termo
                vetor[n] = fibonacci(n - 1) + vetor[n - 2];
            } else if (vetor[n - 1] != 0 && vetor[n - 2] == 0) {
                //caso tenhamos fibonacci do segundo termo
                vetor[n] = vetor[n - 1] + vetor[n - 2];
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(100));
        System.out.println(c);
    }
}
