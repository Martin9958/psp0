package edu.escuelaing.arem.model;

public class MyLinkedList {

    private Node head;
    public int nodesNumber;

    public MyLinkedList(Object information) {
        this.head = new Node(information);
        nodesNumber ++;
    }

    public void addNodeByIndex(int index, Object information){
        Node temporal = this.head;
        Node theNewNode;
        for(int i=0; i<index-1 && temporal.getNext()!=null;i++){
            temporal = temporal.getNext();
        }
        theNewNode = temporal.getNext();
        temporal.setNext(new Node(information));
        temporal.getNext().setNext(theNewNode);
        nodesNumber++;
    }

    public void addAtHeadNode(Object information){
        Node temporal = this.head;
        this.head = new Node(information);
        this.head.setNext(temporal);
        nodesNumber++;
    }

    public void addAtTailNode(Object information){
        Node temporal = this.head;
        while(temporal.getNext() != null){
            temporal = temporal.getNext();
        }
        temporal.setNext(new Node(information));
        nodesNumber++;
    }

    public void removeNodeByIndex(int index){
        Node temporal = this.head;
        for(int i=0; i<index-1 && temporal.getNext() != null; i++){
            temporal = temporal.getNext();
        }
        temporal.setNext(temporal.getNext().getNext());
        nodesNumber--;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
