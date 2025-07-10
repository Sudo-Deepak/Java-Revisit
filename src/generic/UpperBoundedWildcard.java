package generic;

import java.util.List;

/**
 * Demonstrates the use of upper-bounded wildcards.
 *
 * <p>{@code <? extends Number>} means any type that is a subclass of {@code Number}.
 * Common when reading numeric values.
 */
class UpperBoundedWildcard {

    /**
     * Sums all numbers in a list using upper bounded wildcard.
     *
     * @param list a list of elements that extend {@code Number}
     * @return the total sum
     */
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(10, 20, 30);
        List<Double> doubleList = List.of(1.5, 2.5, 3.5);

        System.out.println("Sum of Integers: " + sumNumbers(intList));
        System.out.println("Sum of Doubles: " + sumNumbers(doubleList));
    }
}

/*
Output:
    Sum of Integers: 60.0
    Sum of Doubles: 7.5
 */
