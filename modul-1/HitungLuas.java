
// Program untuk menghitung luas bangun ruang Tabung, Persegi Panjang, dan Trapesium
public class HitungLuas {
    public static void main(String[] args) {
        Tabung tabung = new Tabung(7, 10);
        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 4);
        Trapesium trapesium = new Trapesium(3, 5, 4);

        System.out.println("Luas Tabung: " + tabung.hitungLuas());
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
        System.out.println("Luas Trapesium: " + trapesium.hitungLuas());
    }
}

//Class Tabung
class Tabung {
    //deklarasi variabel
    double radius;
    double tinggi;
    
    //constructor
    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }
    //Method
    public double hitungLuas() {
        return 2 * Math.PI * radius * (radius + tinggi);
    }
}

//Class PersegiPanjang
class PersegiPanjang {
    //deklarasi variabel
    double panjang;
    double lebar;
    
    //constructor
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    //Method
    public double hitungLuas() {
        return panjang * lebar;
    }
}

//Class Trapesium
class Trapesium {
    //deklarasi variabel
    double sisi1;
    double sisi2;
    double tinggi;
    
    //constructor
    public Trapesium(double sisi1, double sisi2, double tinggi) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.tinggi = tinggi;
    }
    //Method
    public double hitungLuas() {
        return (sisi1 + sisi2) * tinggi / 2;
    }
}

