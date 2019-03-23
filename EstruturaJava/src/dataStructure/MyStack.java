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
public class MyStack {

    public Node top;

    public MyStack() {
        this.top = null;
    }

    //empilhar
    public void push(int value) {
        Node newNode = new Node(value, null);
        newNode.next = this.top;
        this.top = newNode;
    }
    //verficar se é vazia
    public boolean isEmpty() {
        return this.top == null;
    }


    //desempilhar
    public int pop() {
            int result = this.top.value;
            this.top = this.top.next;
            return result;
    }
}
