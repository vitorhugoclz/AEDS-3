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
public class Node {
    public int value;
    public Node next;
    
    //metodo contrutor 1
    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
        
    }
    //metodo contrutor 2
    private Node(){}
    
}
