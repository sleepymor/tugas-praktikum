public class BilanganGanjilGenap {

    public static void main(String[] args) {
        System.out.println("Bilangan Ganjil dan Genap antara 1-1000 menggunakan for-loop:");
        forLoop();

        System.out.println("\nBilangan Ganjil dan Genap antara 1-1000 menggunakan while-loop:");
        whileLoop();

        System.out.println("\nBilangan Ganjil dan Genap antara 1-1000 menggunakan do-while loop:");
        doWhileLoop();
    }

    public static void forLoop() {
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i + " adalah bilangan ganjil");
            }
        }
    }

    public static void whileLoop() {
        int i = 1;
        while (i <= 1000) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i + " adalah bilangan ganjil");
            }
            i++;
        }
    }

    public static void doWhileLoop() {
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i + " adalah bilangan ganjil");
            }
            i++;
        } while (i <= 1000);
    }
}