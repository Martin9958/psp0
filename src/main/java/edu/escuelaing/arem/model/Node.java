package edu.escuelaing.arem.model;

/**
 *
 */
public class Node {

    /**
     *
     */
    private Object information;

    /**
     *
     */
    private Node next;

    /**
     *
     * @param information
     */
    public Node (Object information){
        this.information = information;
        this.next = null;
    }

    /**
     *
     * @return
     */
    public Object getInformation() {
        return this.information;
    }

    /**
     *
     * @param information
     */
    public void setInformation(Object information){
        this.information = information;
    }

    /**
     *
     * @return
     */
    public Node getNext(){
        return this.next;
    }

    /**
     *
     * @param next
     */
    public void setNext(Node next){
        this.next = next;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return " Node{" +
                " information=" + information +
                ",next=" + next +
                '}';
    }

}
