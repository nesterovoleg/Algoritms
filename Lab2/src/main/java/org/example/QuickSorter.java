package org.example;

import java.util.ArrayList;

public class QuickSorter implements Sorter {
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> inputList){
        quickSort(inputList,0,inputList.size()-1);
        return inputList;
    }

    private void quickSort(ArrayList<Integer> input,int left, int right) {
        if (left >= right)
            return;
        int coreNumber = split(input, left, right);
        quickSort(input, left, coreNumber - 1);
        quickSort(input, coreNumber + 1, right);
    }

    private int split(ArrayList<Integer> input, int left, int right) {
        int coreNumber = input.get(right);
        int ptr = left - 1;
        for (int i = left; i < right; i++) {
            if(input.get(i) < coreNumber){
                ptr++;
                swap(ptr,i,input);}
        }
        swap(ptr+1,right,input);
        return ptr+1;
    }

    private void swap(int ptr, int i, ArrayList<Integer> input) {
        int tmp = input.get(ptr);

        input.set(ptr, input.get(i));
        input.set(i, tmp);
    }
}
