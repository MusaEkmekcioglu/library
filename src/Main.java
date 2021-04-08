public class Main {



    public static void main(String[] args) {
        Runner runner=new Runner();
        Kitap kitap=new Kitap();
        Kitap ktp1 =new Kitap("musa", "nazim","1988",12,1001);
        Kitap ktp2 =new Kitap("musa2", "nazim2","1985",11,1002);
        Kitap ktp3 =new Kitap("musa3", "nazim3","1968",13,1003);
        Kitap.kitapList.add(0,ktp1);
        Kitap.kitapList.add(1,ktp2);
        Kitap.kitapList.add(2,ktp3);

        runner.uygulama();
    }
}
