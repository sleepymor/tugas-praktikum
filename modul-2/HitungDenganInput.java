import javax.swing.JOptionPane;

public class HitungDenganInput {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateCircumference();

        Trapesium trapesium = new Trapesium();
        trapesium.calculateArea();

        PrismaSegitiga prismasegitiga = new PrismaSegitiga();
        prismasegitiga.calculateVolume();
    }
}


class Circle {
    public void calculateCircumference() {
        double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius of the circle: "));
        double kelilingLingkaran = 2 * Math.PI * radius;
        JOptionPane.showMessageDialog(null, "Keliling Lingkaran: " + kelilingLingkaran);
    }
}

class Trapesium {
    public void calculateArea() {
        double base1 = Double.parseDouble(JOptionPane.showInputDialog("Enter base1 of the trapesium: "));
        double base2 = Double.parseDouble(JOptionPane.showInputDialog("Enter base2 of the trapesium: "));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height of the trapesium: "));
        double luasTrapesium = 0.5 * (base1 + base2) * height;
        JOptionPane.showMessageDialog(null, "Luas Trapesium: " + luasTrapesium);
    }
}

class PrismaSegitiga {
    public void calculateVolume() {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Enter base of the triangle: "));
        double heightTriangle = Double.parseDouble(JOptionPane.showInputDialog("Enter height of the triangle: "));
        double heightPrisma = Double.parseDouble(JOptionPane.showInputDialog("Enter height of the prism: "));
        double luasPrismaSegitiga = 0.5 * base * heightTriangle * heightPrisma;
        JOptionPane.showMessageDialog(null, "Luas Prisma Segitiga: " + luasPrismaSegitiga);
    }
}