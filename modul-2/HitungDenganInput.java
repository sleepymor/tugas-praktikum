import javax.swing.JOptionPane;

public class HitungDenganInput {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateCircumference();

        Trapezium trapezium = new Trapezium();
        trapezium.calculateArea();

        TrianglePrism trianglePrism = new TrianglePrism();
        trianglePrism.calculateVolume();
    }
}


class Circle {
    public void calculateCircumference() {
        System.out.println("Using JOptionPane:");
        double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius of the circle: "));
        double kelilingLingkaran = 2 * Math.PI * radius;
        JOptionPane.showMessageDialog(null, "Keliling Lingkaran: " + kelilingLingkaran);
    }
}

class Trapezium {
    public void calculateArea() {
        System.out.println("Using JOptionPane:");
        double base1 = Double.parseDouble(JOptionPane.showInputDialog("Enter base1 of the trapezium: "));
        double base2 = Double.parseDouble(JOptionPane.showInputDialog("Enter base2 of the trapezium: "));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height of the trapezium: "));
        double luasTrapesium = 0.5 * (base1 + base2) * height;
        JOptionPane.showMessageDialog(null, "Luas Trapesium: " + luasTrapesium);
    }
}

class TrianglePrism {
    public void calculateVolume() {
        System.out.println("Using JOptionPane:");
        double base = Double.parseDouble(JOptionPane.showInputDialog("Enter base of the triangle: "));
        double heightTriangle = Double.parseDouble(JOptionPane.showInputDialog("Enter height of the triangle: "));
        double heightPrisma = Double.parseDouble(JOptionPane.showInputDialog("Enter height of the prism: "));
        double luasPrismaSegitiga = 0.5 * base * heightTriangle * heightPrisma;
        JOptionPane.showMessageDialog(null, "Luas Prisma Segitiga: " + luasPrismaSegitiga);
    }
}