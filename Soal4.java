import java.util.Scanner;

public class Soal4{
    public static void main(String[] args) {
        Scanner scan = new Scanner  (System.in);
        int Masuk,Keluar,Lama;

        System.out.println("Lama Bekerja");

        Masuk = scan.nextInt();
        System.out.println("Masukan Jumlah Masuk :    "+Masuk);

        Keluar = scan.nextInt();
        System.out.println("Masukan Jumlah Keluar :    "+Keluar);


        //cek total nilai belanja 
        if(Keluar >= Masuk) {
            Lama = Keluar - Masuk;
        }else{
            Lama = (12 - Masuk) + Keluar;
        }
        System.out.println("Lama =    "+Lama);
        scan.close();
    }
}