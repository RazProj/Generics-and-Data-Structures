public class Cell<E> {
    private E cellContent;
    private Cell<E> nextCell;

    // Constructor to initialize cell content with no next cell
    public Cell(E content) {
        this.cellContent = content;
        this.nextCell = null;
    }

    // Constructor to initialize cell content and next cell
    public Cell(E content, Cell<E> next) {
        this.cellContent = content;
        this.nextCell = next;
    }

    // Getter for cell content
    public E getCellContent() {
        return this.cellContent;
    }

    // Getter for the next cell
    public Cell<E> getNextCell() {
        return nextCell;
    }

    // Setter for cell content
    public void setCellContent(E content) {
        this.cellContent = content;
    }

    // Setter for the next cell
    public void setNextCell(Cell<E> next) {
        this.nextCell = next;
    }
}
