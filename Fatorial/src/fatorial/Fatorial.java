/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        System.out.println(fatorial(100));
    }

    public static BigInteger fatorial(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        }
        BigInteger x = BigInteger.valueOf(n);
        return x.multiply(fatorial(n - 1));
    }
}
