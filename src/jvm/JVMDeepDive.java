package jvm;

/**
 * Demonstrates how various components of the JVM Architecture handle and store different types of data during program execution.
 * <p>
 * JVM Components Covered:
 * - Class Loader Subsystem
 * - Method Area (Class Metadata, Static variables, Constants, String Pool)
 * - Heap (Object storage)
 * - Stack (Local variables, references, method calls)
 * - Program Counter Register
 * - Execution Engine (Interpreter + JIT)
 * - Garbage Collector (Automatic memory management)
 */
public class JVMDeepDive {

    // Static variable (Stored in Method Area)
    private static final String STATIC_CONSTANT = "Static data in Method Area";

    // Instance variable (Stored in Heap as part of the Object)
    private final String instanceData;

    // Constructor (Called during object creation, object allocated in Heap)
    public JVMDeepDive(String instanceData) {
        this.instanceData = instanceData;
    }

    public static void main(String[] args) {

        /*
         * Class Loader Subsystem loads the JVMDeepDive.class into the JVM
         * Method Area stores class-level metadata and static constants
         */

        System.out.println("------ JVM Architecture Demonstration ------");

        // Local variable stored in Stack (method frame for main)
        int localCounter = 10;

        // String literal stored in String Pool (part of Method Area in modern JVMs)
        String greeting = "Hello, JVM World!";

        // Object creation - reference stored in Stack, object stored in Heap
        JVMDeepDive example = new JVMDeepDive("Instance Data in Heap");

        // Method call - new Stack Frame created for displayDetails
        example.displayDetails(localCounter, greeting);

        // Hint to JVM for garbage collection (not guaranteed to run immediately)
        example = null; // Eligible for GC
        System.gc();

        System.out.println("Program Execution Completed.");
    }

    /**
     * Demonstrates object references, local variables, and interaction with JVM memory areas.
     */
    public void displayDetails(int count, String greetMessage) {

        // New Stack Frame for this method
        double piValue = 3.14159; // Local variable in Stack

        System.out.println("\n--- Inside displayDetails() Method ---");
        System.out.println("Static Constant (Method Area): " + STATIC_CONSTANT);
        System.out.println("Instance Data (Heap): " + instanceData);
        System.out.println("Greeting (String Pool / Method Area): " + greetMessage);
        System.out.println("Count (Local - Stack): " + count);
        System.out.println("Pi Value (Local - Stack): " + piValue);

        // Demonstrating object allocation within method scope
        String[] dataArray = new String[3]; // Array object allocated in Heap
        dataArray[0] = "First";
        dataArray[1] = "Second";
        dataArray[2] = "Third";

        System.out.println("\nArray Elements (Objects in Heap):");
        for (String item : dataArray) {
            System.out.println(item);
        }
    }
}

