import java.util.Scanner;

public class otoparkFactory {
    User user=new User.UserBuilder("Esma","Gelebek","34DES34","kapalı")
            .tcNo(5263318).telefonNumarasi("+905432133212").build();
    public otopark otoparkTuru(){
        String otoparkTuru="";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hangi otopark türüne girmek istersiniz?(açık or kapalı)");
        otoparkTuru=scanner.next();

        if (otoparkTuru.equals("açık")){
            acikotopark acikOtopark= acikotopark.getInstance();
            return new acikotopark();
        } else if (otoparkTuru.equals("kapalı")){
            kapaliOtopark kapaliotopark=kapaliOtopark.getInstance();
            kapaliotopark.otoparkTuru(user);
            return new kapaliOtopark();
        }else
            return null;
    }
}
