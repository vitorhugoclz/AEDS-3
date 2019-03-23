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
public class Node2 {
    int value;
    Node2 next;
    Node2 prev;
    
    public Node2(int value, Node2 next, Node2 prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
    
    private Node2() {
        
    }
}
