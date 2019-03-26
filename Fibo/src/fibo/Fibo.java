/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibo;

/**
 *
 * @author Vitor
 */
public class Fibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(fibonacci(5, 0, 1, 1, 0));
    }
    
    public static int fibonacci(int n, int i, int j, int k, int total) {
        if(k == n)
            return total;
        
        total = i + j;
        i = j;
        j = total;
        k++;
        return fibonacci(n, i, j, j, total);
    }
}
