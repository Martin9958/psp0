package edu.escuelaing.arem.model.linkedListModel;

import edu.escuelaing.arem.model.linkedListModel.exception.MyLinkedListException;

/**
 *
 */
public class MyLinkedList {

    /**
     *
     */
    private Node head;

    /**
     *
     */
    private int size;

    /**
     *
     */
    public MyLinkedList(){
        this.head = null;
        size = 0;
    }

    /**
     *
     * @param information
     */
    public void addANodeAtHead(Object information){
        Node theNewNode = new Node(information);
        Node temporal = this.head;
        this.head = theNewNode;
        this.head.setNext(temporal);
        this.size++;
    }

    /**
     *
     * @param information
     */
    public void addNodeAtTheTail(Object information){
        if(head == null){
            addANodeAtHead(information);
        }else{
        Node theNewNode = new Node(information);
        Node temporal = this.head;
        while(temporal.getNext() != null){
            temporal = temporal.getNext();
        }
        temporal.setNext(theNewNode);
        this.size++;}
    }

    /**
     *
     * @param information
     */
    public void addANode(Object information){
        if(this.head == null) {
            this.addANodeAtHead(information);
        }else{
            this.addNodeAtTheTail(information);
        }
    }

    /**
     *
     * @param index
     * @param information
     * @throws MyLinkedListException
     */
    public void addANodeByIndex(int index, Object information) throws MyLinkedListException{
        if(head == null && index == 0){
            addANodeAtHead(information);
        }else if(head ==null && index !=0){
            throw new MyLinkedListException("This Element cant be added, because the linked list is empty");
        }else{
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
    }

    /**
     *
     * @param index
     * @throws MyLinkedListException
     */
    public void deleteANodeByIndex(int index) throws MyLinkedListException{
        if(head == null && index == 0 || head ==null && index !=0 ){
            throw new MyLinkedListException("This Element cant be deleted, because the linked list is empty");
        }else{
            Node temporal = this.head;
            for(int i=0; i<index -1 && temporal.getNext()!= null; i++){
                temporal = temporal.getNext();
            }
            temporal.setNext(temporal.getNext().getNext());
            this.size--;
        }
    }

    /**
     *
     * @param index
     * @return
     * @throws MyLinkedListException
     */
    public Node getNodeByIndex(int index) throws MyLinkedListException{
        if(head == null && index == 0 || head ==null && index !=0 ) {
            throw new MyLinkedListException("This Element cant be deleted, because the linked list is empty");
        }else{
            Node temporal = this.head;
            for(int i=0; i<index; i++){
                temporal = temporal.getNext();
            }
            return temporal;
        }
    }

    /**
     *
     * @param index
     * @return
     * @throws MyLinkedListException
     */
    public Node getTheNextNodeGivenAnIndex(int index) throws MyLinkedListException {
        if(index >=this.size || head ==null && index !=0 || head == null && index == 0 ){
            throw new MyLinkedListException("This Element doesnt have a next node");
        }else{
            return this.getNodeByIndex(index).getNext();}

    }

    /**
     *
     * @param index
     * @return
     * @throws MyLinkedListException
     */
    public Node getThePriorNodeGivenAnIndex(int index) throws MyLinkedListException {
        if(head == null && index == 0 || head ==null && index !=0 ) {
            throw new MyLinkedListException("This Element doesnt have a prior node, because the linked list is empty");
        }else if(index == 0 && size!=0 || index >=this.size+1){
            throw new MyLinkedListException("This Element doesnt have a prior node");
        }else {
            Node temporal = this.head;
            for(int i=0; i<index-1; i++){
                temporal = temporal.getNext();
            }
            return temporal;
        }
    }

    /**
     *
     * @return
     */
    public int getMyLinkedListSize(){
        return this.size;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Linked List = {" +
                "head=" + head +
                '}';
    }

}
