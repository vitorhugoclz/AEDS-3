package fatorial;
import java.math.BigInteger;
/**
 *
 * @author Vitor
 */
public class Fatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(fatorial(1000));
    }

    public static BigInteger fatorial(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        }
        BigInteger x = BigInteger.valueOf(n);
        return x.multiply(fatorial(n - 1));
    }
}
