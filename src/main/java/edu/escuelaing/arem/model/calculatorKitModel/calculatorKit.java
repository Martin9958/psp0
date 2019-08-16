package edu.escuelaing.arem.model.calculatorKitModel;

import edu.escuelaing.arem.model.linkedListModel.MyLinkedList;
import edu.escuelaing.arem.model.linkedListModel.exception.MyLinkedListException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class calculatorKit {

    /**
     *
     */
    private MyLinkedList linkedList;

    /**
     *
     */
    public calculatorKit(String path){
        BufferedReader bufferedReader;
        try{
            bufferedReader = new BufferedReader(new FileReader(path));
            this.linkedList = new MyLinkedList();
            String line ;
            while(!(line = bufferedReader.readLine()).equals("")){
                line = line.trim();
                this.linkedList .addANode(Double.parseDouble(line));
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @return
     */
    public Double calculateMean(){
        Double summatory = 0.0;
        for(int i =0; i<this.linkedList.getMyLinkedListSize();i++){
            try {
                summatory += (Double) this.linkedList.getNodeByIndex(i).getInformation();
            } catch (MyLinkedListException e) {
                e.printStackTrace();
            }
        }
        Double mean = summatory/this.linkedList.getMyLinkedListSize();
        return mean;
    }

    /**
     *
     * @return
     */
    public Double calculateStdDesviation(){
        Double summatory = 0.0;
        for(int i =0; i<this.linkedList.getMyLinkedListSize();i++){
            try {
                summatory +=  Math.pow((Double)this.linkedList.getNodeByIndex(i).getInformation() - calculateMean(), 2);
            } catch (MyLinkedListException e) {
                e.printStackTrace();
            }
        }
        Double desviation = Math.sqrt(summatory/(this.linkedList.getMyLinkedListSize()-1));
        return desviation;
    }

    public String calculationFormat(Object information){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(information);
    }
    /**
     *
     * @return
     */
    public MyLinkedList getLinkedList(){
        return this.linkedList;
    }

}
