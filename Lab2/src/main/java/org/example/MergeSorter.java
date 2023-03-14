package org.example;

import java.util.ArrayList;

public class MergeSorter implements Sorter {

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> inputList) {

        split(inputList,0, inputList.size() - 1);
        return inputList;

    }

    private void split(ArrayList<Integer> input, int left, int right) {

        if (left < right && (right - left) >= 1) {
            int middleElement = (right + left) / 2;

            split(input, left, middleElement);
            split(input, middleElement + 1, right);

            join(input, left, middleElement, right);
        }
    }

    private void join(ArrayList<Integer> input, int left, int middle, int right) {
        ArrayList<Integer> tempArray = new ArrayList<>();

        int leftIndex = left;
        int rightIndex = middle + 1;

        while (leftIndex <= middle && rightIndex <= right) {
            if (input.get(leftIndex) <= input.get(rightIndex)) {
                tempArray.add(input.get(leftIndex++));
            } else {
                tempArray.add(input.get(rightIndex++));
            }
        }

        while (leftIndex <= middle){
            tempArray.add(input.get(leftIndex++));
        }
        while (rightIndex <= right) {
            tempArray.add(input.get(rightIndex++));
        }
        for(int i = 0; i < tempArray.size(); left++){
            input.set(left, tempArray.get(i++));

        }
    }
}

