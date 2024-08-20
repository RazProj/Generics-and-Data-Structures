/**
 * NOTE: Instead of the functions I created to reverse the list and print it,
 *       I can use the built-in reverse function in the StringBuilder class.
 *       However, since I discovered it after writing these functions,
 *       I prefer to keep it this way.
 **/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws EmptyListException {
        // Create, print, and reverse the list, then print the reversed list
        Cell<String> headOfTheReversedUserList = createPrintAndReverseFirstList();
        printFirstListBackwards(headOfTheReversedUserList);


        LinkedList<Person> persons = createPersonsList();
        try {
            Person maxPerson = Max.max(persons);
            System.out.println("\nThe Oldest person is: " + maxPerson.getName());
        } catch (EmptyListException e) {
            throw new EmptyListException("The list is empty.");
        }


    }

    // Method to create a list, print it, reverse it, and return the head of the reversed list
    public static Cell<String> createPrintAndReverseFirstList() {
        LinkedList<String> first = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        // Read 6 strings from the user and add them to the list
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter a string:");
            input = scanner.nextLine();
            first.add(input);
        }

        // Print the original list
        System.out.println("Original list: " + first);

        // Close the scanner
        scanner.close();

        // Reverse the list and return the head of the reversed list
        return reverseList(first);
    }

    // Method to reverse the linked list and return the new head
    public static Cell<String> reverseList(LinkedList<String> list) {
        Cell<String> prev = null;
        Cell<String> current = list.getHead();
        Cell<String> next;

        // Iterate through the list and reverse the direction of the pointers
        while (current != null) {
            next = current.getNextCell();  // Store the next cell
            current.setNextCell(prev);     // Reverse the current cell's pointer
            prev = current;                // Move prev and current one step forward
            current = next;
        }

        // After reversing, prev will be the new head
        return prev;
    }

    // Method to print the list starting from the given head
    public static void printFirstListBackwards(Cell<String> headOfTheReversedUserList) {
        System.out.print("Reversed list printed backwards: ");
        // Iterate through the list and print each element
        while (headOfTheReversedUserList != null) {
            System.out.print(headOfTheReversedUserList.getCellContent() + " ");
            headOfTheReversedUserList = headOfTheReversedUserList.getNextCell();
        }
    }

    // Method to create a list of Person objects and print their details
    public static LinkedList<Person> createPersonsList() {
        LinkedList<Person> persons = new LinkedList<>();
        Person one = new Person("Kobi", 123456789, 1897);
        Person two = new Person("Yariv", 987654321, 2004);
        Person three = new Person("Moshe", 135792468, 1964);
        Person four = new Person("Shani", 246813579, 1988);
        System.out.println("\n\n" + one + "\n" + two + "\n" + three + "\n" + four);
        persons.add(one);
        persons.add(two);
        persons.add(three);
        persons.add(four);
        return persons;
    }
}