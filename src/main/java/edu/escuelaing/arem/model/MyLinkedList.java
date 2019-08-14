package edu.escuelaing.arem.model;

public class MyLinkedList {

    public Node head;

    public MyLinkedList() {
    }

    public MyLinkedList addNode(MyLinkedList linkedList, Object information){
        Node theNewNode = new Node(information);
        theNewNode.setNext(null);
        if(linkedList.head == null){
            linkedList.head = theNewNode;
        }else{
            Node theLastNode = linkedList.head;
            while(theLastNode.getNext()!=null){
                theLastNode = theNewNode.getNext();
            }
            theLastNode.setNext(theNewNode);
        }
        return linkedList;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
