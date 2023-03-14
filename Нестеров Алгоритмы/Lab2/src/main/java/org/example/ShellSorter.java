package org.example;

import java.util.ArrayList;

public class ShellSorter implements Sorter {
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> inputList) {
        int k = inputList.size();
        int h = 1;
        while (h < k/3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < k; i++) {
                for (int j = i; j >= h && inputList.get(j) < inputList.get(j-h) ; j-= h) {
                    int buf = inputList.get(j);
                    inputList.set(j, inputList.get(j-h));
                    inputList.set(j-h, buf);
                }
            }
            h = h / 3;
        }
        return inputList;
    }
}
