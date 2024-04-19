public class Acikotopark extends Otopark{
    private static Acikotopark instance;

    public static Acikotopark getInstance(){
        if (instance==null){
            synchronized (Acikotopark.class){
                if (instance==null){
                    System.out.println("getInstance():getInstance" +
                            " ilk kez çağrıldı!");
                    instance=new Acikotopark();
                }
            }
        }
        return instance;
    }
}
