package org.example;

import java.util.ArrayList;

public class BubbleSorter implements Sorter {

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> inputList) {
        int tmp;
        for (int i = 0; i < inputList.size()-1 ; i++){
            for (int j = 0; j < inputList.size() - i - 1; j++){
                if(inputList.get(j) > inputList.get(j + 1)){
                    tmp = inputList.get(j);
                    inputList.set(j,inputList.get(j +1 ));
                    inputList.set(j + 1,tmp);}
            }
        }
        return inputList;
    }
}
