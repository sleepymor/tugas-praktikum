class dataBiodata {

    private String name, jurusan, fakultas, universitas, alamat, email, pekerjaan, hobi, keahlian, karya;

    public dataBiodata(String name, String jurusan, String fakultas, String universitas, String alamat, String email, String pekerjaan, String hobi, String keahlian, String karya) {
        this.name = name;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.universitas = universitas;
        this.alamat = alamat;
        this.email = email;
        this.pekerjaan = pekerjaan;
        this.hobi = hobi;
        this.keahlian = keahlian;
        this.karya = karya;
    }

    //getter
    public String getName() {
        return name;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getFakultas() {
        return fakultas;
    }

    public String getUniversitas() {
        return universitas;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getEmail() {
        return email;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public String getHobi() {
        return hobi;
    }

    public String getKeahlian() {
        return keahlian;
    }

    public String getKarya() {
        return karya;
    }

    //Print
    public void showData() {
        System.out.println("Nama: " + getName());
        System.out.println("Jurusan: " + getJurusan());
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("Universitas: " + getUniversitas());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Email: " + getEmail());
        System.out.println("Pekerjaan: " + getPekerjaan());
        System.out.println("Hobi: " + getHobi());
        System.out.println("Keahlian: " + getKeahlian());
        System.out.println("Karya: " + getKarya());
    }
}

public class Biodata {

    public static void main(String[] args) {

        dataBiodata biodata = new dataBiodata("John Doe", "Informatika", "Teknik", "Institut Teknologi Kalimantan", "Balikpapan, Indonesia", "johndoe@example.com", "Software Developer", "Gaming, Coding", "Web Development, AI", "Aplikasi Mobile XYZ");

        // Menampilkan biodata
        biodata.showData();
    }

}
