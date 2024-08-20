public class LinkedList<E> {
    private Cell<E> head;
    private Cell<E> tail;

    // Constructor to initialize the linked list
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Getter for head
    public Cell<E> getHead() {
        return this.head;
    }

    // Getter for tail
    public Cell<E> getTail() {
        return this.tail;
    }

    // Method to add a new element to the linked list
    public void add(E content) {
        Cell<E> newCell = new Cell<>(content);
        if (tail == null) {
            // If the list is empty, set both head and tail to the new cell
            head = newCell;
        } else {
            // Otherwise, append the new cell to the end of the list
            tail.setNextCell(newCell);
        }
        tail = newCell;
    }

    public void remove() throws EmptyListException {
        if (head == null) {
            throw new EmptyListException("The list is empty.");
        }
        Cell<E> temp = head.getNextCell();
        head.setNextCell(null); // Disconnect the removed cell from the list
        head = temp;
        if (head == null) {
            tail = null; // If the list becomes empty, update the tail
        }
    }

    @Override
    public String toString() {
        // Create a StringBuilder object to efficiently build the resulting string
        StringBuilder sb = new StringBuilder();

        // Iterate over each cell in the linked list starting from the head
        for (Cell<E> temp = head; temp != null; temp = temp.getNextCell()) {
            // Append the content of the current cell to the StringBuilder
            // followed by space
            sb.append(temp.getCellContent()).append(" ");
        }

        // Convert the StringBuilder to a String and remove any leading or trailing whitespace
        // This ensures the final string does not have extra spaces at the beginning or end
        return sb.toString().trim();
    }

}
