package edu.escuelaing.arem.model.calculatorKitModel;

import edu.escuelaing.arem.model.linkedListModel.MyLinkedList;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class calculatorKit {
    /**
     *
     */
    public calculatorKit(String path){
        BufferedReader bufferedReader;
        try{
            bufferedReader = new BufferedReader(new FileReader(path));
            MyLinkedList myLinkedList = new MyLinkedList();
            String line = bufferedReader.readLine();
            while(line != null){
                line = line.trim();
                myLinkedList.addANode(Integer.parseInt(line));
            }
            System.out.println(myLinkedList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
