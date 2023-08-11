package AdvanceJava;

import java.util.ArrayList;
import java.util.SortedMap;

public class Collection_ArrayList {
    public static void main(String[] args) {
        // An ArrayList is a class that provides us some common solution that we can not solve easily with array
        ArrayList<Integer> arrayList = new ArrayList<>(); // This is the syntax to Initialize array list. It is an integer type array list
        arrayList.add(2); // Adding value in array list
        arrayList.add(6); // Adding value in array list
        arrayList.add(3); // Adding value in array list
        arrayList.add(7); // Adding value in array list
        arrayList.add(0, 5); // To add a value 5 at index position 0 we can use this syntax
        arrayList.add(0, 9); // Now if we again add another value 9 at position index 0 then it will add 9 at 0th index and will push 0th element (here is 5) to 1st index. And so on...
        for(int i = 0; i < arrayList.size(); i++) { // Accessing all elements in the array list
            System.out.print(arrayList.get(i));
            System.out.print(", ");
        }
        System.out.println();
        ArrayList<Integer> arrayList1 = new ArrayList<>(5); // We can also add initial capacity of an array list. In this case it is 5.
        arrayList1.add(19); // Adding value in array list
        arrayList1.add(17); // Adding value in array list
        arrayList1.add(12); // Adding value in array list
        arrayList1.add(17); // Adding value in array list
        arrayList1.add(14); // Adding value in array list
        arrayList.addAll(arrayList1); // We can use add all method to add arrayList1 in arrayList
        System.out.println("Elements of arrayList after adding all elements of arrayList1 in it -->");
        for(int i = 0; i < arrayList.size(); i++) { // Accessing all elements in the array list
            System.out.print(arrayList.get(i));
            System.out.print(", ");
        }
        System.out.println();
        System.out.println(arrayList1.contains(27)); // It will return false as 27 is not present in arrayList1
        System.out.println(arrayList1.contains(17)); // It will return true as 17 is present in arrayList1
        System.out.println(arrayList1.indexOf(17)); // It will return the index value of 17. If 17 is not present in array list then it will return -1
        System.out.println(arrayList1.lastIndexOf(17)); // It will return the last index where 17 is present
        System.out.println(arrayList1.set(2, 437)); // It will replace the 2nd index value with 437
        for(int i = 0; i < arrayList1.size(); i++) { // Accessing all elements in the array list
            System.out.print(arrayList1.get(i));
            System.out.print(", ");
        }
        arrayList.clear(); // It makes the array as empty array
        for(int i = 0; i < arrayList.size(); i++) { // Accessing all elements in the array list
            System.out.print(arrayList.get(i));
            System.out.print(", ");
        }
    }
}
