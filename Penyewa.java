public class Penyewa {
    protected int id_penyewa;
    protected String nama;
    protected String alamat;
    protected int no_tlpn;

    public int getId_penyewa() {
        return id_penyewa;
    }

    public void setId_penyewa(int id_penyewa) {
        this.id_penyewa = id_penyewa;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getNo_tlpn() {
        return no_tlpn;
    }

    public void setNo_tlpn(int no_tlpn) {
        this.no_tlpn = no_tlpn;
    }
}