import java.util.Scanner;
public class Menentukan_N_Hari{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Nhari,Belakang;
        String[] Nama_Hari;

        Nhari = scan.nextInt();
        Nama_H
        
        Belakang = Nhari+1;

        switch(Belakang){
            case 1 :
                System.out.println("Senin");
                break;
            case 2 :
                System.out.println("Selasa");
                break;
            case 3 :
                System.out.println("Rabu");
                break;
            case 4 :
                System.out.println("Kamis");
                break;
            case 5 :
                System.out.println("Jumat");
                break;
            case 6 :
                System.out.println("Sabtu");
                break;
            case 7 :
                System.out.println("Minggu");
                break;
            default :
                System.out.println("inputan salah");
                break;
        }
        System.out.println("Nama Hari :    "+Nama_Hari);
    }
}  

