package com.my.collection_.List_;

/**
 * @author Gzy
 * @version 1.0
 */
public class LinkedList01 {
    public static void main(String[] args) {
        Node jk = new Node("jk");
        Node tom = new Node("tom");
        Node cc = new Node("cc");

        jk.next = tom;
        tom.next = cc;

        cc.pre = tom;
        tom.pre = jk;

        Node first = jk;
        Node last = cc;


        while (true){
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        Node smith = new Node("smith");

        tom.next = smith;
        smith.next = cc;
        cc.pre = smith;
        smith.pre = tom;
        first = jk;//重置first
        while (true){
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }



    }
}

class Node{
    public Object item;
    public Node next;
    public Node pre;

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name = " + item ;
    }
}
