public class Max {

    public static <E extends Comparable<E>> E max(LinkedList<E> list) throws EmptyListException {
        // Check if the list is empty
        if (list.getHead() == null) {
            throw new EmptyListException("The list is empty.");
        }

        // Initialize maxContent with the head element's content
        E maxContent = list.getHead().getCellContent();

        // Start iterating from the second element, to avoid a step which is redundent.
        for (Cell<E> i = list.getHead().getNextCell(); i != null; i = i.getNextCell()) {
            // Compare each element's content with maxContent
            if (i.getCellContent().compareTo(maxContent) > 0) {
                maxContent = i.getCellContent();
            }
        }

        return maxContent;
    }
}
