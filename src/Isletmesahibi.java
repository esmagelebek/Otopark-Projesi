import java.util.Scanner;

public class Isletmesahibi {
    private static Isletmesahibi instance;
    Scanner scanner=new Scanner(System.in);
    public static Isletmesahibi getInstance() {
        if (instance == null) {
            synchronized(Isletmesahibi.class) {
                if (instance == null) {
                    System.out.println("getInstance():getInstance ilk kez çağrıldı!");
                    instance = new Isletmesahibi();
                }
            }
        }

        return instance;
    }
    //işletme sahibi de muhasebe ve müdür işlemlerini yapıyor
    public void odemePlani(){
        System.out.println("odeme planı ister misiniz?");

        String cevap= "";
        cevap=scanner.next();
        if(cevap.equals("evet")){
            System.out.println("odeme planı olusturuldu");
            System.out.println("Müşteriye iletmek ister misiniz?");
            cevap= scanner.next();
            if (cevap.equals("evet")){
                System.out.println("odeme planı müşteriye iletildi");
            }else {
                System.out.println("odeme planı müşteriye iletilmedi");
            }
        } else if (cevap.equals("hayır")) {
            System.out.println("odeme planı olusturulmadı");
        }
    }
    public void musteriTakibi(){
        System.out.println("Musteri takibi yapmak istiyor musunuz?(evet or hayır)");
        String cevap= "";
        cevap=scanner.next();
        if(cevap.equals("evet")){
            System.out.println("musteri takibi yapılıyor");
        } else if (cevap.equals("hayır")) {
            System.out.println("musteri takibi yapılmıyor");
        }
    }
    public void oneriveSikayetTakibi(){
        System.out.println("Öneri ve şikayet takibi yapmak istiyor musunuz?(evet or hayır)");
        String cevap= "";
        cevap=scanner.next();
        if (cevap.equals("evet")){
            System.out.println("Öneri ve şikayet takibi yapılıyor");
        }else{
            System.out.println("Öneri ve şikayet takibi yapılmıyor");
        }
    }
    public void aylikRapor(){
        System.out.println("Aylık rapor oluşturmak istiyor musunuz?(evet or hayır)");
        String cevap= "";
        cevap=scanner.next();
        if (cevap.equals("evet")){
            System.out.println("Aylık rapor oluşturuldu. ");
        }else
            System.out.println("Aylık rapor oluşturulmadı");
    }
}
