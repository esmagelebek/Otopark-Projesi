import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class aylikAbonelik implements abonelik {

    private User user;
    Scanner scanner=new Scanner(System.in);
    String ad;
    String soyad;
    String plakaNo;

    @Override
    public abonelik abonelikTipi() {
        System.out.println("Ad :");
        ad=scanner.next();
        System.out.println("Soyad :");
        soyad=scanner.next();
        System.out.println("Plaka No :");
        plakaNo=scanner.next();
        this.user=new User.UserBuilder(ad,soyad,plakaNo,"aylık").build();
        List<User> liste=new ArrayList<>();
        liste.add(this.user);
        return this;
    }

}
