public class User {
    private final String ad;

    private final String soyad;

    private final int tcNo;
    private final String plakaNo;

    private  final String adres;

    private final String telefonNumarasi;

    private final String emailAdres;
    private final String abonelikTercihi;

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getTcNo() {
        return tcNo;
    }

    public String getPlakaNo() {
        return plakaNo;
    }

    public String getAdres() {
        return adres;
    }

    public String getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public String getEmailAdres() {
        return emailAdres;
    }

    public String getAbonelikTercihi() {
        return abonelikTercihi;
    }



    private User(UserBuilder builder){
        this.ad=builder.ad;
        this.soyad=builder.soyad;
        this.tcNo= builder.tcNo;
        this.plakaNo= builder.plakaNo;
        this.adres= builder.adres;
        this.telefonNumarasi= builder.telefonNumarasi;
        this.emailAdres= builder.emailAdres;
        this.abonelikTercihi= builder.abonelikTercihi;
    }
public static class UserBuilder{
    private final String ad;
    private final String soyad;
    private int tcNo;
    private final String plakaNo;
    private String adres;
    private String telefonNumarasi;
    private String emailAdres;
    private final String abonelikTercihi;
    public UserBuilder(String ad,String soyad,String plakaNo,String abonelikTercihi){
        this.ad=ad;
        this.soyad=soyad;
        this.plakaNo=plakaNo;
        this.abonelikTercihi=abonelikTercihi;
    }
    public UserBuilder tcNo(int tcNo){
        this.tcNo=tcNo;
        return this;
    }
    public UserBuilder adres(String adres){
        this.adres=adres;
        return this;
    }
    public UserBuilder telefonNumarasi(String telefonNumarasi){
        this.telefonNumarasi=telefonNumarasi;
        return this;
    }
    public UserBuilder emailAdres(String emailAdres){
        this.emailAdres=emailAdres;
        return this;
    }
    public User build(){
        if(ad==null || soyad==null || plakaNo==null || abonelikTercihi==null){
            throw new IllegalStateException("Ad,soyad,plaka no ve abonelik tercihi zorunludur!!!!!");
        }else {
            System.out.println("User oluşturuldu");
            return new User(this);
        }
    }
}
}

