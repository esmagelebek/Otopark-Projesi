import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class YillikAbonelik implements Abonelik {
    private User user;
    Scanner scanner=new Scanner(System.in);
    String ad;
    String soyad;
    String plakaNo;
    List<User> liste=new ArrayList<>();

    @Override
    public Abonelik abonelikTipi() {
        System.out.println("Ad :");
        ad=scanner.next();
        System.out.println("Soyad :");
        soyad=scanner.next();
        System.out.println("Plaka No :");
        plakaNo=scanner.next();
        this.user=new User.UserBuilder(ad,soyad,plakaNo,"yıllık").build();

        liste.add(user);
        return this;
    }
}
