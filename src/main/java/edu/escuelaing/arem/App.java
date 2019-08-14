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
        list.addNode(list,1);
        list.addNode(list,2);
        list.addNode(list,3);
        list.addNode(list,4);
        System.out.println(list);
    }
}
