import java.util.Scanner;

public class Ciftsayı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("bir sayı giriniz=");
        int a=input.nextInt();
        int toplam = 0,ortalama = 0,sayac = 0;

        for(int i=1;i<=a;i++){

        if((i % 3) == 0 &&(i % 4)==0) {
            sayac++;
            System.out.println("cift sayılar="+i);
            toplam +=i;
            ortalama=toplam/sayac;

        }
                   }
        System.out.println("Sayıların ortalaması="+ortalama);

    }




    }


