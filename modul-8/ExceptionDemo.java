

public class ExceptionDemo {
    public static void main(String[] args) {
        ArithmeticHandler arithmeticHandler = new ArithmeticHandler();
        IndexHandler indexHandler = new IndexHandler();

        // Handling ArithmeticException
        System.out.println("=== ArithmeticException Demo ===");
        arithmeticHandler.divideNumbers(10, 0);

        // Handling IndexOutOfBoundsException
        System.out.println("\n=== IndexOutOfBoundsException Demo ===");
        indexHandler.accessArrayElement(new int[]{1, 2, 3}, 5);
    }
}

class ArithmeticHandler {
    public void divideNumbers(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}

class IndexHandler {
    public void accessArrayElement(int[] array, int index) {
        try {
            System.out.println("Element at index " + index + ": " + array[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " is out of bounds.");
        }
    }
}
