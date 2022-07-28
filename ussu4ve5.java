import java.util.Scanner;

public class ussu4ve5 {
    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);
        System.out.print("BÝR SAYI GÝRÝNÝZ : ");
        k = input.nextInt();

        System.out.println("4 kuvvetleri  : ");

        for ( int i = 1; i <= k; i *= 4){
            System.out.println(i);}

        System.out.println("5 kuvvetleri  : ");


        for ( int i = 1; i <= k; i *= 5){
            System.out.println(i);}


    }
}
