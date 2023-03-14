package org.example;

public class FabricSort {
    public static Sorter createSorter(SortingType typeSort){
        return switch (typeSort) {
            case MERGESORTER -> new MergeSorter();
            case QUICKSORTER -> new QuickSorter();
            case SHELLSORTER -> new ShellSorter();
            case BUBBLESORTER -> new BubbleSorter();
            default -> throw new RuntimeException();
        };
    }
}
