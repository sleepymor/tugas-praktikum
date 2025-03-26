public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private String fakultas;
    private double ipSemester;
    private double ipKumulatif;

    // Constructor 1
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Constructor 2
    public Mahasiswa(String nama, String nim, String jurusan, String fakultas) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
    }

    // Constructor 3
    public Mahasiswa(String nama, String nim, String jurusan, String fakultas, double ipSemester, double ipKumulatif) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.ipSemester = ipSemester;
        this.ipKumulatif = ipKumulatif;
    }

    public void displayIdentitas() {
        System.out.println("Identitas Mahasiswa");
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        if (jurusan != null) {
            System.out.println("Jurusan: " + jurusan);
        }
        if (fakultas != null) {
            System.out.println("Fakultas: " + fakultas);
        }
        if (ipSemester != 0) {
            System.out.println("IP Semester: " + ipSemester);
        }
        if (ipKumulatif != 0) {
            System.out.println("IP Kumulatif: " + ipKumulatif);
        }
    }

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Budi", "123456");
        Mahasiswa mhs2 = new Mahasiswa("Ani", "654321", "Teknik Informatika", "Fakultas Teknik");
        Mahasiswa mhs3 = new Mahasiswa("Siti", "112233", "Sistem Informasi", "Fakultas Ilmu Komputer", 3.75, 3.80);

        mhs1.displayIdentitas();
        System.out.println();
        mhs2.displayIdentitas();
        System.out.println();
        mhs3.displayIdentitas();
    }
}
