import java.util.Scanner;

public class Kuadran{
    public static void main(String[] args) {
        Scanner scan = new Scanner  (System.in);
        int X,Y;

        X = scan.nextInt();
        System.out.println("Masukan X: Rp."+X);

        
        Y = scan.nextInt();
        System.out.println("Masukan Y: Rp."+Y);

         
        if(X >= 0) {
            if (Y >= 0){
                System.out.println("Quadran I");
            }
            System.out.println("Quadran IV");
        }else{
            if(Y >= 0){
            System.out.println("Quadran II");
        }else{
            System.out.println("Quadran III");
        }
    }
        scan.close();
    }
}