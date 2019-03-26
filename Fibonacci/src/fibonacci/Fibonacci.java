package fibonacci;
import java.math.BigInteger;

public class Fibonacci{
  public static BigInteger[] seqFib = new BigInteger[11000];
  public static int c = 0;
  
  public static BigInteger fibonacci(int n) {
	if(seqFib[n] == null) {
		calculaFib(n);
	}
	return seqFib[n];
  }

  public static void calculaFib(int n) {
	//Incrementa o contador
	c++;
	//Se n < 3 o Fibonacci de n sera 1, e portanto seqFib na posicao n recebe 1
	if(n < 3) {
		seqFib[n] = BigInteger.ONE;
	} else {
		//Se no vetor em determinada posicao n for igual null significa que o calculo
		//ainda nao foi realizado, sendo necessario a chamada do metodo calculaFib 
		//Caso contrario nao eh necessario fazer o calculo novamente, pode-se apenas acessar
		//o seu valor no vetor na posicao desejada
		if(seqFib[n-1] == null && seqFib[n-2] == null)
			seqFib[n] = fibonacci(n-1).add(fibonacci(n-2));
		else if(seqFib[n-1] == null && seqFib[n-2] != null)
			seqFib[n] = fibonacci(n-1).add(seqFib[n-2]);
		else if(seqFib[n-1] != null && seqFib[n-2] == null)
			seqFib[n] = seqFib[n-1].add(seqFib[n-2]);
	}
  }
  
  public static void main(String[] args) {
	  System.out.println(fibonacci(1000));
	  System.out.println(c);
  }
}