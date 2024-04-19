public class KapaliOtopark extends Otopark{
    private static KapaliOtopark instance;

    public static KapaliOtopark getInstance(){
        if (instance==null){
            synchronized (KapaliOtopark.class){
                if (instance==null){
                    System.out.println("getInstance():getInstance" +
                            " ilk kez çağrıldı!");
                    instance=new KapaliOtopark();
                }
            }
        }
        return instance;
    }

}
