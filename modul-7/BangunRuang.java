// File: BangunRuang.java
public class BangunRuang {
    public double hitungVolume() {
        return 0;
    }
}

class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }
}

class Balok extends BangunRuang {
    private double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
}

class Tabung extends BangunRuang {
    private double jariJari, tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }
}

class Kerucut extends BangunRuang {
    private double jariJari, tinggi;

    public Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3) * Math.PI * Math.pow(jariJari, 2) * tinggi;
    }
}

class Limas extends BangunRuang {
    private double panjang, lebar, tinggi;

    public Limas(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3) * panjang * lebar * tinggi;
    }
}

class Prisma extends BangunRuang {
    private double alas, tinggiAlas, tinggiPrisma;

    public Prisma(double alas, double tinggiAlas, double tinggiPrisma) {
        this.alas = alas;
        this.tinggiAlas = tinggiAlas;
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public double hitungVolume() {
        return (0.5 * alas * tinggiAlas) * tinggiPrisma;
    }
}

class Bola extends BangunRuang {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(jariJari, 3);
    }
}

public class HitungBangunRuang {
    public static void main(String[] args) {
        BangunRuang kubus = new Kubus(3);
        BangunRuang balok = new Balok(4, 5, 6);
        BangunRuang tabung = new Tabung(3, 7);
        BangunRuang kerucut = new Kerucut(3, 7);
        BangunRuang limas = new Limas(4, 5, 6);
        BangunRuang prisma = new Prisma(4, 5, 6);
        BangunRuang bola = new Bola(3);

        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Volume Tabung: " + tabung.hitungVolume());
        System.out.println("Volume Kerucut: " + kerucut.hitungVolume());
        System.out.println("Volume Limas: " + limas.hitungVolume());
        System.out.println("Volume Prisma: " + prisma.hitungVolume());
        System.out.println("Volume Bola: " + bola.hitungVolume());
    }
}