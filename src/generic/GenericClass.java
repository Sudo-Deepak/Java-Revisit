package generic;

/**
 * A generic class representing a key-value pair.
 *
 * <p>This class demonstrates how to define a generic class with multiple type parameters {@code <K, V>}.
 * Commonly used in data structures like maps or configurations where each key has a corresponding value.
 *
 * @param <K> the type of the key
 * @param <V> the type of the value
 */
public class GenericClass<K, V> {
    private K key;
    private V value;

    public GenericClass(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        GenericClass<String, Integer> pair = new GenericClass<>("Age", 30);
        System.out.println(pair.getKey() + " = " + pair.getValue());
    }
}

/*
Output:
    Age = 30
 */
