package edu.escuelaing.arem.model;


public class Node {

    private Object information;
    private Node next;

    public Node (Object information){
        this.information = information;
    }

    public Object getInformation() {
        return this.information;
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "information=" + information +
                ",next=" + next +
                '}';
    }
}
