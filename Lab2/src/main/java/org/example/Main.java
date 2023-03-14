package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        for (int count : new int[]{10, 100, 1000, 10000}) {
            System.out.println("Number of elements: " + count);
            ArrayList<Integer> arrayList = filingList(count);

            for (SortingType type : SortingType.values()) {
                System.out.println("Sorting type: " + type.name());
                ArrayList<Integer> sortedList = countingTime(arrayList,FabricSort.createSorter(type));
                listOutput(sortedList);
                System.out.println();
                System.out.println("List that was: " + arrayList);
            }

        }

    }
    public static ArrayList<Integer> filingList(int counter){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < counter; i++) {
            arrayList.add(rand.nextInt(counter));
        }
        listOutput(arrayList);
        return arrayList;
    }

    public static void listOutput(ArrayList<Integer> arrayList){
        for (int i = 0; i < Math.min(arrayList.size(), 50); i++) {
            System.out.print(" " + arrayList.get(i));
        }
        System.out.println();
    }

    public static ArrayList<Integer> countingTime (ArrayList<Integer> list, Sorter sorter){
        ArrayList<Integer> arrayList = new ArrayList<>(list);
        long time = System.currentTimeMillis();
        arrayList = sorter.sort(arrayList);
        System.out.printf("Time taken: %s%n", System.currentTimeMillis() - time);
        return arrayList;
    }
}