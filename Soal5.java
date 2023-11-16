import java.util.Scanner;

public class Soal5{
    public static void main(String[] args) {
        Scanner scan = new Scanner  (System.in);
        int Masuk,Keluar,Lama,Biaya;

        System.out.println("Biaya Parkir");

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

        if(Lama > 2){
           Biaya = 2000 + (Lama - 2) * 500;
        }else{
            Biaya = 2000;
        }
        System.out.println("Lama =    "+Lama);
        System.out.println("Biaya =    "+Biaya);
        scan.close();
    }
}
