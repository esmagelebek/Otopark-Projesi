public class kapaliOtopark implements otopark{
    private static kapaliOtopark instance;

    public static kapaliOtopark getInstance(){
        if (instance==null){
            synchronized (kapaliOtopark.class){
                if (instance==null){
                    System.out.println("getInstance():getInstance" +
                            "ilk kez çağrıldı!");
                    instance=new kapaliOtopark();
                }
            }
        }
        return instance;
    }

    @Override
    public void otoparkTuru(User user) {
        System.out.println("Kapalı otoparka girildi");
    }
}
