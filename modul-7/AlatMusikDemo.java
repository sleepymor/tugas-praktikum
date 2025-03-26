// File: AlatMusik.java
abstract class AlatMusik {
    protected String nama;

    public AlatMusik(String nama) {
        this.nama = nama;
    }

    public abstract void bermain();
}

class Piano extends AlatMusik {
    public Piano() {
        super("Piano");
    }

    @Override
    public void bermain() {
        System.out.println(nama + " dimainkan dengan menekan tuts.");
    }
}

class Biola extends AlatMusik {
    public Biola() {
        super("Biola");
    }

    @Override
    public void bermain() {
        System.out.println(nama + " dimainkan dengan menggesekkan busur pada senar.");
    }
}

class Gitar extends AlatMusik {
    public Gitar() {
        super("Gitar");
    }

    @Override
    public void bermain() {
        System.out.println(nama + " dimainkan dengan memetik senar.");
    }
}

class Drum extends AlatMusik {
    public Drum() {
        super("Drum");
    }

    @Override
    public void bermain() {
        System.out.println(nama + " dimainkan dengan memukul menggunakan stik.");
    }
}

class Saxophone extends AlatMusik {
    public Saxophone() {
        super("Saxophone");
    }

    @Override
    public void bermain() {
        System.out.println(nama + " dimainkan dengan meniup dan menekan tombol.");
    }
}

class Trumpet extends AlatMusik {
    public Trumpet() {
        super("Trumpet");
    }

    @Override
    public void bermain() {
        System.out.println(nama + " dimainkan dengan meniup dan menekan katup.");
    }
}

public class AlatMusikDemo {
    public static void main(String[] args) {
        AlatMusik[] alatMusik = {
            new Piano(),
            new Biola(),
            new Gitar(),
            new Drum(),
            new Saxophone(),
            new Trumpet()
        };

        for (AlatMusik alat : alatMusik) {
            alat.bermain();
        }
    }
}
