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
       /* MyStack s = new MyStack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (s.isEmpty() == false) {
            System.out.println("Current top: " + s.pop());
        }*/

 MyQueue f = new MyQueue();
        f.toQueue(1);
        f.toQueue(2);
        f.toQueue(3);
        f.toQueue(4);
        f.toQueue(5);
        while(!f.isEmpty()) {
            System.out.println("Current start: " + f.removeQueue());
        }
        /*MyList2 l = new MyList2();
        l.toList(1);
        l.toList(3);
        l.toList(5);
        l.toList(9);
        Node2 next = l.start;
        Node2 prev = l.end;
        while (next != null) {
            System.out.println("Next: " + next.value + " Prev: " + prev.value);
            next = next.next;
            prev = prev.prev;
        }
        l.removeList(1);
        next = l.start;
        prev = l.end;
        while (next != null) {
            System.out.println("Next: " + next.value + " Prev: " + prev.value);
            next = next.next;
            prev = prev.prev;
        }
        l.removeList(9);
        next = l.start;
        prev = l.end;
        while (next != null) {
            System.out.println("Next: " + next.value + " Prev: " + prev.value);
            next = next.next;
            prev = prev.prev;
        }*/
    }
}
