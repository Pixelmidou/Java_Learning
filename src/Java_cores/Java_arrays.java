package Java_cores;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Java_arrays {
    public static void main(String[] args) {

        // defining an n values array :
        int n = 5;
        String[] vegtables = new String[n];

        // manually defining an array :
        String[] fruits = {"apple", "orange", "banana", "coconut"};
        // cannot directly System.out.println(fruits) ( can print indexes )
        // arrays are mutable : fruits[1] = "pineapple"

        // to print the array there are two ways :
        // normal for loop
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        // enhanced for loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Array methods :
        // class "Arrays" needs to be imported
        // Arrays.sort(fruits)
        // Arrays.fill(fruits, "pineapple")
        // Arrays.equals(arr1, arr2)
        // Arrays.compare(arr1, arr2) // compares lexographically

        // 2D arrays ( matrix )
        int[] numseven = {2, 4, 6, 8, 10};
        int[] numsodd = {3, 5, 7, 9};
        int[][] nums = {numseven, numsodd};
        // OR // int[][] nums = {{2, 4, 6, 8, 10}, {3, 5, 7, 9}};
        // 2D arrays are mutable : nums[0][2] = 5

        for (int[] numarr : nums) {
            for (int num : numarr) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n");

        /*
            ArrayList :
                A resizeable array that stores objects
                Arrays are fixed in size, ArrayLists's size can change on demand
                ( similar to python Lists )
                ArrayLists stores ONLY OBJECTS, so if we need to store primitives
                we need to implement autoboxing which we learned in Wrapper_classes
         */

        ArrayList<Integer> intlist = new ArrayList<>();
        ArrayList<Double> doublelist = new ArrayList<>();
        ArrayList<String> fruits2 = new ArrayList<>();

        intlist.add(5); intlist.add(6); intlist.add(9);
        doublelist.add(5.5); doublelist.add(6.5); doublelist.add(9.5);
        fruits2.add("banana"); fruits2.add("orange"); fruits2.add("pineapple");

        fruits2.remove(0);
        fruits2.set(0, "strawberry");
        System.out.println(fruits2.get(0));
        System.out.println(fruits2.size());

        Collections.sort(fruits2);

        System.out.println(intlist);
        System.out.println(doublelist);
        System.out.println(fruits2);

    }
}
