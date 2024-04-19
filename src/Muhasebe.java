import java.util.Scanner;

public class Muhasebe {
    private static Muhasebe instance;

    public static Muhasebe getInstance(){
        if (instance==null){
            synchronized (Muhasebe.class){
                if (instance==null){
                    System.out.println("getInstance():getInstance" +
                            "ilk kez çağrıldı!");
                    instance=new Muhasebe();
                }
            }
        }
        return instance;
    }
    //Muhasebe sorumlusu odeme planı olusturur
    public void odemePlani(){
        System.out.println("odeme planı ister misiniz?");
        Scanner scanner=new Scanner(System.in);
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
}
