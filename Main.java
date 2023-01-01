import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PemilikSewa pemilik = new PemilikSewa();
        Scanner PemilikSewa = new Scanner(System.in);
        System.out.println("===PETUGAS===");
        System.out.print("Masukkan Nama  : ");
        pemilik.nama = PemilikSewa.nextLine();
        System.out.print("Masukkan NO HP : ");
        pemilik.no_tlpn = PemilikSewa.nextInt();

        Penyewa penyewa1 = new Penyewa();
        Scanner penyewa  = new Scanner(System.in);
        System.out.println("===PENYEWA===");
        System.out.print("Masukkan Nama   : ");
        penyewa1.nama = penyewa.nextLine();
        System.out.print("Masukkan Alamat : ");
        penyewa1.alamat= penyewa.nextLine();
        System.out.print("Masukkan ID     : ");
        penyewa1.id_penyewa = penyewa.nextInt();
        System.out.print("Masukkan NO.HP  : ");
        penyewa1.no_tlpn = penyewa.nextInt();

        BufferedReader baca =new BufferedReader(new InputStreamReader(System.in));
        File file = new File("struk.txt");
        try {
            Motor_Lama lama = new Motor_Lama();
            lama.Tipemotor();
            lama.insertdata();

            Motor_Baru baru = new Motor_Baru();
            baru.Tipemotor();
            baru.insertdata();

            PrintWriter output = new PrintWriter(file);
            System.out.println("===========DATA PETUGAS===========");
            System.out.println("Nama Petugas : " + pemilik.getNama());
            System.out.println("No.Hp        : " + pemilik.getNo_tlpn());
            System.out.println("==================================\n");

            System.out.println("==========DATA PENYEWA============");
            System.out.println("Nama Penyewa : " + penyewa1.getNama());
            System.out.println("No ID        : " + penyewa1.getId_penyewa());
            System.out.println("No HP        : " + penyewa1.getNo_tlpn());
            System.out.println("Alamat       : " + penyewa1.getAlamat());
            System.out.println("==================================\n");

            System.out.println("============STRUK PENYEWAAN MOTOR============");
            System.out.println("Nama Penyewa : "+penyewa1.getNama());
            System.out.println("No.ID        : "+penyewa1.getId_penyewa());
            System.out.println("NO.HP        : "+penyewa1.getNo_tlpn());
            System.out.println("Alamat       : "+penyewa1.getAlamat());
            System.out.println("Total Harga  : "+baru.jumlah);
            System.out.println("==============================================");
            System.out.println("=======Terima Kasih Atas Kunjungan Anda=======");
            System.out.println("==============================================");

            output.println("============STRUK PENYEWAAN MOTOR============");
            output.println("Nama Penyewa : "+penyewa1.getNama());
            output.println("No.ID        : "+penyewa1.getId_penyewa());
            output.println("NO.HP        : "+penyewa1.getNo_tlpn());
            output.println("Alamat       : "+penyewa1.getAlamat());
            output.println("Total Harga  : "+baru.jumlah);
            output.println("==============================================");
            output.println("=======Terima Kasih Atas Kunjungan Anda=======");
            output.println("==============================================");

            output.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File tidak di temukan");
        }
    }
}