package Sorts;

public interface Sort {

    <T extends Comparable<T>> T[] sort(T[] unsorted);

}
