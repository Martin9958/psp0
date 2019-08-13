package edu.escuelaing.arem.model;

public class MyLinkedList {

    private Node head;
    private static int nodesNumber;

    public MyLinkedList(float information) {
        this.head = new Node(information);
    }

    public void addAtHeadNode(float information){
        Node temporal = this.head;
        this.head = new Node(information);
        this.head.setNext(temporal);
        nodesNumber++;
    }



}
