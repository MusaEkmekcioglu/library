import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Kitap {
    public String adi;
    public String yazari;
    public String yili;
    public int fiyat;
    public int numarasi;
    public static int sayac=1001;

    static ArrayList<Kitap> kitapList=new ArrayList<>();

    public Kitap() {
    }


    public Kitap(String adi, String yazari, String yili, int fiyat,int numarasi) {
        this.adi = adi;
        this.yazari = yazari;
        this.yili = yili;
        this.fiyat = fiyat;
        this.numarasi=numarasi;
    }





    public void  kitapekle(){
        Runner runner=new Runner();
        System.out.println(kitapList);
        Scanner a=new Scanner(System.in);
        System.out.println("kitap adi =" );
        String b=a.nextLine();
        System.out.println("kitap yazari =" );
        String c=a.nextLine();
        System.out.println("kitap yili =" );
        String d=a.nextLine();
        try {
            System.out.println("kitap fiyati =");
            int e = a.nextInt();
            Kitap ktp = new Kitap(b, c, d, e, sayac + 3);
            kitapList.add(ktp);
            System.out.println(kitapList.get((sayac + 3) - 1001).numarasi + "numarali dosya eklendi");
            System.out.println("kitabiniz eklendi numarasi = " + kitapList.get((sayac + 3) - 1001).numarasi);
            sayac++;
        }catch (InputMismatchException e){
            System.out.println("rakam gir ");
            runner.uygulama();

        }
    }
    public void kitapSil(){
     try {
         Scanner b = new Scanner(System.in);
         System.out.println("silmek istenilen kitap no= ");
         int a = b.nextInt();
         kitapList.remove(kitapList.get(a - 1001));
         // kitapList.remove(a-1001);
         System.out.println(a + " sayilli kitap silindi ");
         sayac--;
     }catch (Exception e){
         System.out.println("aradiginiz numara da kitap yok ");
     }
    }
    public void kitapAra(){
      try {
          Scanner c = new Scanner(System.in);
          System.out.println("aramak istenilen kitap no= ");
          int a = c.nextInt();
          System.out.println(kitapList.get(a - 1001).adi);
      }catch (Exception e){
          System.out.println("aradiginiz bir kitap yok ");
      }
    }
    public void kitapGor(){

        for(int i = 0; i< kitapList.size(); i++){
            System.out.println(kitapList.get(i).toString());
        }
        System.out.println("toplam " + kitapList.size());

    }
    public void giris(){
        String islemler="=====KITAP PROGRAMI======\n"
                + "1:kitap ekleme\n"
                + "2:numara ile kitap sil\n"
                + "3:numara ile kitap ara\n"
                + "4:tumunu listele\n"
                + "5:cikis";
        System.out.println(islemler);
    }


    @Override
    public String toString() {
        return "Kitap{" +
                "adi='" + adi + '\'' +
                ", yazari='" + yazari + '\'' +
                ", yili='" + yili + '\'' +
                ", fiyat=" + fiyat +
                ", numarasi=" + numarasi +
                '}';
    }
}
