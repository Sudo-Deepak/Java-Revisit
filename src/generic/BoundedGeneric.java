package generic;

/**
 * Demonstrates bounded generic types using upper bounds.
 *
 * <p>This class only allows types that are subtypes of {@code Number} to be used.
 * Useful when you need to restrict a generic type to a hierarchy.
 *
 * @param <T> a subtype of {@code Number}
 */
class BoundedGeneric<T extends Number> {
    private T number;

    public BoundedGeneric(T number) {
        this.number = number;
    }

    /**
     * Calculates the square of the number using {@code doubleValue()}.
     *
     * @return the square of the number
     */
    public double square() {
        return number.doubleValue() * number.doubleValue();
    }

    public static void main(String[] args) {
        BoundedGeneric<Integer> intBox = new BoundedGeneric<>(5);
        System.out.println("Square of Integer: " + intBox.square());

        BoundedGeneric<Double> doubleBox = new BoundedGeneric<>(4.5);
        System.out.println("Square of Double: " + doubleBox.square());
    }
}

/*
Output:
    Square of Integer: 25.0
    Square of Double: 20.25
 */
