package edu.escuelaing.arem;

import edu.escuelaing.arem.model.MyLinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        MyLinkedList list = new MyLinkedList();
        list.addANode(1);
        System.out.println(list);
        list.addANode(2);
        System.out.println(list);
        list.addNodeAtTheTail(67);
        System.out.println(list);
        list.addANode(3);
        System.out.println(list);
        list.addANode(4);
        System.out.println(list);
        list.addANodeAtHead(5);
        System.out.println(list);
        list.addANodeByIndex(3,"MY");
        System.out.println(list);
        list.addANodeByIndex(3, 1000);
        System.out.println(list);
        list.addANodeByIndex(7, 1000);
        System.out.println(list);
        list.deleteANodeByIndex(7);
        System.out.println(list);
        list.deleteANodeByIndex(3);
        System.out.println(list);
        System.out.println(list.getMyLinkedListSize());
    }
}
