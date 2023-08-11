package AdvanceJava;

import java.util.*;

public class Collection_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(); // This is the syntax to Initialize linked list. It is an integer type linked list
        linkedList.add(2); // Adding value in linked list
        linkedList.add(6); // Adding value in linked list
        linkedList.add(3); // Adding value in linked list
        linkedList.add(7); // Adding value in linked list
        linkedList.add(0, 5); // To add a value 5 at index position 0 we can use this syntax
        linkedList.add(0, 9); // Now if we again add another value 9 at position index 0 then it will add 9 at 0th index and will push 0th element (here is 5) to 1st index. And so on...
        for(int i = 0; i < linkedList.size(); i++) { // Accessing all elements of the linked list
            System.out.print(linkedList.get(i));
            System.out.print(", ");
        }
        System.out.println();
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(19); // Adding value in linked list
        linkedList1.add(17); // Adding value in linked list
        linkedList1.add(12); // Adding value in linked list
        linkedList1.add(17); // Adding value in linked list
        linkedList1.add(15); // Adding value in linked list
        linkedList1.add(17); // Adding value in linked list
        linkedList1.add(14); // Adding value in linked list
        linkedList.addAll(linkedList1); // We can use add all method to add linkedList1 in linkedList
        System.out.println("Elements of linkedList after adding all elements of linkedList1 in it -->");
        for(int i = 0; i < linkedList.size(); i++) { // Accessing all elements of the linked list
            System.out.print(linkedList.get(i));
            System.out.print(", ");
        }
        System.out.println();
        System.out.println(linkedList1.contains(27)); // It will return false as 27 is not present in linkedList1
        System.out.println(linkedList1.contains(17)); // It will return true as 17 is present in linkedList1
        System.out.println(linkedList1.indexOf(17)); // It will return the index value of 17. If 17 is not present in linked list then it will return -1
        System.out.println(linkedList1.lastIndexOf(17)); // It will return the last index where 17 is present
        System.out.println(linkedList1.set(2, 437)); // It will replace the 2nd index value with 437, and will return the element that was present at that index before replacing
        linkedList1.addFirst(1000); // It will add 1000 at the 1st place of the linked list. This method is not present in ArrayList
        linkedList1.addLast(2000); // It will add 2000 at the last place of the linked list. This method is not present in ArrayList
        linkedList1.remove(1); // It will remove the element present at position 1
        // linkedList1.removeFirst(); //  It will remove the element present at 1st position
        // linkedList1.removeLast(); //  It will remove the element present at last position
        linkedList1.removeFirstOccurrence(17); // It will remove 17 from the position where it 1st occurred
        linkedList1.removeLastOccurrence(17); // It will remove 17 from the position where it last occurred
        for(int i = 0; i < linkedList1.size(); i++) { // Accessing all elements in the linked list
            System.out.print(linkedList1.get(i));
            System.out.print(", ");
        }
        linkedList.clear(); // It makes the linked as empty linked
        for(int i = 0; i < linkedList.size(); i++) { // Accessing all elements in the linked list
            System.out.print(linkedList.get(i));
            System.out.print(", ");
        }
    }
}
