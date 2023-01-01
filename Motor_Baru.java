import java.util.Scanner;
public class Motor_Baru extends Motor{
    Scanner input = new Scanner(System.in);
    public int id;
    public int lamasewa;
    public int pilih;
    public int harga;
    public int jumlah;

    @Override
    public void insertdata() {
        System.out.print("Pilih Tipe Motor : ");
        pilih = input.nextInt();
        if (pilih == 2){
            System.out.println("Anda Memilih tipe motor Baru");
            System.out.println("Tipe-tipe motor lama");
            System.out.println("1. Yamaha Aerox");
            System.out.println("2. Honda PCX");
            System.out.println("3. Kawasaki CRF");
            System.out.println("Silahkan Pilih : ");
            id = input.nextInt();
            switch(id){
                case 1:
                    harga = 450000;
                    System.out.println("Anda memilih motor Yamaha Aerox");
                    System.out.print("input Lama Sewa : ");
                    lamasewa = input.nextInt();
                    jumlah = harga*lamasewa;
                    System.out.println("Total harga sewa : "+jumlah);
                    break;

                case 2:
                    harga = 400000;
                    System.out.println("Anda memilih motor Honda PCX");
                    System.out.println("input Lama Sewa : ");
                    lamasewa = input.nextInt();
                    jumlah = harga*lamasewa;
                    System.out.println("Total harga sewa : "+jumlah);
                    break;

                case 3:
                    harga = 500000;
                    System.out.println("Anda memilih motor Kawasaki CRF");
                    System.out.println("input Lama Sewa : ");
                    lamasewa = input.nextInt();
                    jumlah = harga*lamasewa;
                    System.out.println("Total harga sewa : "+jumlah);
            }
        }
    }
}