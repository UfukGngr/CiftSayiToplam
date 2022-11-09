import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi=0,toplam=0;

        Scanner scan=new Scanner(System.in);

        while(sayi%2==0){
            System.out.print("Sayi giriniz:");
            sayi=scan.nextInt();
            if (sayi % 4 == 0) {
                toplam+=sayi;
            }
            if(sayi%2!=0){
            break;
            }
        }
        System.out.println("4 ün katı sayıların toplamı= "+toplam);




    }
}