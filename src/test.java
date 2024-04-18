import java.util.Scanner;

public class test {





    public static void main(String[] args) {
        abonelikTercihiFactory abonelikTercihi=new abonelikTercihiFactory();
        otoparkFactory OtoparkFactory=new otoparkFactory();
        kullaniciIslemleri kullaniciIslemi=new kullaniciIslemleri();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz : ");
        String kullaniciAdi=scanner.next();
        System.out.println("Şifrenizi giriniz : ");
        String sifre= scanner.next();


       if (kullaniciAdi.equals(kullaniciIslemi.getKayitliKullaniciadi()) || sifre.equals(kullaniciIslemi.getKayitliSifre())) {
           System.out.println("Sisteme başarıyla giriş yaptınız.Tebrikler:))");
           System.out.println("sisteme giriş tipinizi seciniz(müşteri,işletme sahibi,muhasebeci,güvenlik görevlisi,müdür)");
           String girisTipi = "";
           girisTipi=scanner.next();
           String islem="";
           if (girisTipi.equals("müşteri")) {
               System.out.println("Hangi işlemi yapmak istiyorsunuz?");
               islem = scanner.next();
               if (islem.equals("öneri/şikayet")) {
                   kullaniciIslemi.oneriOrSikayet();
               } else if (islem.equals("abonelik kaydı")) {
                   abonelikTercihi.abonelikTercihi();
               } else if (islem.equals("abonelikiptali")) {
                  kullaniciIslemi.abonelikIptali();
               } else if (islem.equals("abonelikdetayınıgörüntüle")) {
                   kullaniciIslemi.abonelikDetayiGoruntule();
               } else if (islem.equals("odemeyap")) {
                   kullaniciIslemi.odemeYap();
               } else if (islem.equals("odemegecmisigoruntule")) {
                   abonelikTercihi.odemeGecmisiGoruntule();
               } else if (islem.equals("otoparkturu")) {
                   OtoparkFactory.otoparkTuru();

           }else
                   System.out.println("hata");
           }else if(girisTipi.equals("muhasebe")){
               muhasebe Muhasebe=muhasebe.getInstance();
               Muhasebe.odemePlani();

           } else if (girisTipi.equals("işletme sahibi")) {
               isletmesahibi isletmeSahibi=isletmesahibi.getInstance();
               System.out.println("Hangi işlemi yapmak istiyorsunuz?");
               islem = scanner.next();
               if(islem.equals("odeme planı")){
                   isletmeSahibi.odemePlani();
               } else if (islem.equals("müşteri takibi")) {
                   isletmeSahibi.musteriTakibi();
               } else if (islem.equals("öneri ve şikayet takibi")) {
                   isletmeSahibi.oneriveSikayetTakibi();
               } else if (islem.equals("aylık rapor")) {
                   isletmeSahibi.aylikRapor();
               }

           }else if (girisTipi.equals("müdür")) {
               Mudur mudur = Mudur.getInstance();
               System.out.println("Hangi işlemi yapmak istiyorsunuz?");
               islem="";
               islem = scanner.next();
               if (islem.equals("müşteritakibi")) {
                   mudur.musteriTakibi();
               } else if (islem.equals("öneri ve şikayet takibi")) {
                   mudur.oneriveSikayetTakibi();
               } else {
                   mudur.aylikRapor();
               }
           }
       }else{
           System.out.println("Şifreniz veya kullanıcı adınız hatalıdır.Lütfen bir daha deneyiniz!!!");
       }
       }
       }
