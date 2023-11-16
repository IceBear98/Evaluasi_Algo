import java.util.Scanner;
 
public class Harga_Barang{
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Harga;
        Double Kode,Diskon;
        String Jenis;
        System.out.print("Pilihan:\n 1. A = 10%\n 2. B = 15%\n 3. C = 20%\n");
        System.out.print("Masukkan Pilihan :");
        Jenis = input.nextLine();
        System.out.println("================");
        switch(Jenis){
            case "A":
            Kode = 0.10;
            Harga = input.nextInt();
            System.out.println("Masukkan Harga :        "+Harga);
            Diskon  = Kode * Harga;
            System.out.println("Tampilkan Harga :     "+Diskon);
            break;
            case "B":
            Kode = 0.15;
            Harga = input.nextInt();
            System.out.println("Masukkan Harga :        "+Harga);
            Diskon  = Kode * Harga;
            System.out.println("Tampilkan Harga :     "+Diskon);
            break;
            case "C":
            Kode = 0.20;
            Harga = input.nextInt();
            System.out.println("Masukkan Harga :        "+Harga);
            Diskon  = Kode * Harga;
            System.out.println("Tampilkan Harga :     "+Diskon);
            break;
            default:
            System.out.println("Salah Pilih ! :(");
        }
    }
}
