package edu.escuelaing.arem.model;


public class Node {

    private float information;
    private Node next;

    public Node (float information){
        this.information = information;
    }

    public float getInformation() {
        return information;
    }

    @Override
    public String toString() {
        return "Node{" +
                "information=" + information +
                ",next=" + next +
                '}';
    }
}
