package com.my.collection_.Set_;

/**
 * @author Gzy
 * @version 1.0
 */
public class Hashset01 {
    public static void main(String[] args) {
        Node1[] table = new Node1[16];

        Node1 nd1 = new Node1("nd1",null);

        Node1 nd2 = new Node1("nd2",null);

        table[0] = nd1;
        table[1] = nd2;

        nd1.next = nd2;
        Node1 nd3 = new Node1("nd3",null);

        table[2] = nd3;

        nd2.next = nd3;



        System.out.println(table);




    }
}

class Node1{
    Object item;
    Node1 next;
    Node1 pre;

    public Node1(Object item, Node1 next) {
        this.item = item;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node1{" +
                "item=" + item +
                ", next=" + next +
                ", pre=" + pre +
                '}';
    }
}