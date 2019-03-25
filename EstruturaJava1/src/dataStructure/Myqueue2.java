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
public class Myqueue2 {

    private Node start;

    public boolean isEmpty() {
        return this.start == null;
    }

    public void toQueue(int value) {
        Node newNode = new Node(value, null);
        if (isEmpty()) {
            this.start = newNode;
        } else {
            Node aux = this.start;
            while(aux.next != null) {
                aux = aux.next;
            }
            aux.next = newNode;
        }
    }
    
    public int removeQueue() {
        int value = this.start.value;
        this.start = this.start.next;
        return value;
    }
}
