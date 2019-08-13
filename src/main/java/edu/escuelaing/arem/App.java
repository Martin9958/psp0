package edu.escuelaing.arem;

import edu.escuelaing.arem.model.MyLinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        MyLinkedList list = new MyLinkedList(1);
        list.addNodeByIndex(1,2);
        list.addNodeByIndex(2,3);
        list.addNodeByIndex(3,4);
        list.addNodeByIndex(4,5);
        list.addNodeByIndex(5,6);
        list.addNodeByIndex(6,7);
        list.addNodeByIndex(7,8);
        System.out.println(list);
        System.out.println(list.nodesNumber);
        list.removeNodeByIndex(0);
        System.out.println(list);
        list.removeNodeByIndex(6);
        list.removeNodeByIndex(1);
        System.out.println(list);
        list.removeNodeByIndex(4);
        list.removeNodeByIndex(1);
        System.out.println(list);
        list.removeNodeByIndex(2);
        System.out.println(list);
        list.removeNodeByIndex(1);
        System.out.println(list);
        System.out.println(list.nodesNumber);

    }
}
