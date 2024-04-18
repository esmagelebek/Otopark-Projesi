import java.util.Scanner;

public class Mudur {
    private static Mudur instance;
    Scanner scanner=new Scanner(System.in);

    public static Mudur getInstance(){
        if (instance==null){
            synchronized (Mudur.class){
                if (instance==null){
                    System.out.println("getInstance():getInstance" +
                            "ilk kez çağrıldı!");
                    instance=new Mudur();
                }
            }
        }
        return instance;
    }
    //müdür işlemlerini ekle
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
    //  öneri ve şikayetleri
    //takip edebilmeli, işletme sahibine aylık rapor sunmalıdır.
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
            System.out.println("Aylık rapor oluşturuldu.İşletme sahibine sunmak istiyor musunuz?(evet or hayır) ");
            cevap=scanner.next();
            if(cevap.equals("evet")){
                System.out.println("Aylık rapor işletme sahibine sunuldu");
            }else{
                System.out.println("Aylık rapor işletme sahibine sunulmadı");
            }
        }else
            System.out.println("Aylık rapor oluşturulmadı");
    }
}
