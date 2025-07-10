package generic;

/**
 * Demonstrates the use of a generic method.
 *
 * <p>A generic method is independent of the class it is declared in and can be applied to different types.
 * Here, {@code <T>} is a method-level type parameter, not tied to any class.
 */
public class GenericMethod {

    /**
     * Generic method to check if two objects are equal.
     *
     * @param a   the first object
     * @param b   the second object
     * @param <T> the type of objects to compare
     * @return true if both objects are equal, false otherwise
     */
    public static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println("Are Integers equal? " + isEqual(10, 10));
        System.out.println("Are Strings equal? " + isEqual("Java", "Java"));
        System.out.println("Are Doubles equal? " + isEqual(10.5, 20.0));
    }
}

/*
Output:
    Are Integers equal? true
    Are Strings equal? true
    Are Doubles equal? false
 */
