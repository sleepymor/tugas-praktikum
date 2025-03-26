public class HitungVolume {
    public static void main(String[] args) {
        VolumeBalok balok = new VolumeBalok(10, 5, 3);
        VolumeBola bola = new VolumeBola(7);

        System.out.println("Volume Balok: " + balok.hitungVolume());
        System.out.println("Volume Bola: " + bola.hitungVolume());
    }
}

abstract class Volume {
    abstract double hitungVolume();
}

class VolumeBalok extends Volume {
    double panjang, lebar, tinggi;

    VolumeBalok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return panjang * lebar * tinggi;
    }
    
}

class VolumeBola extends Volume {
    private double jariJari;

    VolumeBola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }
}