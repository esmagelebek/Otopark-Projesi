
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kullaniciIslemleri {

    Scanner scanner=new Scanner(System.in);
    private String kayitliKullaniciadi="esma";
    private String kayitliSifre="123456";
    private List<User> aboneler;

    ArrayList<String> oneriListesi=new ArrayList<>();
    ArrayList<String> sikayetListesi=new ArrayList<>();
        public String getKayitliKullaniciadi() {
            return kayitliKullaniciadi;
        }

        public String getKayitliSifre() {
            return kayitliSifre;
        }
     public String oneriOrSikayet(){
         System.out.println("öneri mi şikayet mi etmek istiyorsunuz?(öneri or şikayet");
         String secenek= "";
         secenek=scanner.next();

         if (secenek.equals("öneri")){
             System.out.println("Lütfen önerinizi giriniz:");
             String oneri= "";
             oneri=scanner.next();
             oneriListesi.add(oneri);
             System.out.println(oneriListesi);
             return oneri;
         } else if (secenek.equals("şikayet")){
             String sikayet="";
             sikayet= scanner.next();
             sikayetListesi.add(sikayet);
             System.out.println(sikayetListesi);
             return sikayet;
         }else
             return null;
        }
        public void abonelikIptali(){
            System.out.println("Abonelik var mı yok mu");
            String abonelikVarMi="";
            abonelikVarMi=scanner.next();
            if(abonelikVarMi.equals("var")){
                System.out.println("Abonelik iptal edildi");
            }else if (abonelikVarMi.equals("hayır")){
                System.out.println("Abonelik bulunamadı");
            }else {
                System.out.println("Hatalı giriş");
            }

        }
    public void abonelikDetayiGoruntule() {
        System.out.println("Adınızı ve soyadınızı giriniz");
        String ad="";
        ad=scanner.next();
        String soyad="";
        soyad=scanner.next();
        for (User abone : aboneler) {
            if (abone.getAd().equals(ad) && abone.getSoyad().equals(soyad)) {
                System.out.println("Abone Detayları:");
                System.out.println("Ad: " + abone.getAd());
                System.out.println("Soyad: " + abone.getSoyad());
                System.out.println("Plaka No: " + abone.getPlakaNo());
                System.out.println("Abonelik Tercihi: " + abone.getAbonelikTercihi());
                return;
            }
        }
        System.out.println("Böyle bir abone bulunamadı: " + ad + " " + soyad);
    }
    public void odemeYap(){
        System.out.println("odeme türünü giriniz:");
        String odemeTuru="";
        odemeTuru= scanner.next();
        if (odemeTuru.equals("nakit")){
            System.out.println(odemeTuru+"odeme yapılıyor");
        } else if (odemeTuru.equals("kredikartı")) {
            System.out.println(odemeTuru+"odeme yapılıyor");
        } else if (odemeTuru.equals("bankahavalesi")) {
            System.out.println(odemeTuru+"odeme yapılıyor");
        }

    }

    }

