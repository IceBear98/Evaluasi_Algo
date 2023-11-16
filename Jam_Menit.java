import java.util.Scanner;
 
public class Jam_Menit{
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Jam_Start,Menit_Start,Jam_Stop,Menit_Stop,Total_Menit1,Total_Menit2,Selang_Menit,Jam_Durasi,Menit_Durasi;
        
        Jam_Start = input.nextInt();
        System.out.println("Jam Start =    "+Jam_Start);
        Menit_Start = input.nextInt();
        System.out.println("Menit Start =    "+Menit_Start);
        Jam_Stop = input.nextInt();
        System.out.println("Jam Stop   =    "+Jam_Stop);
        Menit_Stop = input.nextInt();
        System.out.println("Menit Stop   =   "+Menit_Stop);

        Total_Menit1 = Jam_Start * 60 + Menit_Start;
        Total_Menit2 = Jam_Stop * 60 + Menit_Stop;

        if(Total_Menit1 >= Total_Menit2){
            Selang_Menit = Total_Menit2 - Total_Menit1;
        }else{
            Selang_Menit = ((12*60)-Total_Menit1) + Total_Menit2;
        }

        Jam_Durasi = Selang_Menit / 60;
        Menit_Durasi = Selang_Menit % 60;

        System.out.println("Jam Durasi =    "+Jam_Durasi);
        System.out.println("Menit Durasi  =    "+Menit_Durasi);
    }

}
