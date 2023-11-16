import java.util.Scanner; 
public class Pengabungan_Resistor{
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Pilihan;
        double R1,R2,R3,ResPengganti;
        Pilihan = input.nextInt();
        R1 = input.nextDouble();
        R2 = input.nextDouble();
        R3 = input.nextDouble();
        System.out.println("R1   =        "+R1);
        System.out.println("R2 =        "+R2);
        System.out.println("R3   =     "+R3);
        System.out.println("================");
        switch(Pilihan){
            case 1:
            ResPengganti = R1 + R2 + R3;
            System.out.println("Resistor Pengganti  =    "+ResPengganti);
            break;
            case 2:
            ResPengganti = (1.0/R1) + (1.0/R2) + (1.0/R3);
            ResPengganti = 1.0 / ResPengganti;
            System.out.println("Resistor Pengganti =     "+ResPengganti);
            break;
            default:
            System.out.println("Salah Pilih ! :(");
        }
    }
}