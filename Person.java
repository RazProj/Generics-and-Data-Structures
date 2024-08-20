public class Person implements Comparable<Person> {
    private final String name;
    private final int id;
    private final int yearOfBirth;

    // Constructor
    public Person(String name, int id, int yearOfBirth) {
        this.name = name;
        this.id = id;
        this.yearOfBirth = yearOfBirth;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for year of birth

    @Override
    public int compareTo(Person other) {
        return Integer.compare(other.yearOfBirth, this.yearOfBirth);
        // Compare based on yearOfBirth
    }

    // Overriding the toString method
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "ID: " + id + "\n" +
                "Year of birth: " + yearOfBirth + "\n";
    }
}
