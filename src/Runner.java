import java.util.ArrayList;
import java.util.Scanner;

public class Runner  {
    Kitap kitap1 = new Kitap();




    public void uygulama(){


        System.out.println("toplam  "+kitap1.kitapList.size()  +"  kitap var ");

        //  kitap1.defaul();
        Scanner scan = new Scanner(System.in);

      kitap1.giris();
        int result = scan.nextInt();

            switch (result) {
                case 1:
                    kitap1.kitapekle();
                    break;
                case 2:
                    kitap1.kitapSil();
                    break;
                case 3:
                    kitap1.kitapAra();
                    break;
                case 4:
                    kitap1.kitapGor();
                    break;
                case 5:
                    System.out.println("uygulamadan cikiliyor...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("yanlis secim yaptiniz..");
                    kitap1.giris();

            }uygulama();

}
        }

