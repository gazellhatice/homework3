//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
//https://app.patika.dev/gazellhatice

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz : ");
        n = input.nextInt();

        for (int i=1; i <= n; i*=4 ){

            System.out.println(i);
        }
        System.out.print("/");

        for (int i=1; i<= n; i*=5 ){
            System.out.print(" "+i+ " ");
        }
    }
}
