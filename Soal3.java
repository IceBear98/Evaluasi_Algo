import java.util.Scanner;

public class Soal3{
    public static void main(String[] args) {
        Scanner scan = new Scanner  (System.in);
        int Peserta,Minibus;

        System.out.println("Jumlah Minibus berdasarkan Jumlah peserta");

        Peserta = scan.nextInt();
        System.out.println("Masukan Jumlah Peserta : "+Peserta);

        Minibus = 0;

        if(Peserta > 7) {
            Minibus = Peserta / 7;
            if (Peserta % 7 != 0){
                Minibus = Minibus + 1;
            }
        }else if(Peserta > 0){
            Minibus = 1;
        }else{
            System.out.println("Tidak dapat Minibus");
        }
        System.out.println("Minibus =    "+Minibus);
        scan.close();
    }
}