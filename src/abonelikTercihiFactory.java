import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class abonelikTercihiFactory {
    private List<String> odemeGecmisi = new ArrayList<>();
    kullaniciIslemleri kullaniciIslemleri=new kullaniciIslemleri();

    public abonelik abonelikTercihi(){
        String abonelikTürü;
        Scanner scanner=new Scanner(System.in);
        System.out.println("hangi abonelik türünü istiyorsunuz? (aylık or yıllık)");
        abonelikTürü= scanner.next();
        if (abonelikTürü.equals("aylık")) {
            return new aylikAbonelik().abonelikTipi();
        } else if (abonelikTürü.equals("yıllık")) {
            return new yillikAbonelik().abonelikTipi();
        }else
            return null;

    }
    public void odemeGecmisiGoruntule() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Önceki Ödemeler:");
        for (String payment : odemeGecmisi) {
            LocalDateTime dateTime = LocalDateTime.parse(payment, formatter);
            String formattedDateTime = dateTime.format(formatter);
            System.out.println("Ödeme Tarihi: " + formattedDateTime);
        }
        if (!odemeGecmisi.isEmpty()) {
            System.out.println("Şu Anki Ödeme:");
            LocalDateTime now = LocalDateTime.now();
            String formattedDateTimeNow = now.format(formatter);
            System.out.println("Ödeme Tarihi: " + formattedDateTimeNow);
        } else {
            System.out.println("Ödeme yapmak istiyor musunuz? (evet/hayır)");
            Scanner scanner = new Scanner(System.in);
            String cevap = scanner.next();
            if (cevap.equalsIgnoreCase("evet")) {
                kullaniciIslemleri.odemeYap();
                LocalDateTime now = LocalDateTime.now();
                String formattedDateTimeNow = now.format(formatter);
                odemeGecmisi.add(formattedDateTimeNow);
                System.out.println("Ödeme yapıldı ve geçmişe eklendi.");
                System.out.println(formattedDateTimeNow);
            } else {
                System.out.println("Ödeme yapılmadı.");
            }
        }
    }

}
