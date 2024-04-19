public abstract class Otopark {

    public Otopark otoparkTuru(String otoparkTuru){

        if (otoparkTuru.equals("açık")){
            Acikotopark acikOtopark= Acikotopark.getInstance();
            System.out.println("Açık otoparka girildi");
            return new Acikotopark();
        } else if (otoparkTuru.equals("kapalı")){
            KapaliOtopark kapaliotopark= KapaliOtopark.getInstance();
            System.out.println("Kapalı otoparka girildi");
            return new KapaliOtopark();
        }else
            return null;
    }
}
