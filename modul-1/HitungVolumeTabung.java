public class HitungVolumeTabung {
    public static void main(String[] args) {
        Tabung tabung = new Tabung(7, 10);
        System.out.println("Volume Tabung: " + tabung.hitungVolume());
    }
}

class Tabung {
    double radius;
    double tinggi;
    
    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }
    
    public double hitungVolume() {
        return Math.PI * Math.pow(radius, 2) * tinggi;
    }
}
