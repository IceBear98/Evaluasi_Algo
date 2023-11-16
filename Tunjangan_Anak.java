import java.util.Scanner;

public class Tunjangan_Anak{
    public static void main(String[] args) {
        Scanner scan = new Scanner  (System.in);
        int Gaji_Pokok,Jumlah_Anak;
        Double Tunjangan;

        System.out.println("Program Tunjangan");

        Gaji_Pokok = scan.nextInt();
        System.out.println("Masukan Gaji Pokok : Rp."+Gaji_Pokok);

        
        Jumlah_Anak = scan.nextInt();
        System.out.println("Masukan Jumlah anak : "+Jumlah_Anak);

        //cek total nilai belanja 
        if(Jumlah_Anak <= 3) {
            Tunjangan =  Jumlah_Anak * 0.1 *Gaji_Pokok;
            System.out.println("Tampilkan Tunjangan =     "+Tunjangan);
        }else if(Jumlah_Anak > 3){
            Tunjangan =  3 * 0.1 *Gaji_Pokok;
            System.out.println("Tampilkan Tunjangan =     "+Tunjangan);
        }else {
            System.out.println("Tidak dapat Tunjangan");
        }
        scan.close();
    }
}

