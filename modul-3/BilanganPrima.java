public class BilanganPrima {

    public static void main(String[] args) {
        System.out.println("Bilangan prima antara 1-1000 menggunakan for-loop:");
        PrimeFinder.findPrimesWithForLoop(1, 1000);

        System.out.println("\nBilangan prima antara 1-1000 menggunakan while-loop:");
        PrimeFinder.findPrimesWithWhileLoop(1, 1000);

        System.out.println("\nBilangan prima antara 1-1000 menggunakan do-while loop:");
        PrimeFinder.findPrimesWithDoWhileLoop(1, 1000);
    }
}

class PrimeFinder {

    public static void findPrimesWithForLoop(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void findPrimesWithWhileLoop(int start, int end) {
        int i = start;
        while (i <= end) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }

    public static void findPrimesWithDoWhileLoop(int start, int end) {
        int i = start;
        do {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= end);
        System.out.println();
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
