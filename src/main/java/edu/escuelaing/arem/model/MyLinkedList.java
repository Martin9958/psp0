package edu.escuelaing.arem.model;

public class MyLinkedList {

    private Node head;
    private int size;

    public MyLinkedList(){
        this.head = null;
        size = 0;
    }

    public void addANodeAtHead(Object information){
        Node theNewNode = new Node(information);
        Node temporal = this.head;
        this.head = theNewNode;
        this.head.setNext(temporal);
        this.size++;
    }

    public void addNodeAtTheTail(Object information){
        Node theNewNode = new Node(information);
        Node temporal = this.head;
        while(temporal.getNext() != null){
            temporal = temporal.getNext();
        }
        temporal.setNext(theNewNode);
        this.size++;
    }

    public void addANode(Object information){
        if(this.head == null) {
            this.addANodeAtHead(information);
        }else{
            this.addNodeAtTheTail(information);
        }
    }

    public void addANodeByIndex(int index, Object information){
        Node temporal = this.head;
        Node theNewNodeToAdd;
        for(int i=0; i<index -1 && temporal.getNext()!= null; i++){
            temporal = temporal.getNext();
        }
        theNewNodeToAdd = temporal.getNext();
        temporal.setNext(new Node(information));
        temporal.getNext().setNext(theNewNodeToAdd);
        this.size++;
    }

    public void deleteANodeByIndex(int index){
        Node temporal = this.head;
        for(int i=0; i<index -1 && temporal.getNext()!= null; i++){
            temporal = temporal.getNext();
        }
        temporal.setNext(temporal.getNext().getNext());
        this.size++;
    }

    public int getMyLinkedListSize(){
        return this.size;
    }

    @Override
    public String toString() {
        return "Linked List = {" +
                "head=" + head +
                '}';
    }
}
