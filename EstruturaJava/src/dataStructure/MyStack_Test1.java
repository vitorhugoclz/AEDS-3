/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructure;

/**
 *
 * @author 2018.1.08.023
 */
public class MyStack_Test1 {

    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (s.isEmpty() == false) {
            System.out.println("Current top: " + s.pop());
        }

    }
}
