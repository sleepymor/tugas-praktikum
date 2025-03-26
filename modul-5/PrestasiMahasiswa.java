class PrestasiMahasiswa {
    private String name;
    private int nim;
    private String jurusan;
    private String fakultas;

    public PrestasiMahasiswa(String name, int nim, String jurusan, String fakultas) {
        this.name = name;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
    }

    public void showData() {
        System.out.println("Nama: " + name);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Fakultas: " + fakultas);
    }

    public void showData(double ipSemester) {
        showData();
        System.out.println("IP Semester: " + ipSemester);
    }

    public void showData(double ipSemester, double ipKumulatif) {
        showData(ipSemester);
        System.out.println("IP Kumulatif: " + ipKumulatif);
    }

    public void showData(double ipSemester, double ipKumulatif, String riwayatBeasiswa) {
        showData(ipSemester, ipKumulatif);
        System.out.println("riwayatBeasiswa: " + riwayatBeasiswa);
    }



}

class Student {
    public static void main(String[] args) {
        PrestasiMahasiswa mhs1 = new PrestasiMahasiswa("Budi", 123456, "Teknik Informatika", "Fakultas Teknik");

        System.out.println("Data Mahasiswa 1");
        mhs1.showData(3.75, 3.80, "KIP" );
    }
}

