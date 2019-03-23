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
public class MyList2 {

    Node2 start;
    Node2 end;

    public MyList2() {
        this.start = null;
    }

    public boolean isEmpty() {
        return this.start == null;
    }

    public void toList(int value) {
        Node2 newNode = new Node2(value, null, null);
        if (this.isEmpty()) {
            this.start = newNode;
            this.end = newNode;
        } else {
            Node2 current = this.start;
            Node2 back = this.start.prev;
            while (current != null && current.value < value) {
                back = current;
                current = current.next;
            }
            if(current == this.start) {
                current.prev = newNode;
                newNode.next = current;
                this.start = newNode;
            }
            else if(current == null) {
                back.next = newNode;
                newNode.prev = back;
                end = newNode;
            }
            else{
                current.prev = newNode;
                newNode.next = current;
                back.next = newNode;
                newNode.prev = back;
            }
        }

    }
    public Node2 removeList(int value) {
        Node2 aux = this.start;
        if(this.end == this.start && this.start.value == value){
            this.start = null;
            this.end = null;
            return aux;
        }
        while(aux != null && aux.value != value)
            aux = aux.next;
        if(aux == null)
            return null;
        if(aux == start) {
            this.start = this.start.next;
            this.start.prev = null;
        } else if(aux == end) {
            this.end = this.end.prev;
            this.end.next = null;
        } else {
           aux.prev.next = aux.next;
           aux.next.prev = aux.prev;
        }       
        return aux;
    }
}
