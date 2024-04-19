import java.util.Scanner;

public abstract class Otopark {
    User user=new User.UserBuilder("Esma","Gelebek","34DES34","kapalı")
            .tcNo(5263318).telefonNumarasi("+905432133212").build();
    public Otopark otoparkTuru(String otoparkTuru){

        if (otoparkTuru.equals("açık")){
            acikotopark acikOtopark= acikotopark.getInstance();
            System.out.println("Açık otoparka girildi");
            return new acikotopark();
        } else if (otoparkTuru.equals("kapalı")){
            kapaliOtopark kapaliotopark=kapaliOtopark.getInstance();
            System.out.println("Kapalı otoparka girildi");
            return new kapaliOtopark();
        }else
            return null;
    }
}
