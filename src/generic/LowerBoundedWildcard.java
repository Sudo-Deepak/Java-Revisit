package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates the use of lower-bounded wildcards.
 *
 * <p>{@code <? super Integer>} means the list can accept Integer or any of its supertypes.
 * This is useful when you want to write (add) to a generic collection.
 */
class LowerBoundedWildcard {

    /**
     * Adds integers to a list that can accept Integer or its supertypes.
     *
     * @param list a list of elements that are {@code Integer} or a superclass of {@code Integer}
     */
    public static void addIntegers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        addIntegers(numberList);

        System.out.println("Contents after adding integers:");
        for (Object obj : numberList) {
            System.out.println(obj);
        }
    }
}

/*
Output:
    Contents after adding integers:
    1
    2
    3
 */
