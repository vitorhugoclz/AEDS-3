/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Vitor
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(fibonacci(30, 0, 1, 1, 0));
    }
    public static int fibonacci(int n, int i, int j, int k,int t) {
        if(k == n)
            return t;
        t = i + j;
        i = j;
        j = t;
        k++;
        return fibonacci(n, i, j, k, t);
    }
}
