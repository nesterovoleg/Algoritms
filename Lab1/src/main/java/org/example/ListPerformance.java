package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListPerformance {

    private static final int N = 100000; // размер списка
    private static final int INSERT_COUNT = 1000; // количество элементов для вставки

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        fill(arrayList, N, "ArrayList");
        fill(linkedList, N, "LinkedList");

        randomAccess(arrayList, "ArrayList");
        randomAccess(linkedList, "LinkedList");

        sequentialAccess(arrayList, "ArrayList");
        sequentialAccess(linkedList, "LinkedList");

        insertAtBeginning(arrayList, INSERT_COUNT, "ArrayList");
        insertAtBeginning(linkedList, INSERT_COUNT, "LinkedList");

        insertAtEnd(arrayList, INSERT_COUNT, "ArrayList");
        insertAtEnd(linkedList, INSERT_COUNT, "LinkedList");

        insertInMiddle(arrayList, INSERT_COUNT, "ArrayList");
        insertInMiddle(linkedList, INSERT_COUNT, "LinkedList");
    }

    private static void fill(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            list.add(random.nextInt(N));
        }
        System.out.printf("Fill %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }

    private static void randomAccess(List<Integer> list, String listType) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            int value = list.get(i);
        }
        System.out.printf("Random access in %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }

    private static void sequentialAccess(List<Integer> list, String listType) {
        long time = System.currentTimeMillis();
        for (Integer value : list) {
            int x = value;
        }
        System.out.printf("Sequential access in %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }

    private static void insertAtBeginning(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            list.add(0, i);
        }
        System.out.printf("Insert at beginning of %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }

    private static void insertAtEnd(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
        System.out.printf("Insert at end of %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }

    private static void insertInMiddle(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();
        int size = list.size();
        for (int i = 0; i < count; i++) {
            list.add(size / 2, i);
        }
        System.out.printf("Insert in the middle of %s: %d ms%n", listType, System.currentTimeMillis() - time);
    }
}