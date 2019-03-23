/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructure;

/**
 *
 * @author Vitor
 */
public class MyQueue {

    public Node first;
    public Node last;

    public MyQueue() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public void toQueue(int value) {
        Node newNode = new Node(value, null);
        if (this.isEmpty()) {
            this.last = newNode;
            this.first = newNode;
        } else {
            this.last.next = newNode;
            this.last = this.last.next;
        }
    }

    public int removeQueue() {
        int resultado = this.first.value;
        if (this.first == this.last) {
            this.first = null;
            this.last = null;
        } else {
            this.first = this.first.next;
        }
        return resultado;
    }
    public int size() {
        Node current = this.first;
        int s = 0;
        while(current != null){
            current = current.next;
            s++;
        }
        return s;
    }
}
