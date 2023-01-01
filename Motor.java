public abstract class Motor implements DaftarMotor {
    public abstract void insertdata();

    @Override
    public void Tipemotor() {
        System.out.println("SELAMAT DATANG DI APLIKASI RENTAL MOTOR");
        System.out.println("===============Pilihan Menu============");
        System.out.println("1. Daftar Motor Lama");
        System.out.println("2. Daftar Motor Baru");
        System.out.println("=======================================");
    }
}