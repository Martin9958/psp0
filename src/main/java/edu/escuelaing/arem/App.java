package edu.escuelaing.arem;

import edu.escuelaing.arem.model.MyLinkedList;
import edu.escuelaing.arem.model.MyLinkedListException;

/**
 * This is the main class to execute the PSP0 Program
 *
 * @author  Andres Martin Cantor Urrego (andres.cantor-u@mail.escuelaing.edu.co)
 */
public class App 
{
    public static void main( String[] args ) {

        MyLinkedList list = new MyLinkedList();
        try {
            list.addANodeByIndex(5,1);
            System.out.println(list);
            list.addANodeByIndex(1,1);
            System.out.println(list);
            list.addANodeByIndex(5,"AQUI");
            System.out.println(list);
        } catch (MyLinkedListException e) {
            e.printStackTrace();
        }
        try {
            list.deleteANodeByIndex(7);
            System.out.println(list);
        } catch (MyLinkedListException e) {
            e.printStackTrace();
        }
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
        try {
            list.addANodeByIndex(3,"MY");
            System.out.println(list);
            list.addANodeByIndex(3, 1000);
            System.out.println(list);
            list.addANodeByIndex(7, 1000);
            System.out.println(list);
        } catch (MyLinkedListException e) {
            e.printStackTrace();
        }
        try {
            list.deleteANodeByIndex(7);
            System.out.println(list);
            list.deleteANodeByIndex(3);
            System.out.println(list);
        } catch (MyLinkedListException e) {
            e.printStackTrace();
        }
        System.out.println("Linked List Size "+list.getMyLinkedListSize());
        try {
            System.out.println(list.getNodeByIndex(6));
        } catch (MyLinkedListException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(list.getNodeByIndex(6).getInformation());
        } catch (MyLinkedListException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(list.getThePriorNodeGivenAnIndex(0).getInformation());
        } catch (MyLinkedListException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(list.getThePriorNodeGivenAnIndex(7).getInformation());
        } catch (MyLinkedListException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(list.getTheNextNodeGivenAnIndex(7).getInformation());
        } catch (MyLinkedListException e) {
            e.printStackTrace();
        }

    }
}
