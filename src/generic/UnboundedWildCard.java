package generic;


import java.util.List;

/**
 * Demonstrates the use of unbounded wildcards.
 *
 * <p>{@code <?>} is used when the type can be anything, but we don't care what it is.
 * Useful for read-only access to data.
 */
public class UnboundedWildCard {
    /**
     * Prints all elements in the given list, regardless of its type.
     *
     * @param list the list to print, of any object type
     */
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");
        List<Integer> numbers = List.of(1, 2, 3);

        System.out.println("Printing names:");
        printList(names);

        System.out.println("Printing numbers:");
        printList(numbers);
    }
}

/*
Output:
    Printing names:
    Alice
    Bob
    Charlie
    Printing numbers:
    1
    2
    3
 */
