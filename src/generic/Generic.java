package generic;

/**
 * <b>Before Java 5</b>, Java did not support generics, so developers used {@code Object} types for general-purpose data structures
 * like collections and utility classes.
 *
 * <p>This approach had significant drawbacks:
 * <ul>
 *   <li><b>Need for explicit casting:</b> Developers had to manually cast objects when retrieving them, which was error-prone.</li>
 *   <li><b>Potential {@code ClassCastException} at runtime:</b> Incorrect casts could lead to runtime failures that were hard to trace.</li>
 * </ul>
 *
 * <p>Generics, introduced in Java 5, addressed these issues by providing compile-time type safety and eliminating unnecessary casts.
 *
 * <p><b>Use Cases:</b>
 * <ul>
 *   <li><b>Collections API:</b> Strongly typed Lists, Sets, Maps etc.</li>
 *   <li><b>Utility Classes:</b> Reusable data structures like Pair, Wrapper, etc.</li>
 *   <li><b>Method-level Generics:</b> Generic methods that work across types.</li>
 *   <li><b>Custom Data Structures:</b> Type-safe stacks, queues, etc.</li>
 *   <li><b>API Design:</b> More flexible and reusable interfaces and classes.</li>
 * </ul>
 */
public class Generic {
}


