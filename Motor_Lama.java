import java.util.Scanner;
public class Motor_Lama extends Motor{
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
        if (pilih == 1){
            System.out.println("Anda Memilih tipe motor lama");
            System.out.println("Tipe-tipe motor lama");
            System.out.println("1. Yamaha Vega R");
            System.out.println("2. Honda Beat");
            System.out.println("3. Suzuki Nex");
            System.out.println("Silahkan Pilih : ");
            id = input.nextInt();
            switch(id){
                case 1:
                    harga = 250000;
                    System.out.println("Anda memilih motor Yamaha Vega R");
                    System.out.print("input Lama Sewa : ");
                    lamasewa = input.nextInt();
                    jumlah = harga*lamasewa;
                    System.out.println("Total harga sewa : "+jumlah);
                    break;

                case 2:
                    harga = 300000;
                    System.out.println("Anda memilih motor Honda Beat");
                    System.out.print("input Lama Sewa : ");
                    lamasewa = input.nextInt();
                    jumlah = harga*lamasewa;
                    System.out.println("Total harga sewa : "+jumlah);
                    break;

                case 3:
                    harga = 200000;
                    System.out.println("Anda memilih motor Suzuki Nex");
                    System.out.print("input Lama Sewa : ");
                    lamasewa = input.nextInt();
                    jumlah = harga*lamasewa;
                    System.out.println("Total harga sewa : "+jumlah);
            }
        }
    }
}