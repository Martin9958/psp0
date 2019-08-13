package edu.escuelaing.arem.model;


public class Node {

    private float information;
    private Node next;

    public Node (float information){
        this.information = information;
    }

    public float getInformation() {
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
